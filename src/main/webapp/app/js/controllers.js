'use strict';

/* Controllers */
var infoMonitorApp = angular.module('infoMonitorApp', ['ngAnimate']);



infoMonitorApp.controller('LatestResultsCtrl', ['$scope','$timeout', function LatestResultsCtrl($scope,$timeout) {
    var thisCtrlCtx = this;
    this.results = [];
    this.connectionstate;
    var ws = new WebSocket("ws://localhost:8080/InfoMonitor-web/latestresultsendpoint");

    ws.onopen = function() {
        thisCtrlCtx.connectionstate = "Succeeded to open a connection";
    };
    ws.onerror = function() {
        thisCtrlCtx.connectionstate = "Failed to open a connection";
    };
    ws.onmessage = function(message) {
        $scope.$apply(function() {
            thisCtrlCtx.results=[];                 
        });
       
        $timeout(function() {
            $scope.$apply(function() {
                thisCtrlCtx.results = angular.fromJson(message.data);  
            });
        }, 500);
        //applyToCtrlScope(message);
    };

    function applyToCtrlScope(message) {    
        
        $scope.$apply(function() {
            thisCtrlCtx.results = angular.fromJson(message.data);  
        });
    }

    $scope.$on("$destroy", function() {
        ws.close();
    });
}]);


infoMonitorApp.controller('TotomatCtrl', ['$scope', function TotomatCtrl($scope) {
    var thisCtrlCtx = this;
    this.totomatResults = [];
    this.connectionstate;
    
    var ws = new WebSocket("ws://localhost:8080/InfoMonitor-web/totomatendpoint");

    ws.onopen = function() {
        thisCtrlCtx.connectionstate = "Succeeded to open a connection";
    };
    ws.onerror = function() {
        thisCtrlCtx.connectionstate = "Failed to open a connection";
    };
    ws.onmessage = function(message) {
        applyToCtrlScope(message);
    };

    function applyToCtrlScope(message) {
        $scope.$apply(function() {
            thisCtrlCtx.totomatResults = angular.fromJson(message.data);
        });
    }

    $scope.$on("$destroy", function() {
        ws.close();
    });
}]);

infoMonitorApp.controller('BreakingNewsCtrl', ['$scope', function BreakingNewsCtrl($scope) {
    var thisCtrlCtx = this;
    this.breakingNews = "Info: Bitte f&uuml;r die Trainings Garderoben links oder rechts benutzen.";
    this.connectionstate;
    this.cssClass;
   
    var ws = new WebSocket("ws://localhost:8080/InfoMonitor-web/breakingnewsendpoint");

    ws.onopen = function() {
        thisCtrlCtx.connectionstate = "Succeeded to open a connection";
    };
    ws.onerror = function() {
        thisCtrlCtx.connectionstate = "Failed to open a connection";
    };
    ws.onmessage = function(message) {
        applyToCtrlScope(message);
    };

    function applyToCtrlScope(message) {
        $scope.$apply(function() {
            thisCtrlCtx.breakingNews = angular.fromJson(message.data);
            if (thisCtrlCtx.breakingNews[0].isBlinking) {
                thisCtrlCtx.cssClass = 'css3-blink';
            } else {
               thisCtrlCtx.cssClass = '';
            }
        });
    }

    $scope.$on("$destroy", function() {
        ws.close();
    });
}]);
