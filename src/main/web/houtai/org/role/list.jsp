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
     
    <div id="search_bar" class="mt10">
       <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">角色管理</b></div>
            <div class="box_center pt10 pb10">
              <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td>角色名称</td>
                  <td><input type="text" name="name" class="input-text lh25" size="10"></td>
                  <td>启用状态</td>
                  <td>
                  	<span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        <option>启用</option> 
                        <option>禁用</option> 
                        </select> 
                        </div> 
                      </div> 
                    </span>
                  </td>
                </tr>
              </table>
            </div>
            <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
              <div class="search_bar_btn" style="text-align:right;">
              	 <input type="button" name="button" class="btn btn82 btn_search" value="查询">
              	 <input type="button" name="button" class="btn btn82 btn_checked" value="全选"> 
     			 <input type="button" name="button" class="btn btn82 btn_nochecked" value="取消"> 
                 <input type="button" name="button" class="btn btn82 btn_add" value="新增" onClick="location.href='add.jsp'" />
              </div>
            </div>
          </div>
        </div>
    </div>
     <div id="table" class="mt10">
        <div class="box span10 oh">
              <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
                <tr>
                   <th width="50px"><input type="checkbox" /></th>
                   <th>角色名称</th>
                   <th>启用状态</th>
                   <th>操作</th>
                </tr>
                <tr class="tr">
                   <td class="td_center"><input type="checkbox"></td>
                   <td class="td_center"><a href="info.jsp">管理员</a></td>
                   <td class="td_center">启用</td>
                   <td class="td_center">
                        <a href="edit.jsp" class="ext_btn">编辑</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认禁用！')) alert('操作成功！');" class="ext_btn">禁用</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认删除！')) alert('操作成功！');" class="ext_btn">删除</a>
                   </td>	
                 </tr>
                 <tr class="tr">
                   <td class="td_center"><input type="checkbox"></td>
                   <td class="td_center"><a href="info.jsp">管理员</a></td>
                   <td class="td_center">启用</td>
                   <td class="td_center">
                        <a href="edit.jsp" class="ext_btn">编辑</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认禁用！')) alert('操作成功！');" class="ext_btn">禁用</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认删除！')) alert('操作成功！');" class="ext_btn">删除</a>
                   </td>	
                 </tr>
                 <tr class="tr">
                   <td class="td_center"><input type="checkbox"></td>
                   <td class="td_center"><a href="info.jsp">管理员</a></td>
                   <td class="td_center">启用</td>
                   <td class="td_center">
                        <a href="edit.jsp" class="ext_btn">编辑</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认禁用！')) alert('操作成功！');" class="ext_btn">禁用</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认删除！')) alert('操作成功！');" class="ext_btn">删除</a>
                   </td>	
                 </tr>
                 <tr class="tr">
                   <td class="td_center"><input type="checkbox"></td>
                   <td class="td_center"><a href="info.jsp">管理员</a></td>
                   <td class="td_center">启用</td>
                   <td class="td_center">
                        <a href="edit.jsp" class="ext_btn">编辑</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认禁用！')) alert('操作成功！');" class="ext_btn">禁用</a>&nbsp;&nbsp;
                        <a href="javascript:if(confirm('确认删除！')) alert('操作成功！');" class="ext_btn">删除</a>
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
  