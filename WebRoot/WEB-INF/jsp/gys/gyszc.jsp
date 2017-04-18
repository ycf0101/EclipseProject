<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8">
	<title>供应商注册页面</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="../common/layui/css/layui.css"  media="all">
</head>
<style>
	.yy_btx{ color: red;}
</style>
<body>
<blockquote class="layui-elem-quote">
	供应商注册页面
</blockquote>
<div style="width:80%;margin-left: 80px;">
<form class="layui-form" action="">
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>登录号</label>
		<div class="layui-input-inline">
			<input type="text" name="dlh" lay-verify="dlh" placeholder="请输入登录名称" autocomplete="off" class="layui-input">
		</div>
		</div>
		<div class="layui-inline">
		<label class="layui-form-label"><span class="yy_btx">*</span>密码</label>
		<div class="layui-input-inline">
			<input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
		</div>
		</div>
		<div class="layui-inline">
		<label class="layui-form-label"><span class="yy_btx">*</span>确认密码</label>
		<div class="layui-input-inline">
			<input type="password" name="repassword" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
		</div>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>供应商全称</label>
			<div class="layui-input-inline">
				<input type="text" name="gysqc" lay-verify="gysqc" placeholder="请输入供应商全程" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">曾用名</label>
			<div class="layui-input-inline">
				<input type="text" name="cym"  placeholder="请输入曾用名" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>法定代表人姓名</label>
			<div class="layui-input-inline">
				<input type="text" name="fddbr" lay-verify="fddbr" placeholder="请输入法定代表人姓名" autocomplete="off" class="layui-input">
			</div>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>手机号码</label>
			<div class="layui-input-inline">
				<input type="tel" name="phone" lay-verify="phone" placeholder="请填写手机号" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>邮箱</label>
			<div class="layui-input-inline">
				<input type="text" name="email" lay-verify="email" placeholder="请填写邮箱" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">出生日期</label>
			<div class="layui-input-inline">
				<input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
			</div>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>账号管理员</label>
			<div class="layui-input-inline">
				<input type="text" name="zhgly" lay-verify="zhgly" placeholder="请输入供应商全程" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">职务</label>
			<div class="layui-input-inline">
				<input type="text" name="zw" placeholder="请输入职务" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>邮编</label>
			<div class="layui-input-inline">
				<input type="text" name="yb" lay-verify="yb" placeholder="请输入邮编" autocomplete="off" class="layui-input">
			</div>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label">公司链接</label>
			<div class="layui-input-inline">
				<input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>身份证号码</label>
			<div class="layui-input-block">
				<input type="text" name="identity" lay-verify="identity" placeholder="请填写身份证号码" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label">性别</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男" checked="">
				<input type="radio" name="sex" value="女" title="女">
			</div>
		</div>
	</div>

	<div class="layui-form-item">
		<label class="layui-form-label">家庭住址</label>
		<div class="layui-input-inline">
			<select name="quiz1">
				<option value="">请选择省</option>
				<option value="浙江" selected="">浙江省</option>
				<option value="你的工号">江西省</option>
				<option value="你最喜欢的老师">福建省</option>
			</select>
		</div>
		<div class="layui-input-inline">
			<select name="quiz2">
				<option value="">请选择市</option>
				<option value="杭州">杭州</option>
				<option value="宁波" disabled="">宁波</option>
				<option value="温州">温州</option>
				<option value="温州">台州</option>
				<option value="温州">绍兴</option>
			</select>
		</div>
		<div class="layui-input-inline">
			<select name="quiz3">
				<option value="">请选择县/区</option>
				<option value="西湖区">西湖区</option>
				<option value="余杭区">余杭区</option>
				<option value="拱墅区">临安市</option>
			</select>
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>注册地址</label>
			<div class="layui-input-inline">
				<input type="text" name="zcdz" lay-verify="zcdz" placeholder="请输入注册地址" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-inline">
			<label class="layui-form-label"><span class="yy_btx">*</span>经营地址</label>
			<div class="layui-input-inline">
				<input type="text" name="jydz" lay-verify="jydz" placeholder="请输入经营地址" autocomplete="off" class="layui-input">
			</div>
		</div>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">公司简介</label>
		<div class="layui-input-block">
			<textarea placeholder="请输入公司的简介" class="layui-textarea"></textarea>
		</div>
	</div>
	<div class="layui-form-item" style="margin-left:300px;">
		<div class="layui-input-block">
			<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		</div>
	</div>
</form>
</div>
<script src="../common/layui/layui.js" charset="utf-8"></script>
<script>
	layui.use(['form', 'layedit', 'laydate'], function(){
		var form = layui.form()
				,$=layui.jquery
				,layer = layui.layer
				,layedit = layui.layedit
				,laydate = layui.laydate;

		//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');

		//自定义验证规则
		form.verify({

			dlh: function(value){
				if(value==""){
					return '登录号为必填项';
				}
				if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
					return '登录号不能有特殊字符';
				}
				if(/(^\_)|(\__)|(\_+$)/.test(value)){
					return '用户名首尾不能出现下划线\'_\'';
				}
			}
			,pass: [/^[\S]{6,12}$/,'密码必须6到12位，且不能出现空格' ]
			,gysqc:function(value){
				if(value=="" || value.length==0){
					return '供应商全称为必填项';
				}
			}
			,fddbr:function(value){
				if(value=="" || value.length==0){
					return '法定代表人为必填项';
				}
			}
			,zhgly:function(){
				if(value=="" || value.length==0){
					return '账号管理员为必填项';
				}
			}
			,yb:function(){
				if(value=="" || value.length==0){
					return '邮编为必填项';
				}
			}
			,zcdz:function(){
				if(value=="" || value.length==0){
					return '注册地址为必填项';
				}
			}
			,jydz:function(){
				if(value=="" || value.length==0){
					return '经营地址为必填项';
				}
			}
			,content: function(value){
				layedit.sync(editIndex);
			}
		});


		//监听提交
		form.on('submit(demo1)', function(data){
			layer.alert(JSON.stringify(data.field), {
				title: '最终的提交信息'
			})
			return false;
		});


	});
</script>

</body>
</html>