<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/18
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
    <title>Title</title>

    <style>
        .layui-form-label{
            width: 100px;
        }
        .layui-input-block {
            margin-left: 130px;
            min-height: 36px;
            width:80%
        }
    </style>
</head>
<body class="body">
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>修改部门</legend>
</fieldset>

<form class="layui-form layui-from-pane"  style="margin-top:20px" >
    <div class="layui-form-item" style="display: none">
        <label class="layui-form-label">id</label>

        <div class="layui-input-block">
            <input type="text" value="${param.id}" name="name" id="id" required  lay-verify="required" autocomplete="off" placeholder="请输入部门名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-block">
            <input type="text" value="${param.name}" name="num" id="name" required  lay-verify="required" autocomplete="off" placeholder="请输入部门人数" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            男<input type="radio" name="sex" checked="checked" value="男">
            女<input type="radio" name="sex"  value="女">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>

        <div class="layui-input-block">
            <input type="text" value="${param.age}" name="age" id="age" required  lay-verify="required" autocomplete="off" placeholder="请输入部门名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">地址</label>
        <div class="layui-input-block">
            <input type="text" value="${param.address}" name="address" id="address" required  lay-verify="required" autocomplete="off" placeholder="请输入部门人数" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">联系方式</label>
        <div class="layui-input-block">
            <input type="text" value="${param.phone}" name="phone" id="phone"  required  lay-verify="required" autocomplete="off" placeholder="请输入部门描述" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" >
        <label class="layui-form-label">入职时间</label>
        <div class="layui-input-block">
            <input type="date" name="time" id="time"
                   autocomplete="off" placeholder="请输入入职时间"  class="layui-input">

        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证</label>

        <div class="layui-input-block">
            <input type="number" value="${param.num}" name="num" id="num" required  lay-verify="required" autocomplete="off" placeholder="请输入身份证" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="display: none">
        <label class="layui-form-label">职位</label>

        <div class="layui-input-block">
            <input type="text" value="${param.wai}" name="wai" id="wai" required  lay-verify="required" autocomplete="off" placeholder="请输入部门名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="margin-top:40px">
        <div class="layui-input-block">
            <button class="layui-btn  layui-btn-submit " lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script>

    $('#time').attr('value','${param.time}')
    layui.use('form', function(){
        var form = layui.form


        //监听提交
        form.on('submit(demo1)', function(data) {
            var id = $("#id").val();
            var sex= $('input:radio:checked').val();
            var name = $("#name").val();
            var age = $("#age").val();
            var address = $("#address").val();
            var phone = $("#phone").val();
            var num = $("#num").val();
            var time = $("#time").val();
            var wai =  $("#wai").val();

            // $.ajax({
            //     url: "../../Servletdpadd",    // 提交到controller的url路径
            //     type: "post",    // 提交方式
            //     data: {"name": name, "num": num,"text":text},  // data为String类型，必须为 Key/Value 格式。
            //        // 服务器端返回的数据类型
            //
            //         success: function (data) {
            //             // 请求成功后的回调函数，其中的参数data为controller返回的map,也就是说,@ResponseBody将返回的map转化为JSON格式的数据，然后通过data这个参数取JSON数据中的值
            //             if(data==="1"){
            //                 layer.msg("成功",{icon: 1, time: 1500}, function () {
            //
            //                     layer.close(index);
            //                     $(".layui-laypage-btn").click();//点击分页刷新当前页
            //                 });
            //             }else {
            //                 layer.alert("请先删除部门", {icon: 2,time:1500}, function () {
            //                     layer.close(index);
            //                     $(".layui-laypage-btn").click();
            //                      window.location.reload();  刷新父窗口
            //                 });
            //             }
            //         }
            // });




            $.ajax({

                url: "../../staff_upd",    // 提交到controller的url路径
                type: "post",    // 提交方式
                data:{"EmpId":id,"EmpName": name, "EmpSex":sex,"EmpAge":age,"EmpAddress":address,"EmpPhone":phone,"EmpIdentity":num,"EmpTime":time,"PostionId":wai}, // data为String类型，必须为 Key/Value 格式。
                // 服务器端返回的数据类型
                async : false,
                success: function (data) {

                    if(data==="1"){
                        parent.layer.msg("修改成功", {icon: 1,time:1000}, function () {

                            // $(".layui-laypage-btn").click();
                            window.parent.location.reload();  //刷新父窗口
                            // parent.layer.closeAll() ;
                            //  var index = parent.layer.getFrameIndex(window.name);
                            //  parent.layer.close(index);

                        });


                    }

                }

            });






        })
        return false;
    });
</script>

</body>
</html>
