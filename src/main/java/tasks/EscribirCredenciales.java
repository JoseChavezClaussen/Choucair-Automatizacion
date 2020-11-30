package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterfaces.HomePage.INPUT_BUSCAR_ARTICULO;
import static userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EscribirCredenciales implements Task {
    private String correo;
    private String contraseña;

    public EscribirCredenciales (String correo, String contraseña){
        this.correo = correo;
        this.contraseña = contraseña;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_SING_IN), //INGRESAR AL SIGN IN
                Enter.theValue(correo).into(INPUT_USUARIO), //INGRESA EL USUARIO EN EL INPUT
                Click.on(CREATE_AND_ACCOUNT), //APRETA ENTER
                Click.on(RB_SEXO_CLIENTE), //SELECCIONAR UN SEXO
                Enter.theValue("José Enrique").into(INPUT_FIRST_NAME), //INGRESAR NOMBRE
                Enter.theValue("Chávez Claussen").into(INPUT_LAST_NAME), //INGRESAR APELLIDO
                Enter.theValue(contraseña).into(INPUT_PASSWORD), //INGRESAR CONTRASEÑA
                Click.on(DDL_DAYS), //Desplegar día
                Click.on(DDL_DAYS_CAMBIAR), //Cambiar la fecha
                Click.on(DDL_MONTHS), //Desplegar mes
                Click.on(DDL_MONTHS_CAMBIAR), //Cambiar mes
                Click.on(DDL_YEARS), //Desplegar año
                Click.on(DDL_YEARS_CAMBIAR), //Cambiar año
                Enter.theValue("Choucair").into(INPUT_COMPANY),
                Enter.theValue("Stret Bolivar 42").into(INPUT_ADDRESS_1),
                Enter.theValue("Unidad 4").into(INPUT_ADDRESS_2),
                Enter.theValue("Kentucky").into(INPUT_CITY),
                Click.on(DDL_STATE),
                Click.on(DDL_STATE_CAMBIAR),
                Enter.theValue("00020").into(INPUT_POSTAL_CODE),
                Enter.theValue("42001098").into(INPUT_PHONE),
                Enter.theValue("984224002").into(INPUT_PHONE_MOBILE),
                Click.on(BUTTON_REGISTER)

        );
    }

    public static EscribirCredenciales usuarioPassword(String correo,String contraseña) {
        //Esta librería te permite ahorrar que instancies ese objeto.
        return instrumented(EscribirCredenciales.class,correo,contraseña);
    }
}
