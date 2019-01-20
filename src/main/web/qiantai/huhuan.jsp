<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>

<!DOCTYPE HTML>
<head>
    <title>Home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/single.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript" src="js/startstop-slider.js"></script>
</head>
<body>
<div class="wrap">
    <div class="header">
        <div class="headertop_desc">
            <div class="call">
                <p><span>Need help?</span> call us <span class="number">1-22-3456789</span></p>
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
            <a href="index.html"><img src="images/logo.png" alt=""/></a>
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
                        <h3>呼唤</h3>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="section group">
                    <div class="col span_2_of_3">
                        <div class="contact-form">
                            <div>
                                <img src="images/feature-pic1.jpg"/>
                            </div>
                            <form method="post" action="javascript:alert('操作成功！');">
                                <div>
                                    <span><label>商品名称:张学友演唱会</label></span>
                                </div>
                                <div>
                                    <span><label>商品类型:演出</label></span>
                                </div>
                                <div>
                                    <span><label>呼唤总金额:5000</label></span>
                                </div>
                                <div>
                                    <span><label>已呼唤金额:3000</label></span>
                                </div>

                                <div>
                                    <span><label>起始日期:2016-05-06至2016-06-05</label></span>
                                </div>
                                <div>
                                    <span><label>所在地区</label></span>
                                    <span>
                                <select>
                                	<option>北京</option>
                                    <option>天津</option>
                                    <option>上海</option>
                                    <option>深圳</option>
                                </select>
                                <select>
                                	<option>海淀</option>
                                    <option>朝阳</option>
                                    <option>东城</option>
                                    <option>西城</option>
                                </select>
                                </span>
                                </div>
                                <div>
                                    <span><label>街道地址</label></span>
                                    <span><input name="" type="text" class="textbox" value="上地西路125号"/></span>
                                </div>
                                <div>
                                    <span><label>邮政编码</label></span>
                                    <span><input name="" type="text" class="textbox" value="073000"/></span>
                                </div>
                                <div>
                                    <span><label>收货人</label></span>
                                    <span><input name="" type="text" class="textbox" value="王思凯"/></span>
                                </div>
                                <div>
                                    <span><label>手机号码</label></span>
                                    <span><input name="" type="text" class="textbox" value="13526899874"/></span>
                                </div>
                                <div>
                                    <span><label>电话号码</label></span>
                                    <span><input name="" type="text" class="textbox" value="010-82825636"/></span>
                                </div>


                                <div>
                                    <span><label>支付金额</label></span>
                                    <span><input type="text" value="" class="textBox"></span>
                                </div>
                                <div>
                                    <span><label>选择回报</label></span>
                                    <span><select>
                                	<option>--请选择--</option>
                                	<option>张学友演唱会门票</option>
                                    <option>邓紫棋演唱会门票</option>
                                    <option>周华健演唱会门票</option>
                                </select></span>
                                </div>
                                <div>
                                    <span><input type="submit" value="生成订单" class="myButton"><input type="button"
                                                                                                    value="直接支付"
                                                                                                    class="myButton1"
                                                                                                    onclick="alert('支付成功！');"></span>
                                </div>
                            </form>
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

