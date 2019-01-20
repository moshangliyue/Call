<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
    <title>Home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="qiantai/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="qiantai/css/slider.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="qiantai/css/single.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="qiantai/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="qiantai/js/move-top.js"></script>
    <script type="text/javascript" src="qiantai/js/easing.js"></script>
    <script type="text/javascript" src="qiantai/js/startstop-slider.js"></script>
</head>
<body>
<div class="wrap">
    <div class="header">
        <div class="headertop_desc">
            <div class="call">
                <p><span>百度呼唤平台</span><span class="number"></span></p>
            </div>
            <div class="account_desc">
                <ul>
                    <li><a href="regist.jsp">注册</a></li>
                    <li><a href="login.jsp">登录</a></li>
                    <li><a href="info.jsp">个人中心</a></li>
                    <li><a href="charge.jsp">充值</a></li>
                    <li><a href="javascript:alert('已安全退出！');">安全退出</a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
        <div class="header_top">
            <div class="logo">
                <a href="index.jsp"><img src="qiantai/images/logo.png" alt=""/></a>
            </div>
            <div class="cart">
                <p>Welcome to our Online Store!</p>
            </div>
            <script type="text/javascript">
                function DropDown(el) {
                    this.dd = el;
                    this.initEvents();
                }

                DropDown.prototype = {
                    initEvents: function () {
                        var obj = this;

                        obj.dd.on('click', function (event) {
                            $(this).toggleClass('active');
                            event.stopPropagation();
                        });
                    }
                }

                $(function () {
                    var dd = new DropDown($('#dd'));
                    $(document).click(function () {
                        // all dropdowns
                        $('.wrapper-dropdown-2').removeClass('active');
                    });
                });

            </script>
            <div class="clear"></div>
        </div>
        <div class="header_bottom">
            <div class="menu">
                <ul>
                    <li class="active"><a href="index.jsp">首页</a></li>
                    <li><a href="attention.jsp">我的关注</a></li>
                    <li><a href="myJoin.jsp">我的参与</a></li>
                    <li><a href="myReward.jsp">我的回报</a></li>
                    <li><a href="myOrder.jsp">我的定单</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="search_box">
                <form action="allPros.jsp">
                    <input type="text" value="Search" onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
                </form>
            </div>
            <div class="clear"></div>
        </div>
        <div class="header_slide">
            <div class="header_bottom_left">

            </div>

            <div class="main">
                <div class="content">
                    <div class="content_top">
                        <div class="heading">
                            <h3>最新项目</h3>
                        </div>
                        <div class="see">
                            <p><a href="allPros.jsp">查看所有项目</a></p>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="section group">
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="proInfo.jsp"><img src="qiantai/images/feature-pic1.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/feature-pic2.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>

                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/feature-pic3.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/feature-pic4.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>

                    <div class="section group">
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/new-pic1.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/new-pic2.jpg" alt=""/></a>
                            <h2>Lorem Ipsum is simply </h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/new-pic4.jpg" alt=""/></a>
                            <h2>张学友演唱会</h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="preview.html"><img src="qiantai/images/new-pic3.jpg" alt=""/></a>
                            <h2>张学友演唱会 </h2>
                            <div class="price-details">
                                <div class="price-number">
                                    <p><span class="rupees"></span></p>
                                </div>
                                <div class="add-cart">
                                    <h4><a href="javascript:alert('关注成功');">关注</a></h4>
                                </div>
                                <div class="add-cart" style="margin-right:2px;">
                                    <h4><a href="javascript:location.href='huhuan.jsp'">呼唤</a></h4>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">

            <div class="copy_right">
                <p>Copyright &copy; 2014.Company name All rights reserved.</p>
            </div>
        </div>
        <script type="text/javascript">
            $(document).ready(function () {
                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <a href="#" id="toTop"><span id="toTopHover"> </span></a>
        <div style="display:none">
            <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript'
                    charset='gb2312'></script>
        </div>
    </div>
</body>
</html>

