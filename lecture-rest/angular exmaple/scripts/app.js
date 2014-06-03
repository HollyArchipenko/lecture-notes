var app = angular.module('domainApp', ['ngResource']);

app.controller('userEmail', ['$scope', '$resource',
	function ($scope, $resource){
		var domainService = $resource('http://localhost:7070/user?userEmail=:userEmail',
			{},
			{getUser: {method:'GET'}}
		)

		$scope.loadUser = function(){
			var domains = domainService.getUser({userEmail: $scope.userEmail}, function(){
				$scope.loadedUserEmail = domains.userEmail || 'user not found or input is empty'
			}); 
		};
	}
])

app.controller('like', ['$scope', '$resource',
	function ($scope, $resource){
		var domainService = $resource('http://localhost:7070/like',
			{},
			{
				setLike: {method:'POST'}, 
				unsetLike: {method: 'DELETE'}
			}
		)

		$scope.like = function(){
			var domains = domainService.setLike({userEmail: $scope.userEmail, password: $scope.userPassword, lectureId: $scope.lectureId}, function(){
				$scope.loadedUserEmail = domains.userEmail || 'user not found or input is empty'
			}); 
		};
	}
])