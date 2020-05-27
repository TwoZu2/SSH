<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/20
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="../resources/layui/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="../resources/layui/css/layui.css" media="all">
    <script src="../resources/layui/layui.js"></script>
</head>
<body>


<table class="layui-hide" id="complainTable" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo" >
    <input class="layui-input" id="sousuo" style="width: 10%;float: left;margin-left: 1%">
    <input class="layui-btn" type="button" lay-event="aaa" value="搜索" id="btn-sou" onclick="fun()" style="width: 5%;float: left;margin-left: 1%"/>
    <input class="layui-btn" type="button" value="添加" lay-event="add" onclick="funp()" id="btn-add" style="margin-left: 15px"/>

    <div class="layui-form" style="float: left;margin-left: 15px">
        <select name="select" id="select"  lay-filter="ssss" >
            <option name="">全部</option>
            <option name="大">大类型</option>
            <option name="小">小类型</option>
        </select>
    </div>


</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>


    function fun() {
        var table = layui.table;

        var name = $('#sousuo').val();

        table.render({

            elem: '#complainTable'

            , url: '../Service_findService?serName='+name
            , even: true

            , request: {
                pageName: 'page' //页码的参数名称，默认：page
                , limitName: 'limit' //每页数据量的参数名，默认：limit
            }

            , toolbar: '#toolbarDemo'

            , title: '用户数据表'

            , limit: 12

            , cols: [[


                {field: 'SerId', title: '序号', width:'5%',  sort: true,align: "center"}

                , {field: 'SerName', title: '服务名称', width: '10%',align: "center"}

                , {field: 'SerPrice', title: '服务价格', width:'15%',sort: true,align: "center"}

                , {field: 'SerIntroduce', title: '服务介绍', width:'40%',  sort: true,align: "center"}

                , {field: 'ServiceType', title: '服务类型', width: '10%',align: "center"}







                , {fixed: 'right', title: '操作',width:'20%', toolbar: '#barDemo',align:"center"}

            ]]

            , page: true

        });

    }





</script>

<script type="text/javascript">
    layui.use(['layer', 'jquery', 'form','table'], function () {

        var table = layui.table;

        var form = layui.form;
        table.render({

            elem: '#complainTable'

            , url: '../Service_findService'
            , even: true

            , request: {
                pageName: 'page' //页码的参数名称，默认：page
                , limitName: 'limit' //每页数据量的参数名，默认：limit
            }

            , toolbar: '#toolbarDemo'

            , title: '用户数据表'

            , limit: 12

            , cols: [[


                {field: 'SerId', title: '序号', width:'5%',  sort: true,align: "center"}

                , {field: 'SerName', title: '服务名称', width: '10%',align: "center"}

                , {field: 'SerPrice', title: '服务价格', width:'15%',sort: true,align: "center"}

                , {field: 'SerIntroduce', title: '服务介绍', width:'40%',  sort: true,align: "center"}

                , {field: 'ServiceType', title: '服务类型', width: '10%',align: "center"}







                , {fixed: 'right', title: '操作',width:'20%', toolbar: '#barDemo',align:"center"}

            ]]

            , page: true

        });


        form.on('select(ssss)', function (data) {
            var wai= $("#select").find("option:selected").attr("name");

            table.render({

                elem: '#complainTable'

                , url: '../Service_findService?wai='+wai
                , even: true

                , request: {
                    pageName: 'page' //页码的参数名称，默认：page
                    , limitName: 'limit' //每页数据量的参数名，默认：limit
                }

                , toolbar: '#toolbarDemo'

                , title: '用户数据表'

                , limit: 12
                , cols: [[


                    {field: 'SerId', title: '序号', width:'5%',  sort: true,align: "center"}

                    , {field: 'SerName', title: '服务名称', width: '10%',align: "center"}

                    , {field: 'SerPrice', title: '服务价格', width:'15%',sort: true,align: "center"}

                    , {field: 'SerIntroduce', title: '服务介绍', width:'40%',  sort: true,align: "center"}

                    , {field: 'ServiceType', title: '服务类型', width: '10%',align: "center"}







                    , {fixed: 'right', title: '操作',width:'20%', toolbar: '#barDemo',align:"center"}

                ]]
                , page: true

            });

            $("#select option[name='"+wai+"']").prop("selected","selected");
        })

        table.on('tool(test)', function (obj) {
            //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if (layEvent === 'edit') {

                layer.open(
                    {
                        type: 2,
                        title: '编辑页面',
                        skin: 'layui-layer-molv',
                        shadeClose: false,
                        shade: 0.8,
                        area: ['880px', '550px'],
                        content: 'Sub_View/serv_upd.html?id='+data.SerId+"&name="+data.SerName+"&price="+data.SerPrice+"&text="+data.SerIntroduce+"&type1="+data.ServiceType+"&tou="+'修改',

                        cancel: function (index) {
                            $(".layui-laypage-btn").click();//这里用于关闭Open时触发回调函数  刷新父页面数据  一定要引入Jquery
                        }
                    });
                /*  注：在这里我不就做修改界面了
                  这里这只是一个弹出框
                  弹出你的修改页面
                  Content中你自定义自己的页面路径并传参数*/
            }
            if (layEvent === 'detail') {

                layer.open(
                    {
                        type: 2,
                        title: '查看',
                        skin: 'layui-layer-molv',
                        shadeClose: false,
                        shade: 0.8,
                        area: ['880px', '550px'],
                        content: 'Sub_View/serv_upd.html?id='+data.SerId+"&name="+data.SerName+"&price="+data.SerPrice+"&text="+data.SerIntroduce+"&type1="+data.ServiceType+"&tou="+'查看'+"&zhuang="+'readonly'+"&style="+'display:none'

                    });

                /*  注：在这里我不就做修改界面了
                  这里这只是一个弹出框
                  弹出你的修改页面
                  Content中你自定义自己的页面路径并传参数*/
            }if (layEvent === 'del')//删除数据
            {
                /*  删除数据在这里可以使用Ajax异步
                  就和平常使用一样简单*/
                /*  删除数据在这里可以使用Ajax异步
                 就和平常使用一样简单*/
                layer.confirm('您确定删除:' + data.SerName + '吗？', function (index) {
                    //向服务端发送删除指令，在这里可以使用Ajax异步
                    $.post("../Service_delete", {id: data.SerId}, function (ret) {
                        if (ret === "1") {//删除成功，刷新当前页表格
                            layer.msg("成功",{icon: 1, time: 1500}, function () {
                                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                                layer.close(index);
                                // $(".layui-laypage-btn").click();//点击分页刷新当前页
                            });
                        } else {  //删除失败
                            layer.alert(ret.msg, {icon: 2}, function () {
                                layer.close(index);
                                $(".layui-laypage-btn").click();
                                window.location.reload();
                            });
                        }
                    });
                });
            }
        });
    });





    //添加
    function funp() {


        layer.open({
            type: 2,
            title: '添加服务',

            area: ['50%', '90%'],
            shadeClose: false, //点击遮罩关闭
            content: 'Sub_View/serv_add.html'

        });

    }







</script>
<script>


</script>

</body>
</html>