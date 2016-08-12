<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
</head>
<body>
<div class="container">
<h3> <i class="fa fa-expeditedssl" aria-hidden="true"></i> Create Account</h3>
<form class="form-horizontal" role="form">
    <div class="form-group">
	<div class="col-xs-4">
      <label for="name">Username:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter username">
	  </div>
    </div>
    <div class="form-group">
	<div class="col-xs-4">
      <label for="mobile">Mobile.no:</label>
      <input type="tel" class="form-control" id="mobile" placeholder="Enter mobile no" >
    </div></div>
	<form class="form-horizontal" role="form">
    <div class="form-group">
	<div class="col-xs-4">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
	  </div>
    </div>
    <div class="form-group">
	<div class="col-xs-4">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div></div>
	<div class="a-section a-spacing-top-large a-text-left ap_mobile_number_fields">
        <div class="a-row">
          We will send you a text to verify your phone.
        </div>
       </div></br>
	<button type="button" class="btn btn-success">Continue</button>
	 <div class="a-divider a-divider-section"><div class="a-divider-inner"></div></div>

      
      <div class="a-row">
        Already have an account?
        <a class="a-link-emphasis" href="Login.jsp">
          Sign in <i class="fa fa-hand-o-right" aria-hidden="true"></i>
        </a>
      </div>

    </div></div>
	
  </form>
</div>
</body>
</html>