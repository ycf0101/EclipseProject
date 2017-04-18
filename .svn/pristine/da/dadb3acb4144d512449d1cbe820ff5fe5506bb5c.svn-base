<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../common/layui/css/layui.css"  media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>展示的页面</legend>
</fieldset>

<div class="layui-form" >
    <table class="layui-table" id="biuuu_city_list">
        <!--<colgroup>
            <col width="50">
            <col width="150">
            <col width="150">
            <col width="200">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"></th>
            <th>人物</th>
            <th>民族</th>
            <th>出场时间</th>
            <th>格言</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="checkbox" lay-skin="primary"></td>
            <td>贤心</td>
            <td>汉族</td>
            <td>1989-10-14</td>
            <td>人生似修行</td>
        </tr>
        <tr>
            <td><input type="checkbox" lay-skin="primary"></td>
            <td>张爱玲</td>
            <td>汉族</td>
            <td>1920-09-30</td>
            <td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
        </tr>
        <tr>
            <td><input type="checkbox" lay-skin="primary"></td>
            <td>Helen Keller</td>
            <td>拉丁美裔</td>
            <td>1880-06-27</td>
            <td> Life is either a daring adventure or nothing.</td>
        </tr>
        <tr>
            <td><input type="checkbox" lay-skin="primary"></td>
            <td>岳飞</td>
            <td>汉族</td>
            <td>1103-北宋崇宁二年</td>
            <td>教科书再滥改，也抹不去“民族英雄”的事实</td>
        </tr>
        <tr>
            <td><input type="checkbox" lay-skin="primary"></td>
            <td>孟子</td>
            <td>华夏族（汉族）</td>
            <td>公元前-372年</td>
            <td>猿强，则国强。国强，则猿更强！ </td>
        </tr>
        </tbody>
        -->
    </table>
</div>
<div id="yy_myfj" align="center"></div>
<script src="../common/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['laypage', 'layer','form'], function(){
        var
                $ = layui.jquery,
                form = layui.form(),
                laypage = layui.laypage,
                layer = layui.layer
                ;

        //全选
        form.on('checkbox(allChoose)', function(data){
            var child = $(data.elem).parents('table').find('tbody input[type="checkbox"]');
            child.each(function(index, item){
                item.checked = data.elem.checked;
            });
            form.render('checkbox');
        });
        //测试数据
        var data = [
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲</td><td>汉族</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲1</td><td>汉族1</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲2</td><td>汉族2</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲3</td><td>汉族3</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲4</td><td>汉族4</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲5</td><td>汉族5</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲6</td><td>汉族6</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲7</td><td>汉族7</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲8</td><td>汉族8</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲9</td><td>汉族9</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲10</td><td>汉族10</td><td>1920-09-30</td></tr>',
            '<tr><td><input type="checkbox" lay-skin="primary"></td> <td>张爱玲11</td><td>汉族11</td><td>1920-09-30</td></tr>'
        ];

        var nums=4;
        //模拟渲染
        var render = function(curr){
            //此处只是演示，实际场景通常是返回已经当前页已经分组好的数据
            var str = '', last = curr*nums - 1;
            last = last >= data.length ? (data.length-1) : last;
            for(var i = (curr*nums - nums); i <= last; i++){
                str += data[i];
            }
            return str;
        };
        //调用分页
        laypage({
            cont: 'yy_myfj'
            ,pages: Math.ceil(data.length/nums) //得到总页数
            ,jump: function(obj){
                document.getElementById('biuuu_city_list').innerHTML = render(obj.curr);
            }
        });

    });
</script>

</body>
</html>