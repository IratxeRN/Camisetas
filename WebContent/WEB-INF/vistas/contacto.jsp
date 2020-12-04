<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp" %>


<div class="row pt-5">
 <div class="col-lg-4 offset-1">
    <h2 class=""> Contacto</h2>
     <p class="pr-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quae consequatur dolorum, in nemo natus repellat tenetur iste quia recusandae ipsum ab reiciendis libero laborum minus deleniti error consequuntur facilis sint!</p>
     <p class="pr-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quae consequatur dolorum, in nemo natus repellat tenetur iste quia recusandae ipsum ab reiciendis libero laborum minus deleniti error consequuntur facilis sint!</p>
 </div>
 
 <form class=" p-3 ml-4 col-10 col-lg-6 needs-validation" novalidate action="contacto" method="post">
    
    <div class="form-group row">
        <label for="inputName" class="col-sm-10">Nombre de Contacto</label>
        <div class="col-sm-10">
        <input type="text" class="form-control" id="inputName" required pattern="[A-Z][a-z]*" placeholder="Nombre con primera letra en mayusculas">
        <div class="invalid-feedback">El nombre debe comenzar con  mayusculas y solo letras</div>
      </div>
    </div >
      <div class="form-group row">
        <label for="inputEmail4" class="col-sm-10">Email</label>
        <div class="col-sm-10">
        <input type="email" class="form-control" id="inputEmail4" required placeholder="example@example.com" pattern="\w+@\w+\.\w+">
        <div class="invalid-feedback">Debe introducir una email valido</div>
      </div>
    </div>

    <div class="form-group row">
        <label for="conocido" class="col-sm-10">Como me has conocido?</label>
        <div class="col-sm-10">
            <select id="conocido" name="conocido" class="form-control">
                <option value="navegando">Navegando</option>
                <option value="amigo">Por un/a amigo/a</option>
              </select>
      </div>
    </div>

      <div class="form-group row">  
      <label for="mensaje"class="col-sm-10">Comentario</label>
      <div class="col-sm-10">
      <textarea class="form-control" id="menaje" required placeholder="Deja tu mensaje"></textarea>
      <div class="invalid-feedback">No has introducido ningun mensaje</div>
    </div>
</div>
    <button type="submit" class="btn btn-primary">Sign in</button>
  </form>
</div>


<%@ include file="/WEB-INF/vistas/includes/pie.jsp" %>
