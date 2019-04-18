$(function () {
    //获取为你推荐的图片信息
    $.ajax({
        url : "img",//请求的url
        dataType : "json",//后台数据返回类型
        success : function(data) {//响应成功执行的方法
            for(var i=0;i<data.length;i++){
                var li="<li><img src='img/"+data[i].img+"'><li>";
                $(".ul").append(li);
            }
        }
    })

    //关注列表跳转页面
    $('.contant ul.list').on('click', 'li', function (e) {
        e.preventDefault();
        var fid = $(this).index();
        sessionStorage['followId'] = fid + 1;
        if (fid == 0) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 1) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 2) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 3) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 4) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 5) {
            location.href = 'petal_bizi.html';
        }
        else if (fid == 6) {
            location.href = 'petal_bizi.html';
        }
    })


})//function的结尾

window.load=show(0);
//更多加载
function show(pageNo) {
    $.ajax({
        url : "img",//请求的url
        data:{"pageNo":pageNo},
        dataType : "json",//后台数据返回类型
        success : function(data) {//响应成功执行的方法
            for (var i = 0; i < data.length; i++) {
                var li = "<li><img src='img/" + data[i].img + "'><li>";
                $(".ul").append(li);
            }
            $("#loadmore").one("click", function(){show(pageNo + 1);});
        }
    })
}

//关注列表跳转

