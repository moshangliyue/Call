<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>
<!doctype html>
 <html lang="zh-CN">
 <head>
   <meta charset="UTF-8">
   <link rel="stylesheet" href="../../css/common.css">
   <link rel="stylesheet" href="../../css/main.css">
   <script type="text/javascript" src="../../js/jquery.min.js"></script>
   <script type="text/javascript" src="../../js/colResizable-1.3.min.js"></script>
   <script type="text/javascript" src="../../js/common.js"></script>
   
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
            <div class="box_top"><b class="pl15">角色添加</b></div>
            <div class="box_center">
              <form action="javascript:location.href='list.jsp'" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                  <td class="td_right">角色名：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                <tr >
                  <td class="td_right">启用状态</td>
                  <td class="">
                    <input type="radio" name="status" checked="checked" /> 可用
                    <input type="radio" name="status" /> 不可用
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">资源配置：</td>
                  <td class="">
                    <ul>
                    	<li><input type="checkbox" name="menu" />权限管理
                        	<ul>
                        		<li>&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="menu" />人员管理</li>
                            	<li>&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="menu" />角色管理</li>
                            	<li>&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="menu" />资源管理</li>
                        	</ul>
                        </li>
                        <li><input type="checkbox" name="menu" />系统设置
                        	<ul>
                        		<li>&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="menu" />密码修改</li>
                        	</ul>
                        </li>
                    </ul>
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
  