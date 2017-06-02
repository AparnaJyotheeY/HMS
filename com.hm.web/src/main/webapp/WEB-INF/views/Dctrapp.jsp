<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.hm.web.model.ReceptionistBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Doctor-Appointment List</title>
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
<link rel="stylesheet" href='<c:url value="/static/css/morris.css"/>' />
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
<style>
.modal-footer {
    
     border-top: none; 
}
</style>
<!-- //lined-icons -->
</head> 
<%String message=(String) request.getAttribute("message");
if(message==null){
	message="";
}
String smessage=(String) request.getAttribute("successmessage");
if(smessage==null){
	smessage="";
}
List<ReceptionistBean> dlist=(List) request.getAttribute("fuelexpen");

%>
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
                <li class="breadcrumb-item"><a href="index.html">Home</a> <i class="fa fa-angle-right"></i></li>
				<li class="breadcrumb-item"><a href="doctor.html">Doctor Dashboard</a> <i class="fa fa-angle-right"></i></li>
				   
				   
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

<div class="col-md-6"><h3> <i class="fa fa-arrow-circle-right" aria-hidden="true"></i>&nbsp;&nbsp;Appointment</h3></div>
<div class="col-md-offset-9 col-md-3"><button type="button" class="btn btn-success" data-toggle="modal" data-target="#add">Add Appointment</button></div>

<div class="btn-toolbar">
    <button class="btn btn-primary">Copy</button>
    <button class="btn">CSV</button>
    <button class="btn">Excel</button>
    <button class="btn">PDF</button>
    <button class="btn">Print</button>
</div>
<div class="well  table-responsive">
     <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   
                   <th>#</th>
                   <th>Date & time</th>
                    <th>Patient Name</th>
                     <th>Doctor Name</th>
                     <th>Options</th>
					 
               </thead>
    <tbody>
    
    <tr>
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
        <h4 class="modal-title custom_align" id="Heading">Edit Appointment</h4>
      </div>
		  
          <div class="modal-body">
		  <div class="col-md-offset-1 col-md-10">
          <div class="form-group">
        <input class="form-control " type="text" placeholder="Date" id="datepicker">
        </div>
		<script>
  $( function() {
    $( "#datepicker" ).datepicker();
	$("#datepicker").datepicker({ minDate: 0 });
  } );
  </script>
		 <div class="form-group">
        <input class="form-control " type="text" placeholder="Time" id="timepicker">
        </div>
		<script type="text/javascript">
            $('#timepicker').timepicker();</script>
        <div class="form-group">
        
        <input class="form-control " type="text" placeholder="Patient Name">
        </div>
		<div class="form-group">
        
        <input class="form-control " type="text" placeholder="Doctor Name">
        </div>
       <div class="form-group">
        
        <input type="checkbox">
		<label>Notify Patient With SMS</label>
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
        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
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
        <h4 class="modal-title custom_align" id="Heading">Add Appointment</h4>
      </div>
          <div class="modal-body">
		   <div class="col-md-offset-1 col-md-10">
          <div class="form-group">
        <input class="form-control " type="text" placeholder="date" id="datepicker1">
        </div>
		<script>
  $( function() {
    $( "#datepicker1" ).datepicker();
	$("#datepicker1").datepicker({ minDate: 0 });
  } );
  </script>
		 <div class="form-group">
        <input class="form-control " type="text" placeholder="Time" id="timepicker1">
        </div>
		<script type="text/javascript">
            $('#timepicker1').timepicker();</script>
        <div class="form-group">
        
        <select class="form-control ">
		<option>Select Patient Name</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		
		</select>
        </div>
		
       <div class="form-group">
        
        <input type="checkbox">
		<label>Notify Patient With SMS</label>
        </div>
      </div>
          <div class="modal-footer" style="text-align:center;">
        <button type="button" class="btn btn-success"> Submit</button>
      </div>
        </div>
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
			<div class="sidebar-menu">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li><a href="doctor.html"><i class="fa fa-home"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										
										
										 <li class="active" ><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i><span> Appointment</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li class="active"id="menu-academico-avaliacoes" ><a href="appointmentlist.html">Appointment List</a></li>
											<li id="menu-academico-avaliacoes" ><a href="Requestedappointment.html">Requested Appointments</a></li>
											
										  </ul>
										</li>
									<li><a href="prescription.html"><i class="fa fa-stethoscope"></i><span>Prescription</span><div class="clearfix"></div></a></li>
									<li id="menu-academico" ><a href="patient.html"><i class="fa fa-wheelchair"></i><span>Patient</span><div class="clearfix"></div></a></li>
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
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>

<script src="js/raphael-min.js"></script>
	<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>	
<!--COPY rights end here-->
</body>
</html>