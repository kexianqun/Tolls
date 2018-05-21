/**
 * 管理员登录
 */
function adminLogin() {
    //获取输出框的值
    var name = $('#name').val();
    var password = $('#password').val();
    if(name==null||name==""||name==undefined){
        alert("请输入用户名");
    }else if(password==null||password==""||password==undefined){
        alert("请输入密码");
    }else{
        var manager = {
            "mngname":name,
            "password":password
        }
        var managerJson = JSON.stringify(manager);
        $.ajax({
            url: '/tolls/manager/login',
            datatype: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: managerJson,
            type: 'POST',
            success: function (data){
                var lenth = data.errorList.length;
                if(lenth == 0){
                    window.location.href='/tolls/manager/newsRel.jsp';
                }else{
                    alert(data.errorList[0]);
                }
            }
        });
    }
}