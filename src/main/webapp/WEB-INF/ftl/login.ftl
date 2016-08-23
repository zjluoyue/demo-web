<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign in: Simple Web</title>

    <!-- Bootstrap -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- css -->
    <link rel="stylesheet" href="/static/css/commons.css">

</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Simple Web</a>
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
            <form id="login" class="form-signin" action="login" method="post">
                <div class="text-xs-center">
                    <h2 class="form-signin-heading">Sign in </h2>
                    <hr>
                </div>
                <fieldset class="form-group">
                    <label for="username" class="sr-only">UserName</label>
                    <input type="text" id="username" name="userName" class="form-control" placeholder="username"
                           required autofocus>
                </fieldset>
                <fieldset class="form-group">
                    <label for="inputPassword" class="sr-only">Password</label>
                    <input type="password" id="inputPassword" name="passWord" class="form-control"
                           placeholder="password" required>
                </fieldset>
                <div class="checkbox">
                  <label>
                    <input type="checkbox" value="remember-me"> Remember me
                  </label>
                </div>
                <fieldset class="form-group" style="line-height:1;">
                    <button id="submit" class="btn btn-lg btn-primary btn-block"
                            type="submit">Sign in
                    </button>
                </fieldset>
            </form>

            <div class="card card-block" style="margin-bottom:200px;">
                <div class="crad-text">
                    <span>Need an account?</span>
                    <span> </span>
                    <a href="register">Create one here.</a>
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
//        $("#submit").click(function () {
//            $.ajax({
//                url: "http://localhost:9999/home",
//                type: "POST",
//                data: null,
//                async: false,
//                error: function(request) {
//                    alert("Connection error");
//                },
//                success: function(data) {
//                }
//            })
//        })
    </script>
</body>
</html>