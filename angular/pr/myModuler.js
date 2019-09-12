// JavaScript Document
var app = angular.module('myApp', []);

app.controller('myCtrl',function($scope){
$scope.my='test';
})
app.directive('myDir',function(){
	return{
	template : "my custom dir"
}

});