// JavaScript Document
var app = angular.module('myApp',["ngRoute"]);
app.config(function($routeProvider){
	$routeProvider.when("/test",{
		templateUrl:"routrs/test.html"
	})

})
	




app.controller('todoCtrl',function($scope,$http){
		$scope.todoName ="Todo Application";
		$scope.todos =[];

		function fatchTodos(){
			$http.get("http://localhost:4000/todos").then(function(response){

			console.log("response",response)
			$scope.todos = response.fatchTodos
			});

		}
		fatchTodos()
		$scope.addTodo = function(){
				$scope.todos.push({name: $scope.todoInput, complete: false});
			}
			$scope.incomplete = function(){
					
						var count =0;
						for(var i =0;i<$scope.todos.length;i++){
							if($scope.todos[i].complete == false){
									count++
								}
								
								}
								return count;
							
													  
					}
					$scope.wrning =function(){
						if($scope.incomplete()>3){
							return "wrning-lebel"
						}

					}
	});