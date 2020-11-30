    # language: es

 Característica: Realizar compras de articulos
   Como un nuevo cliente
   Quiero ingresar a la pagina http://automationpractice.com/index.php
   Para realizar una compra de un articulo

  @Escenario1
  Escenario: Agregar articulo al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega 3 unidades dresses al carro
    Entonces el ve los productos listado en el carro de compras

  @Escenario2
  Escenario: Realizar el flujo completo de compra
    Dado que un cliente accede hasta la web de compras con un jecc1jecc@gmail.com y jose123
    Cuando el agrega 3 unidades dresses al carro estando logueado
    Entonces el terminara realizando una compra con el metodo tarjeta

   @Escenario3
   Escenario: Registrarse en la página
      Dado que un cliente accede hasta la web de compras
      Cuando el quiera registrarse con un jec120jecc@gmail.com y una jose123
      Entonces el va a estar logueado

   @Escenario4
   Escenario: Ingresar con una cuenta
     Dado que un cliente accede hasta la web de compras
     Cuando el ingrese con un jecc1jecc@gmail.com y una jose123
     Entonces el va a poder realizar una compra
