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
import tasks.ComprarProducto;
import tasks.IngresarCredenciales;
import userinterfaces.HomePage;
import tasks.BuscarProducto;
import tasks.AgregarProducto;
import userinterfaces.RealizarComprasPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.CarroComprasPage.LINK_CARRITO_AGREGADO;


public class CompraSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private RealizarComprasPage homePage = new RealizarComprasPage();



    @Entonces("^el terminara realizando una compra con el metodo (.*)$")
    public void elTerminaraRealizandoUnaCompra(String metodo) {
        actor.should(seeThat(the(LINK_CARRITO_AGREGADO), isPresent()));
        actor.wasAbleTo(
                ComprarProducto.metodo(metodo)
        );

    }

    @Cuando("^el agrega (.*) unidades (.*) al carro estando logueado$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad(cantidad)
        );
    }



    @Dado("^que un cliente accede hasta la web de compras con un (.*) y (.*)$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras(String correo, String contraseña) {
        //Indicando que se abrirá desde el navegador elegido (Chrome)
        actor.can(BrowseTheWeb.with(navegador));
        //Maximizar la pantalla
        navegador.manage().window().maximize();
        //Redirecciona a la página de la clase PageObject que extendimos.
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.wasAbleTo(
                IngresarCredenciales.usuarioPassword(correo,contraseña)
        );
    }
}

