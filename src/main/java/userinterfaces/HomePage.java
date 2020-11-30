package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input para buscar producto").located(By.id("search_query_top"));

    public static final Target BUTTON_ARTICULO = Target.the ("Boton para realizar la busqueda").located(By.name("submit_search"));

    public static final Target SELECT_ARTICULO = Target.the("Selecciona un articulo").locatedBy("//a[@title='Blouse' and @class='product-name']");


}
