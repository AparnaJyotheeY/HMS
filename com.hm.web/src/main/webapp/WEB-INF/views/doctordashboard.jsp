<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.hm.web.model.DoctorBean"%>
<%@page import="java.util.List"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Hospital management system</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/bootstrap.min.css"/>'  />
<!-- Custom CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/style.css"/>'  />

<!-- Graph CSS -->
<link href='<c:url value="/static/css/font-awesome.css"/>' > 
<!-- jQuery -->
<script src='<c:url value="/static/js/jquery-2.1.4.min.js"/>'></script>
<!-- //jQuery -->

<!-- lined-icons -->
<link rel="stylesheet" href='<c:url value="/static/css/icon-font.min.css" />' />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
<link href='<c:url value="/static/css/app.css"/>' />
<link href='<c:url value="/static/css/fullcalendar.min.css" />' />
<link href='<c:url value="/static/css/fullcalendar.print.css"/>' />
<script src='<c:url value="/static/js/moment.min.js"/>'></script>

<script src='<c:url value="/static/js/fullcalendar.min.js"/>'></script>
<!-- //lined-icons -->
<style>

	
		
	#wrap {
		width: 1100px;
		margin: 0 auto;
		}
		
	#external-events {
		float: left;
		width: 150px;
		padding: 0 10px;
		text-align: left;
		}
		
	#external-events h4 {
		font-size: 16px;
		margin-top: 0;
		padding-top: 1em;
		}
		
	.external-event { /* try to mimick the look of a real event */
		margin: 10px 0;
		padding: 2px 4px;
		background: #3366CC;
		color: #fff;
		font-size: .85em;
		cursor: pointer;
		}
		
	#external-events p {
		margin: 1.5em 0;
		font-size: 11px;
		color: #666;
		}
		
	#external-events p input {
		margin: 0;
		vertical-align: middle;
		}
	#script-warning {
		display: none;
		background: #eee;
		border-bottom: 1px solid #ddd;
		padding: 0 10px;
		line-height: 40px;
		text-align: center;
		font-weight: bold;
		font-size: 12px;
		color: red;
	}

	#loading {
		display: none;
		position: absolute;
		top: 10px;
		right: 10px;
	}

	#calendar {
/* 		float: right; */
        margin: 0 auto;
		width: 900px;
		background-color: #FFFFFF;
		  border-radius: 6px;
        box-shadow: 0 1px 2px #C3C3C3;
		-webkit-box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
-moz-box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
box-shadow: 0px 0px 21px 2px rgba(0,0,0,0.18);
		}

</style>
</head> 
<body>
   <div class="page-container">
   <!--/content-inner-->
<div class="left-content">
	   <div class="mother-grid-inner">
             <!--header start here-->
<div class="header-main">
					<div class="col-md-3 logo-w3-agile">
								<h1><a href="index.html">HMS</a></h1>
							</div>
						<div class=" col-md-offset-6 col-md-3 profile_details w3l">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img src="images/" alt="img"> </span> 
												<div class="user-name">
													<p>Name</p>
												</div>
												<i class="fa fa-angle-down"></i>
												<i class="fa fa-angle-up"></i>
												<div class="clearfix"></div>	
											</div>	
										</a>
										<ul class="dropdown-menu drp-mnu">
											<li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
										</ul>
									</li>
								</ul>
							</div>
						  <div class="clearfix"> </div>
						  
				</div><!--heder end here-->
		<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.html">Home</a> <i class="fa fa-angle-right"></i></li>
				<li class="breadcrumb-item"><a href="doctor.html">Doctor Dashboard</a> <i class="fa fa-angle-right"></i></li>
            </ol>
			<div class="col-md-6"><h3> <i class="fa fa-arrow-circle-right" aria-hidden="true"></i>&nbsp;&nbsp;Appointment Calendar</h3></div>
			<div class="clear"></div>
			<div class="clear"></div>
			<div id='wrap'>


<div id='calendar'></div>

<div style='clear:both'></div>
</div>
			
<div class="clearfix"></div>
			
				
<!--//four-grids here-->
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		</script>

</div>
</div>
  <!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li class="active"><a href="doctor.html"><i class="fa fa-home"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										
										
										 <li id="menu-academico" ><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i><span> Appointment</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="appointmentlist.html">Appointment List</a></li>
											<li id="menu-academico-avaliacoes" ><a href="Requestedappointment.html">Requested Appointments</a></li>
											
										  </ul>
										</li>
									<li><a href="prescription.html"><i class="fa fa-stethoscope"></i><span>Prescription</span><div class="clearfix"></div></a></li>
									<li><a href="patient.html"><i class="fa fa-wheelchair"></i><span>Patient</span><div class="clearfix"></div></a></li>
									 <li id="menu-academico" ><a href="bedallotment.html"><i class="fa fa-bed" aria-hidden="true"></i><span> Bed allotment</span> <div class="clearfix"></div></a>
										  
										</li>
									<li id="menu-academico" ><a href="bloodbank.html"><i class="fa fa-tint"></i><span>BloodBank</span><div class="clearfix"></div></a></li>
									  <li id="menu-academico" ><a href="report.html"><i class="fa fa-hospital-o"></i><span> Report</span> <div class="clearfix"></div></a>
										  
										</li>
									  <li><a href="doctoroperationtheaters.html"><i class="fa fa-hospital-o"></i><span>Operation Theatre List</span><div class="clearfix"></div></a></li> 
									
									<li><a href="payroll.html"><i class="fa fa-money" aria-hidden="true"></i><span>Payroll</span> <div class="clearfix"></div></a>
									  
									</li>
									
									<li><a href="message.html"><i class="fa fa-envelope" aria-hidden="true"></i>  <span>Message</span><div class="clearfix"></div></a></li>
									<li><a href="profile.html"><i class="fa fa-lock" aria-hidden="true"></i>  <span>Profile</span><div class="clearfix"></div></a></li>
									
								  </ul>
								</div>
							  </div>
							  <div class="clearfix"></div>		
							</div>
						<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
<!--js -->

<script src='<c:url value="/static/js/jquery.nicescroll.js"/>'></script>
<script src='<c:url value="/static/js/scripts.js"/>'></script>
<!-- Bootstrap Core JavaScript -->
   <script src='<c:url value="/static/js/bootstrap.min.js"/>'></script>
   <!-- /Bootstrap Core JavaScript -->	   
<!-- morris JavaScript -->	
<script src='<c:url value="/static/js/raphael-min.js"/>'></script>

<script>
	$(document).ready(function() {
	
		$('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay,listWeek'
			},
			defaultDate: '2017-04-12',
			editable: true,
			navLinks: true, // can click day/week names to navigate views
			eventLimit: true, // allow "more" link when too many events
			events: {
				url: 'php/get-events.php',
				error: function() {
					$('#script-warning').show();
				}
			},
			loading: function(bool) {
				$('#loading').toggle(bool);
			}
		});
		
	});
	
</script>
<!--copy rights start here-->
<div class="copyrights">
	 <p>� 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>	
<!--COPY rights end here-->

</body>
</html>
