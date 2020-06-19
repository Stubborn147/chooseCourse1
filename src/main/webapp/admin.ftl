<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
<#--    <link rel="Bookmark" href="/favicon.ico">-->
<#--    <link rel="Shortcut Icon" href="/favicon.ico"/>-->
    <!--[if lt IE 9]>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css"/>

    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>

    <!--请在下方写此页面业务相关的脚本-->
    <script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
    <script src="static/h-ui/js/echarts.min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>admin</title>
	<style type="text/css">
		td{
			border: 1px solid #ddd;
		}
	</style>
</head>
<body>

访问路径:${admins}
	<div class="navbar-wrapper" style="width: 100%;background-color:#228B22;">
	    <div class="navbar navbar-fixed-top">
	        <div class="container-fluid cl" style="background-color: #228B22;height: 20%;">
						<h3 style="color: white;">Young_OG | 管理系统 </h3>
	            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
	                <!-- 判断用户是否登录，如果用户未登录那么显示请登录 -->
	                <ul class="cl">
	                    <li style="font-size: 16px;">欢迎管理员</li>
						<li><a href="#">注销</a></li>
	                </ul>
	                <!--判断用户是否登录，如果用户已经登录显示用户名和权限名-->
	            </nav>
	        </div>
	    </div>
	</div>
<aside class="Hui-aside" style="width: 13%;">
    <div class="menu_dropdown bk_2" style="margin-top: 45%;">
		<div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
		    <dl id="menu-admin">
		        <dt style="color: white;font-size: 18px;" id="msgstatic" onclick="messagae()">信息统计</dt>
		        <dd>
		            <ul>
		                <li>班级添加</li>
						<li>班级比例</li>
		            </ul>
		        </dd>
		    </dl>
		</div>
        <div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
            <dl id="menu-article">
                <dt style="color: white;font-size: 18px;" id="student" onclick="student()">学生管理</dt>
                <dd>
                    <ul>
                        <li>添加学生</li>
						<li>修改学生</li>
                    </ul>
                </dd>
            </dl>
        </div>
        <div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
            <dl id="menu-product">
                <dt style="color: white;font-size: 18px;" id="teacher" onclick="teacher()">教师管理</dt>
                <dd>
                    <ul>
                        <li>添加教师</li>
                        <li>教师课程</li>
                    </ul>
                </dd>
            </dl>
        </div>
        <div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
            <dl id="menu-member">
                <dt style="color: white;font-size: 18px;">课程管理</dt>
                <dd>
                    <ul>
                        <li>添加课程</li>
                    </ul>
                </dd>
            </dl>
        </div>
        <div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
            <dl id="menu-admin">
                <dt style="color: white;font-size: 18px;">班级管理</dt>
                <dd>
                    <ul>
                        <li>班级添加</li>
						<li>班级比例</li>
                    </ul>
                </dd>
            </dl>
        </div>
		<div style="margin-top: 15%;border-radius: 3.125rem;background-color:#228B22 ;text-align: center;">
		    <dl id="menu-product">
		        <dt style="color: white;font-size: 18px;">个人信息</dt>
		        <dd>
		            <ul>
		                <li>修改信息</li>
		            </ul>
		        </dd>
		    </dl>
		</div>
    </div>
</aside>

<div class="Hui-article-box" style="margin-top: 0.8%;margin-left: -2%;">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="" data-href="#">我的管理</span>
                    <em></em></li>
            </ul>
        </div>
    </div>
    <div id="iframe_box" class="Hui-article" style="height: auto;margin-left: 1.5%;">
 <!--统计信息-->
	<div id="statistics" style="width: 80%;height:70%;margin-left: 10%;margin-top: 6%;display: block;"> </div>
<!--学生管理-->	
	<div id="student_manager" style="height: 500px;width: 100%;display: none;">
		<div style="width: 10%;height: 8%; font-weight: 600;font-size: 20px;">学生管理</div>
		 <table style="margin-left: 1%;width: 95%;margin-top: 1%;" id="students">
			 <tr style="text-align: center;">
				 <td style="font-size: 15px;"><b>学号</b></td>
				 <td style="font-size: 15px;"><b>姓名</b></td>
				 <td style="font-size: 15px;"><b>密码</b></td>
				 <td style="font-size: 15px;"><b>性别</b></td>
			     <td style="font-size: 15px;"><b>出生日期</b></td>
				 <td style="font-size: 15px;"><b>地址</b></td>
				 <td style="font-size: 15px;"><b>班级</b></td>
				 <td style="font-size: 15px;"><b>学分</b></td>
			 </tr>
		 </table>
	</div>
	
	<div id="teacher_manager" style="height: 500px;width: 100%;display: none;">
		<div style="width: 10%;height: 8%; font-weight: 600;font-size: 20px;">教师管理</div>
		 <table style="margin-left: 1%;width: 95%;margin-top: 1%;" id="teachers">
			 <tr style="text-align: center;">
				 <td style="font-size: 15px;"><b>工号</b></td>
				 <td style="font-size: 15px;"><b>姓名</b></td>
				 <td style="font-size: 15px;"><b>密码</b></td>
				 <td style="font-size: 15px;"><b>职称</b></td>
			     <td style="font-size: 15px;"><b>联系方式</b></td>
				 <td style="font-size: 15px;"><b>所教课程</b></td>
			 </tr>
		 </table>
	</div>
	
	
	
    </div>
</div>


<!--管理员首页统计-->
<#--<script type="text/javascript">-->
<#--						//使用ajax加载数据 -->
<#--						$.ajax({-->
<#--							type: 'post',-->
<#--							url: "http://localhost:8080/chooseCourse/bar",-->
<#--							dataType: 'json',-->
<#--							success: function(data) { //data格式:[{name:nameValue,value:valueVal},...] -->
<#--								initChat(data);-->
<#--							}-->
<#--						});-->
<#--			-->
<#--						function initChat(data) {-->
<#--							var dom = document.getElementById("statistics");-->
<#--							var myChart = echarts.init(dom);-->
<#--			-->
<#--							// 初始 option-->
<#--							var option = {-->
<#--								title: {-->
<#--									text: '信息统计',-->
<#--								},-->
<#--								backgroundColor: '#ccc',-->
<#--								textStyle: {-->
<#--									color: '#000',-->
<#--								},-->
<#--								tooltip: {},-->
<#--								legend: {-->
<#--									data: ['数量'],-->
<#--								},-->
<#--								xAxis: {-->
<#--									data: formatData(data).xAxData,-->
<#--									axisLabel: {-->
<#--										interval: 0, //横轴信息全部显示  -->
<#--										rotate: -20, //-30度角倾斜显示  -->
<#--									}-->
<#--								},-->
<#--								yAxis: {},-->
<#--								series: [{-->
<#--									name: '数量',-->
<#--									type: 'bar',-->
<#--									data: formatData(data).serData-->
<#--								}]-->
<#--							};-->
<#--							if (option && typeof option === "object") {-->
<#--								myChart.setOption(option, true);-->
<#--							}-->
<#--						};-->
<#--			-->
<#--						function formatData(data) {-->
<#--							var xAxData = [];-->
<#--							var serData = [];-->
<#--			-->
<#--							for (var i = 0; i < data.length; i++) {-->
<#--								xAxData.push(data[i].name || "");-->
<#--								serData.push({-->
<#--									name: data[i].name,-->
<#--									value: data[i].value || 0-->
<#--								});-->
<#--							}-->
<#--			-->
<#--							return {-->
<#--								xAxData: xAxData,-->
<#--								serData: serData-->
<#--							};-->
<#--						};-->
<#--</script>-->

<#--<script>-->
<#--	//获取学生的全部信息-->
<#--	$.ajax({-->
<#--		url:"http://localhost:8080/chooseCourse/student/all",-->
<#--		success:function(stu){-->
<#--			var msgs='';-->
<#--			$.each(stu,function(index,student){-->
<#--				msgs+='<tr style="text-align: center;">'+-->
<#--								 '<td>'+student.sid+'</td>'+-->
<#--								 '<td>'+student.name+'</td>'+-->
<#--								 '<td>'+student.pwd+'</td>'+-->
<#--								 '<td>'+student.gender+'</td>'+-->
<#--				                ' <td>'+student.birthday+'</td>'+-->
<#--								 '<td>'+student.address+'</td>'+-->
<#--								 '<td>'+student.className+'</td>'+-->
<#--								 '<td>'+student.credit+'</td>'+-->
<#--								  '<td style="border: none;"><div style="background-color: rgba(238, 238, 238, 0.98);border-radius:50% ;" onclick="del(this)">×</div></td>'+-->
<#--				       '</tr>'-->
<#--			});-->
<#--			$("#students").append(msgs);-->
<#--		}-->
<#--	});-->
<#--	-->
<#--	//获取教师的全部信息-->
<#--	$.ajax({-->
<#--		url:"http://localhost:8080/chooseCourse/teacher/all",-->
<#--		success:function(tea){-->
<#--			var msgt='';-->
<#--			$.each(tea,function(index,teacher){-->
<#--				msgt+='<tr style="text-align: center;">'+-->
<#--								' <td style="font-size: 15px;">'+teacher.tid+'</td>'+-->
<#--								 '<td style="font-size: 15px;">'+teacher.tname+'</td>'+-->
<#--								 '<td style="font-size: 15px;">'+teacher.tpwd+'</td>'+-->
<#--								' <td style="font-size: 15px;">'+teacher.title+'</td>'+-->
<#--				   ' <td style="font-size: 15px;">'+teacher.phone+'</td>'+-->
<#--								 '<td style="font-size: 15px;">'+teacher.teachCourse+'</td>'+-->
<#--								  '<td style="border: none;"><div style="background-color: rgba(238, 238, 238, 0.98);border-radius:50% ;" onclick="del(this)">×</div></td>'+-->
<#--				'</tr>'-->
<#--			});-->
<#--			$("#teachers").append(msgt);-->
<#--		}-->
<#--	});-->
<#--	-->
<#--	//点击学生管理，所对应的display为block,其他的全为none-->
<#--	function student(){-->
<#--		document.getElementById("student_manager").style.display="block"; //inline会改变位置-->
<#--		document.getElementById("statistics").style.display="none";-->
<#--		document.getElementById("teacher_manager").style.display="none";-->
<#--		-->
<#--	}-->
<#--	//点击信息统计，所对应的display为block,其他的全为none-->
<#--	function messagae(){-->
<#--		document.getElementById("student_manager").style.display="none";-->
<#--		document.getElementById("statistics").style.display="block";-->
<#--		document.getElementById("teacher_manager").style.display="none";-->
<#--	}-->
<#--	//点击教师管理，所对应的display为block,其他的全为none-->
<#--	function teacher(){-->
<#--		document.getElementById("student_manager").style.display="none";-->
<#--		document.getElementById("statistics").style.display="none";-->
<#--		document.getElementById("teacher_manager").style.display="block";-->
<#--	}-->
<#--	-->
<#--	function del(obj){-->
<#--		obj.parentNode.parentNode.remove();-->
<#--	}-->
<#--</script>-->

<script type="text/javascript">
	
	$(function () {
	    /*$("#min_title_list li").contextMenu('Huiadminmenu', {
	        bindings: {
	            'closethis': function(t) {
	                console.log(t);
	                if(t.find("i")){
	                    t.find("i").trigger("click");
	                }
	            },
	            'closeall': function(t) {
	                alert('Trigger was '+t.id+'\nAction was Email');
	            },
	        }
	    });*/
	});
	
	/*个人信息*/
	function myselfinfo() {
	    layer.open({
	        type: 1,
	        area: ['300px', '200px'],
	        fix: false, //不固定
	        maxmin: true,
	        shade: 0.4,
	        title: '查看信息',
	        content: '<div>管理员信息</div>'
	    });
	}
</script>
</body>
</html>

