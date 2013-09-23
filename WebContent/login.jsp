<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/foundation.css" media="screen" />
<title>Login</title>
</head>
<body>
	<div class="content-wrapper large-12 columns">
		<div id="content" class="large-6 large-centered columns">
			<fieldset>
				<form action="userOperations" method="post">

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
									<label for="right-label" class="right inline">Password</label>
								</div>
								<div class="small-9 columns">
									<input type="password" name="_password" id="right-label"
										placeholder="Full Name">
								</div>
							</div>
						</div>

                        <div class="large-11 large-centered columns">
							<div class="row">
								<div class="small-3 columns">
									
								</div>
								<div class="small-9 columns">
									<input type="submit" class="small button success round"
								id="right-label" name="_action" value="login">
								</div>
							</div>
						</div>
                        

					


				</form>
			</fieldset>
		</div>
	</div>
</body>
</html>