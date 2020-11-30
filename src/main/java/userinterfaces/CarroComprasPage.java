package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class CarroComprasPage {
    public static final Target LINK_CARRITO_AGREGADO = Target.the("Ver el Producto agregado al carrito").locatedBy("//*[@id=\"order_step\"]/li[1]/span");
}
