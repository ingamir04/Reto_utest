package utest.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistro1 {
    public static final Target BUTTON_JOIN = Target.the("Bonton para registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRTS = Target.the("Campo para ingresar primer nombre").located(By.id("firstName"));
    public static final Target INPUT_LAST = Target.the("Campo para ingresar segundo nombre").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Campo para ingresar correo electronico").located(By.id("email"));
    public static final Target MONTH = Target.the("Lista de meses").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Lista de dias").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Lista de años").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Boton Siguiente").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

}
