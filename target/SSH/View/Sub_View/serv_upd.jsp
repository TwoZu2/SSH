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
    <legend>${param.tou}服务</legend>
</fieldset>

<form class="layui-form layui-from-pane"  style="margin-top:20px" >
    <div class="layui-form-item" style="display: none">
        <label class="layui-form-label">id</label>

        <div class="layui-input-block">
            <input type="text" value="${param.id}" name="name" id="id" required  lay-verify="required" autocomplete="off" placeholder="请输入" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">服务名称</label>
        <div class="layui-input-block">
            <input type="text" value="${param.name}" ${param.zhuang} name="name" id="name" required  lay-verify="required" autocomplete="off" placeholder="请输入服务名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">服务价格</label>
        <div class="layui-input-block">
            <input type="number" value="${param.price}" name="price" id="price" ${param.zhuang} required  lay-verify="required" autocomplete="off" placeholder="请输入服务价格" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">服务介绍</label>

        <div class="layui-input-block">
            <textarea name="text" id="text" ${param.zhuang}  lay-verify="required" autocomplete="off" placeholder="请输入服务介绍" class="layui-textarea">${param.text}</textarea>
        </div>
    </div>

    <div class="layui-form-item" >
        <label class="layui-form-label">服务类型</label>
        <div class="layui-input-block">

            <select id="type1">
                <option value="大">大类型</option>
                <option value="小">小类型</option>
            </select>

        </div>
    </div>
    <div class="layui-form-item" style="margin-top:40px;${param.style}">
        <div class="layui-input-block">
            <button class="layui-btn  layui-btn-submit " lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script>

    $("#type1 option[value=${param.type1}]").prop("selected","selected");

    layui.use('form', function(){
        var form = layui.form


        //监听提交
        form.on('submit(demo1)', function(data) {
            var id = $("#id").val();

            var name = $("#name").val();


            var text = $("#text").val();
            var price = $("#price").val();

            var type1 =  $("#type1").val();





            $.ajax({

                url: "../../Servletservupd",    // 提交到controller的url路径
                type: "post",    // 提交方式
                data:{"id":id,"name": name, "text":text,"type1":type1,"price":price}, // data为String类型，必须为 Key/Value 格式。
                // 服务器端返回的数据类型

                success: function (data) {

                    if(data==="1"){
                        parent.layer.msg("修改成功", {icon: 1,time:1000}, function () {

                            // $(".layui-laypage-btn").click();
                            window.parent.location.reload();  //刷新父窗口
                            // parent.layer.closeAll() ;
                            //  var index = parent.layer.getFrameIndex(window.name);
                            // parent.layer.close(index);

                        });


                    }

                }

            });


            return false;



        })

    });
</script>

</body>
</html>
