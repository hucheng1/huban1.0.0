<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- saved from url=(0038)https://muse.huaban.com/users/17041754 -->
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta content="ie=edge" http-equiv="x-ua-compatible">
    <title data-react-helmet="true">个人主页 - 花瓣美思 - 原创设计平台</title>
    <meta data-react-helmet="true" name="description" content="花瓣美思 - 高质量、高效率、无风险的设计服务">
    <link data-react-helmet="true" rel="shortcut icon"
          href="https://muse.huaban.com/assets/57817251462a6d174e80efc8d975d352.ico">
    <link href="ToDesigner/app-fe7f8bdcdd789e5021a6.css" rel="stylesheet">
    <script>
        var _hmt = _hmt || [];
        (function () {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?bd5915e18cc9b1ab964cc940c537c8ca";
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
    <style type="text/css">#YSF-BTN-HOLDER {
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
    }</style>
</head>
<body>
<div id="app">
    <div class="app" data-reactroot="" data-reactid="1" data-react-checksum="23520201"><!-- react-empty: 2 -->
        <!-- react-empty: 3 -->
        <div class="header navi flat" id="header" data-reactid="4">
            <nav class="ui container ui menu" data-reactid="5"><a class="brand item" href="https://muse.huaban.com/"
                                                                  data-reactid="6"><i class="graph logo text"
                                                                                      data-reactid="7"></i></a><a
                    class="item" href="designMain.jsp" data-reactid="8">首页</a>
                <div class="ui service dropdown item" data-reactid="9"><a class="item"
                                                                          href="designService.jsp"
                                                                          data-reactid="10">设计服务</a><i
                        class="icon dropdown" data-reactid="11"></i>
                    <div class="submenu" data-reactid="12">
                        <div class="ui vertical harp two wides arrow left menu" data-reactid="13"><a class="item"
                                                                                                     href="https://muse.huaban.com/services/?category=logo_brand"
                                                                                                     data-reactid="14">LOGO/品牌</a><a
                                class="item" href="https://muse.huaban.com/services/?category=graphic_design"
                                data-reactid="15">平面设计</a><a class="item"
                                                             href="https://muse.huaban.com/services/?category=web_app_ui"
                                                             data-reactid="16">UI 设计</a><a class="item"
                                                                                           href="https://muse.huaban.com/services/?category=paint_illustration"
                                                                                           data-reactid="17">绘画/插画</a><a
                                class="item" href="https://muse.huaban.com/services/?category=industry_product"
                                data-reactid="18">工业/产品设计</a><a class="item"
                                                                href="https://muse.huaban.com/services/?category=video_animation"
                                                                data-reactid="19">影视/动画</a><a class="item"
                                                                                              href="https://muse.huaban.com/services/?category=photography"
                                                                                              data-reactid="20">摄影</a><a
                                class="item" href="https://muse.huaban.com/services/?category=costume_design"
                                data-reactid="21">服装设计</a><a class="item"
                                                             href="https://muse.huaban.com/services/?category=interior_home_design"
                                                             data-reactid="22">室内设计</a><a class="item"
                                                                                          href="https://muse.huaban.com/services/?category=fashion_design"
                                                                                          data-reactid="23">造型设计</a><a
                                class="item" href="https://muse.huaban.com/services/?category=custom_design"
                                data-reactid="24">私家定制</a><a class="item"
                                                             href="https://muse.huaban.com/services/?category=others"
                                                             data-reactid="25">其它</a></div>
                    </div>
                </div>
                <a class="item" href="designer.jsp" data-reactid="26">设计师</a>
                <div class="right menu" data-reactid="27">
                    <div class="item actions" data-reactid="28">
                        <div class="auth buttons" data-reactid="29"><a class="ui grey button" data-reactid="30">
                            <!-- react-text: 31 -->登录<!-- /react-text --><!-- react-empty: 32 --></a><a
                                class="ui button" data-reactid="33"><!-- react-text: 34 -->注册<!-- /react-text -->
                            <!-- react-empty: 35 --></a></div>
                    </div>
                </div>
            </nav>
        </div>
        <div class="ui container offset" data-reactid="36">
            <div class="user-home" data-reactid="37"><!-- react-empty: 108 -->
                <div class="user home page" >
                    <div class="ui grid">
                   <div class="nine wide column" id="tod" >
                   <%--         <div class="user dashboard"><img class="ui image"
                                                             src="ToDesigner/120x120">
                                <div class="ui dash"><h3 class="username">静静Meow</h3>
                                    <div class="ui horizontal tags list">
                                        <div class="item tags"><span class="tag">插画师</span><span
                                                class="tag">漫画师</span><span class="tag">手工艺人</span></div>
                                        <div class="item">深圳</div>
                                    </div>
                                    <div class="description">
                                        擅长Q版、绘本、儿插风格、吉祥物设计，有新媒体、传统广告工作经历，多年绘画经验，有个人风格。可以根据故事文案进行插画，条漫创作。服务过wifi-cat、中国平安、微讯快车道等传统广告、新媒体广告公司。
                                    </div>
                                    <div class="right floated actions"><span class="ui icon basic button"><i
                                            class="graph message"></i><!-- react-empty: 126 --></span></div>
                                </div>
                            </div>--%>
                        </div>
                        <div class="three wide column extra list">
                            <div class="ui middle aligned detail list">
                                <div class="item">
                                    <div class="content"><i class="graph time"></i><!-- react-text: 132 -->平均响应时间
                                        <!-- /react-text --><span class="right floated content">50分39秒</span></div>
                                </div>
                                <div class="item">
                                    <div class="content"><i class="graph user id"></i><!-- react-text: 137 -->实名认证
                                        <!-- /react-text --><span class="right floated content">已认证</span></div>
                                </div>
                                <div class="item">
                                    <div class="content"><i class="graph star score"></i><!-- react-text: 142 -->评价
                                        <!-- /react-text --><span class="right floated content"><span class="rate view"><i
                                                class="icon star color brown"></i><i
                                                class="icon star color brown"></i><i
                                                class="icon star color brown"></i><i
                                                class="icon star color brown"></i><i class="icon star color brown"></i></span></span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <nav class="ui secondary pointing menu" id="a">
                    <div class="right menu"><a class="item" target="_blank" href="">
                        <!-- react-text: 156 -->他/她<!-- /react-text --><!-- react-text: 157 -->的花瓣主页<!-- /react-text --><i
                            class="icon double angle right"></i></a></div>
                </nav>
                <div class="ui four cards" id="ad">
                </div>
            </div>
        </div>
        <footer class="site footer" data-reactid="52">
            <div class="ui container links" data-reactid="53"><h2 class="ui header" data-reactid="54">花瓣美思，花瓣网旗下网站</h2>
                <div class="ui grid" data-reactid="55">
                    <div class="four column row" data-reactid="56">
                        <div class="column" data-reactid="57"><label class="title" data-reactid="58">花瓣美思</label>
                            <div class="ui link list" data-reactid="59"><a class="item"
                                                                           href="https://muse.huaban.com/about"
                                                                           data-reactid="60">关于美思</a><a class="item"
                                                                                                        href="https://muse.huaban.com/about/help/buy"
                                                                                                        data-reactid="61">雇主问题</a><a
                                    class="item" href="https://muse.huaban.com/about/help/sell"
                                    data-reactid="62">设计师问题</a><a class="item" href="https://muse.huaban.com/about/help"
                                                                  data-reactid="63">使用帮助</a></div>
                        </div>
                        <div class="column" data-reactid="64"><label class="title" data-reactid="65">平台战略合作伙伴</label>
                            <div class="ui link list" data-reactid="66"><a class="item"
                                                                           href="http://blog.huaban.com/?p=16794"
                                                                           data-reactid="67">中华世纪坛创意新媒体联盟</a><a
                                    class="item" href="http://www.visualchina.com/" data-reactid="68">视觉中国</a><a
                                    class="item" href="http://zhan.qq.com/" data-reactid="69">腾讯风铃</a><a class="item"
                                                                                                         href="https://ixdc.org/"
                                                                                                         data-reactid="70">ixdc</a><a
                                    class="item" href="http://www.redstaraward.org/" data-reactid="71">红星奖</a></div>
                        </div>
                        <div class="column" data-reactid="72"><label class="title" data-reactid="73">联系与合作</label>
                            <div class="ui link list" data-reactid="74"><a class="item"
                                                                           href="https://muse.huaban.com/about/contact/"
                                                                           data-reactid="75">联系我们</a><span
                                    class="link item" data-reactid="76"><a data-reactid="77">联系客服</a></span><a
                                    class="item" href="http://weibo.com/huabanwang" data-reactid="78">微博 @花瓣网</a><a
                                    class="item weixin qr link" data-reactid="79"><!-- react-text: 80 -->微信
                                <!-- /react-text -->
                                <div class="layer" data-reactid="81"><img
                                        src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAF8AAABfCAIAAAABLoyiAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpGNTdDNEE1RjcyQURFMjExQTdCNERDNjg4REREQjdENyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo2RjE3MTdDOUI5M0QxMUUyQTlFMUVFNjM0QjJFMUIyMSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo2RjE3MTdDOEI5M0QxMUUyQTlFMUVFNjM0QjJFMUIyMSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkZCMzY4RDQ1MzJCOUUyMTE4MUI1RjUxRjJCQkQ4NzI2IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkY1N0M0QTVGNzJBREUyMTFBN0I0REM2ODhERERCN0Q3Ii8+IDwvcmRmOkRlc2NyaXB0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"
                                        alt="花瓣微信二维码" data-reactid="82"></div>
                            </a></div>
                        </div>
                        <div class="column" data-reactid="83"><label class="title" data-reactid="84">移动客户端</label>
                            <div class="ui link list" data-reactid="85"><a class="item"
                                                                           href="https://itunes.apple.com/us/app/mei-si-zhao-dao-geng-zhuan/id1077258053?ls=1&amp;mt=8"
                                                                           data-reactid="86">iOS</a><a class="item"
                                                                                                       href="https://muse-file.b0.upaiyun.com/android/muse_v2.0.2_2018_07_17.apk"
                                                                                                       data-reactid="87">Android</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright" data-reactid="88">
                <div class="ui container" data-reactid="89">Copyright© Huaban.com 2016 | 浙B2-20110282 浙ICP备05049240
                </div>
            </div>
        </footer>
        <span class="muse ui blue trayer ysf button" data-reactid="90"><i class="graph tiny white message"
                                                                          data-reactid="91"></i><!-- react-text: 92 -->联系客服
            <!-- /react-text --></span></div>
</div>
<script src="js/jquery-1.11.0.min.js" type="application/javascript"></script>
<script>
    window.load=toSelectAll();
    window.load=ByfdidSelect();
    function toSelectAll(){

        var c=getRequest();
        var fdid=c.fdid;
        $.post('/toSelectAll',{'fdid':fdid},function(data){
            if(data==null){
              return;
            }
            for(var i=0;i<data.length;i++){


                $("#a").append('<a class="item active" href="ToDesigner.jsp?fdid='+data[i].fdId+'">设计服务</a><a\n' +
                    '                        class="item " href="ToFile.html?fdid='+data[i].fdId+'">个人资料</a>')

                $("#tod").append(' <div class="user dashboard"><img class="ui image"\n' +
                    '                                                             src="ToDesigner/'+data[i].fdimges+'">\n' +
                    '                                <div class="ui dash"><h3 class="username">'+data[i].fdTruename+'</h3>\n' +
                    '                                    <div class="ui horizontal tags list">\n' +
                    '                                        <div class="item tags" id="biao">' +
                    '                                               </div>\n' +
                    '                                        <div class="item">'+data[i].fdAddress+'</div>\n' +
                    '                                    </div>\n' +
                    '                                    <div class="description">\n' +
                    '                                      '+data[i].fdIntro+'\n' +
                    '                                    </div>\n' +
                    '                                    <div class="right floated actions"><span class="ui icon basic button"><i\n' +
                    '                                            class="graph message"></i><!-- react-empty: 126 --></span></div>\n' +
                    '                                </div>\n' +
                    '                            </div>')

            }

            for(var m=0;m<data[0].good.length;m++){
              $("#biao").append('<span class="tag">'+data[0].good[m].fgName+'</span>')
            }
        },'json')
    }

    function ByfdidSelect(){
        var c=getRequest();
        var fdid=c.fdid;
        $.post('/ByfdidSelect',{"fdid":fdid},function(data){
            if(data==null){
                return;
            }

            for(var i=0;i<data.length;i++){
                $("#ad").append(' <div class="ui service link card">\n' +
                    '                        <div class="actions">\n' +
                    '                            <button class="ui icon button fav"></button>\n' +
                    '                        </div>\n' +
                    '                        <a href=""><img class=""\n' +
                    '                                                                                    src="ToDesigner/'+data[i].fseImg+'"></a>\n' +
                    '                        <div class="content"><label class="title">'+data[i].fseName+'</label></div>\n' +
                    '                        <footer class="extra content"><label class="price">价格面议</label>\n' +
                    '                            <p class="tip"></p></footer>\n' +
                    '                    </div>')
            }


        },'json')
    }

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
<div class="layer-6" id="YSF-BTN-HOLDER">
    <div id="YSF-CUSTOM-ENTRY-6"><img src="ToDesigner/6.png"></div>
    <span id="YSF-BTN-CIRCLE"></span>
    <div id="YSF-BTN-BUBBLE">
        <div id="YSF-BTN-CONTENT"></div>
        <span id="YSF-BTN-ARROW"></span><span id="YSF-BTN-CLOSE"></span></div>
</div>
<div id="YSF-PANEL-INFO" class="ysf-chat-layer" data-switch="0">
</div>
</body>
</html>
