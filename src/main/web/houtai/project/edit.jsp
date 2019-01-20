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
     <div id="forms" class="mt10">
        <div class="box">
          <div class="box_border">
            <div class="box_top"><b class="pl15">项目编辑</b></div>
            <div class="box_center">
              <form action="javascript:location.href='list.jsp'" class="jqtransform">
               <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">
               	
                
                <tr>
                  <td class="td_left"><h3>项目信息：</h3></td>
                  <td class=""> 
                  </td>                 
                </tr>	
                <tr>
                	<td></td>
                    <td></td>
                </tr>    
                 <tr>
                  <td class="td_right">项目名称：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">
                  </td>                 
                </tr>
                <tr>
                  <td class="td_right">项目简介：</td>
                  <td class="">
                    <textarea name="" id="" cols="30" rows="10" class="textarea" style="resize:none;"></textarea>
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">项目类型：</td>
                  <td class="">
                    <span class="fl">
                      <div class="select_border"> 
                        <div class="select_containers "> 
                        <select name="" class="select"> 
                        <option>演出</option> 
                        <option>赛事</option> 
                        </select> 
                        </div> 
                      </div> 
                    </span>
                  </td>
                 </tr>
                 <tr>
                  <td class="td_right">呼唤金额：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">元
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">筹资天数：</td>
                  <td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="15">~<input type="text" name="name" class="input-text lh30" size="15">
                  </td>                 
                </tr>
                
                <tr>
                  <td class="td_right">H5顶部图片：</td>
                  <td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 </tr>
                
                <tr>
                  <td class="td_right">项目详情：</td>
                  <td class="">
                    <textarea name="" id="" cols="30" rows="10" class="textarea" style="resize:none;"></textarea>
                  </td>
                 </tr>
                     
                     
                     
                     
                 <tr>
                  <td class="td_left"><h3>发起人信息：</h3></td>
                  <td class=""> 
                  </td>                 
                </tr>    
                     
                <tr>
                	<td></td>
                    <td></td>
                </tr>         
                     
                               
                    <tr>
                  	<td class="td_right">公司名称：</td>
                  	<td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">元
                 	</td>                 
                	</tr>
                    
                    <tr>
                  	<td class="td_right">企业营业执照副本扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                 
                 	<tr>
                  	<td class="td_right">法人身份证反面扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                 
                 	<tr>
                  	<td class="td_right">经办人身份证反面扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                    
                    <tr>
                  	<td class="td_right">经办人联系电话：</td>
                  	<td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">元
                 	</td>                 
                	</tr>
                    
                    <tr>
                  	<td class="td_right">组织机构代码证扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                 
                 	<tr>
                  	<td class="td_right">税务登记副本扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                 
                 	<tr>
                  	<td class="td_right">银行结算账户开户许可证扫描件：</td>
                  	<td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                 	</tr>
                    
                    <tr>
                  	<td class="td_right">银行：</td>
                  	<td class=""> 
                    	<span class="fl">
                      	<div class="select_border"> 
                        <div class="select_containers "> 
                        	<select name="" class="select"> 
                        		<option>中国农业银行</option> 
                        		<option>中国工商银行</option> 
                        	</select> 
                        </div> 
                      	</div> 
                    	</span>
                 	</td>                 
                	</tr>
                    
                    <tr>
                  	<td class="td_right">银行对公账号：</td>
                  	<td class=""> 
                    <input type="text" name="name" class="input-text lh30" size="40">元
                 	</td>                 
                	</tr>
                    
                 <tr>
                   <td class="td_right">&nbsp;</td>
                   <td class="">
                     <input type="button" name="button" class="btn btn82 btn_save2" onClick="javascript:alert('操作成功！');" value="修改" /> 
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
  