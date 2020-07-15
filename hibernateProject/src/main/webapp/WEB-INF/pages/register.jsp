<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <title>Email </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>

<body>

<header style="height: 30px;background-color:#dae0e5" >

</header>
<br>

<div class="container" style="width:50%">
<a href="showMovies">
<img src="img/books.jpeg" style="height:204px">
</a>
<div class="form-group"  >
	
		<h1>${ message}</h1>
	<form action="users" method="post"  enctype="multipart/form-data">
	
	<!-- private String name;
	private String address;
	private String role;
	private String Salary;
	private Timestamp DOB;
	private byte[] photo; -->
	
      <label for="name" >Enter your name</label>
    <input type="name" class="form-control"  name="name">
    
      <label for="address" >Enter your address</label>
    <input type="address" class="form-control"  name="address">
    
     <label for="role" >Enter a role </label>
    <input type="role" class="form-control"  name="role">
  
      <label for="salary" >Enter your salary</label>
    <select class="form-control"  name="salary">
    <option> 2000</option>
    <option> 3000</option>
    
    </select>
    <br>
    
     <label for="DOB" >Enter your date of birth</label>
    <input type="DOB" class="form-control"  name="dob">
    <label for="photo" >Upload a photo</label>
    <input type="file" class="form-control"  name="photo">
    
  	 
    <br>
    
    <button type="submit" class=" btn btn-success" > Register</button>
  
      
    <a href="register">
    <button type="button" class=" btn btn-secondary" > Show Movies</button>
	</a> 
	<a href="logout">
    <button type="button" class=" btn btn-danger" > logout</button>
    </a>
	
 </form>
  </div>
</div>
</body>
</html>