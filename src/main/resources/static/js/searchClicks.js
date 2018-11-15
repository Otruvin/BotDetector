$(document).ready(function(){
	
    var page = window.location.pathname.split("/").pop();
    var ip_client = "";
    var id_clicked_block;
    var height_banner;
    var width_banner;
    var click_coord_X;
    var click_coord_Y;
    
    $.getJSON('https://api.ipify.org?format=json', function(data){
        ip_client = data.ip;
    });

    $('div.banner').live('click', function(e) { 
    	var date = new Date();
    	var time = date.getTime();
    	var offset = $(this).offset();
    	id_clicked_block = e.target.id;
    	width_banner = e.target.style.width;
    	height_banner = e.target.style.height;
    	click_coord_X = (e.pageX - offset.left);
    	click_coord_Y = (e.pageY - offset.top);
        alert("Page: " + page + ",\n" 
        		+ "Id_block: " + id_clicked_block + ",\n" 
        		+ "Height_banner: " + height_banner + ",\n" 
        		+ "Width_banner: " + width_banner + ",\n"
        		+ "Clicked_coord_X: " + click_coord_X + ",\n"
        		+ "Clicked_coord_Y: " + click_coord_Y + ",\n" 
        		+ "Ip_client"+ ip_client);
    });
    
    var app = new Vue({
    	el: '#app',
    	data: {
    		message: 'Привет, Vue!'
    	}
    });
    

});