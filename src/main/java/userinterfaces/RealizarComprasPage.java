package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class RealizarComprasPage extends PageObject {
    public static final Target LINK_SING_IN = Target.the("Ingresar a SING_IN").locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public static final Target INPUT_USUARIO_CREADO = Target.the("Input para ingresar el usuario").locatedBy("//*[@id=\"email\"]");
    public static final Target INPUT_PASSWORD_CREADO = Target.the("Input para la contraseña").located(By.id("passwd"));
    public static final Target BUTTON_SING_IN = Target.the("Boton para registrarse").locatedBy("//*[@id=\"SubmitLogin\"]/span");
    public static final Target LINK_LOGO_INICIO = Target.the("Link para regresar al home").locatedBy("//*[@id=\"header_logo\"]/a/img");
    public static final Target COMPRA_PASO_1 = Target.the("Paso 1 flujo de compra").locatedBy("//span[text()='Proceed to checkout']");
    public static final Target RADIO_CHECK = Target.the("RADIO BUTTON flujo de compra").located(By.id("cgv"));
    public static final Target COMPRA_PASO_4 = Target.the("PASO 4 flujo de compra").locatedBy("//*[@id=\"form\"]/p/button/span");
    public static final Target COMPRA_PASO_5 = Target.the("Paso 5 flujo de compra").located(By.className("bankwire"));
    public static final Target COMPRA_PASO_CONFIRMAR = Target.the("Paso Confirmar flujo de compra").locatedBy("//span[text()='I confirm my order']");

}
