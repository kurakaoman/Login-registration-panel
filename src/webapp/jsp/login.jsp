<%@page language="java" contentType="text/html" %>
<html>
<body>
<h1>Sign in to ...</h1>
<div class="row" style="margin-bottom:10px;border-width:1px;border-style:solid;min-height:33.99px; width: 100%; border-spacing: 2px;border-radius: 2px;    border-color: #ced4da; font-size:14px">
    <div class="col-md-4 text-left">
        <strong>If you have an account, please sign in below. </strong>
    </div>
</div>
<div class="row" style="margin-bottom:10px;border-width:1px;border-style:solid;min-height:33.99px; width: 100%; border-spacing: 2px;border-radius: 2px;    border-color: #ced4da; font-size:14px">
    <div class="col-md-4 text-left">
        <strong> To log in your browser must have cookies enabled. </strong>
    </div>
</div>
<div class="row" style="margin-bottom:10px;border-width:1px;border-style:solid;min-height:33.99px; width: 100%; border-spacing: 2px;border-radius: 2px;    border-color: #ced4da; font-size:14px">
    <div class="col-md-4 text-left">
        <strong>If you are new to here? Create an account for free. </strong>
    </div>
</div>
${passwordError}
${loginError}
<form method="POST" action="/login">
    <div class="from-group">
        <div class="row" style="text-align:left; padding: 0 15px 0 15px">Username:</div>

    <input type="text" name="username" id="username" class="form-control" style="margin-bottom:10px"></input>
    </div>
    <div class="from-group">
        <div class="row" style="text-align:left; padding: 0 15px 0 15px">Password:</div>
    <input type="text" name="password" id="password" class="form-control" style="margin-bottom:10px"></input>
    </div>
    <br>
    <div class="col-md-2 col-md-offset-10">
        <div class="from-group">
            <input class="btn btn-primary float-right" type="submit" value="Save"/>
        </div>
    </div>
</form>
</body>
</html>