<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Admin-Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/bootstrap.min.css"/>' />
<!-- Custom CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/style.css" />'/>
<link rel="stylesheet" href='<c:url value="/static/css/morris.css"/>' />
<!-- Graph CSS -->
<link href='<c:url value="/static/css/font-awesome.css"/>' > 
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
						  
				</div>
<!--heder end here-->
		<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="<%=request.getContextPath( )%>/">Home</a> <i class="fa fa-angle-right"></i></li>
				<li class="breadcrumb-item"><a href="<%=request.getContextPath( )%>/admin">Admin Dashboard</a> <i class="fa fa-angle-right"></i></li>
				   
            </ol>
<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/addoctor"><div class="four-agileits">
							<div class="icon">
								<i class="fa fa-user-md " aria-hidden="true"></i>
							</div>
							<div class="four-text">
							
								<h3>9 Doctors</h3>
								
								
							</div>
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="<%=request.getContextPath( )%>/addpatient"><div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-user" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>9 Patient</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
					<a href="<%=request.getContextPath( )%>/addnurse">	<div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-plus-square" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>10 Nurse</h3>
								
								
							</div>
						
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="adpharmacist.html"><div class="four-wthree">
						<div class="icon">
								<i class="fa fa-medkit fa-3x" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>5 Pharmacist</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="clearfix"></div>
				</div>
<!--//four-grids here-->

	
	
	<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
					<a href="adlaboratoris.html">	<div class="four-agileits">
						<div class="icon">
								<i class="fa fa-flask" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>5 Laboratorist</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="adaccount.html"><div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-money" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>5 Accountant</h3>
								

							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="adpaymenthistory.html"><div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-money" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>2 Payment</h3>
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="admedicine.html"><div class="four-wthree">
						<div class="icon">
								<i class="fa fa-plus-square"></i>
							</div>
							<div class="four-text">
								<h3>3 Medicine </h3>
								
								
							</div>
							
						</div></a>
					</div>
					<div class="clearfix"></div>
				</div>
<!--//four-grids here-->
<!--four-grids here-->
		<div class="four-grids">
					<div class="col-md-3 four-grid">
					<a href="adoperationreport.html">	<div class="four-agileits">
						<div class="icon">
							<i class="fa fa-hospital-o"></i>
							</div>
							<div class="four-text">
								<h3>3 Operation Report</h3>
								

							</div>
							
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="adbirth.html"><div class="four-agileinfo">
						<div class="icon">
								<i class="fa fa-file" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>2 Birth Report</h3>
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="addeath.html"><div class="four-w3ls">
						<div class="icon">
								<i class="fa fa-file" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>3 Death Report</h3>
								
								
							</div>
							
							
						</div></a>
					</div>
					<div class="col-md-3 four-grid">
						<a href="adsystemsettings.html"><div class="four-wthree">
						<div class="icon">
								<i class="fa fa-cog" aria-hidden="true"></i>
							</div>
							<div class="four-text">
								<h3>Settings</h3>
								

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


</div>
</div>
  <!--//content-inner-->
			<!--/sidebar-menu-->
				<div class="sidebar-menu" style="height:1050px; position:absolute;">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li class="active"><a href="admin.html"><i class="fa fa-desktop"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										
									     <li><a href="addepartment.html"><i class="fa fa-sitemap"></i><span>Department</span><div class="clearfix"></div></a></li>
										 
										 
									    <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/addoctor"><i class="fa fa-user-md" aria-hidden="true"></i><span>Doctor</span><div class="clearfix"></div></a></li>
									 
									 <li id="menu-academico" ><a href="<%=request.getContextPath( )%>/addpatient"><i class="fa fa-user " aria-hidden="true"></i><span> Patient</span> <div class="clearfix"></div></a></li>
									
									<li id="menu-academico" ><a href="<%=request.getContextPath( )%>/adnurse"><i class="fa fa-plus-square" aria-hidden="true"></i><span>Nurse</span><div class="clearfix"></div></a></li>
									 
									 <li id="menu-academico" ><a href="adpharmacist.html"><i class="fa fa-medkit" aria-hidden="true"></i><span>Pharmacist</span> <div class="clearfix"></div></a>
										  
										</li>
									 <li><a href="adlaboratoris.html"><i class="fa fa-flask" aria-hidden="true"></i>  <span>Laboratorist</span><div class="clearfix"></div></a></li>
									
							       
									<li><a href="adaccount.html"><i class="fa fa-money" aria-hidden="true"></i><span>Accountant</span> <div class="clearfix"></div></a>
									  
									</li>
									
									<li><a href="adreceptionist.html"><i class="fa fa-plus-square"></i>  <span>Receptionist</span><div class="clearfix"></div></a></li>
									<li><a href=""><i class="fa fa-cog" aria-hidden="true"></i><span>Monitor Hospital</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="adpaymenthistory.html">Payment History</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adbedeallotment.html"> Bed Allotment</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adbloodbank.html">BloodBank</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adblooddonor.html">Blood Donor</a></li>
											<li id="menu-academico-avaliacoes" ><a href="admedicine.html">Medicine</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adoperationreport.html">Operation Report</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adbirth.html">Birth Report</a></li>
											<li id="menu-academico-avaliacoes" ><a href="addeath.html">Death Report</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adambavailablity.html">
											Ambulance Availablity</a></li>
											
											<li id="menu-academico-avaliacoes" ><a href="adambfuel.html">
											Ambulance Fuel Exepenses</a></li>
											
											
										  </ul>
										</li>
									
									<li id="menu-academico" ><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i><span>Payroll</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="adcreatepayroll.html">Create Payroll</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adpayrolllist.html">Payroll List</a></li>
											
											
											
										  </ul>
										</li>
									
									
									<li><a href="adnoticeboard.html"><i class="fa fa-file-text-o" aria-hidden="true"></i>  <span>Noticeboard</span><div class="clearfix"></div></a></li>
									
									<li id="menu-academico" ><a href="#"><i class="fa fa-cog" aria-hidden="true"></i><span>Settings</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
									
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="adsystemsettings.html">System Settings</a></li>
										
											<li id="menu-academico-avaliacoes" ><a href="adsms.html">SMS Settings</a></li>
											
											
											
										  </ul>
										</li>
										<li><a href="adprofile.html"><i class="fa fa-medkit"></i>  <span>Account</span><div class="clearfix"></div></a></li>
								  </ul>
								</div>
							  </div>
								  <div class="clearfix"></div>		
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
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>	
<!--COPY rights end here-->
</body>
</html>