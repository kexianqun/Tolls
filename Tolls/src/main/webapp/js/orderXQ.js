$(function () {
    //获取用户ID
    var loc = location.href;
    var n1 = loc.length;//地址的总长度
    var n2 = loc.indexOf("=");//取得=号的位置
    var oid = decodeURI(loc.substr(n2+1, n1-n2));//从=号后面的内容
    console.log("用户编码："+oid);
    //查询所有预约记录
    $.ajax({
        url: '/tolls/carorder/showByoid',
        datatype: 'json',
        data: {
            "orderId":oid
        },
        type: 'POST',
        success: function (data){
            var lenth = data.errorList.length;
            if(lenth == 0){
                //动态拼接dom
                console.log(data.tradeMap.carorder)
                var mList = data.tradeMap.carorder;
                var tr1;
                var passtime = mList.passtime;
                var exTolls = mList.exTolls;
                tr1 = '<td>'+ mList.username+'</td><td>'+ mList.lpnumber+'</td><td>'+ mList.enTolls+'</td><td>'+ mList.exTolls+'</td><td>'+ mList.ordertime+'</td>' +
                    '<td>'+ mList.passtime+'</td><td>'+ mList.tel+'</td><td>'+ mList.description+'</td><td>'+ mList.addpicture+'</td>'+'<td><a href="javascript:void(0)" >取消预约</a></td>';
                var tr2 = '<td colspan="10">您已预约'+passtime+'通过'+exTolls+'收费站，请按照预约时间通行，超过2小时将自动取消</td>';
                $("#order_tab").append('<tr>'+tr1+'</tr>');
                $("#order_tab").append('<tr>'+tr2+'</tr>');
            }else{
                alert(data.errorList[0]);
            }
        }
    });
})