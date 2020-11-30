package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleProductoPage {
    public static final Target BOTON_AÑADIR_CARRITO = Target.the("Añade al carrito").locatedBy("//*[@id=\"add_to_cart\"]/button/span");

    public static final Target AUMENTAR_ARTICULOS = Target.the ("Aumentar la cantidad de articulos").locatedBy("//*[@id=\"quantity_wanted_p\"]/a[2]/span");

    public static final Target CAMBIAR_COLOR = Target.the ("Cambiar de color al articulo").located(By.name("White"));

    public static final Target BOTON_ENTRAR_CARRITO = Target.the ("Entrar al carrito").locatedBy("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

    public static final Target DDL_TAMAÑO_ARTICULO = Target.the ("Seleccionar el desplegable").located(By.id("uniform-group_1"));

    public static final Target DDL_CAMBIAR_TAMAÑO = Target.the ("Cambiar tamaño de prenda").locatedBy("//option[@title='M']");
}
