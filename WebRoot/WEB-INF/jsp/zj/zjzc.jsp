<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>ä¸å®¶æ³¨åé¡µé¢</title>
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
    ä¾åºåæ³¨åé¡µé¢
</blockquote>
<div style="width:80%;margin-left: 80px;">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>ä¸å®¶å§å</label>
                <div class="layui-input-inline">
                    <input type="text" name="dlh" lay-verify="username" placeholder="è¯·è¾å¥å§å" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>å¯ç </label>
                <div class="layui-input-inline">
                    <input type="password" name="password" lay-verify="pass" placeholder="è¯·è¾å¥å¯ç " autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>ç¡®è®¤å¯ç </label>
                <div class="layui-input-inline">
                    <input type="password" name="repassword" lay-verify="pass" placeholder="è¯·è¾å¥å¯ç " autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>ææºå·ç </label>
                <div class="layui-input-inline">
                    <input type="tel" name="phone" lay-verify="phone" placeholder="è¯·å¡«åææºå·" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>é®ç®±</label>
                <div class="layui-input-inline">
                    <input type="text" name="email" lay-verify="email" placeholder="è¯·å¡«åé®ç®±" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">åºçæ¥æ</label>
                <div class="layui-input-inline">
                    <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>æ¯ä¸é¢æ ¡</label>
                <div class="layui-input-inline">
                    <input type="text" name="byyx" lay-verify="byyx" placeholder="è¯·è¾å¥æ¯ä¸é¢æ ¡" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>æå­¦ä¸ä¸</label>
                <div class="layui-input-inline">
                    <input type="text" name="sxzy" lay-verify="sxzy" placeholder="è¯·è¾å¥æå­¦ä¸ä¸" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>ç°ä»»èå¡</label>
                <div class="layui-input-inline">
                    <input type="text" name="xrzw" lay-verify="xrzw" placeholder="è¯·è¾å¥ç°ä»»èå¡" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>èº«ä»½è¯å·ç </label>
                <div class="layui-input-block">
                    <input type="text" name="identity" lay-verify="identity" placeholder="è¯·å¡«åèº«ä»½è¯å·ç " autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>å·¥ä½åä½</label>
                <div class="layui-input-inline">
                    <input type="text" name="gzdw" lay-verify="gzdw" placeholder="è¯·è¾å¥å·¥ä½åä½" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">æ§å«</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="ç·" title="ç·" checked="">
                    <input type="radio" name="sex" value="å¥³" title="å¥³">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label"><span class="yy_btx">*</span>éä¿¡å°å</label>
                <div class="layui-input-inline">
                    <input type="text" name="txdz" lay-verify="txdz" placeholder="è¯·è¾å¥éä¿¡å°å" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">ä¸ªäººç®ä»</label>
            <div class="layui-input-block">
                <textarea placeholder="è¯·è¾å¥ä¸ªäººçç®ä»" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item" style="margin-left:300px;">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="demo1">ç«å³æäº¤</button>
                <button type="reset" class="layui-btn layui-btn-primary">éç½®</button>
            </div>
        </div>
    </form>
</div>
<script src="../common/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
               var   form = layui.form()
                    ,$=layui.jquery
                    ,layer = layui.layer
                    ,layedit = layui.layedit
                    ,laydate = layui.laydate;

        //åå»ºä¸ä¸ªç¼è¾å¨
        var editIndex = layedit.build('LAY_demo_editor');

        //èªå®ä¹éªè¯è§å
        form.verify({
            username:function(value){
                if(value==""){
                        return 'ç¨æ·åä¸è½ä¸ºç©º';
                }
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\sÂ·]+$").test(value)){
                         return 'ç¨æ·åä¸è½æç¹æ®å­ç¬¦';
                }
                if(/(^\_)|(\__)|(\_+$)/.test(value)){
                      return 'ç¨æ·åé¦å°¾ä¸è½åºç°ä¸åçº¿\'_\'';
                        }
                if(/^\d+\d+\d$/.test(value)){
                    return 'ç¨æ·åä¸è½å¨ä¸ºæ°å­';
                }

            }
            ,byyx:function(value){
                if(value.length==0 || value==""){
                    return 'æ¯ä¸é¢æ ¡æ¯å¿å¡«å­æ®µ';
                }
            }
            ,sxzy:function(value){
                if(value.length==0 || value==""){
                    return 'æå­¦ä¸ä¸æ¯å¿å¡«å­æ®µ';
                }
            }
            , xrzw:function(value){
                if(value.length==0 || value==""){
                    return 'ç°ä»»èå¡æ¯å¿å¡«å­æ®µ';
                }
            }
            ,gzdw:function(value){
                if(value.length==0 || value==""){
                    return 'å·¥ä½åä½æ¯å¿å¡«å­æ®µ';
                }
            }
            , txdz:function(){
                if(value.length==0 || value==""){
                    return 'éä¿¡å°åæ¯å¿å¡«å­æ®µ';
                }
            }
            ,pass: [/^[\S]{6,12}$/,'å¯ç å¿é¡»6å°12ä½ï¼ä¸ä¸è½åºç°ç©ºæ ¼' ]
                ,content: function(value){
                layedit.sync(editIndex);
            }
        });


        //çå¬æäº¤
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: 'æç»çæäº¤ä¿¡æ¯'
            })
            return false;
        });


    });
</script>

</body>
</html>