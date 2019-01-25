<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
 <html lang="zh-CN">
 <head>
   <meta charset="UTF-8">
   <link rel="stylesheet" href="../css/common.css">
   <link rel="stylesheet" href="../css/main.css">
   <script type="text/javascript" src="../js/jquery.min.js"></script>
   <script type="text/javascript" src="../js/colResizable-1.3.min.js"></script>
   <script type="text/javascript" src="../js/common.js"></script>
     <script type="application/javascript" src="../js/Dateshift.js"></script>
     <script type="application/javascript">
        function chaxun() {
            $(".tr").remove();
            var name=$("#name").val();

            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/pro/selectByname",
                data:{"pname":name},
                dataType: "json",
                success: function(result){
                    $(result).each(function (index, item) {

                        //时间转换、
                        var pstart = getMyDate(parseInt(item.pstart));
                        var pend = getMyDate(parseInt(item.pend));
                        var bili=Math.floor(item.geton.ging/item.pamount*100);
                        var idtr ='tr';
                        var tr = "<tr class='tr' id='"+idtr +(index+1)+"'>" +
                            " <td align='center'>"+item.pid+"</td>" +
                            "<td align='center'>"+item.pname+"</td>" +
                            "<td align='center'>"+item.pcomname+"</td>" +
                            "<td align='center'>"+item.ptypes+"</td>" +
                            " <td align='center'>"+item.pamount+"</td>" +
                            "<td align='center'>"+item.geton.ging+"</td>" +
                            " <td align='center'>"+bili+"%</td>" +
                            "<td align='center'>"+pstart+"</td>" +
                            "<td align='center'>"+pend+"</td>" +
                            " <td align='center'>\n" +
                            " <a href='edit.jsp' class='ext_btn'>编辑修改</a>&nbsp;&nbsp;" +
                            "<a href=\"#\" class=\"ext_btn\">满标确认</a>\n" +
                            "</td></tr>";
                        $("#"+idtr+index+"").after(tr);
                    });
                }
            });
        }

     <%--  $(function () {
           $.ajax({
               type: "post",
               url: "${pageContext.request.contextPath}/pro/selectsave",
               dataType: "json",
               success: function(result){
                   $(result).each(function (index, item) {

                       //时间转换、
                       var pstart = getMyDate(parseInt(item.pstart));
                       var pend = getMyDate(parseInt(item.pend));



                       var bili=Math.floor(item.geton.ging/item.pamount*100);
                       var idtr ='tr';
                       var tr = "<tr class='tr' id='"+idtr +(index+1)+"'>" +
                           " <td align='center'>"+item.pid+"</td>" +
                           "<td align='center'>"+item.pname+"</td>" +
                           "<td align='center'>"+item.pcomname+"</td>" +
                           "<td align='center'>"+item.ptypes+"</td>" +
                           " <td align='center'>"+item.pamount+"</td>" +
                           "<td align='center'>"+item.geton.ging+"</td>" +
                           " <td align='center'>"+bili+"%</td>" +
                           "<td align='center'>"+pstart+"</td>" +
                           "<td align='center'>"+pend+"</td>" +
                           " <td align='center'>\n" +
                           " <a href='edit.jsp' class='ext_btn'>编辑修改</a>&nbsp;&nbsp;" +
                           "<a href=\"#\" class=\"ext_btn\">满标确认</a>\n" +
                           "</td></tr>";
                       $("#"+idtr+index+"").after(tr);
                   });
               }
           });
       })

    --%>

     </script>

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
            <div class="box_top"><b class="pl15">项目管理</b></div>
            <div class="box_center pt10 pb10">
              <table class="form_table" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td>项目名称</td>
                  <td><input type="text" id="name" class="input-text lh25" size="10"></td>
                  <td></td>
                  <td>
                  </td>
                </tr>
              </table>
            </div>
            <div class="box_bottom pb5 pt5 pr10" style="border-top:1px solid #dadada;">
              <div class="search_bar_btn" style="text-align:right;">
              	 <input type="button" name="button" onclick="chaxun()" class="btn btn82 btn_search" value="查询">
                                                                                              <!--
                                                                                              
                 <input type="button" name="button" class="btn btn82 btn_add" value="新增" onClick="location.href='add.jsp'" />-->
              </div>
            </div>
          </div>
        </div>
    </div>
     <div id="table" class="mt10">
        <div class="box span10 oh">
              <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table">
                <tr id="tr0">
                   <th>ID</th>
                   <th>项目名称</th>
                   <th>发起方</th>
                   <th>项目类别</th>
                   <th>呼唤金额</th>
                   <th>认投金额</th>
                   <th>完成比例</th>
                   <th>开始时间</th>
                   <th>结束时间</th>
                   <th width="200">操作</th>
                </tr>
                <c:forEach items="${pi.list}" var="pro">
                <tr class="tr" >
                   <td align="center">${pro.pid}</td>
                   <td align="center">${pro.pname}</td>
                   <td align="center">${pro.pcomname}</td>
                   <td align="center">${pro.ptypes}</td>
                   <td align="center">${pro.pamount}</td>
                   <td align="center">${pro.geton.ging}</td>
                   <td align="center" >${pro.percent}%</td>
                   <td align="center"><fmt:formatDate value="${pro.pstart}" pattern="yyyy-MM-dd"/> </td>
                   <td align="center"><fmt:formatDate value="${pro.pend}" pattern="yyyy-MM-dd"/></td>
                   <td align="center">
                        <a href="${pageContext.request.contextPath}/pro/selectBypid?pid=${pro.pid}" class="ext_btn">编辑修改</a>&nbsp;&nbsp;
                        <a href="#" class="ext_btn">满标确认</a>
                   </td>	
                 </tr>
                </c:forEach>
              </table>
              <div class="page mt10">
                <div class="pagination">
                  <ul>
                      <li class="first-child"><a href="${pageContext.request.contextPath}/pro/selectsave?currpage=1">首页</a></li>
                      <li class="disabled">
                          <c:if test="${pi.pageNum != 1}">
                            <a href="${pageContext.request.contextPath}/pro/selectsave?currpage=${pi.prePage}">上一页</a>
                          </c:if>
                      </li>
                      <li>
                          <c:if test="${pi.pageNum != pi.pages}">
                            <a href="${pageContext.request.contextPath}/pro/selectsave?currpage=${pi.nextPage}">下一页</a>
                          </c:if>
                      </li>
                      <li class="last-child"><a href="${pageContext.request.contextPath}/pro/selectsave?currpage=${pi.pages}">尾页</a></li>
                  	  <li class="disabled"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总共${pi.pages}页&nbsp;&nbsp;每页10条&nbsp;&nbsp;当前第${pi.pageNum}页&nbsp;&nbsp;</span></li>
                  </ul>
                </div>

              </div>
        </div>
     </div>
   </div> 
 </body>
 </html>
  