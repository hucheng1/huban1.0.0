//数量减
function jian() {
    //获取数量
    var num=parseInt(document.getElementById("num").innerText);
    //获取金额
    var price=parseInt(document.getElementById("money").innerText);
    if(num<=1){
        alert("数量不能少于1");
        return false;
    }else{
        num=num-1;
        $('#num').html(num);
        //改变金额
        $("#price").html(price*num);
    }
}

//数量加
function jia() {
    //获取数量
    var num=parseInt(document.getElementById("num").innerText);
    //获取金额
    var price=parseInt(document.getElementById("money").innerText);
    //改变数量
      num=num+1;
    $('#num').html(num);
    //改变金额
    $("#price").html(num*price);
}
function  show() {
    if(window.confirm("是否继续付款")==true){
        //继续付款 跳转到后台
        var price=parseInt(document.getElementById("price").innerText);//获取加减后的价格
        var num=parseInt(document.getElementById("num").innerText);//获取数量
        var title=$("input[name='name']").val();//获取项目标题
        var context=$('#desc').val()//获取项目内容
        var sheId=document.getElementById("aa").innerText;
        var fuId=document.getElementById("bb").innerText;
        alert("金额："+price+" 数量："+num+" 项目标题："+title+" 内容:"+context+" 购买设计："+sheId+"  服务方id："+fuId);
/*        $.ajax({
            url:"zu",
            data:{"price":price,"num":num,"title":title,"context":context,"sheId":sheId,"fuId":fuId},
            dataType:"post"
        })*/
        window.location.href="zu?price="+price+"&num="+num+"&title="+title+"&context="+context+"&sheId="+sheId+"&fuId="+fuId;
    }else{
        alert("您已取消付款操作");
    }
}
