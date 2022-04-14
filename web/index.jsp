<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/bec3cdf477.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>2</title>
    </head>
    <body>
    <h1 style="text-align: center;">Formulario de Registro</h1>
            <br>
        <div style="text-align: center; display: flex;
  justify-content: center;
  align-items: center;">
        <form action="ServletRecibe" method="POST" style="width: 500px;">
            <div class="form-group">
                <input type="text" class="form-control" id="cedula" name="cedula" placeholder="Cédula">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" id="telefono" name="telefono" placeholder="Teléfono">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Dirección">
            </div>
            <button type="submit" class="btn btn-primary">Enviar Datos</button>
        </form>
            </div>
        
    </body>
</html>
