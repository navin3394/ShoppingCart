<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
</head>

<body>

<div class="container">
<div class="panel panel-default">
  <div class="panel-heading">
<h2 class="heading2"><i class="fa fa-shopping-bag" aria-hidden="true"></i>&nbsp;Login</h2> </div> 
  <div class="panel-body">
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
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
	<button type="submit" class="btn btn-success pull-right" title="continue"><i class="fa fa-shopping-bag" aria-hidden="true"></i>Continue</button>
  </form>
</div></div>

</body>
</html>
