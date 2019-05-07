var fid=sessionStorage['followId'];//获取画板id
$(function () {
    $.ajax({
        type:'post',
        url:'ju',
        data:{'fid':fid},
        dataType:"json",
        success: function (data) {
            //读取标题与内容
            $("#hhh").text(data.hname);
            $(".info").text(data.context);
            /*   //关注者头像
               for(var j=0;j<data[i].usersList.length;j++){
                   var a="<a class='\"followers_item\" ' href=\"#\">\n" +
                       "<img src='"+data[i].usersList[j].img+"' alt=\"\">\n" +
                       "</a>"
                   $(".followers").append(a);
               }*/

        }
    })//画板关注信息结尾

    //关注者头像
    $.ajax({
        type:'post',
        url:'heder',
        data:{'fid':fid},
        dataType:"json",
        success: function (data) {
            for(var i=0;i<data[0].usersList.length;i++){
                var a="<a class='\"followers_item\" ' href=\"#\">\n" +
                    "<img src='"+data[0].usersList[i].img+"' alt=\"\">\n" +
                    "</a>"
                $(".followers").append(a);
            }
        }
    })//关注着头像结尾
})

//点击画板关注
function gaunzhu(){
    //验证用户是否登录才能点击关注

}