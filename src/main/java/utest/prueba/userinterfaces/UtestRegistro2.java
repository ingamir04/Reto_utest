package utest.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistro2 {
    public static final Target INPUT_CITY = Target.the("Campo ciudad").located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("Campo codigo postal").located(By.id("zip"));
    public static final Target BUTTON_NEXTDEVICIES = Target.the("Boton de siguiente").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
