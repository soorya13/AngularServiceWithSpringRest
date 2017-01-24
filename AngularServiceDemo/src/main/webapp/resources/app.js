var app=angular.module('myApp',[]);
app.factory("dataservice",function($http){
	
	var factory={
			getData:getData
	}
	return factory;
	function getData(name)
	{
		return $http({
				method:'get',
				url:'pullmessage/'+name
					
		});
	}
});


app.controller('myCtrl',function($scope,dataservice){
	$scope.getMd=function(){
		dataservice.getData($scope.name)
		.then(function(response)
				{
					$scope.obj=response.data;
				});
		
	}
	
});