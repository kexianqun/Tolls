$(function () {
    toPage(0);
    //查询共有多少条记录
    var userid = $('#userid').val();
    $.ajax({
        url: '/tolls/carorder/showCount',
        datatype: 'json',
        data:{
           "userid":userid
        },
        type: 'POST',
        success: function (data){
            console.log(data.tradeMap);
            var num = data.tradeMap.Count;
            console.log("共有记录条数："+num);
            var curPage = 1;
            var pages = Math.ceil(num/10);
            if(num!=undefined){
                $('#mNum_span').html("共有"+num+"条信息，");
                $('#curpage_span').html(curPage);
                $('#pages_span').html(pages);
            }
        }
    });
})

//到指定页数
function toPage(page) {
    var from =page*5;
    var to = 5;
    //查询该用户所有预约记录
    var userid = $('#userid').val();
    console.log("查询的用户"+userid);
    $.ajax({
        url: '/tolls/carorder/showByuser',
        datatype: 'json',
        data: {
            "userid":userid,
            "from":from,
            "to":to
        },
        type: 'POST',
        success: function (data){
            var lenth = data.errorList.length;
            if(lenth == 0){
                //动态拼接dom
                console.log(data.tradeMap.carorder)
                var mList = data.tradeMap.carorder;
                $("#order_tab  tr:not(:first)").empty("");
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
}

//下一页
function nextPage() {
    var curPage = parseInt($('#curpage_span').text());
    var pages = parseInt($('#pages_span').text());
    console.log("当前页数："+curPage);
    if(curPage==pages){
        alert("已经到最后一页了")
    }else{
        curPage+=1;
        $('#curpage_span').html(curPage);
        toPage(curPage-1);
    }
}

//上一页
function previous() {
    var curPage = parseInt($('#curpage_span').text());
    console.log("当前页数："+curPage);
    if(curPage==1){
        alert("已经是首页了")
    }else{
        curPage-=1;
        $('#curpage_span').html(curPage);
        toPage(curPage-1);
    }
}

//转到第几页
function turnPage() {
    var page = $('#curpage_span').text();
    if(page!=""&&page!=null){
        var pages = parseInt($('#pages_span').text());//总页数
        var turnpage = parseInt($('#turnpage').val());//转到页数
        if(turnpage>pages){
            alert("超出总页数范围");
        }else if(turnpage<=0){
            alert("不能转到错误的页数");
        }else{
            var curPage=turnpage;
            $('#curpage_span').html(curPage);
            toPage(curPage-1);
        }
    }
}

//第一页
function firstPage() {
    toPage(0);
}

//第二页
function secondPage() {
    var pages = parseInt($('#pages_span').text());//总页数
    if(pages<2){
        alert("超出总页数范围");
    }else{
        toPage(1);
    }
}

