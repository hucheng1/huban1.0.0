<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- saved from url=(0032)https://muse.huaban.com/services -->
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta content="ie=edge" http-equiv="x-ua-compatible">
    <title data-react-helmet="true"> 设计服务 - 花瓣美思 - 原创设计平台</title>
    <meta data-react-helmet="true" name="description" content="花瓣美思 - 高质量、高效率、无风险的设计服务">
    <link href="./designService/app-fe7f8bdcdd789e5021a6.css" rel="stylesheet">
    <script>
        var _hmt = _hmt || [];
        (function () {
            var hm = document.createElement("script");
            hm.src = "";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <script>
        window.dataLayer = window.dataLayer || [];

        function gtag() {
            dataLayer.push(arguments);
        }

        gtag('js', new Date());
        gtag('config', 'UA-123333106-2');
    </script>
    <style type="text/css">

        #YSF-BTN-HOLDER {
        position: fixed;
        right: 30px;
        bottom: 24px;
        cursor: pointer;
        overflow: visible;
        filter: alpha(opacity=100);
        opacity: 1;
        z-index: 9990
    }

    #YSF-BTN-HOLDER:hover {
        filter: alpha(opacity=95);
        opacity: .95
    }

    #YSF-BTN-HOLDER img {
        display: block;
        overflow: hidden;
    }

    #YSF-BTN-CIRCLE {
        display: none;
        position: absolute;
        right: -5px;
        top: -6px;
        width: auto;
        min-width: 12px;
        height: 20px;
        padding: 0 4px;
        background-color: #f00;
        font-size: 12px;
        line-height: 20px;
        color: #fff;
        text-align: center;
        white-space: nowrap;
        font-family: sans-serif;
        border-radius: 10px;
        z-index: 1;
    }

    #YSF-BTN-BUBBLE {
        display: none;
        position: absolute;
        left: -274px;
        bottom: -15px;
        width: 278px;
        height: 80px;
        box-sizing: border-box;
        padding: 14px 22px;
        filter: alpha(opacity=100);
        opacity: 1;
        background: url(https://qiyukf.com/sdk//res/img/sdk/bg_floatMsg2x.png) no-repeat;
        background: url(https://qiyukf.com/sdk//res/img/sdk/bg_floatMsg.png) 9;
        background-size: 278px 80px;
        z-index: 1;
    }

    #YSF-BTN-HOLDER.layer-6 {
        bottom: 0;
    }

    #YSF-BTN-HOLDER.layer-1 #YSF-BTN-BUBBLE {
        top: 0
    }

    #YSF-BTN-HOLDER.layer-6 #YSF-BTN-BUBBLE {
        bottom: -6px;
    }

    #YSF-BTN-BUBBLE:hover {
        filter: alpha(opacity=95);
        opacity: .95
    }

    #YSF-BTN-CONTENT {
        height: 45px;
        padding: 0;
        white-space: normal;
        word-break: break-all;
        text-align: left;
        font-size: 14px;
        line-height: 1.6;
        color: #222;
        overflow: hidden;
        z-index: 0;
    }

    #YSF-BTN-ARROW {
        display: none;
    }

    #YSF-BTN-CLOSE {
        position: absolute;
        width: 15px;
        height: 15px;
        right: 4px;
        top: -3px;
        filter: alpha(opacity=90);
        opacity: .9;
        cursor: pointer;
        background: url(https://qiyukf.com/sdk//res/img/sdk/btn-close.png) no-repeat;
        z-index: 1
    }

    #YSF-BTN-CLOSE:hover {
        filter: alpha(opacity=100);
        opacity: 1;
    }

    #YSF-PANEL-CORPINFO.ysf-chat-layeropen {
        width: 511px;
        height: 470px;
        box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
    }

    #YSF-PANEL-CORPINFO {
        position: fixed;
        bottom: 0px;
        right: 20px;
        width: 0;
        height: 0;
        z-index: 99999;
    }

    #YSF-PANEL-INFO.ysf-chat-layeropen {
        width: 311px;
        height: 470px;
        filter: alpha(opacity=100);
        opacity: 1;
        box-shadow: 0 0 20px 0 rgba(0, 0, 0, .15);
    }

    #YSF-PANEL-INFO {
        position: fixed;
        bottom: 0px;
        right: 20px;
        width: 0px;
        height: 0px;
        filter: alpha(opacity=0);
        opacity: 0;
        z-index: 99999;
    }

    #YSF-PANEL-INFO .u-btn {
        background-color: #62A8EA
    }

    #YSF-CUSTOM-ENTRY {
        background-color: #F96868;
    }

    #YSF-CUSTOM-ENTRY-0 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-1 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 14px;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-2 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 0;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-3 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 50%;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-4 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 50%;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-5 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 5px;
        box-shadow: 0px 6px 10px 0px rgba(0, 0, 0, 0.25);
    }

    #YSF-CUSTOM-ENTRY-6 {
        position: relative;
        width: auto;
        background-color: #62A8EA;
        border-radius: 5px;
        border-bottom-left-radius: 0;
        border-bottom-right-radius: 0;
    }

    #YSF-CUSTOM-ENTRY-0 img {
        max-width: 300px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-1 img {
        width: 28px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-2 img {
        width: 58px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-3 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-4 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-5 img {
        width: 60px;
        height: auto;
    }

    #YSF-CUSTOM-ENTRY-6 img {
        width: 115px;
        height: auto;
    }

    #YSF-IFRAME-LAYER {
        border: 0;
        outline: none;
    }

    .ysf-online-invite-wrap {
        z-index: 10001;
        position: fixed;
        _position: absolute;
        top: 50%;
        left: 50%;
    }

    .ysf-online-invite {
        position: relative;
        top: -50%;
        left: -50%;
        cursor: pointer;
    }

    .ysf-online-invite img {
        display: block;
        width: 250px;
    }

    .ysf-online-invite .ysf-online-invite-img {
        width: 100%;
        height: 100%
    }

    .ysf-online-invite .text {
        position: absolute;
        top: -11px;
        left: 0;
        right: 0;
        overflow: hidden;
        margin: 36px 20px 0 67px;
        line-height: 140%;
        color: #526069;
        font-size: 14px;
        font-family: "Microsoft YaHei", "微软雅黑", tahoma, arial, simsun, "宋体";
        text-align: left;
        white-space: normal;
        word-wrap: break-word;
    }

    .ysf-online-invite .close {
        position: absolute;
        top: -6px;
        right: -6px;
        width: 32px;
        height: 32px;
        background: url(https://qiyukf.com/sdk/res/img/invite-close.png) no-repeat;
        cursor: pointer;
    }

    .ysf-online-invite .close.custom {
        top: -16px;
        right: -16px;
    }

    #YSF-PANEL-MOBILE {
        background: rgba(46, 47, 49, 0.7);
        position: fixed;
        bottom: 0px;
        right: 0px;
        width: 100%;
        height: 0px;
        transition-property: height, bottom;
        transition-duration: 0.3s;
        transition-timing-function: ease;
        transition-delay: 0s;
        z-index: 9999;
    }

    #YSF-PANEL-MOBILE.ysf-chat-layeropen {
        width: 100%;
        height: 100%;
        transition-property: height, bottom;
        transition-duration: 0.3s;
        transition-timing-function: ease;
        transition-delay: 0s;
    }

    #YSF-IFRAME-LAYER.ysf-chat-mobile-layeropen {
        height: 90% !important;
        transition-property: height, bottom;
        transition-duration: 0.3s;
        transition-timing-function: ease;
        transition-delay: 0s;
    }

    #YSF-IFRAME-LAYER {
        position: absolute;
        bottom: 0px;
        left: 0;
        right: 0px;
        width: 0px;
        height: 0px;
        transition-property: height, bottom;
        transition-duration: 0.3s;
        transition-timing-function: ease;
        transition-delay: 0s;
        z-index: 9999;
    }

    .YSF-PANEL-BODY-FIXED {
        position: fixed !important;
        left: 0;
        right: 0;
    }
    </style>
    <link rel="shortcut icon" href="https://muse.huaban.com/assets/57817251462a6d174e80efc8d975d352.ico"
          data-react-helmet="true">
</head>
<body>
<div id="app">
    <div class="app" data-reactroot="" data-reactid="1" data-react-checksum="1123983324"><!-- react-empty: 2 -->
        <!-- react-empty: 3 -->
        <div class="header navi" id="header" data-reactid="4">
            <nav class="ui container ui menu" data-reactid="5"><a class="brand item" href=""
                                                                  data-reactid="6"><i class="graph logo text"
                                                                                      data-reactid="7"></i></a><a
                    class="item" href="designMain.html" data-reactid="8">首页</a>
                <div class="ui service dropdown item" data-reactid="9"><a class="item active"
                                                                          href=""
                                                                          data-reactid="10">设计服务</a><i
                        class="icon dropdown" data-reactid="11"></i>
                    <div class="submenu" data-reactid="12">
                        <div class="ui vertical harp two wides arrow left menu" data-reactid="13"><a class="item"
                                                                                                     href=""
                                                                                                     data-reactid="14">LOGO/品牌</a><a
                                class="item" href=""
                                data-reactid="15">平面设计</a><a class="item"
                                                             href=""
                                                             data-reactid="16">UI 设计</a><a class="item"
                                                                                           href=""
                                                                                           data-reactid="17">绘画/插画</a><a
                                class="item" href=""
                                data-reactid="18">工业/产品设计</a><a class="item"
                                                                href=""
                                                                data-reactid="19">影视/动画</a><a class="item"
                                                                                              href=""
                                                                                              data-reactid="20">摄影</a><a
                                class="item" href=""
                                data-reactid="21">服装设计</a><a class="item"
                                                             href=""
                                                             data-reactid="22">室内设计</a><a class="item"
                                                                                          href=""
                                                                                          data-reactid="23">造型设计</a><a
                                class="item" href=""
                                data-reactid="24">私家定制</a><a class="item"
                                                             href=""
                                                             data-reactid="25">其它</a></div>
                    </div>
                </div>
                <a class="item" href="designer.html" data-reactid="26">设计师</a><a class="item"
                                                                                 href=""
                                                                                 data-reactid="27">工作台</a>
                <div class="right menu" data-reactid="28">
                    <div class="item actions" data-reactid="29"><a class="ui basic button"
                                                                   href=""
                                                                   data-reactid="30">申请入驻</a>
                        <div data-reactid="31">
                            <div class="ui icon input" data-reactid="32"><input type="text" placeholder="搜索设计服务"
                                                                                value="" data-reactid="33"><i
                                    class="icon search link" data-reactid="34"></i></div>
                            <div class="ui avatar dropdown" data-reactid="35"><a class="avatar"
                                                                                 href=""
                                                                                 data-reactid="36"><img class="avatar"
                                                                                                        src="./设计服务 - 花瓣美思 - 原创设计平台_files/40x40"
                                                                                                        data-reactid="37"></a>
                                <div class="submenu" data-reactid="38">
                                    <div class="ui vertical menu arrow right" data-reactid="39"><a class="item"
                                                                                                   href=""
                                                                                                   data-reactid="40">我的美思</a><a
                                            class="item" href=""
                                            data-reactid="41">设置</a><a class="item" href=""
                                                                       data-reactid="42">我的花瓣</a>
                                        <div class="item" data-reactid="43">退出</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <div class="ui container offset services-page"><!-- react-empty: 1736 -->
            <div id="appy" class="ui segments facets">
                <div class="ui segment search facets">
                    <div class="ui middle filled grid">
                        <div class="column label">分类:</div>
                        <nav class="middle column list" id="appt">
                            <a class="item active" href="designService.jsp">全部</a>

                           </nav>
                    </div>
                </div>

            </div>
            <div class="search dimension">
                <div class="ui dropdown" tabindex="0"><label class="text">推荐排序</label><i class="angle down icon"></i>
                    <div class="menu" tabindex="-1"><a class="item active selected"
                                                       href="">推荐排序</a><a class="item"
                                                                          href="">创建时间</a><a
                            class="item" href="">好评</a></div>
                </div>
                <div class="ui dropdown" tabindex="0"><label class="text">不限项目周期</label><i class="angle down icon"></i>
                    <div class="menu" tabindex="-1"><a class="item active selected"
                                                       href="">不限项目周期</a><a class="item"
                                                                            href="">一天内</a><a
                            class="item" href="">一周内</a><a
                            class="item" href="">一个月</a><a
                            class="item" href="">两个月</a><a
                            class="item" href="">三个月</a><a
                            class="item" href="">三月以上</a></div>
                </div>
                <div class="right"><span>提供加急服务</span>
                    <div class="toggle checkbox "><label></label></div>
                </div>
            </div>
            <div class="ui divider"></div>
            <div class="search result"><!-- react-empty: 2048 -->
                <div id="appe" class="ui four cards">
                </div>
            </div>
            <div class="ui basic center aligned segment">
                <nav class="ui pagination menu"id="apage" >

                </nav>
            </div>
        </div>
        <footer class="site footer" data-reactid="216">
            <div class="ui container links" data-reactid="217"><h2 class="ui header" data-reactid="218">
                花瓣美思，花瓣网旗下网站</h2>
                <div class="ui grid" data-reactid="219">
                    <div class="four column row" data-reactid="220">
                        <div class="column" data-reactid="221"><label class="title" data-reactid="222">花瓣美思</label>
                            <div class="ui link list" data-reactid="223"><a class="item"
                                                                            href="https://muse.huaban.com/about"
                                                                            data-reactid="224">关于美思</a><a class="item"
                                                                                                          href="https://muse.huaban.com/about/help/buy"
                                                                                                          data-reactid="225">雇主问题</a><a
                                    class="item" href="https://muse.huaban.com/about/help/sell"
                                    data-reactid="226">设计师问题</a><a class="item"
                                                                   href="https://muse.huaban.com/about/help"
                                                                   data-reactid="227">使用帮助</a></div>
                        </div>
                        <div class="column" data-reactid="228"><label class="title" data-reactid="229">平台战略合作伙伴</label>
                            <div class="ui link list" data-reactid="230"><a class="item"
                                                                            href="http://blog.huaban.com/?p=16794"
                                                                            data-reactid="231">中华世纪坛创意新媒体联盟</a><a
                                    class="item" href="http://www.visualchina.com/" data-reactid="232">视觉中国</a><a
                                    class="item" href="http://zhan.qq.com/" data-reactid="233">腾讯风铃</a><a class="item"
                                                                                                          href="https://ixdc.org/"
                                                                                                          data-reactid="234">ixdc</a><a
                                    class="item" href="http://www.redstaraward.org/" data-reactid="235">红星奖</a></div>
                        </div>
                        <div class="column" data-reactid="236"><label class="title" data-reactid="237">联系与合作</label>
                            <div class="ui link list" data-reactid="238"><a class="item"
                                                                            href="https://muse.huaban.com/about/contact/"
                                                                            data-reactid="239">联系我们</a><span
                                    class="link item" data-reactid="240"><a data-reactid="241">联系客服</a></span><a
                                    class="item" href="http://weibo.com/huabanwang" data-reactid="242">微博 @花瓣网</a><a
                                    class="item weixin qr link" data-reactid="243"><!-- react-text: 244 -->微信
                                <!-- /react-text -->
                                <div class="layer" data-reactid="245"><img
                                        src="data:image/png"
                                        alt="花瓣微信二维码" data-reactid="246"></div>
                            </a></div>
                        </div>
                        <div class="column" data-reactid="247"><label class="title" data-reactid="248">移动客户端</label>
                            <div class="ui link list" data-reactid="249"><a class="item"
                                                                            href="https://itunes.apple.com/us/app/mei-si-zhao-dao-geng-zhuan/id1077258053?ls=1&amp;mt=8"
                                                                            data-reactid="250">iOS</a><a class="item"
                                                                                                         href="https://muse-file.b0.upaiyun.com/android/muse_v2.0.2_2018_07_17.apk"
                                                                                                         data-reactid="251">Android</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright" data-reactid="252">
                <div class="ui container" data-reactid="253">Copyright© Huaban.com 2016 | 浙B2-20110282 浙ICP备05049240
                </div>
            </div>
        </footer>
        <div class="im trayer" data-reactid="254">
            <div class="ui raised circular inverted segment message icon visible" data-reactid="255"><i
                    class="graph chat message" data-reactid="256"></i></div>
            <div class="ui card dialog-box invisible" data-reactid="257">
                <header class="header" data-reactid="258">
                    <nav class="ui compact secondary menu" data-reactid="259"><a class="item active" data-tab="chat"
                                                                                 data-reactid="260">
                        <!-- react-text: 261 -->聊天<!-- /react-text --></a><a class="item" data-tab="message"
                                                                             data-reactid="262"><!-- react-text: 263 -->
                        通知<!-- /react-text --></a></nav>
                    <i class="graph chat close hoverable" data-reactid="264"></i></header>
                <div class="ui tab active" data-tab="chat" data-reactid="265">
                    <div class="users content" data-reactid="266">
                        <div class="box" style="display:block;" data-reactid="267">
                            <div class="ui divided items hover scrollable" data-reactid="268">
                                <div class="empty segment" data-reactid="269"><i class="graph data null message"
                                                                                 data-reactid="270"></i><label
                                        class="text" data-reactid="271">没有聊天信息</label></div>
                            </div>
                        </div>
                        <div class="chat box" style="display:none;" data-reactid="272">
                            <div class="title" data-reactid="273"><i class="graph back" data-reactid="274"></i>
                                <!-- react-text: 275 -->未知用户<!-- /react-text --></div>
                            <div class="ui spring items" data-reactid="276"></div>
                            <div class="ui middle filled reply text grid" data-reactid="277">
                                <div class="middle column" data-reactid="278">
                                    <div class="ui input" data-reactid="279"><input name="message" data-reactid="280">
                                    </div>
                                </div>
                                <div class="column" data-reactid="281">
                                    <button class="ui button" data-reactid="282">发送</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="ui tab" data-tab="message" data-reactid="283">
                    <div class="systems content" data-reactid="284">
                        <div class="box" style="display:block;" data-reactid="285">
                            <div class="ui divided items hover scrollable" data-reactid="286">
                                <div class="empty segment" data-reactid="287"><i class="graph data null notification"
                                                                                 data-reactid="288"></i><label
                                        class="text" data-reactid="289">没有通知</label></div>
                            </div>
                        </div>
                        <div class="chat box" style="display:none;" data-reactid="290">
                            <div class="title" data-reactid="291"><i class="graph back" data-reactid="292"></i></div>
                            <div class="ui divided spring items" data-reactid="293"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <span class="muse ui blue trayer ysf button" data-reactid="294"><i class="graph tiny white message"
                                                                           data-reactid="295"></i>
            <!-- react-text: 296 -->联系客服<!-- /react-text --></span></div>
</div>
<script src="js/jquery-1.11.0.min.js" type="application/javascript"></script>
<script>
    window.load=CLoad();
    window.load=GLoad();

    function GLoad(){

       var c= getRequest();
       var fcid=c.fcId;
       var fsid=c.fsId;
       var pageNo=c.pageNo;

       $.post('/selectCGao',{"fcid":fcid,"fsid":fsid,"pageNo":pageNo},function (data) {
            if(data==null){
               return;
            }

        for(var v=0;v<data.ser.length;v++){
                var price=data.ser[v].fsePrice;
                if(price==null||price==""){
                    price="价格面议";
                }else{
                    price=price+"/";
                }

                var unit=data.ser[v].fsePriceunit;
                if(unit==""||unit==null){
                    unit="";
                }

            $("#appe").append(' <div class="ui service link card">\n' +
                '                        <div class="actions">\n' +
                '                            <button class="ui icon button fav"></button>\n' +
                '                        </div>\n' +
                '                        <a href="YuanC.html?fseid='+data.ser[v].fseId+'"><img class=""\n' +
                '                                        src="./designService/'+data.ser[v].fseImg+'"></a>\n' +
                '                        <div class="content"><label class="title">'+data.ser[v].fseName+'</label></div>\n' +
                '                        <footer class="extra content"><label class="price">'+price+unit+'</label>\n' +
                '                            <p class="tip">提供可选拓展</p></footer>\n' +
                '                    </div>')
        }

            $("#apage").append('<a class="item" href="/designService.jsp?fcid='+fcid+'&fsid='+fsid+'&pageNo=1">\n'+
                '  <i class="icon angle double left"></i>');

            for(var k=1;k<=data.page.totalPage;k++){//循环页数<a>标签
                    $("#apage").append(' <a class="item" href="/designService.jsp?fcid='+fcid+'&fsid='+fsid+'&pageNo='+k+'">'+k+'</a>   ');
            }
           var p=0;
           for(var k=1;k<=data.page.totalPage;k++) {
               var p=k++;
           }
            $("#apage").append(' <a class="item" href="/designService.jsp?fcid=' + fcid + '&fsid=' + fsid + '&pageNo='+ p + '"><i class="icon angle right"></i></a>' +
                ' <a class="item" href="/designService.jsp?fcid=' + fcid + '&fsid=' + fsid + '&pageNo='+ p + '"\n' +
                '               <i class="icon angle double right"></i></a>')
        },"json");
    }


    function CLoad(){
        $.post('/CateSelctAll','',function(data){
            if(data==null){
                return;
            }
//           alert(JSON.stringify(data));
            var zhi=getRequest();
            for(var i=0;i<data.length;i++){
                $("#appt").append("<a href='designService.jsp?fcId="+data[i].fcId+"' class='item '>\n" + data[i].fcName+"</a>");

                if(zhi!=null&&Number(zhi.fcId)==data[i].fcId){//查子类
                    var subs=data[i].subs;
                    $("#appy").append(' <div class="ui segment divider"></div>\n' +
                        '                <div class="ui segment search facets">\n' +
                        '                    <div class="ui middle filled grid">\n' +
                        '                        <div class="column label">子类:</div>\n' +
                        '                        <nav id="appr" class="middle column list">\n' +
                        '                        </nav>\n' +
                        '                    </div>\n' +
                        '                </div>');
                    for(var j=0;j<subs.length;j++){//list
                        $("#appr").append("<a href='designService.jsp?fsId="+subs[j].fsId+"' class='item'>\n" + subs[j].fsName+"</a>");
                    }

                }
            }


        },'json')
    }
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

</script>

<div style="top: 0px; left: 0px; visibility: hidden; position: absolute; width: 1px; height: 1px;">
    <iframe style="height:0px; width:0px;" src="./designService/delegate.jsp"></iframe>
</div>
<div class="layer-6" id="YSF-BTN-HOLDER">
    <div id="YSF-CUSTOM-ENTRY-6"><img src="./designService/6.png"></div>
    <span id="YSF-BTN-CIRCLE"></span>
    <div id="YSF-BTN-BUBBLE">
        <div id="YSF-BTN-CONTENT"></div>
        <span id="YSF-BTN-ARROW"></span><span id="YSF-BTN-CLOSE"></span></div>
</div>
<div id="YSF-PANEL-INFO" class="ysf-chat-layer" data-switch="0">
    <iframe src="./designService/iframe.jsp" id="YSF-IFRAME-LAYER"
            style="width: 100%; height: 100%;"></iframe>
</div>
</body>
</html>
