var fid=sessionStorage['followId'];//获取画板id
$(function () {
    $.ajax({
        type:'post',
        url:'ju',
        data:{'fid':fid},
        dataType:"json",
        success: function (data) {
            //读取标题与内容
            for (var i = 0; i < data.length; i++) {
                $("#hhh").text(data[i].hname);
                $(".info").text(data[i].describe);
            }
        }
    })//画板关注信息结尾

    //关注者头像
    $.ajax({
        type:'post',
        url:'heder',
        data:{'fid':fid},
        dataType:"json",
        success: function (data) {
            // alert(JSON.stringify(data))
            for(var i=0;i<data[0].usersList.length;i++){
                var a="<a class='\"followers_item\" ' href=\"#\">\n" +
                    "<img src='img/" + data[0].usersList[i].img + "' alt=\"\">\n" +
                    "</a>"
                $(".followers").append(a);
            }
        }
    })//关注着头像结尾


})



