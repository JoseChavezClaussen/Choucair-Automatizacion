package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task{
    private String descripcion;


    public BuscarProducto(String descripcion) {

        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(INPUT_BUSCAR_ARTICULO), //Escribir el producto - Campo de búsqueda
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO),//Apretar Enter
                Click.on(SELECT_ARTICULO)//Seleccionar producto a agregar

        );
    }
    public static BuscarProducto conDescripcion(String descripcion) {
        //Esta librería te permite ahorrar que instancies ese objeto.
        return instrumented(BuscarProducto.class,descripcion);
    }
}