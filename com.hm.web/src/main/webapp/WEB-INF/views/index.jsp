<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<link  rel='stylesheet' type='text/css' href='<c:url value="/static/css/bootstrap.min.css"/>' />
<!-- Custom CSS -->
<link  rel='stylesheet' type='text/css' href='<c:url value="/static/css/style.css"/>'  />
<link rel="stylesheet" href='<c:url value="/static/css/morris.css" />'/>
<!-- Graph CSS -->
<link  rel='stylesheet' type='text/css' href='<c:url value="/static/css/font-awesome.css" />'> 
<!-- jQuery -->
<script src='<c:url value="/static/js/jquery-2.1.4.min.js"/>'></script>
<!-- //jQuery -->

<!-- lined-icons -->
<link rel="stylesheet" href='<c:url value="/static/css/icon-font.min.css" />' />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- //lined-icons -->
</head> 
<body>
   <div class="page-container">
   <!--/content-inner-->
<div class="left-content">
	   <div class="mother-grid-inner">
             <!--header start here-->
				<div class="header-main">
					<div class="logo-w3-agile">
								<h1><a href="index.html">HMS</a></h1>
							</div>
					
						  <div class="clearfix"> </div>	
				</div>
<!--heder end here-->
		<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.html">Home</a> <i class="fa fa-angle-right"></i></li>
            </ol>
<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
						<a href="login.jsp"><div class="four-agileits">
							<div class="icon">
								<i class="glyphicon glyphicon-user" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Admin</h3>
								
								
							</div>
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="login.jsp"><div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-user-md fa-3x" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Doctors</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="bedstatus.html"><div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-bed" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Beds</h3>
								
								
							</div></a>
						
							
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/alogin"><div class="four-wthree">
						<div class="icon">
								<i class="fa fa-user-md fa-3x" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Nurse</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="clearfix"></div>
				</div>
<!--//four-grids here-->

	
	
	<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/alogin"><div class="four-agileits">
						<div class="icon">
								<i class="fa fa-laptop" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>IT Department</h3>
								
								
							</div></a>
							
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
					<a href="<%=request.getContextPath( )%>/alogin">	<div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-wrench" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Engineering Department</h3>
								

							</div></a>
							
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/alogin"><div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-flask" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Laboratorist</h3>
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/alogin""><div class="four-wthree">
						<div class="icon">
								<i class="fa fa-medkit"></i>
							</div>
							<div class="four-text">
								<h3>Pharmacist</h3>
								
								
							</div></a>
							
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
<!--//four-grids here-->
<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
					<a href="<%=request.getContextPath( )%>/alogin">	<div class="four-agileits">
						<div class="icon">
							<i class="fa fa-wheelchair"></i>
							</div>
							<div class="four-text">
								<h3>Patient</h3>
								

							</div></a>
							
							
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<a href=""<%=request.getContextPath( )%>/alogin"><div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-money" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Hr & Payroll /operation</h3>
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
					<a href="bloodbankstatus.html">	<div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-hospital-o"></i>
							</div>
							<div class="four-text">
								<h3>Blood Bank</h3>
								
								
							</div>
							</a>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
					<a href="ambulanceavailability.html">	<div class="four-wthree">
						<div class="icon">
								<i class="fa fa-ambulance" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Ambulance Services</h3>
								
</a>
							</div>
							
							
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
<!--//four-grids here-->
<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/alogin"><div class="four-agileits">
						<div class="icon">
								<i class="fa fa-female" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Receptionist</h3>
								
							</div>
							</a>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<a href="operationtheatres.html"><div class="four-agileinfo">
							<div class="icon">
								<i class="glyphicon glyphicon-list-alt" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Operation Theatres Scheduling</h3>
								

							</div></a>
							
						</div>
					</div>
				
					<div class="col-md-3 four-grid">
						<a href="biolab.html"><div class="four-wthree">
							<div class="icon">
								<i class="fa fa-medkit"></i>
							</div>
							<div class="four-text">
								<h3>Biomedical Waste Management</h3>
								
							</div>
							
						</div></a>
					</div>
					<div class="clearfix"></div>
				</div>
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
		<!-- /script-for sticky-nav -->
<!--inner block start here-->
<div class="inner-block">

</div>
<!--inner block end here-->
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>	
<!--COPY rights end here-->
</div>
</div>
  <!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu"style="height:1050px; position:absolute;">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li class="active"><a href="<%=request.getContextPath( )%>/"><i class="fa fa-home"></i> <span>Home</span><div class="clearfix"></div></a></li>
										
										
										 <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/alogin"><i class="glyphicon glyphicon-user" aria-hidden="true"></i><span>Admin</span><div class="clearfix"></div></a></li>
									<li><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-user-md " aria-hidden="true"></i><span>Doctors</span><div class="clearfix"></div></a></li>
									<li id="menu-academico" ><a href="#"><i class="fa fa-bed" aria-hidden="true"></i><span>Beds</span><div class="clearfix"></div></a></li>
									 <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-user-md " aria-hidden="true"></i><span> Nurse</span> <div class="clearfix"></div></a>
										  
										</li>
									<li id="menu-academico" ><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-laptop" aria-hidden="true"></i><span>IT Department</span><div class="clearfix"></div></a></li>
									  <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-wrench" aria-hidden="true"></i><span> Engieering Department</span> <div class="clearfix"></div></a>
										  
										</li>
									 <li><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-flask" aria-hidden="true"></i>  <span>Laboratorist</span><div class="clearfix"></div></a></li>
									<li><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-medkit"></i>  <span>Pharmacist</span><div class="clearfix"></div></a></li>
							        <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-wheelchair"></i> <span>Patient</span> <div class="clearfix"></div></a>
										 
									 </li>
									<li><a href="<%=request.getContextPath( )%>/alogin"><i class="fa fa-money" aria-hidden="true"></i><span>Hr & Payroll/operation</span> <div class="clearfix"></div></a>
									  
									</li>
									
									<li><a href=""><i class="fa fa-hospital-o"></i>  <span>Blood Bank</span><div class="clearfix"></div></a></li>
									<li><a href=""><i class="fa fa-ambulance" aria-hidden="true"></i>  <span>Ambulance Services</span><div class="clearfix"></div></a></li>
									<li><a href=""><i class="fa fa-quora" aria-hidden="true"></i> <span>Quality Assurance &<br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Monitoring</span><div class="clearfix"></div></a></li>
									<li><a href=""><i class="fa fa-medkit"></i>  <span>Biomedical waste<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mangement</span><div class="clearfix"></div></a></li>
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
<script src='<c:url value="/static/js/morris.js"/>'></script>
<script>
	$(document).ready(function() {
		//BOX BUTTON SHOW AND CLOSE
	   jQuery('.small-graph-box').hover(function() {
		  jQuery(this).find('.box-button').fadeIn('fast');
	   }, function() {
		  jQuery(this).find('.box-button').fadeOut('fast');
	   });
	   jQuery('.small-graph-box .box-close').click(function() {
		  jQuery(this).closest('.small-graph-box').fadeOut(200);
		  return false;
	   });
	   
	    //CHARTS
	    function gd(year, day, month) {
			return new Date(year, month - 1, day).getTime();
		}
		
		graphArea2 = Morris.Area({
			element: 'hero-area',
			padding: 10,
        behaveLikeLine: true,
        gridEnabled: false,
        gridLineColor: '#dddddd',
        axes: true,
        resize: true,
        smooth:true,
        pointSize: 0,
        lineWidth: 0,
        fillOpacity:0.85,
			data: [
				{period: '2014 Q1', iphone: 2668, ipad: null, itouch: 2649},
				{period: '2014 Q2', iphone: 15780, ipad: 13799, itouch: 12051},
				{period: '2014 Q3', iphone: 12920, ipad: 10975, itouch: 9910},
				{period: '2014 Q4', iphone: 8770, ipad: 6600, itouch: 6695},
				{period: '2015 Q1', iphone: 10820, ipad: 10924, itouch: 12300},
				{period: '2015 Q2', iphone: 9680, ipad: 9010, itouch: 7891},
				{period: '2015 Q3', iphone: 4830, ipad: 3805, itouch: 1598},
				{period: '2015 Q4', iphone: 15083, ipad: 8977, itouch: 5185},
				{period: '2016 Q1', iphone: 10697, ipad: 4470, itouch: 2038},
				{period: '2016 Q2', iphone: 8442, ipad: 5723, itouch: 1801}
			],
			lineColors:['#ff4a43','#a2d200','#22beef'],
			xkey: 'period',
            redraw: true,
            ykeys: ['iphone', 'ipad', 'itouch'],
            labels: ['All Visitors', 'Returning Visitors', 'Unique Visitors'],
			pointSize: 2,
			hideHover: 'auto',
			resize: true
		});
		
	   
	});
	</script>
</body>
</html>