package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetalleProductoPage.*;
import static userinterfaces.HomePage.INPUT_BUSCAR_ARTICULO;

public class AgregarProducto implements Task {
    public String cantidad;


    public AgregarProducto(String cantidad) {
        this.cantidad = cantidad;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CAMBIAR_COLOR),//Seleccionar color
                Click.on(DDL_TAMAÑO_ARTICULO),//Selecciona el DDL
                Click.on(DDL_CAMBIAR_TAMAÑO),//Cambiar Tamaño de Prenda
                Click.on(AUMENTAR_ARTICULOS),//Aumentar la cantidad de productos
                Click.on(BOTON_AÑADIR_CARRITO),//Click Añadir al carrito
                Click.on(BOTON_ENTRAR_CARRITO) //Click en ver al carrito//

        );


    }
    public static AgregarProducto cantidad(String cantidad) {
        //Esta librería te permite ahorrar que instancies ese objeto.
        return instrumented(AgregarProducto.class, cantidad);
    }
}

