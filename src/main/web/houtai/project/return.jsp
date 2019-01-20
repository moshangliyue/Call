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
     
     <div id="button" class="mt10">
       <input type="button" name="button" class="btn btn82 btn_add" onClick="location.href='add.jsp'" value="项目">
       <input type="button" name="button" class="btn btn82 btn_add" onClick="location.href='return.jsp'" value="回报">
     </div>
     
    <div id="search_bar" class="mt10">
       <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">回报设置</b></div>
          </div>
        </div>
    </div>
     <div id="table" class="mt10">
        <div class="box span10 oh">
              <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
                <tr>
                   	<th>id</th>
                   	<th>支付金额（￥）</th>
                   	<th>回报内容</th>
                 	<th>限定名额（人）</th>		
                    <th>回报时间</th>
                </tr>
                <tr class="tr">
                   	<td align="center">001</td>
                   	<td align="center">23000</td>
                   	<td align="center">邓紫棋演唱会门票</td>
                	<td align="center">20人</td>
                    <td align="center">项目结束后20天</td>
                 </tr>
                 <tr class="tr">
                   	<td align="center">002</td>
                   	<td align="center">23000</td>
                   	<td align="center">邓紫棋演唱会门票</td>
                	<td align="center">20人</td>
                    <td align="center">项目结束后20天</td>
                 </tr>
                 <tr class="tr">
                   	<td align="center">003</td>
                   	<td align="center">23000</td>
                   	<td align="center">邓紫棋演唱会门票</td>
                	<td align="center">20人</td>
                    <td align="center">项目结束后20天</td>
                 </tr>
                 <tr class="tr">
                   	<td align="center">004</td>
                   	<td align="center">23000</td>
                   	<td align="center">邓紫棋演唱会门票</td>
                	<td align="center">20人</td>
                    <td align="center">项目结束后20天</td>
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
                  </ul>
                </div>

              </div>
        </div>
     </div>
     
     
      
     <div id="forms" class="mt10">
        <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">添加回报</b></div>
            <div class="box_center">
              <form action="" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                  <td class="td_right">回报类型：</td>
                  <td class=""> 
                    <span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        <option>演唱会门票</option> 
                        <option>体育赛事门票</option> 
                        </select> 
                        </div> 
                      </div> 
                    </span>
                  </td>
                </tr>
                <tr>
                  <td class="td_right">支付金额：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>
                </tr>
                <tr >
                  <td class="td_right">回报内容：</td>
                  <td class="">
					<textarea name="" id="" cols="30" rows="10" class="textarea" style="resize:none;"></textarea>
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">回报图片：</td>
                  <td class="">
                    <input type="file" name="file" class="input-text lh30" size="10">
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">限定名额：</td>
                  <td class="">
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">回报时间：</td>
                  <td class="">
                    项目结束后&nbsp;&nbsp;<input type="text" name="name" class="input-text lh30" size="10">天
                  </td>
                </tr>
                 <tr>
                   <td class="td_right">&nbsp;</td>
                   <td class="">
                     <input type="button" name="button" class="btn btn82 btn_save2" value="上一步" onClick="history.back();"> 
                     <input type="button" name="button" class="btn btn82 btn_res" onClick="alert('操作成功！')" value="提交"> 
                   </td>
                 </tr>
               </table>
               </form>
            </div>
          </div>
        </div>
     </div>
   </div> 
 </body>
 </html>
  