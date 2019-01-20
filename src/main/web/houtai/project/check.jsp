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
     <div id="forms" class="mt10">
        <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">流标审核</b></div>
            <div class="box_center">
              <form action="javascript:location.href='listFail.jsp'" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                  <td class="td_right">项目名称：</td>
                  <td class=""> 
                    张学友演唱会
                  </td>                 
                </tr>
                <tr >
                  <td class="td_right">呼唤金额：</td>
                  <td class="">
					3000
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">认投金额：</td>
                  <td class="">
                   300
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">完成进度：</td>
                  <td class="">
                   10%
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">流标原因：</td>
                  <td class="">
                    <input type="radio" name="status"> 筹款失败
                    <input type="radio" name="status"> 项目失效
                    <input type="radio" name="status"> 其他
                  </td>
                 </tr>
                 <tr>
                   <td class="td_right">&nbsp;</td>
                   <td class="">
                     <input type="submit" name="button" class="btn btn82 btn_save2" value="保存" /> 
                    <input type="button" name="button" class="btn btn82 btn_res" value="返回" onclick="history.back();" /> 
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
  