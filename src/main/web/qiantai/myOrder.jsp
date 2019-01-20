<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>

<!DOCTYPE HTML>
<head>
<title>News</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
</head>
<body>
  <div class="wrap">
	<div class="header">
		<div class="headertop_desc">
			<div class="call">
				 <p><span>Need help?</span> call us <span class="number">1-22-3456789</span></span></p>
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
		<div class="header_top">
			<div class="logo">
				<a href="index.jsp"><img src="images/logo.png" alt="" /></a>
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
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						event.stopPropagation();
					});	
				}
			}

			$(function() {

				var dd = new DropDown( $('#dd') );

				$(document).click(function() {
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
	     		<form action="myReward.jsp">
	     			<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
	     		</form>
	     	</div>
	     	<div class="clear"></div>
	     </div>	     	
   </div>
 <div class="main">
    <div class="content">
    		
           <div class="image group">
				<div class="grid images_3_of_1">
					<img src="images/feature-pic1.jpg" alt="" />
				</div>
				<div class="grid news_desc">
					<h3>商品名：张学友演唱会</h3>
					<p>商品类型：演出</p>
                    <p>自己的呼唤金额：500元</p>
                    <p>回报内容：演唱会门票一张</p>
                    <p>支付状态：未支付</p>
                    <p><input type="button" value="修改订单" onclick="location.href='huhuan.html'"/>&nbsp;&nbsp;<input type="button" value="确认支付" onClick="alert('操作成功！');"/>&nbsp;&nbsp;<input type="button" value="取消订单" onClick="alert('操作成功！');"/></p>
			   </div>
		   </div>
           <div class="image group">
				<div class="grid images_3_of_1">
					<img src="images/newsimg1.jpg" alt="" />
				</div>
				<div class="grid news_desc">
					<h3>商品名：张学友演唱会</h3>
					<p>商品类型：演出</p>
                    <p>自己的呼唤金额：500元</p>
                    <p>回报内容：演唱会门票一张</p>
                    <p>支付状态：已支付</p>
                    <p></p>
			   </div>
		   </div>
           <div class="image group">
				<div class="grid images_3_of_1">
					<img src="images/newsimg1.jpg" alt="" />
				</div>
				<div class="grid news_desc">
					<h3>商品名：张学友演唱会</h3>
					<p>商品类型：演出</p>
                    <p>自己的呼唤金额：500元</p>
                    <p>回报内容：演唱会门票一张</p>
                    <p>支付状态：已未支付</p>
                    <p></p>
			   </div>
		   </div>
           <div class="image group">
				<div class="grid images_3_of_1">
					<img src="images/newsimg1.jpg" alt="" />
				</div>
				<div class="grid news_desc">
					<h3>商品名：张学友演唱会</h3>
					<p>商品类型：演出</p>
                    <p>自己的呼唤金额：500元</p>
                    <p>回报内容：演唱会门票一张</p>
                    <p>支付状态：已支付</p>
                    <p></p>
			   </div>
		   </div>
           <div class="image group">
				<div class="grid images_3_of_1">
					<img src="images/newsimg1.jpg" alt="" />
				</div>
				<div class="grid news_desc">
					<h3>商品名：张学友演唱会</h3>
					<p>商品类型：演出</p>
                    <p>自己的呼唤金额：500元</p>
                    <p>回报内容：演唱会门票一张</p>
                    <p>支付状态：已支付</p>
                    <p></p>
			   </div>
		   </div>	
		   <div class="content-pagenation">
						<li><a href="#">Frist</a></li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><span>....</span></li>
						<li><a href="#">Last</a></li>
						<div class="clear"> </div>
					</div>	
         </div> 
    </div>
 </div>
   <div class="footer">
   	  <div class="wrap">	
	     <div class="section group">
				
			</div>			
        </div>
        <div class="copy_right">
				<p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		   </div>
    </div>
   <script type="text/javascript">
		$(document).ready(function() {			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
    <a href="#" id="toTop"><span id="toTopHover"> </span></a>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

