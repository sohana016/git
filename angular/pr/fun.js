// JavaScript Document
var app = angular.module('myApp',[]);
app.controller('personalCtrl',function($scope){
			$scope.firstName="Tawhida";	
			$scope.lastName="Shorif";
			$scope.fullName= function(){
				return $scope.firstName +" " + $scope.lastName;
				
				};
									  
	});