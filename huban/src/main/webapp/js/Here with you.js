$(function () {
    //关注列表跳转页面
    $('.contant ul.list').on('click', 'li', function (e) {
        e.preventDefault();//防止上面的链接打开 URL
        var fid = $(this).index();
        sessionStorage['followId'] = fid + 1;//相同浏览器的不同页面间可以共享相同的数据
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


})


window.load = waterFall("aa", "view-on");

// 瀑布流函数
function waterFall(parent, child) {
    // 父盒子居中，取得所有父盒字
    //先获得父元素及其底下所有的子元素
    var oParent = document.getElementById(parent);
    if (oParent == null) return;
    var allBox = oParent.getElementsByClassName(child);
    //    获取子盒子高度
    //    var boxWidth = allBox[0].offsetWidth;
    var boxWidth = allBox[0].offsetWidth;
    // 求出列数
    var cols = oParent.offsetWidth / boxWidth - 1;
    var xyMargin = 16;
    //    定义高度数组
    var arrH = [];

    // 遍历盒子
    for (var i = 0; i < allBox.length; i++) {
        // 求出每个盒子的高度
        var boxH = allBox[i].offsetHeight + xyMargin;
        if (i < cols) {
            // heightArr.push(boxHeight); //第一行
            arrH.push(boxH);
            allBox[i].style.position = "absolute";
            allBox[i].style.left = i * (boxWidth + xyMargin) + 'px';
            allBox[i].style.top = xyMargin + 'px';
        } else {
            // 取出最矮的盒子高度
            var minH = Math.min.apply(null, arrH);
            //求出最矮盒子的对应所引
            var minIndex = getMinBoxIndex(arrH, minH);
            //子盒子定位
            allBox[i].style.position = 'absolute';
            allBox[i].style.left = minIndex * (boxWidth + xyMargin) + 'px';
            allBox[i].style.top = minH + xyMargin + 'px';
            arrH[minIndex] += boxH;
        }
    }
    // 更新父盒子的高度
    var parentHeight = allBox[allBox.length - 1].offsetTop + allBox[allBox.length - 1].offsetHeight;
    oParent.style.height = parentHeight;
};

//获取最小下标函数
function getMinBoxIndex(arr, min) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] === min) {
            return i;
        }
    }
}


