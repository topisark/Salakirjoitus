<%@include file="ylapalkki.jsp" %>
<div class="container">
    <h1>Pieni salakirjoitustulkki</h1>     

    <p>Olikohan salakirjoituksessa virhe, vai ymmärsinkö väärin? Käsittääkseni esim. A = 2 ja Q = 22, jolloin on vaikea tulkita onko syötteellä 22 tarkoitettu AA vai Q.</p>

    <p>Ohjelma ei nyt siis toimi ihan täydellisesti, mutta toivottavasti se ei haittaa menoa!</p>
    <br>

    <% if (session.getAttribute("salaisuus") == null || !session.getAttribute("salaisuus").equals("42")) { %>
    <p>Mikä on vastaus suureen kysymykseen elämästä, maailmankaikkeudesta ja muusta sellaisesta?</p>

    <div>
        <form role="form" class="form-inline" action="salaisuus" method="POST">     
            <div class="form-group">
                <input type="password" name="salaisuus" class="form-control" placeholder="Salaisuus">
            </div>
            <button type="submit" class="btn btn-default">Jee!</button>
        </form>
    </div>
    <% } else { %>       
    <ul>
        <li><a href="koodaa.jsp">Kirjoita viesti</a></li>
        <li><a href="pura.jsp">Tulkitse viesti</a></li>   
    </ul>
    <% }%>  

</div>
</body>
</html>
