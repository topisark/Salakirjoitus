<%@include file="ylapalkki.jsp" %>
<div class="container">
    <h1>Koodatun tekstin purku</h1>     

    <form role="form" action="pura" method="POST">
        <div class="form-group">
            <textarea name="teksti" class="form-control" rows="4" style="width:800px;" placeholder="Kirjota tähän purettava teksti"></textarea>  
        </div>
        <button type="submit" class="btn btn-default">Pura!</button>
    </form>
    <br>
    <div>
        <% if (request.getAttribute("teksti") != null) {%>
        <textarea class="form-control" rows="4" style="width:600px;"><%= request.getAttribute("teksti")%></textarea>
        <% }%>     
    </div>
</div>
</body>
</html>