var fid=sessionStorage['followId'];//获取画板id
$(function () {
    $.ajax({
        type:'post',
        url:'ju',
        data:{'fid':fid},
        dataType:"json",
        success: function (data) {
            for(var i=0;i<data.length;i++){
                //读取标题与内容
                $("#hhh").text(data[i].hname);
                $(".info").text(data[i].context);
                //关注者头像
                for(var j=0;j<data[i].usersList.length;j++){
                    var a="<a class='\"followers_item\" ' href=\"#\">\n" +
                        "<img src='"+data[i].usersList[j].img+"' alt=\"\">\n" +
                        "</a>"
                    $(".followers").append(a);
                }
            }
        }
    })//画板关注信息结尾
})