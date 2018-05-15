function register() {
    var username = $('#username').val();
    var password = $('#password').val();
    var gender = $('#sex input[name="gender"]:checked ').val();
    var address = $('#address').val();
    var birthday = $('#birthday').val();
    var telphone = $('#tel-phone').val();
    var idNumber = $('#idNumber').val();
    var dlNumber = $('#dlNumber').val();
    if(username==null||username==""||username==undefined){
        alert("请填写用户名");
    }else if(password==null||password==""||password==undefined){
        alert("请填写密码");
    }else if(gender==null||gender==""||gender==undefined){
        alert("请选择性别");
    }else if(address==null||address==""||address==undefined){
        alert("请填写地址");
    }else if(birthday==null||birthday==""||birthday==undefined){
        alert("请选择出生日期");
    }else if(telphone==null||telphone==""||telphone==undefined){
        alert("请填写电话号码");
    }else if(idNumber==null||idNumber==""||idNumber==undefined){
        alert("请填写身份证号");
    }else if(dlNumber==null||dlNumber==""||dlNumber==undefined){
        alert("请填写驾照编码");
    }else{
        var user = {
           "username":username,
            "password":password,
            "gender":gender,
            "address":address,
            "birthday":birthday,
            "tel":telphone,
            "idnumber":idNumber,
            "dlnumber":dlNumber,
            "credit":100,
            "deleted":"0"
        };
        var userJson = JSON.stringify(user);
        $.ajax({
            url: '/tolls/user/register',
            datatype: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: userJson,
            type: 'POST',
            success: function (data){
                var lenth = data.errorList.length;
                if(lenth == 0){
                    //注册成功，跳转到登录页面
                    alert(data.tradeMap.STATE);
                    window.location.href = "/tolls/user/login.jsp";
                }else{
                    alert(data.errorList[0]);
                }
            }
        });
    }
}