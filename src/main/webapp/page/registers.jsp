<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file='/common/includeStyle.jsp' %>
<!DOCTYPE html>
<html>
<!-- Mirrored from www.zi-han.net/theme/hplus/register.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:19:52 GMT -->
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>H+ 后台主题UI框架 - 注册</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
    <link rel="shortcut icon" href="favicon.ico">       
    <link href="resources/login/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <script>
    	if(window.top !== window.self){
    		window.top.location = window.location;
    	}
    </script>

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">H+</h1>

            </div>
            <h3>欢迎注册 H+</h3>
            <p>创建一个H+新账户</p>
            <form id="registerForm" class="form-horizontal m-t">
                <div class="form-group">
                    <input id="userName" type="text" class="form-control" name="userName" placeholder="请输入用户名">
                    <!-- <span id="tip" class="help-block m-b-none" style="color: #cc5965;display: inline-block;margin-left: 5px;"><i class="fa fa-info-circle"></i>账号已存在 </span> -->
                </div>
                <div class="form-group">
                    <input id="password" type="password" class="form-control" name="password" placeholder="请输入密码" required="">
                </div>
                <div class="form-group">
                    <input id="confirm_password" type="password" class="form-control"  name="confirm_password" placeholder="请再次输入密码" required="">                   
                    <span class="help-block m-b-none" style="text-align:left"><i class="fa fa-info-circle"></i> 请再次输入您的密码</span>
                </div>
                 <div class="form-group">
                    <input id="phone" type="text" class="form-control"  name="phone" placeholder="请输入手机号" required="">
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>

                <p class="text-muted text-center"><small>已经有账户了？</small><a href="/">点此登录</a>
                </p>

            </form>
        </div>
    </div>
    <!-- <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/hplus.min.js"></script>
    <script src="resources/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="resources/js/plugins/layer/layer.min.js"></script>
    
    <script src="resources/js/plugins/iCheck/icheck.min.js"></script>
    <script src="resources/js/plugins/validate/jquery.validate.min.js"></script>
    <script src="resources/js/plugins/validate/messages_zh.min.js"></script> -->
     <%@ include file='/common/includeScript.jsp' %>
    <script>
        $(document).ready(function(){
        	
        	var e="<i class='fa fa-times-circle'></i> ";
        	$("#registerForm").validate({
        		onsubmit: true,
                onfocusout: false,
                onkeyup: false,
                 rules: {
                     userName: {
                         required: true,
                         minlength:2,
                         remote:{   
                             url: "/user/query_user", //后台处理程序    
                             type: "GET",  //数据发送方式   
                             contentType: 'application/json',//接受数据格式       
                             data: {userName: function() {   
                                     return $("#userName").val();   
                                   }     
                            }                
                         } 
                     },
                     password:{required:true,minlength:5},
                     confirm_password:{required:true,minlength:5,equalTo:"#password"},
                     phone:{required:true,minlength:11,maxlength:11}                    
                 },
                 messages: {
                	 userName:{required:e+"请输入您的用户名",minlength:e+"用户名必须两个字符以上",remote:e+"用户名已经存在"},
                 	 password:{required:e+"请输入您的密码",minlength:e+"密码必须5个字符以上"},
                     confirm_password:{required:e+"请再次输入密码",minlength:e+"密码必须5个字符以上",equalTo:e+"两次输入的密码不一致"},
                 	 phone:{required:e+"请输入您的手机号"}
                 },
                 submitHandler: function (form) { //通过之后回调               	 
                	 addUser();
                 },
                 invalidHandler: function (form, validator) { //不通过回调
                     return false;
                 }
             });	                 
        });
        
        function addUser(){
        	var user = new Object();
        	user.userName = $('#userName').val();
        	user.password = $('#password').val();
        	user.phone = $('#phone').val();
        	$.ajax({
                url: '/register/add_user',
                data: JSON.stringify(user),
                type: 'POST',
                contentType: 'application/json',  
                success: function () {
                        addSuccess();                                    
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                	alert("出错啦！");
                    //showSystemError();
                }
            });
        }
        
        function addSuccess() {
            layer.alert('注册成功!',
            		function () {
                window.location.href="/";
            });
        }
    </script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/register.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:19:52 GMT -->
</html>
