package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.EscribirCredenciales;
import tasks.IngresarCredenciales;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.CarroComprasPage.LINK_CARRITO_AGREGADO;
import static userinterfaces.IngresarLoginPage.LINK_SING_OUT;
import static userinterfaces.VerificarUsuarioLogueado.LINK_LOGIN_INGRESADO;


public class LoginSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("login");
    private LoginPage homePage = new LoginPage();
    @Dado("^que un cliente accede hasta la web de compras$")
    public void queUnClienteAccedeHastaLaWebDeCompras() {
        //Indicando que se abrirá desde el navegador elegido (Chrome)
        actor.can(BrowseTheWeb.with(navegador));
        //Maximizar la pantalla
        navegador.manage().window().maximize();
        //Redirecciona a la página de la clase PageObject que extendimos.
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @Cuando("^el quiera registrarse con un (.*) y una (.*)$")
    public void elQuieraRegistrarseComoCliente(String correo,String contraseña ) {
        actor.wasAbleTo(
                EscribirCredenciales.usuarioPassword(correo,contraseña)

        );
    }


    @Entonces("^el va a estar logueado$")
    public void elVaAEstarLogueado() {
        actor.should(seeThat(the(LINK_LOGIN_INGRESADO), isPresent()));
        actor.wasAbleTo(
                Click.on(LINK_SING_OUT)
        );
    }

    @Entonces("^el va a poder realizar una compra$")
    public void elVaAPoderRealizarUnaCompra() {

    }

    @Cuando("^el ingrese con un (.*) y una (.*)$")
    public void elIngreseConUnUsuarioYUnaContraseña(String correo, String contraseña){
        actor.wasAbleTo(
                IngresarCredenciales.usuarioPassword(correo,contraseña)

        );
    }
}
