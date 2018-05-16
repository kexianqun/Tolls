function addorder() {
    //获取页面数据
    var userid = $('#userid').val();
    var username = $('#username').val();
    var plateNumber = $('#plateNumber').val();
    var intoll = $('#intoll').val();
    var outtoll = $('#outtoll').val();
    var passtime = $('#passtime').val();
    var description = $('#description').val();
    var addpicture = $('#addpicture').val();
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
        alert("请选择通过时间");
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
                    window.location.href='/tolls/user/orderXQ.jsp?'+'txt='+oid;
                }else{
                    alert(data.errorList[0]);
                }
            }
        });
    }
}