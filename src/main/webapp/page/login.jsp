<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file='/common/includeStyle.jsp' %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
	<title>登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
    <link href="resources/login/css/style.min862f.css" rel="stylesheet"> 
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
    	if(window.top !== window.self){ 
    		window.top.location = window.location;
    	}
    </script>
</head>
<body class="gray-bg">
    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">H+</h1>

            </div>
            <h3>欢迎使用 H+</h3>

            <form id="loginForm" class="m-t" role="form">
                <div class="form-group">
                    <input id="userName" type="text" class="form-control" name="userName" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input id="password"  type="password" class="form-control" name="password" placeholder="密码" required="">
                </div>
                <button type="submit"  class="btn btn-primary block full-width m-b">登 录</button>
                
                <p class="text-muted text-center"> <a href="/"><small>忘记密码了？</small></a> | <a href="/register">注册一个新账号</a>
                </p>

            </form>
        </div>
    </div>
    <!-- <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="resources/js/hplus.min.js"></script>
    <script src="resources/js/plugins/layer/layer.min.js"></script>
    <script src="resources/js/plugins/validate/jquery.validate.min.js"></script>
    <script src="resources/js/plugins/validate/messages_zh.min.js"></script> -->
    <%@ include file='/common/includeScript.jsp' %>
    <script>
    $(document).ready(function(){      	
    	var e="<i class='fa fa-times-circle'></i> ";
    	$("#loginForm").validate({
    		onsubmit: true,
            onfocusout: false,
            onkeyup: false,
             rules: {
                 userName: {
                     required: true,
                     minlength:2,
                     remote:{   
                         url: "/user/query_user_two", //后台处理程序    
                         type: "GET",  //数据发送方式   
                         contentType: 'application/json',//接受数据格式       
                         data: {userName: function() {   
                                 return $("#userName").val();   
                               }     
                        }                
                     }                      
                 },
                 password:{required:true,minlength:5}                 
             },
             messages: {
            	 userName:{required:e+"请输入您的用户名",minlength:e+"用户名必须两个字符以上",remote:e+"用户名不存在"},
             	 password:{required:e+"请输入您的密码",minlength:e+"密码必须5个字符以上"}                
             },
             submitHandler: function (form) { //通过之后回调               	 
            	 login();
             },
             invalidHandler: function (form, validator) { //不通过回调
                 return false;
             }
         });	                 
    });
    
	    function login(){
	    	var user = new Object();
	    	user.userName = $('#userName').val();
	    	user.password = $('#password').val();
	    	$.ajax({
                url: '/user/login',
                data: JSON.stringify(user),
                type: 'POST',
                contentType: 'application/json',
                success: function (data) {
                	console.log(data);
                    if (data) {
                        addSuccess();
                    }else{
                    	layer.alert('密码错误！');
                    }                   
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                	layer.alert('系统错误');
                    //showSystemError();
                }
            });
	    }
	    
	    function addSuccess() {
                window.location.href="/index";           
        }
	    
    
    </script>
</body>
</html>
