<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/bootstrap.min.css" />' />
<!-- Custom CSS -->
<link rel='stylesheet' type='text/css' href='<c:url value="/static/css/style.css"  />'/>
<link rel="stylesheet" href="css/morris.css" />
<!-- Graph CSS -->
<link href="css/morris.css" type="text/css" href='<c:url value="/static/css/font-awesome.css"/>' > 
<!-- jQuery -->
<script src='<c:url value="/static/js/jquery-2.1.4.min.js"/>'></script>
<!-- //jQuery -->

<link rel="stylesheet" href='<c:url value="/static/css/icon-font.min.css"  />'/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- //lined-icons -->
<style>
body{
background:rgba(177, 219, 92, 0.51);}
</style>
</head> 
<body>


<div class="container-fulid back">
<div class="col-md-offset-4 col-md-4"style="text-align:center;">
<img class="heading" src='<c:url value="/static/images/logo1.png" />'>
<h3 class="heading">Hospital Management System</h3>

</div>

</div>
<div class="container col-md-offset-4 col-md-4">
<div class="login">
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Log in</h2>

  <form:form action="login" id="loginform" class="form-vertical"
			modelAttribute="userBean" method="post">
    <p><input name="email" type="email" placeholder="Doctor@example.com"></p>
    <p><input name="password" type="password" placeholder="****"></p>
    <a ><p><input type="submit" value="Log in"></p></a>
  </form:form>
</div></div>
<div class="clearfix"></div>
<div class="col-md-offset-4 col-md-4">
<table class="table table-bordered">
    <thead>
      <tr>
        <th>Account</th>
        <th>Email</th>
        <th>Password</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Admin</td>
        <td>admin@example.com</td>
        <td>1234</td>
      </tr>
      <tr>
        <td>Accountant</td>
        <td>accountant@example.com</td>
        <td>1234</td>
      </tr>
      <tr>
        <td>Doctor</td>
        <td>Doctor@example.com</td>
        <td>1234</td>
      </tr>
	   <tr>
        <td>Laboratorist</td>
        <td>Laboratorist@example.com</td>
		<td>1234</td>
      </tr> 
	  <tr>
        <td>Nurse</td>
        <td>Nurse@example.com</td>
		<td>1234</td>
      </tr> 
	  <tr>
        <td>Patient</td>
		<td>Patient@example.com</td>
        <td>1234</td>
         </tr>
		  <tr>
        <td>Pharmacist</td>
		<td>Pharmacist@example.com</td>
        <td>1234</td>
         </tr>
		  <tr>
        <td>Receptionist</td>
		<td>Receptionist@example.com</td>
        <td>1234</td>
         </tr>
    </tbody>
  </table>


</div>


<div class="clear"></div>
<div class="clear"></div>
<div class="clearfix"></div>


<div class="copyrights">
	 <p>© 2017 HMS. All Rights Reserved | Design by  <a href="http://prodesigntek.com/" target="_blank">Prodesigntek</a> </p>
</div>
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