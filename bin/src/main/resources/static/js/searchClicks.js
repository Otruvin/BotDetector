$(document).ready(function(){
	
    var page = window.location.pathname.split("/").pop();
    var ip_client = "";
    var id_clicked_block;
    var height_banner;
    var width_banner;
    var click_coord_X;
    var click_coord_Y;
    var move_mouse_position_x;
    var move_mouse_position_y;


    $.getJSON('https://api.ipify.org?format=json', function(data){
        ip_client = data.ip;
    });
    
    window.onmousemove = function(e) {
    	move_mouse_position_x = e.pageX;
    	move_mouse_position_y = e.pageY;
    }
    
    setInterval(function() {
    	
    	var mousePositionInfo = {
    			pageName : page,
    			mouseCoordX : move_mouse_position_x,
    			mouseCoordY : move_mouse_position_y,
    			ipClient : ip_client
    	}
    	
    	$.ajax({
    		type : "POST",
        	contentType : "application/json",
        	url : "/clickManage/sendMoveMouseData",
        	data : JSON.stringify(mousePositionInfo),
        	dataType : 'json',
        	success : function(result) {
        		if(result.status == "Done"){
        			console.log("Good, all sended");
        		}else {
        			console.log("Send error");
        		}
        		console.log(result);
        	},
        	error : function(event) {
        		alert("Error!")
        		console.log("ERROR: ", event);
        	}
    	});
    },1000);
    

    $('div.banner').live('click', function(e) { 
    	var date = new Date();
    	var time = date.getTime();
    	var offset = $(this).offset();
    	id_clicked_block = e.target.id;
    	width_banner = $(this).width();
    	height_banner = $(this).height();
    	click_coord_X = (e.pageX - offset.left);
    	click_coord_Y = (e.pageY - offset.top);
        
        e.preventDefault();
        
        var clickInfo = {
        		namePage: page,
        		nameBanner: id_clicked_block,
        		heightBanner: height_banner,
        		widthBanner: width_banner,
        		clickedCoordX: click_coord_X,
        		clickedCoordY: click_coord_Y,
        		ipClient: ip_client
        }
        
        var userInfo = {
        		ipUser : ip_client,
        		browserCodeName : navigator.appCodeName,
        		browserName : navigator.appName,
        		brouserVersion : navigator.appVersion,
        		cookiesEnabled : navigator.cookieEnabled,
        		browserLanguage : navigator.language,
        		browserOnline : navigator.onLine,
        		platform : navigator.platform,
        		userAgentHeader : navigator.userAgent
        }
        
        console.log(window.location);
        
        $.ajax({
        	type : "POST",
        	contentType : "application/json",
        	url : "/clickManage/sendUserData",
        	data : JSON.stringify(userInfo),
        	dataType : 'json',
        	success : function(result) {
        		if(result.status == "Done"){
        			console.log("Good, all sended");
        		}else {
        			console.log("Send error");
        		}
        		console.log(result);
        	},
        	error : function(event) {
        		alert("Error!")
        		console.log("ERROR: ", event);
        	}
        });
        
        $.ajax({
        	type : "POST",
			contentType : "application/json",
			url : "/clickManage/sendClickData",
			data : JSON.stringify(clickInfo),
			dataType : 'json',
			success : function(result) {
				if(result.status == "Done"){
					console.log("Good, all sended");
				}else{
					console.log("Send error");
				}
				console.log(result);
			},
			error : function(event) {
				alert("Error!")
				console.log("ERROR: ", event);
			}
        });
        
    }); //

});



