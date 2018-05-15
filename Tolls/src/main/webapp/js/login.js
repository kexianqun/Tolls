/**
 * 登录
 */
function login() {
    //获取输出框的值
    var username = $('#username').val();
    var password = $('#password').val();
    if(username==null||username==""||username==undefined){
        alert("请输入用户名");
    }else if(password==null||password==""||password==undefined){
        alert("请输入密码");
    }else{
        var user = {
            "username":username,
            "password":password
        }
        var userJson = JSON.stringify(user);
        $.ajax({
            url: '/tolls/user/login',
            datatype: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: userJson,
            type: 'POST',
            success: function (data){
                var lenth = data.errorList.length;
                if(lenth == 0){
                    window.location.href='/tolls/user/order.jsp';
                }else{
                    alert(data.errorList[0]);
                }
            }
        });
    }
}