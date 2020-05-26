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
    <script src="<%=path%>/layui/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src="../layui/layui.js"></script>
</head>
<body>


<table class="layui-hide" id="complainTable" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo" >
    <input class="layui-btn" type="button" value="添加" lay-event="add" onclick="funp()" id="btn-add" style="margin-left: 15px"/>

    <div class="layui-form" style="float: left;margin-left: 15px">
        <select name="select" id="select"  lay-filter="ssss" >
            <option name="-1">全部</option>


        </select>
    </div>


</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>


    // var brandId = $("select[name=brandId]").val();
    //清空






</script>
<script type="text/javascript">
    layui.use(['layer', 'jquery', 'form','table'], function () {

        var table = layui.table;

        var form = layui.form;
        table.render({

            elem: '#complainTable'

            , url: '../staff_Show'
            , even: true

            , request: {
                pageName: 'page' //页码的参数名称，默认：page
                , limitName: 'limit' //每页数据量的参数名，默认：limit
            }

            , toolbar: '#toolbarDemo'

            , title: '用户数据表'

            , limit: 7 //员工显示行数

            , cols: [[


                {field: 'EmpId', title: '序号', width:'5%',  sort: true,align: "center"}

                , {field: 'EmpName', title: '员工姓名', width: '7%',align: "center"}

                , {field: 'EmpSex', title: '员工性别', width:'5%',sort: true,align: "center"}

               , {field: 'EmpAge', title: '员工年龄', width:'5%',  sort: true,align: "center"}

                , {field: 'EmpAddress', title: '家庭地址', width: '15%',align: "center"}

                , {field: 'EmpPhone', title: '联系方式', width:'20%',sort: true,align: "center"}


                , {field: 'EmpTime', title: '入职时间', width: '15%',align: "center"}

                , {field: 'EmpIdentity', title: '身份证号码', width:'18%',sort: true,align: "center"}



                , {fixed: 'right', title: '操作',width:'10%', toolbar: '#barDemo',align:"center"}

            ]]

            , page: true

        });


        form.on('select(ssss)', function (data) {
            var wai= $("#select").find("option:selected").attr("name");

            table.render({

                elem: '#complainTable'

                , url: '../staff_Show?wai='+wai
                , even: true

                , request: {
                    pageName: 'page' //页码的参数名称，默认：page
                    , limitName: 'limit' //每页数据量的参数名，默认：limit
                }

                , toolbar: '#toolbarDemo'


                , title: '用户数据表'

                , limit: 12

                , cols: [[


                    {field: 'EmpId', title: '序号', width:'5%',  sort: true,align: "center"}

                    , {field: 'EmpName', title: '员工姓名', width: '7%',align: "center"}

                    , {field: 'EmpSex', title: '员工性别', width:'5%',sort: true,align: "center"}

                    , {field: 'EmpAge', title: '员工年龄', width:'5%',  sort: true,align: "center"}

                    , {field: 'EmpAddress', title: '家庭地址', width: '15%',align: "center"}

                    , {field: 'EmpPhone', title: '联系方式', width:'20%',sort: true,align: "center"}


                    , {field: 'EmpTime', title: '入职时间', width: '15%',align: "center"}

                    , {field: 'EmpIdentity', title: '身份证号码', width:'18%',sort: true,align: "center"}



                    , {fixed: 'right', title: '操作',width:'10%', toolbar: '#barDemo',align:"center"}

                ]]

                , page: true
                ,done: function(res, curr, count){

                    $.ajax({url:'../ServletstShow',
                        type:"post",
                        async:true,

                        error:function(){
                        },

                        data: {"page":1,"limit":99999},
                        success:function(data){

                            var str= data.substring(data.indexOf('['),data.lastIndexOf(']')+1);

                            var html = '';

                            $.each(JSON.parse(str), function(idx, obj) {
                                $("#select").append("<option value='"+obj.LocName+"' name='"+obj.LocId+"'>"+obj.LocName+"</option>");
                            });
                            layui.form.render("select");
                            $("#select option[name='"+wai+"']").prop("selected","selected");
                        }

                    });
                }
            });


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
                        content: 'Sub/staff_upd.jsp?id='+data.EmpId+"&name="+data.EmpName+"&sex="+data.EmpSex+"&age="+data.EmpAge+"&address="+data.EmpAddress+"&phone="+data.EmpPhone+"&time="+data.EmpTime+"&num="+data.EmpIdentity+"&wai="+$("#select").find("option:selected").attr("name"),//跳转的页面

                        cancel: function (index) {
                            $(".layui-laypage-btn").click();//这里用于关闭Open时触发回调函数  刷新父页面数据  一定要引入Jquery
                        }
                    });
                /*  注：在这里我不就做修改界面了
                  这里这只是一个弹出框
                  弹出你的修改页面
                  Content中你自定义自己的页面路径并传参数*/
            } if (layEvent === 'del')//删除数据
            {
                /*  删除数据在这里可以使用Ajax异步
                  就和平常使用一样简单*/
                /*  删除数据在这里可以使用Ajax异步
                 就和平常使用一样简单*/
                layer.confirm('您确定删除id：' + data.EmpId + '的数据吗？', function (index) {
                    //向服务端发送删除指令，在这里可以使用Ajax异步
                    $.post("../staff_del", {id: data.EmpId}, function (ret) {
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


    //列表赋值


    //添加
    function funp() {
        var wai = $("#select").find("option:selected").attr("name");
        if (wai < 0) {
            layer.msg("请选择职位",{time:1000})
        } else {
            layer.open({
                type: 2,
                title: '员工添加',

                area: ['50%', '90%'],
                shadeClose: false, //点击遮罩关闭
                content: 'Sub/staff_add.jsp?wai=' + $("#select").find("option:selected").attr("name")

            });
        }
    }









    // layui.use(['table', 'form'], function() {
    //
    //     var form = layui.form,
    //         table = layui.table;
    //     $.post('../ServletdpShow', {id:1},function(res) {
    //
    //         var html = '';a
    //         $.each(JSON.parse(res), function(idx, obj) {
    //             html+=" <option value="+obj.DepId+">"+obj.DepName+"</option>"
    //         });
    //
    //         $("#select").html(html);
    //         form.render('select');
    //     })
    //
    //     form.on('select(myselect)', function(res) {
    //
    //         var data = {
    //             id: res.value
    //         }
    //         var id = data.id;
    //         $.post("Servletddd", {id: id}, function (ret) {
    //
    //             alert(ret)
    //
    //             table.render({
    //
    //
    //                 elem: '#complainTable'
    //                 , url: "Servletddd?id="+2
    //
    //                 , even: true
    //
    //                 , request: {
    //                     pageName: 'page' //页码的参数名称，默认：page
    //                     , limitName: 'limit' //每页数据量的参数名，默认：limit
    //                 }
    //
    //                 , toolbar: '#toolbarDemo'
    //
    //                 , title: '用户数据表'
    //
    //                 , limit: 15
    //
    //                 , cols: [[
    //
    //
    //                     , {field: 'id', title: '序号', width: 80, fixed: 'left', unresize: true, sort: true}
    //
    //                     , {field: 'username', title: '名字', width: 100}
    //
    //                     , {field: 'sex', title: '性别', sort: true}
    //                     , {field: 'city', title: '名字', width: 100}
    //
    //                     , {field: 'sign', title: '性别', sort: true}
    //                     , {field: 'experience', title: '名字', width: 100}
    //
    //                     , {field: 'logins', title: '性别', sort: true}
    //                     , {field: 'wealth', title: '性别', sort: true}
    //                     , {field: 'classify', title: '性别', sort: true}
    //                     , {field: 'score', title: '性别', sort: true}
    //
    //
    //                     , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 150}
    //
    //                 ]]
    //                 , date: ret
    //                 , page: true
    //
    //             });
    //
    //         });
    //
    //
    //
    //
    //     })
    //
    // });
    layui.use('form', function () {
        getClassify();
    })

    function getClassify() {
        $.ajax({url:'../ServletstShow',
            type:"post",
            async:true,

            error:function(){
            },

            data: {"page":1,"limit":99999},
            success:function(data){

                var str= data.substring(data.indexOf('['),data.lastIndexOf(']')+1);

                var html = '';

                $.each(JSON.parse(str), function(idx, obj) {
                    $("#select").append("<option value='"+obj.LocName+"' name='"+obj.LocId+"'>"+obj.LocName+"</option>");
                });
                layui.form.render("select");

            }

        });
    }



</script>
<script>


</script>

</body>
</html>