function addorder() {
    //获取页面数据
    var userid = $('#userid').val();
    var username = $('#username').val();
    var plateNumber = $('#plateNumber').val();
    var intoll = $('#intoll').val();
    var outtoll = $('#outtoll').val();
    var passdate = $('#passtime').val();
    var time = $('#timepicker1').val();
    var index = time.indexOf(":");
    var hour = parseInt(time.substring(0,index));
    var t = time.substring(time.length-2);
    console.log(t+"---"+hour);
    if(t=="AM"){
        time = time.substring(0,time.length-2);
        console.log("AM时间："+time);
    }else{
        var h = 12+hour;
        time = h+""+time.substring(index,time.length-2);
        console.log("PM时间："+time);
    }
    var passtime = passdate+" "+time;
    var description = $('#description').val();
    var addpicture = $('#add_pic').val();
    var index = addpicture .lastIndexOf("\\");
    addpicture  = ""+addpicture .substring(index + 1, addpicture .length);
    console.log(addpicture);
    var check = "待审核";
    var state = "未通过";
    var deleted = 0;
    var tel = $('#tel').val();
    if(username==null||username==""||username==undefined){
        alert("请填写预约人姓名");
    }else if(plateNumber==null||plateNumber==""||plateNumber==undefined){
        alert("请填写车牌号");
    }else if(intoll==null||intoll==""||intoll==undefined){
        alert("请选择入口收费站");
    }else if(outtoll==null||outtoll==""||outtoll==undefined){
        alert("请选择出口收费站");
    }else if(passtime==null||passtime==""||passtime==undefined){
        alert("请选择通过日期以及时间");
    }else if(description==null||description==""||description==undefined){
        alert("请填写货物描述");
    }else if(tel==null||tel==""||tel==undefined){
        alert("请填写预约人电话号码");
    }else{
        var order = {
            "username":username,
            "lpnumber":plateNumber,
            "enTolls":intoll,
            "exTolls":outtoll,
            "passtime":passtime,
            "description":description,
            "tel":tel,
            "addpicture":addpicture,
            "checkState":check,
            "orderState":state,
            "deleted":deleted
        };
        var orderJson = JSON.stringify(order);
        //增加预约信息
        $.ajax({
            url: '/tolls/carorder/insert',
            datatype: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: orderJson,
            type: 'POST',
            success: function (data){
                var lenth = data.errorList.length;
                if(lenth == 0){
                    //预约成功
                    var order = data.tradeMap.carorder;
                    console.log(order);
                    var oid = order.orderId;
                    alert("预约成功");
                    // window.location.href='/tolls/user/orderXQ.jsp?'+'txt='+oid;
                }else{
                    alert(data.errorList[0]);
                }
                $.ajax({
                    url: '/tolls/carorder/upload',
                    type: "POST",
                    processData: false,
                    contentType: false,
                    data: formData,
                    success: function(d) {
                        console.log(d);
                    }
                });
            },
            error:function (data) {
            }
        });
    }
    //获取文件
    var formData = new FormData();
    formData.append('img', $('#file')[0].files[0]);
    console.log(formData);
    //文件上传
    $.ajax({
        url: '/tolls/carorder/upload',
        type: "POST",
        async: false,
        cache: false,
        processData: false,
        contentType: false,
        data: formData,
        success: function(d) {
            console.log(d);
        }
    });
}

//下拉框查询入口收费站
function getinTolls() {
    var tolls = $('#intoll').val();
    if(tolls==""||tolls==null){
        $.ajax({
            type: "POST",
            url: "/tolls/tolls/show",
            dataType:"json",
            success: function (data) {
                var lenth = data.errorList.length;
                if(lenth != 0){
                    alert(data.errorList[0]);
                }else {
                    //动态增加option
                    $('#intoll option').not(":first").remove();
                    var mList = data.tradeMap.tolls;
                    console.log(mList);
                    for(i in mList){
                        var tname = mList[i].tollsname;
                        var tid = mList[i].tollsId;
                        var option='<option value ="'+ tid +'">'+ tname +'</option>'
                        $('#intoll').append(option);
                    }
                }
            }
        });
    }
}

//下拉框查询出口收费站
function getoutTolls() {
    var tolls = $('#outtoll').val();
    if(tolls==""||tolls==null){
        $.ajax({
            type: "POST",
            url: "/tolls/tolls/show",
            dataType:"json",
            success: function (data) {
                var lenth = data.errorList.length;
                if(lenth != 0){
                    alert(data.errorList[0]);
                }else {
                    //动态增加option
                    $('#outtoll option').not(":first").remove();
                    var mList = data.tradeMap.tolls;
                    for(i in mList){
                        var tname = mList[i].tollsname;
                        var tid = mList[i].tollsId;
                        var option='<option value ="'+ tid +'">'+ tname +'</option>'
                        $('#outtoll').append(option);
                    }
                }
            }
        });
    }
}

$(function () {
    getinTolls();
    getoutTolls();
})

