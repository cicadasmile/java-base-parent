<html>
<head>
    <title>index.html</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
</head>
<body>
<hr/>
<h2>CREATE Cookie</h2>
<form method="GET" action="/cookieServletOne">
    userName:<input type="text" name="userName"/>
    <input type="submit" value="SUBMIT"/>
</form>
<hr/>
<h2>GET Cookie</h2>
<form method="POST" action="/cookieServletOne">
    userName:<input type="text" name="userName"/>
    <input type="submit" value="SUBMIT"/>
</form>
<hr/>
<h2>UPDATE Cookie</h2>
<form method="GET" action="/cookieServletTwo">
    userName:<input type="text" name="userName"/>
    <input type="submit" value="SUBMIT"/>
</form>
<hr/>
<h2>DELETE Cookie</h2>
<form method="POST" action="/cookieServletTwo">
    userName:<input type="text" name="userName"/>
    <input type="submit" value="SUBMIT"/>
</form>
</body>
</html>
