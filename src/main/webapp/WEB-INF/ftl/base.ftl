<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title><@title/></title>

  <!-- Bootstrap -->
  <link href="/static/css/bootstrap.min.css" rel="stylesheet">
  <!-- css -->
  <link rel="stylesheet" href="/static/css/commons.css">
  <link rel="stylesheet" href=<@href/>>
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

  <#if content?exists>
    <@content/>
  </#if>
  <#if images?exists>
    <@images/>
  </#if>
  <#if comment?exists>
    <@comment/>
  </#if>
</div>
<footer class="footer">
    <div class="container">
        <p class="text-muted">&copy;2016 xxx.com. All rights reserved.</p>
    </div>
</footer>
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="/static/js/bootstrap.min.js"></script>

</body>
</html>