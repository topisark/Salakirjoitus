<%@include file="ylapalkki.jsp" %>
<div class="container">
    <h1>Selv�n tekstin koodaus</h1>     

    <form role="form" action="koodaa" method="POST">
        <div class="form-group">
            <textarea name="teksti" class="form-control" rows="4" style="width:800px;" placeholder="Kirjota t�h�n koodattava teksti"></textarea>  
        </div>
        <button type="submit" class="btn btn-default">Koodaa!</button>
    </form>
    <br>
    <div>
        <% if (request.getAttribute("koodi") != null) {%>
        <textarea class="form-control" rows="4" style="width:600px;"><%= request.getAttribute("koodi")%></textarea>
        <% }%>     
    </div>
</div>
</body>
</html>