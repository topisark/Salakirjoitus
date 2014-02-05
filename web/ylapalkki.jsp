<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Salaisista salaisin salakirjoitus</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap-theme.min.css">        
        <style>
            body {
                padding-top: 60px;
            }</style>
    </head>
    <body>        
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">Enigma</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <% if (session.getAttribute("salaisuus") != null && session.getAttribute("salaisuus").equals("42")) {  %>
                        <li><a href="koodaa.jsp">Kirjoita viesti</a></li>
                        <li><a href="pura.jsp">Tulkitse viesti</a></li>    
                            <% }%>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>