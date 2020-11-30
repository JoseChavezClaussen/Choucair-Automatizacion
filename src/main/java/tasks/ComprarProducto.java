package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.RealizarComprasPage.*;

public class ComprarProducto implements Task {
    public String metodo;

    public ComprarProducto(String metodo){
        this.metodo=metodo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPRA_PASO_1), //COMPRA PASO 1 (SUMMARY)
                Click.on(COMPRA_PASO_1), //COMPRA PASO 3 (ADDRESS) SE SALTEA EL PASO 2 YA QUE EL CLIENTE ESTA LOGUEADO
                Click.on(RADIO_CHECK), //CLICK AL RADIO BUTTON
                Click.on(COMPRA_PASO_4), //COMPRA PASO 4 (SHIPPING)
                Click.on(COMPRA_PASO_5),
                Click.on(COMPRA_PASO_CONFIRMAR)

        );
    }
    public static ComprarProducto metodo(String metodo) {
        //Esta librería te permite ahorrar que instancies ese objeto.
        return instrumented(ComprarProducto.class,metodo);
    }
}
