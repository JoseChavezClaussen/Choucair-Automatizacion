package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;
import java.util.List;
import userinterfaces.CarroComprasPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.CarroComprasPage.LINK_CARRITO_AGREGADO;

public class EjemploGlobalSteps {

    @Managed(driver = "chrome", uniqueSession = true)
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        //Indicando que se abrirá desde el navegador elegido (Chrome)
        actor.can(BrowseTheWeb.with(navegador));
        //Maximizar la pantalla
        navegador.manage().window().maximize();
        //Redirecciona a la página de la clase PageObject que extendimos.
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega (.*) unidades (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad(cantidad)
        );
    }


    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {
        actor.should(seeThat(the(LINK_CARRITO_AGREGADO), isPresent()));
    }


}
