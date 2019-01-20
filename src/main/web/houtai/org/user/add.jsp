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
            <div class="box_top"><b class="pl15">用户添加</b></div>
            <div class="box_center">
              <form action="javascript:location.href='list.jsp'" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
                 
                 <tr>
                  <td align="left" colspan="2" style="background-color:#999;">基本资料：</td>      
                 </tr>
                 
                 <tr>
                  <td class="td_right">用户名：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                <tr>
                  <td class="td_right">密码：</td>
                  <td class=""> 
                    <input type="password" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                <tr>
                  <td class="td_right">角色：</td>
                  <td class=""> 
                    <span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        	<option>管理员</option> 
                        	<option>财务</option> 
                        </select>
                        </div> 
                      </div> 
                    </span>
                  </td>                 
                </tr>
                <tr>
                  <td class="td_right">手机号：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                <tr>
                  <td align="left" colspan="2" style="background-color:#999;">添加收货信息：</td>      
                </tr>
                <tr >
                  <td class="td_right">所在地区</td>
                  <td class="">
                    <span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        	<option>北京</option> 
                        	<option>天津</option> 
                        </select>
                        <select name="" class="select"> 
                        	<option>海淀</option> 
                        	<option>朝阳</option> 
                        </select>
                        <select name="" class="select"> 
                        	<option>上地</option> 
                        	<option>西二旗</option> 
                        </select> 
                        </div> 
                      </div> 
                    </span>
                  </td>
                 </tr>
                 
                 <tr>
                  <td class="td_right">街道地址：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">邮政编码：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">收货人姓名:</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">手机号码：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">电话号码：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
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
  