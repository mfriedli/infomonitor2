(function(){
    'use strict';
    angular.module('infoMonitorApp')
        .controller('ContentCtrl', ContentCtrl);

    ContentCtrl.$inject=['$scope', '$http', '$sce', '$timeout'];
    function ContentCtrl($scope,$http,$sce,$timeout){
        var vm = this;
        vm.baseImgUrl = "http://localhost:8080/InfoMonitor-web/content/";
        
        vm.content;
        vm.connectionstate;
        vm.img;
        vm.showImage = false;
        vm.showWebpage = false;
        vm.showVideo = false;
        vm.contentUrl;
    
        vm.ws = new WebSocket("ws://localhost:8080/InfoMonitor-web/contentendpoint");
        vm.ws.binaryType = 'arraybuffer';
        vm.ws.onopen = function() {
            vm.connectionstate = "Succeeded to open a connection";
        };
        vm.ws.onerror = function() {
            vm.connectionstate = "Failed to open a connection";
        };
        vm.ws.onmessage = function(message) {
            applyToCtrlScope(message);
        };
        vm.ws.onclose = function() {
            vm.ws.close();
        };

        vm.loadImage = function() {
            $http({
                method: 'POST',
                url: 'http://localhost:8080/InfoMonitor-web/app/imageDownload',
                headers: {'Content-Type': 'application/json'},
                data: vm.content.contentUri
            }).success(function(data) {
                vm.img = data;            
            });
        };
        
        function applyToCtrlScope(message) {             
            vm.showImage = false; 
            vm.showWebpage = false;
            vm.showVideo = false;
            vm.content = angular.fromJson(message.data);
            if (vm.content.contentType === 'PICTURE') {
                vm.contentUrl = vm.baseImgUrl.concat(vm.content.contentUri);
                $timeout(function() {
                    vm.showImage = true;
                }, 4000);               
            }
            else if (vm.content.contentType === 'WEBPAGE') {                
                vm.contentUrl = $sce.trustAsResourceUrl(vm.content.externalWebUrl);
                $timeout(function() {
                    vm.showWebpage = true;
                }, 4000);                
            }
            else if (vm.content.contentType === 'VIDEO') {   
                vm.contentUrl = vm.baseImgUrl.concat(vm.content.contentUri);
                $timeout(function() {
                    vm.showVideo = true;
                }, 4000);
            }           
        }

        $scope.$on("$destroy", function() {
            vm.ws.close();
        }); 
    }

})();
