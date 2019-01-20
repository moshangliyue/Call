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
            <div class="box_top"><b class="pl15">放款明细</b></div>
            <div class="box_center pt10 pb10">
              <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td>项目名称</td>
                  <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                  <td>收款方</td>
                  <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                </tr>
              </table>
            </div>
            <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
              <div class="search_bar_btn" style="text-align:right;">
              	 <input type="button" name="button" class="btn btn82 btn_search" value="查询">
              </div>
            </div>
          </div>
        </div>
    </div>
     <div id="table" class="mt10">
        <div class="box span10 oh">
              <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
                <tr>
                   <th>ID</th>
                   <th>项目名称</th>
                   <th>放款单号</th>
                   <th>收款方</th>
                   <th>总金额（元）</th>
                   <th>收款银行</th>
                   <th>收款账户</th>
                   <th>放款期数</th>
                   <th>放款状态</th>
                   <th>操作</th>
                </tr>
                
                <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">张学友演唱会</td>
                   <td align="center">12315461231</td>
                   <td align="center">山东日报</td>
                   <td align="center">3000</td>
                   <td align="center">中国工商银行</td>
                   <td align="center">2984747550</td>
                   <td align="center">首款</td>
                   <td align="center">未放款</td>
                   <td align="center">
                   	<a href="javascript:alert('操作成功！');" class="ext_btn">放款</a>&nbsp;&nbsp;
                   </td>
                 </tr>
                 
                 <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">张学友演唱会</td>
                   <td align="center">12315461231</td>
                   <td align="center">山东日报</td>
                   <td align="center">3000</td>
                   <td align="center">中国工商银行</td>
                   <td align="center">2984747550</td>
                   <td align="center">首款</td>
                   <td align="center">已放款</td>
                   <td align="center">
                   	<a class="ext_btn" style="cursor:auto">放款</a>&nbsp;&nbsp;
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
  