<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link href="../common/css/login.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
    	window.onload=function(){
    		var isError = document.getElementById("isError").value;
    		if(isError!=null && isError!="")
    			alert(isError);
    	}
    	
    	function checkImage(){
    		var str = Math.random();
    		document.getElementById("yzm").src="${pageContext.request.contextPath}/sys/yzm.action?str="+str;
    	}
    	
    	//刷新页面
    	function refrech(){
    		document.getElementById("form").action="${pageContext.request.contextPath }/sys/index.action";
    		document.getElementById("form").target="_self";
    		document.getElementById("form").submit();
    	}
    </script>
</head>
<body>
<img src="../common/image/logo.png" alt="logo" id="logo" width="700" height="60" />
<div id="login">
    <form id="form" action="${pageContext.request.contextPath }/sys/login.action">
     <input id="isError" type="hidden" value="${requestScope.loginMessage}" />
     <table cellpadding="0" cellspacing="20" id="mytab">
        <tr>
            <td>登录名:</td>
            <td><input type="text" name="loginname" id="loginname" placeholder="请填写登录名" required="required" value="admin"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="loginpassword" id="loginpassword" placeholder="请填写密码" required="required" value="0"/></td>
        </tr>
        <tr>
            <td>验证码:</td>
            <td><input type="text" id="yanzheng" placeholder="验证码" required="required" name="yzm" />
            <td><img id="yzm" alt="验证码" src="${pageContext.request.contextPath}/sys/yzm.action" />&nbsp;<a href="javascript:void(0);" onclick="refrech();">看不清，换一张</a></td>
        </tr>
         <tr>
             <td colspan="2" align="center"><input type="submit" name="sub" id="sub" value="登录" onclick="return loginMessage();"/></td>
         </tr>
      </table>
      <div>
      	 <ul>
      	 
      	 
      	 </ul>
      </div>
    </form>
</div>
</body>
</html>