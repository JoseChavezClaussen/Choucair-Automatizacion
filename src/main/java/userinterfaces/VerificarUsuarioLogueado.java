package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VerificarUsuarioLogueado {
    public static final Target LINK_LOGIN_INGRESADO = Target.the("Link para validar que se ingreso correctamente").locatedBy("//a[@title = 'View my customer account']");

}
