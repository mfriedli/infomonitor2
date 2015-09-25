(function(){
    'use strict';
    angular.module('infoMonitorApp')
        .controller('LockerRoomCtrl', LockerRoomCtrl);

    LockerRoomCtrl.$inject=['$scope', '$timeout'];
    function LockerRoomCtrl($scope,$timeout) {
        var vm = this;
        vm.date = "";
        vm.lockerrooms = [];
        vm.connectionstate;
    
        vm.ws = new WebSocket("ws://localhost:8080/InfoMonitor-web/lockerroomendpoint");

        vm.ws.onopen = function() {
            vm.connectionstate = "Succeeded to open a connection";
        };
        vm.ws.onerror = function() {
            vm.connectionstate = "Failed to open a connection";
        };
        vm.ws.onmessage = function(message) {
            applyToCtrlScope(message);
        };

        function applyToCtrlScope(message) {              
            vm.lockerrooms = angular.fromJson(message.data);
            if (!angular.isUndefined(vm.lockerrooms[0]) && 
                !angular.isUndefined(vm.lockerrooms[0].Datum)) {
                vm.date = vm.lockerrooms[0].Datum;
            }                           
        }

        $scope.$on("$destroy", function() {
           vm.ws.close();
        });
    }
})();