<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.hm.web.model.DoctorBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Admin-Nurse</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<!-- Bootstrap Core CSS -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel='stylesheet' type='text/css'  href='<c:url value="/static/css/style.css" />'/>
<link rel="stylesheet"  type="text/css" href='<c:url value="/static/css/morris.css"/>' />
<!--js -->
<script src='<c:url value="/static/js/jquery.nicescroll.js"/>'></script>
<script src='<c:url value="/static/js/scripts.js"/>'></script>
<!-- Bootstrap Core JavaScript -->
   <script src='<c:url value="/static/js/raphael-min.js"/>'></script>
   <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-timepicker/0.5.2/js/bootstrap-timepicker.js"></script>


   <link href='<c:url value="/static/css/jquery-ui.css"/>' >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-timepicker/0.5.2/css/bootstrap-timepicker.css">
   <script src='<c:url value="/static/tinymce/tinymce.min.js"/>'></script>
<script>
tinymce.init({
selector:"textarea.tinymce"
});

</script>

<style>
.modal-footer {
    
     border-top: none; 
}
</style>
<!-- //lined-icons -->
</head> 
<%
String message=(String) request.getAttribute("message");
if(message==null){
	message="";
}
String smessage=(String) request.getAttribute("successmessage");
if(smessage==null){
	smessage="";
}
%>
<body>
   <div class="page-container">
   <!--/content-inner-->
<div class="left-content">
	   <div class="mother-grid-inner">
             <!--header start here-->
<div class="header-main">
					<div class="col-md-3 logo-w3-agile">
								<h1><a href="<%=request.getContextPath( )%>/">HMS</a></h1>
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
											<li> <a href="login.jsp"><i class="fa fa-sign-out"></i> Logout</a> </li>
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

<div class="col-md-6"><h3> <i class="fa fa-arrow-circle-right" aria-hidden="true"></i>&nbsp;&nbsp; Nurse</h3></div>
<div class="col-md-offset-9 col-md-3"><button type="button" class="btn btn-success" data-toggle="modal" data-target="#add">Add Nurse</button></div>
                       <span> <h4 style="color:red;text-align:center"><%=message %></h4><h4 style="color:green;text-align:center"><%=smessage %></h4></span>

<div class="btn-toolbar">
   <button class="btn btn-primary">Copy</button>
    
    <button onclick="location.href='./exportdexcel'" class="btn btn-warning">Excel</button>
    <button onclick="location.href='./exportdpdf'" class="btn btn-danger">PDF</button>
   
</div>
<div class="well  table-responsive">
     <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   
                   <th>Image </th>
                   <th>Name</th>
                    <th>Email</th>
                    <th>Address</th>
					<th>Phone</th>
					<th>Options</th>
                     
					 
               </thead>
    <tbody>
    
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    
    
    
    <td><a data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></a>
    <a data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></a></td>
    </tr>
  
    </tbody>
        
</table>
  </div>
<div class="clearfix"></div>
<ul class="pagination pull-right">
  <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
  <li class="active"><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
</ul>
                
          
            
       

<div class="clear"></div>
<div class="clear"></div>


<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Edit Nurse</h4>
      </div>
		  
          <div class="modal-body">
		  <div class="col-md-offset-1 col-md-10">
         
		 <div class="form-group">
        <input class="form-control " type="text" placeholder="Name" >
        </div>
		
        <div class="form-group">
        
        <input class="form-control " type="text" placeholder="Email">
        </div>
	
		
		<div class="form-group">
        
        <input class="form-control " type="text" placeholder="Address">
        </div>
		
      <div class="form-group">
        
        <input class="form-control " type="text" placeholder="Phone">
        </div>

		<div class="form-group">
        <label>Image</label>
        <input class="form-control " type="file" placeholder="Phone">
        </div>
		
		
	</div>
	
          <div class="modal-footer" style="text-align:center;">
        <button type="button" class="btn btn-warning">Update</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
    </div>
   
    
    
    
    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
      </div>
          <div class="modal-body">
       
       <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>
       
      </div>
        <div class="modal-footer ">
        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
	
	
<div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Add Nurse</h4>
      </div>
              <form:form action="nursedetails" method="post" class="form-horizontal" enctype="multipart/form-data" modelAttribute="userRegDetails" >
      
          <div class="modal-body">
		  <div class="col-md-offset-1 col-md-10">
         
		 <div class="form-group">
        <input class="form-control " name="name" type="text" placeholder="Name" >
        </div>
		
        <div class="form-group">
        
        <input class="form-control " name="email" type="text" placeholder="Email">
        </div>
	
		 <div class="form-group">
        
        <input class="form-control " name="password" type="password" placeholder="Password">
        </div>
		<div class="form-group">
        
        <input class="form-control " name="address" type="text" placeholder="Address">
        </div>
		
      <div class="form-group">
        
        <input class="form-control " name="phone" type="text" placeholder="Phone">
        </div>
		
	
		<div class="form-group">
        <label>Image</label>
        <input class="form-control " name="image" type="file" placeholder="Phone">
        </div>
		
		
		
	</div>
	
         <div class="modal-footer" style="text-align:center;">
        <button type="submit" class="btn btn-success"> Submit</button>
      </div>
        </div>
        </form:form>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
    </div>
    
	
	
	<script>$(document).ready(function(){
$("#mytable #checkall").click(function () {
        if ($("#mytable #checkall").is(':checked')) {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", true);
            });

        } else {
            $("#mytable input[type=checkbox]").each(function () {
                $(this).prop("checked", false);
            });
        }
    });
    
    $("[data-toggle=tooltip]").tooltip();
});

</script>
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
				<div class="sidebar-menu"style="height:1050px; position:absolute;">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li><a href="admin.html"><i class="fa fa-desktop"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										
									     <li><a href="addepartment.html"><i class="fa fa-sitemap"></i><span>Department</span><div class="clearfix"></div></a></li>
										 
										 
									    <li id="menu-academico" ><a href="addoctor.html"><i class="fa fa-user-md" aria-hidden="true"></i><span>Doctor</span><div class="clearfix"></div></a></li>
									 
									 <li id="menu-academico" ><a href="adpatient.html"><i class="fa fa-user " aria-hidden="true"></i><span> Patient</span> <div class="clearfix"></div></a></li>
									
									<li class="active" ><a href="adnurse.html"><i class="fa fa-plus-square" aria-hidden="true"></i><span>Nurse</span><div class="clearfix"></div></a></li>
									 
									 <li id="menu-academico" ><a href="adpharmacist.html"><i class="fa fa-medkit" aria-hidden="true"></i><span>Pharmacist</span> <div class="clearfix"></div></a>
										  
										</li>
									 <li><a href="adlaboratoris.html"><i class="fa fa-flask" aria-hidden="true"></i>  <span>Laboratorist</span><div class="clearfix"></div></a></li>
									
							       
									<li><a href="adaccount.html"><i class="fa fa-money" aria-hidden="true"></i><span>Accountant</span> <div class="clearfix"></div></a>
									  
									</li>
									
									<li><a href="adreceptionist.html"><i class="fa fa-plus-square"></i>  <span>Receptionist</span><div class="clearfix"></div></a></li>
									<li ><a href=""><i class="fa fa-cog" aria-hidden="true"></i><span>Monitor Hospital</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
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

<script src='<c:url value="/static/js/raphael-min.js"/>'></script>
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>	
<!--COPY rights end here-->
</body>
</html>