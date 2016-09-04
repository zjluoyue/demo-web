<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sign up: Simple Web</title>

    <!-- Bootstrap -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- css -->
    <link rel="stylesheet" href="/static/css/commons.css">
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
	    	<a class="navbar-brand" href="#">Project name</a>
	    	<button type="button" class="navbar-toggle" data-toggle="collapse" 
				data-target="#navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	    </div>

        <div class="collapse navbar-collapse">
            <ul class="nav nav-pills">
                <li class="nav-item active">
                    <a class="nav-link" href="#">主页</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">关于</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">资讯</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="col-md-4 col-md-offset-4">
        <form class="form-signin" action="register" method="post">
        	<div class="text-xs-center">
                <h2 class="form-signin-heading">Sign up </h2>
                <hr>
        	</div>
            <fieldset class="form-group">
                <label for="username" class="sr-only">UserName</label>
                <input type="text" id="username" name="userName" class="form-control"
                       placeholder="your username"
                       required autofocus>
            </fieldset>
            <fieldset class="form-group">
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" name="passWord" id="inputPassword" class="form-control"
                       placeholder="create password" required>
            </fieldset>

            <fieldset class="form-group" style="line-height:1;">
                <p><button type="submit" class="btn btn-primary btn-block">Sign up for Assertible</button></p>
                <small class="text-muted">
                    <span>By clicking "Sign up for Assertible", you agree to our </span>
                    <a href="/#">Terms of Service</a>
                    <span> and </span>
                    <a href="/#">Privacy Policy</a>
                    <span>. We'll occasionally send you account related emails.</span>
                </small>
            </fieldset>
        </form>

        <div class="card card-block" style="margin-bottom:200px;">
            <div class="crad-text">
                <span>Have an account?</span>
                <span> </span>
                <a href="login">Sign in here.</a>
            </div>
        </div>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <p class="text-muted">Place sticky footer content here.</p>
    </div>
</footer>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/static/js/bootstrap.min.js"></script>

<script type="text/javascript">
    var $navli = $(".nav-item");
    $navli.each(function () {
        $(this).click(function () {
            $navli.removeClass("active");
            $(this).addClass("active");
        })
    })
</script>

</body>
</html>