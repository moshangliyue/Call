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
            <div class="box_top"><b class="pl15">表单</b></div>
            <div class="box_center">
              <form action="javascript:location.href='list.jsp'" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                  <td class="td_right">资源名：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40" value="资源管理" />
                  </td>                 
                </tr>
                <tr >
                  <td class="td_right">上级菜单：</td>
                  <td class="">
 
                    <span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        <option>顶级资源</option> 
                        <option selected="selected">权限设置</option> 
                        <option>系统管理</option> 
                        <option>项目管理</option> 
                        </select> 
                        </div> 
                      </div> 
                    </span>
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">资源路径：</td>
                  <td class="">
                    <input type="text" class="input-text lh30" size="40" value="/menu.do" />
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">启用状态：</td>
                  <td class="">
                    <input type="radio" name="status" checked="checked" /> 可用
                    <input type="radio" name="status" /> 不可用
                  </td>
                 </tr>
                 <tr>
                   <td class="td_right">&nbsp;</td>
                   <td class="">
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
  