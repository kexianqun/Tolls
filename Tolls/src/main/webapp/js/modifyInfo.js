$(function () {
    var userid = $('#userid').val();
    $.ajax({
        url: '/tolls/user/show',
        datatype: 'json',
        data: {
            "userid":userid
        },
        type: 'POST',
        success: function (data){
            var lenth = data.errorList.length;
            if(lenth == 0){
                //查询成功,给dom赋值
                var user  = data.tradeMap.user;
                $('#username').val(user.username);
                var sex = user.gender;
                if(sex=="男"){
                    $(":radio[name='gender'][value='男']").attr("checked","checked");
                }else{
                    $(":radio[name='gender'][value='女']").attr("checked","checked");
                }
                $('#address').val(user.address);
                $('#birthday').val(user.birthday);
                $('#telphone').val(user.tel);
                $('#idno').val(user.idnumber);
                $('#dlNumber').val(user.dlnumber);
                $('#credit').val(user.credit);
            }else{
                alert(data.errorList[0]);
            }
        }
    });
})

//保存
function save() {
    var userid = $('#userid').val();
    var username = $('#username').val();
    var password = $('#password').val();
    var gender = $('input:radio[name="gender"]:checked').val();
    var address = $('#address').val();
    var birthday = $('#birthday').val();
    var tel = $('#telphone').val();
    var idnumber = $('#idno').val();
    var dlnumber = $('#dlNumber').val();
    var credit = $('#credit').val();
    if(username==null||username==""||username==undefined){
        alert("请填写用户名");
    }else if(gender==null||gender==""||gender==undefined){
        alert("请选择性别");
    }else if(address==null||address==""||address==undefined){
        alert("请填写地址");
    }else if(birthday==null||birthday==""||birthday==undefined){
        alert("请选择出生日期");
    }else if(tel==null||tel==""||tel==undefined){
        alert("请填写电话号码");
    }else if(idnumber==null||idnumber==""||idnumber==undefined){
        alert("请填写身份证号");
    }else if(dlnumber==null||dlnumber==""||dlnumber==undefined){
        alert("请填写驾照编码");
    }else{
        var user = {
            "userId":userid,
            "username":username,
            "password":password,
            "gender":gender,
            "birthday":birthday,
            "address":address,
            "tel":tel,
            "idnumber":idnumber,
            "dlnumber":dlnumber,
            "credit":credit,
            "deleted":0
        };
        var userJson = JSON.stringify(user);
        $.ajax({
            url: '/tolls/user/update',
            datatype: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: userJson,
            type: 'POST',
            success: function (data){
                var lenth = data.errorList.length;
                if(lenth == 0){
                    //修改成功，刷新页面
                    alert(data.tradeMap.STATE);
                    location.reload();
                }else{
                    alert(data.errorList[0]);
                }
            }
        });
    }

}