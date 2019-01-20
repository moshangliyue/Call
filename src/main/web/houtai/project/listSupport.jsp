<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>
<!doctype html>
 <html lang="zh-CN">
 <head>
   <meta charset="UTF-8">
   <link rel="stylesheet" href="../css/common.css">
   <link rel="stylesheet" href="../css/main.css">
   <script type="text/javascript" src="../js/jquery.min.js"></script>
   <script type="text/javascript" src="../js/colResizable-1.3.min.js"></script>
   <script type="text/javascript" src="../js/common.js"></script>
   
   <script type="text/javascript">
      $(function(){  
        $(".list_table").colResizable({
          liveDrag:true,
          gripInnerHtml:"<div class='grip'></div>", 
          draggingClass:"dragging", 
          minWidth:30
        }); 
        
      }); 
   </script>
   <title>Document</title>
 </head>
 <body>
  <div class="container">
     
    <div id="search_bar" class="mt10">
       <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">查看支持</b></div>
          </div>
        </div>
    </div>
     <div id="table" class="mt10">
        <div class="box span10 oh">
              <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
              <caption>项目名称：张学友演唱会</caption>
                <tr>
                   <th>ID</th>
                   <th>投资人</th>
                   <th>收货人</th>
                   <th>收货地址</th>
                   <th>订单号</th>
                   <th>联系电话</th>
                   <th>支付金额</th>
                   <th>回报内容</th>
                   <th>发放状态</th>
                   <th>操作</th>
                </tr>
                
                <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">lucine</td>
                   <td align="center">张晓波</td>
                   <td align="center">北京市朝阳区地球村</td>
                   <td align="center">20160302</td>
                   <td align="center">13521527687</td>
                   <td align="center">20</td>
                   <td align="center">演唱会门票</td>
                   <td align="center">已发放</td>
                   <td align="center">
                        <a class="ext_btn" style="cursor:auto;">回报发放已确认</a>
                   </td>	
                 </tr>
                 
                 <tr class="tr">
                   <td align="center">2</td>
                   <td align="center">lucine</td>
                   <td align="center">张晓波</td>
                   <td align="center">北京市朝阳区地球村</td>
                   <td align="center">20160302</td>
                   <td align="center">13521527687</td>
                   <td align="center">20</td>
                   <td align="center">演唱会门票</td>
                   <td align="center">未发放</td>
                   <td align="center">
                        <a href="javascript:alert('操作成功！');" class="ext_btn">回报发放确认</a>
                   </td>	
                 </tr>
                 
                 
              </table>
              <div class="page mt10">
                <div class="pagination">
                  <ul>
                      <li class="first-child"><a href="#">首页</a></li>
                      <li class="disabled"><span>上一页</span></li>
                      <li class="active"><span>1</span></li>
                      <li><a href="#">2</a></li>
                      <li><a href="#">下一页</a></li>
                      <li class="last-child"><a href="#">末页</a></li>
                  	  <li class="disabled"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总共2页&nbsp;&nbsp;每页10条&nbsp;&nbsp;当前第1页&nbsp;&nbsp;总共15条</span></li>
                  </ul> 
                </div>

              </div>
        </div>
     </div>
   </div> 
 </body>
 </html>
  