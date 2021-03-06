$(function() {

	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	case 'All Products':
		$('#listProduct').addClass('active');
		break;

	default:
		if (menu == "Home")
			break;
		$('#listProduct').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

	
	
	var $table=$('#productListTable');
	
	if($table.length){
		//console.log('Inside the table');
		var jsonUrl= '';
		if(window.categoryId == ''){
			jsonUrl=window.contextRoot + '/json/data/all/products';
		}else{
			jsonUrl=window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
		}
		
		$table.DataTable(
		{
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
			pageLength: 5,
			ajax:{
				url:jsonUrl,
				dataSrc:''
			},
			columns:[
				{
					data:'name'
				},
				{
					data:'brand'
				},
				{
					data:'unitPrice'
				},
				{
					data:'quantity'
				},
				{
					data:'quantity'
				},
			]
				
			
		});
	}

});