
$(function () {

    var fid = getRequest().hid;
    alert("fid" + fid)
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

//返回?后的json对象
function getRequest() {
    //获取url中"?"符后的字串
    var url = location.search;
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        var strs = str.split("&");
        for (var i = 0; i < strs.length; i++) {
            //theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
            //theRequest[strs[i].split("=")[0]] = decodeURI(strs[i].split("=")[1]);
            theRequest[strs[i].split("=")[0]] = decodeURIComponent(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}


