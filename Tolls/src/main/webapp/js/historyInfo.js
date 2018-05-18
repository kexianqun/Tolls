$(function () {
    //查询该用户所有预约记录
    var userid = $('#userid').val();
    console.log("查询的用户"+userid);
    $.ajax({
        url: '/tolls/carorder/showByuser',
        datatype: 'json',
        data: {
            "userid":userid
        },
        type: 'POST',
        success: function (data){
            var lenth = data.errorList.length;
            if(lenth == 0){
                //动态拼接dom
                console.log(data.tradeMap.carorder)
                var mList = data.tradeMap.carorder;
                for(i in mList){
                    var tr;
                    tr = '<td>'+ mList[i].username+'</td><td>'+ mList[i].lpnumber+'</td><td>'+ mList[i].enTolls+'</td><td>'+ mList[i].exTolls+'</td><td>'+ mList[i].ordertime+'</td>' +
                        '<td>'+ mList[i].passtime+'</td><td>'+ mList[i].tel+'</td><td>'+ mList[i].checkState+'</td><td>'+ mList[i].orderState+'</td><td>'+ mList[i].description+'</td>';
                    $("#order_tab").append('<tr>'+tr+'</tr>');
                }
            }else{
                alert(data.errorList[0]);
            }
        }
    });
})