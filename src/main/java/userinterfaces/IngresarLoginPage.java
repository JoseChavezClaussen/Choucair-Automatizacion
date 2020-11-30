package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php")
public class IngresarLoginPage extends PageObject {
    public static final Target LINK_SING_IN = Target.the("Ingresar a SING_IN").locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public static final Target INPUT_USUARIO_CREADO = Target.the("Input para ingresar el usuario").locatedBy("//*[@id=\"email\"]");
    public static final Target INPUT_PASSWORD_CREADO = Target.the("Input para la contraseña").located(By.id("passwd"));
    public static final Target BUTTON_SING_IN = Target.the("Boton para registrarse").locatedBy("//*[@id=\"SubmitLogin\"]/span");
    public static final Target LINK_LOGO_INICIO = Target.the("Link para regresar al home").locatedBy("//*[@id=\"header_logo\"]/a/img");
    public static final Target LINK_SING_OUT = Target.the("Cerrar sesion").located(By.className("logout"));
}
