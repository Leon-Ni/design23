<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>
  <script type="text/javascript" src="http://malsup.github.com/jquery.form.js"></script>
</head>
<body>
<form id="form1" action="post.php" method="post">
  <input name="test" value="" />
  <input type="submit" name="s" value="submit" />
  <input type="button" id="cancel" value="cancel" />
</form>
<script type="text/javascript">
    var options = {
        error: function(XMLHttpRequest, textStatus) {
            // 解除取消事件
            $('#cancel').unbind('click');
            alert('click: \n' + textStatus);
        },
        success: function(responseText) {
            // 解除取消事件
            $('#cancel').unbind('click');
            alert('responseText: \n' + responseText);
        }
    };

    $('#form1').submit(function() {
        $(this).ajaxSubmit(options);
        var jqxhr = $(this).data('jqxhr');
        // 绑定取消事件
        $('#cancel').bind('click', function(){
            jqxhr.abort();
        });
        return false;
    });
</script>
</body>
</html>