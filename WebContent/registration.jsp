<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/foundation.css" media="screen" />
<title>Registration Test</title>
</head>
<body>
	<div class="header-wrapper large-12 columns">
		<header class="large-6 large-centered columns">

		<h2>Daily Account Registration</h2>

		</header>
	</div>
	<div class="content-wrapper large-12 columns">
		<div id="content" class="large-6 large-centered columns" >
			<fieldset>
				<legend>Registration</legend>

				<form id="registration" action="userOperations" method="post">
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Nick Name</label>
								</div>
								<div class="small-9 columns">
									<input type="text" name="_nickname" id="right-label"
										placeholder="Nick Name">
								</div>
							</div>
						</div>
					
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Full Name</label>
								</div>
								<div class="small-9 columns">
									<input type="text" name="_fullname" id="right-label"
										placeholder="Full Name">
								</div>
							</div>
						</div>
					
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Address</label>
								</div>
								<div class="small-9 columns">
									<textarea id="right-label" name="_address"
										placeholder="Address"></textarea>
								</div>
							</div>
						</div>
					
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Date Of
										Birth</label>
								</div>
								<div class="small-9 columns">
									<input type="text" name=_birthdate id="right-label"
										placeholder="Date Of Birth">
								</div>
							</div>
						</div>
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Contact Number</label>
								</div>
								<div class="small-9 columns">
									<input type="text" id="right-label" name="_cnumber"
										placeholder="Contact Number">
								</div>
							</div>
						</div>
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Permanent Number</label>
								</div>
								<div class="small-9 columns">
									<input type="text" id="right-label" name="_pnumber"
										placeholder="Permanent Number">
								</div>
							</div>
						</div>
					
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									<label for="right-label" class="right inline">Gender</label>
								</div>
								<div class="small-9 columns">
									<input type="text" id="right-label" name="_gender"
										placeholder="Gender">
								</div>
							</div>
						</div>
						
						
						<div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									
								</div>
								<div class="small-9 columns">
									<input type="submit" class="medium button success round"
								id="right-label" name="_register" value="Register">
								</div>
							</div>
						</div>
						
						
					
						
					
			</fieldset>
			</form>
		</div>
	</div>
	<div class="footer-wrapper large-12 columns">
		<footer id="footer-content" class="large-11 large-centered columns">
		 
		 <h5 class="left">&copy;Developed by GIFTED,TON and Wolverine</h5>
		 <ul class="inline-list right">
		 <li><a href="#"  title="Facebook"><img src="img/webicon-facebook.png" /></a></li>
		 <li><a href="#"  title="Twitter"><img src="img/webicon-twitter.png" /></a></li>
		 
		 </ul> 
		 </footer>
	</div>




</body>
</html>