var  app = angular.module("SocieteApp",[]);
app.controller("SocieteController",function($scope,$http){
	$scope.societesDePage=null;
	$scope.motCle=null;
	$scope.page=0;
	$scope.size=4;
	$scope.pages=[];
	$scope.chargerSocietes=function(){
		$http.get("societesParMC?mc="+$scope.motCle+"&page="+$scope.page+"&size="+$scope.size)
		.success(function(data){
			$scope.societesDePage=data;
			$scope.pages=new Array(data.totalPages);
		});
	};
	
	$scope.goToPage=function(p){
		$scope.page=p;
		$scope.chargerSocietes();
	}
});