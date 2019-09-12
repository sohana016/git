// JavaScript Document
var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope, $location){

			$scope.todoList = [];
			$scope.addTodo = function(){
					$scope.todoList.push($scope.todo);
				}
				$scope.myUrl = $location.absUrl();
	
});

	
	