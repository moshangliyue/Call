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
<script type="application/javascript">
    function saveInfos() {
        alert("sss")
        $("#updateform").submit();
    }

</script>
    <script type="text/javascript">
        $(function () {
            $(".list_table").colResizable({
                liveDrag: true,
                gripInnerHtml: "<div class='grip'></div>",
                draggingClass: "dragging",
                minWidth: 30
            });

        });
    </script>

    <title>Document</title>
</head>
<body>
<div class="container">
    <div id="button" class="mt10">
        <input type="button" name="button" class="btn btn82 btn_add" onClick="location.href='add.jsp'" value="项目">

    </div>
    <div id="forms" class="mt10">
        <div class="box">
            <div class="box_border">
                <div class="box_top"><b class="pl15">项目添加</b></div>
                <div class="box_center">
                    <form action="${pageContext.request.contextPath}/pro/updateBypid" class="jqtransform"
                          id="updateform" method="post" enctype="multipart/form-data">

                        <table class="form_table pt15 pb15" width="100%" cellpadding="0" cellspacing="0">

                            <input type="hidden" name="pid" value="${project.pid}">
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
                                    <input type="text" name="pname" value="${project.pname}" class="input-text lh30" size="40">
                                </td>
                            </tr>
                            <tr>
                                <td class="td_right">项目简介：</td>
                                <td class="">
                                    <textarea name="pintro" id="" cols="30" rows="10" class="textarea"
                                              style="resize:none;">${project.pintro}</textarea>
                                </td>
                            </tr>
                            <tr>
                                <td class="td_right">项目类型：</td>
                                <td class="">
                    <span class="fl">
                      <div class="select_border">
                        <div class="select_containers ">
                        <select name="ptypes" class="select">
                        <option value="演出">演出</option>
                        <option value="赛事">赛事</option>
                        </select>
                        </div>
                      </div>
                    </span>
                                </td>
                            </tr>
                            <tr>
                                <td class="td_right">呼唤金额：</td>
                                <td class="">
                                    <input type="text" name="pamount"value="${project.pamount}" class="input-text lh30" size="40">元
                                </td>
                            </tr>

                            <tr>
                                <td class="td_right">筹资天数：</td>
                                <td class="">
                                    <input type="date" name="update" class="input-text lh30" size="15">~
                                    <input type="date" name="downdate" class="input-text lh30" size="15">
                                </td>
                            </tr>

                            <tr>
                                <td class="td_right">H5顶部图片：</td>
                                <td class=""><input type="file" name="file" class="input-text lh30" size="10"></td>
                            </tr>

                            <tr>
                                <td class="td_right">项目详情：</td>
                                <td class="">
                                    <textarea name="pdetail" id="" cols="30" rows="10" class="textarea"
                                              style="resize:none;">${project.pdetail}</textarea>
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
                                    <input type="text" name="pcomname" value="${project.pcomname}" class="input-text lh30" size="40">
                                </td>
                            </tr>

                            <tr>
                                <td class="td_right">经办人联系电话：</td>
                                <td class="">
                                    <input type="text" name="pcomphon" value="${project.pcomphon}" class="input-text lh30" size="40">
                                </td>
                            </tr>


                            <tr>
                                <td class="td_right">银行：</td>
                                <td class="">
                    	<span class="fl">
                      	<div class="select_border">
                        <div class="select_containers ">
                        	<select name="pbank" class="select">
                        		<option value="中国农业银行">中国农业银行</option>
                        		<option value="中国工商银行">中国工商银行</option>
                        	</select>
                        </div>
                      	</div>
                    	</span>
                                </td>
                            </tr>

                            <tr>
                                <td class="td_right">银行对公账号：</td>
                                <td class="">
                                    <input type="text" name="pbanknumber" value="${project.pbanknumber}" class="input-text lh30" size="40">
                                </td>
                            </tr>
                            <div class="box_top"><b class="pl15">添加回报</b></div>
                            <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0">

                                <tr>
                                    <td class="td_right">回报类型：</td>
                                    <td class="">
                    <span class="fl">
                      <div class="select_border">
                        <div class="select_containers ">
                        <select name="phtypes" class="select">
                        <option value="演唱会门票">演唱会门票</option>
                        <option value="体育赛事门票">体育赛事门票</option>
                        </select>
                        </div>
                      </div>
                    </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="td_right">支付金额：</td>
                                    <td class="">
                                        <input type="text" name="phamount" value="${project.phamount}"  class="input-text lh30" size="40">
                                    </td>
                                </tr>
                                <tr>
                                    <td class="td_right">回报内容：</td>
                                    <td class="">
                                        <textarea name="phcontent" id="" cols="30" rows="10" class="textarea"
                                                  style="resize:none;">${project.phcontent}</textarea>
                                    </td>
                                </tr>

                                <tr>
                                    <td class="td_right">限定名额：</td>
                                    <td class="">
                                        <input type="text" name="phnumberpeople" value="${project.phnumberpeople}" class="input-text lh30" size="40">
                                    </td>
                                </tr>
                                <tr>
                                    <td class="td_right">回报时间：</td>
                                    <td class="">
                                        项目结束后&nbsp;&nbsp;<input type="text" name="phday" value="${project.phday}" class="input-text lh30"
                                                                size="10">天
                                    </td>
                                </tr>

                                <tr>
                                    <td class="td_right">&nbsp;</td>

                                    <td class="">
                                        <input type="button" name="button" class="btn btn82 btn_res"
                                               onClick="saveInfos()" value="提交">
                                    </td>
                                </tr>
                            </table>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
  