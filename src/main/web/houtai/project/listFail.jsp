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
            <div class="box_top"><b class="pl15">失败项目</b></div>
            <div class="box_center pt10 pb10">
              <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td>项目名称</td>
                  <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                  <td></td>
                  <td>
                  </td>
                </tr>
              </table>
            </div>
            <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
              <div class="search_bar_btn" style="text-align:right;">
              	 <input type="button" name="button" class="btn btn82 btn_search" value="查询"> <!--
                 <input type="button" name="button" class="btn btn82 btn_add" value="新增" onClick="location.href='add.jsp'" />-->
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
                   <th>发起方</th>
                   <th>项目类别</th>
                   <th>流标原因</th>
                   <th>呼唤金额</th>
                   <th>认投金额</th>
                   <th>完成比例</th>
                   <th>开始时间</th>
                   <th>结束时间</th>
                   <th width="100">操作</th>
                </tr>
                
                <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">张学友演唱会</td>
                   <td align="center">山东日报</td>
                   <td align="center">演出</td>
                   <td align="center">筹款失败</td>
                   <td align="center">100</td>
                   <td align="center">50</td>
                   <td align="center">50%</td>
                   <td align="center">2016-01-01</td>
                   <td align="center">2016-01-15</td>
                   <td align="center">
                        <a class="ext_btn" style="cursor:auto;">流标已审核</a>&nbsp;&nbsp;
                   </td>	
                 </tr>
                 <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">张学友演唱会</td>
                   <td align="center">山东日报</td>
                   <td align="center">演出</td>
                   <td align="center">筹款失败</td>
                   <td align="center">100</td>
                   <td align="center">50</td>
                   <td align="center">50%</td>
                   <td align="center">2016-01-01</td>
                   <td align="center">2016-01-15</td>
                   <td align="center">
                        <a href="check.jsp" class="ext_btn">流标审核</a>&nbsp;&nbsp;
                   </td>	
                 </tr>
                 <tr class="tr">
                   <td align="center">1</td>
                   <td align="center">张学友演唱会</td>
                   <td align="center">山东日报</td>
                   <td align="center">演出</td>
                   <td align="center">筹款失败</td>
                   <td align="center">100</td>
                   <td align="center">50</td>
                   <td align="center">50%</td>
                   <td align="center">2016-01-01</td>
                   <td align="center">2016-01-15</td>
                   <td align="center">
                        <a href="check.jsp" class="ext_btn">流标审核</a>&nbsp;&nbsp;
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
  