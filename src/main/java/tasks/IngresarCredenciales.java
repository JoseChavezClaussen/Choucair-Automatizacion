package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IngresarLoginPage.*;
import static userinterfaces.LoginPage.LINK_SING_IN;

public class IngresarCredenciales implements Task {
    private String correo;
    private String contraseña;


    public IngresarCredenciales(String correo,String contraseña){
        this.correo=correo;
        this.contraseña=contraseña;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_SING_IN), //INGRESAR AL SIGN IN
                Enter.theValue(correo).into(INPUT_USUARIO_CREADO),
                Enter.theValue(contraseña).into(INPUT_PASSWORD_CREADO),
                Click.on(BUTTON_SING_IN),
                Click.on(LINK_LOGO_INICIO)

        );
    }

    public static IngresarCredenciales usuarioPassword(String correo, String contraseña) {
        //Esta librería te permite ahorrar que instancies ese objeto.
        return instrumented(IngresarCredenciales.class,correo,contraseña);
    }

}
