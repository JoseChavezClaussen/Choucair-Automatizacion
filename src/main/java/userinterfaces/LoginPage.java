package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://automationpractice.com/index.php")
public class LoginPage extends PageObject {
    public static final Target LINK_SING_IN = Target.the("Ingresar a SING_IN").locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public static final Target INPUT_USUARIO = Target.the("Input para ingresar el usuario").located(By.name("email_create"));
    public static final Target CREATE_AND_ACCOUNT = Target.the ("Click en el create and account").locatedBy("//*[@id=\"SubmitCreate\"]/span");
    public static final Target RB_SEXO_CLIENTE = Target.the("Click para indicar el sexo").located(By.id("id_gender1"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input para el primer nombre").located(By.id("customer_firstname"));
    public static final Target INPUT_LAST_NAME = Target.the("Input para el primer nombre").located(By.id("customer_lastname"));
    public static final Target INPUT_PASSWORD = Target.the("Input para la contraseña").located(By.id("passwd"));
    public static final Target DDL_DAYS = Target.the("Desplegable para ingresar dia").located(By.id("days"));
    public static final Target DDL_DAYS_CAMBIAR = Target.the("Ingresar dia de cumpleaños").locatedBy("//*[@id=\"days\"]/option[4]");
    public static final Target DDL_MONTHS = Target.the("Desplegable para ingresar mes").located(By.id("months"));
    public static final Target DDL_MONTHS_CAMBIAR = Target.the("Ingresar mes de cumpleaños").locatedBy("//*[@id=\"months\"]/option[5]");
    public static final Target DDL_YEARS = Target.the("Desplegable para ingresar mes").located(By.id("years"));
    public static final Target DDL_YEARS_CAMBIAR = Target.the("Ingresar año de cumpleaños").locatedBy("//*[@id=\"years\"]/option[27]");
    public static final Target INPUT_COMPANY = Target.the("Input Company").located(By.id("company"));
    public static final Target INPUT_ADDRESS_1 = Target.the("Input Address 1").located(By.id("address1"));
    public static final Target INPUT_ADDRESS_2 = Target.the("Input Address 2").located(By.id("address2"));
    public static final Target INPUT_CITY = Target.the("Input para ingresar ciudad").located(By.id("city"));
    public static final Target DDL_STATE= Target.the("Desplegable para ingresar el Estado de la Ciudad").located(By.id("id_state"));
    public static final Target DDL_STATE_CAMBIAR = Target.the("Cambiar el estado de la ciudad").locatedBy("//*[@id=\"id_state\"]/option[6]");
    public static final Target INPUT_POSTAL_CODE= Target.the("Input para ingresar codigo postal").located(By.id("postcode"));
    public static final Target INPUT_PHONE = Target.the("Input para ingresar telefono de casa").located(By.id("phone"));
    public static final Target INPUT_PHONE_MOBILE = Target.the("Input para ingresar celular").located(By.id("phone_mobile"));
    public static final Target BUTTON_REGISTER = Target.the("Botón para registrarse").located(By.id("submitAccount"));





}
