
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.hm.web.model.DoctorBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Receptionist - Appointmentlist</title>
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

/* Style The Dropdown Button */
.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

/* The container <div> - needed to position the dropdown content */
.dropdown {
    position: relative;
    display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #f1f1f1}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}

/* Change the background color of the dropdown button when the dropdown content is shown */
.dropdown:hover .dropbtn {
    background-color: #3e8e41;
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
List<DoctorBean> dlist=(List) request.getAttribute("appointmentlist");
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
											<li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
										</ul>
									</li>
								</ul>
							</div>
						  <div class="clearfix"> </div>
						  
				</div><!--heder end here-->
		<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="<%=request.getContextPath( )%>/">Home</a> <i class="fa fa-angle-right"></i></li>
				<li class="breadcrumb-item"><a href="<%=request.getContextPath( )%>/receptionist">Dashboard</a> <i class="fa fa-angle-right"></i></li>
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
<div class="row">
<div class="col-md-6"><h3> <i class="fa fa-arrow-circle-right" aria-hidden="true"></i>&nbsp;&nbsp; Appointment List</h3></div>
</div>
<div class="col-md-offset-9 col-md-3"><button type="button" class="btn btn-success" data-toggle="modal" data-target="#add">Add Appointment</button></div>
<div class="clear"></div>
   <table  class="table table-responsive">
                   
                   <thead>
                   
                   <th>Select Doctor</th>
                   <th>Start Date</th>
                    <th>End Date</th>
                     <th></th>
                    
					
               </thead>
    <tbody>
    
    <tr>
    
    <td>	<div class="form-group">
        
       <select class="form-control ">
		<option>Select a Doctor</option>
		<option>dsmcds</option>
		<option>Fdmfcdsklm</option>
		
		</select> </div>
	</td>
    <td>      <div class="form-group">
        <input class="form-control " name="adate" type="text" placeholder="Date" id="datepicker">
        </div>
	</td>
    <td>      <div class="form-group">
        <input class="form-control " type="text" placeholder="Date" id="datepicker">
        </div>
	</td>
<td> <button type="button" class="btn btn-success">Filter</button>
     </td>
    
    
    
   
    </tr>
  
    </tbody>
        
</table>




<div class="btn-toolbar">
    <button class="btn btn-primary">Copy</button>
    <button onclick="location.href='./exportdrappointexcel'" class="btn btn-warning">Excel</button>
    <button onclick="location.href='./exportrappointpdf'" class="btn btn-danger">PDF</button>
</div>
<div class="well table-responsive">
     <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   
                   <th>#</th>
                   <th>Date</th>
                    <th>Doctor</th>
                     <th>Patient</th>
                    
					
               </thead>
    <tbody>
    
    <tr>
    
    <td></td>
    <td></td>
    <td></td>
<td></td>
    
    
    
   
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
        <h4 class="modal-title custom_align" id="Heading">Approve Appointment</h4>
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
        
       <select class="form-control ">
		<option>Select a Doctor</option>
		<option>dsmcds</option>
		<option>Fdmfcdsklm</option>
		
		</select> </div>
		 <div class="form-group">
        
        <input type="checkbox">
		<label>Notify Patient With SMS</label>
        </div>
	   </div>
             <div class="modal-footer" style="text-align:center;">
        <button type="button" class="btn btn-success">Approve</button>
      </div>
        </div>
 <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
    </div>
 <div class="modal fade" id="add" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Add Prescription</h4>
      </div>
          <div class="modal-body">
           <form:form action="rprescriptiondetails" method="post" class="form-horizontal" modelAttribute="userRegDetails" >
		   <div class="col-md-offset-1 col-md-10">
          <div class="form-group">
        <input class="form-control " name="apdate" type="text" placeholder="Date" id="datepicker2">
        </div>
		<script>
  $( function() {
    $( "#datepicker2" ).datepicker();
	$("#datepicker2").datepicker({ minDate: 0 });
  } );
  </script>
 
		 <div class="form-group">
        <input class="form-control " name="aptime" type="text" placeholder="Time" id="timepicker1">
        </div>
		<script type="text/javascript">
            $('#timepicker1').timepicker();</script>
        <div class="form-group">
        
        <select class="form-control " name="apname">
		<option>Select Patient Name</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		<option>dfclkdsjfdls</option>
		
		</select>
        </div>
		<div class="form-group">
		<label>Case History</label>
		 <textarea class="tinymce" name="achistory"></textarea>
		
		</div>
		
		
		<div class="form-group">
		<label>Medication</label>
		 <textarea class="tinymce" name="amdedication"></textarea>
		
		</div>
		
		<div class="form-group">
		<label>Note</label>
		 <textarea class="tinymce" name="anote"></textarea>
		
		</div>
		
		
      
      </div>
          <div class="modal-footer" style="text-align:center;">
        <button type="submit" class="btn btn-success"> Submit</button>
      </div>
      </form:form>
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
										<li ><a href="receptionistdashboard.html"><i class="fa fa-home"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										<li ><a href="receptionistpatient.html"><i class="fa fa-user"></i> <span>Patient</span><div class="clearfix"></div></a></li>
									 
									 <li class="active"><a href="#"><i class="fa fa-edit" aria-hidden="true"></i><span> Appointment</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li class="active"><a href="receptionistappointmentlist.html">Appointment List</a></li>
											<li  ><a href="receptionistrequestedapp.html">Requested Appointment</a></li>
											
										  </ul>
										</li>
									 
									 
									  <li><a href="receptionistoperationtheaters.html"><i class="fa fa-hospital-o"></i><span>Operation Theatre List</span><div class="clearfix"></div></a></li> 
									
									  <li><a href="receambulanceavailability.html"><i class="fa fa-ambulance" aria-hidden="true"></i> <span>Ambulance availability</span><div class="clearfix"></div></a></li>
									 
									 <li><a href="receambulancefuel.html"><i class="fa fa-money" aria-hidden="true"></i><span>Ambulance Fuel <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Expenses</span><div class="clearfix"></div></a></li> 
									
									 
									 
									 <li><a href="receptionistpayroll.html"><i class="fa fa-money"></i><span>Payroll</span><div class="clearfix"></div></a></li> 
															 
									 
									<li ><a href="receptionistprofile.html"><i class="fa fa-lock"></i><span>Profile</span>
									
									<div class="clearfix"></div></a></li>
									
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