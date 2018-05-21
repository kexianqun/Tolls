$(function () {
    //查询所有新闻信息
    $.ajax({
        url: '/tolls/news/show',
        datatype: 'json',
        type: 'POST',
        success: function (data){
            var lenth = data.errorList.length;
            if(lenth == 0){
                //动态拼接dom，显示新闻标题
                var news = data.tradeMap.news;
                for(i in news){
                    var tr;
                    tr = '<th><ul><li><a href="javascript:void(0)" onclick="">'+news[i].title+'</a></li></ul></th>';
                    $('#news_tab').append('<tr>'+tr+'</tr>');
                }
            }else{
                alert(data.errorList[0]);
            }
        }
    });
})