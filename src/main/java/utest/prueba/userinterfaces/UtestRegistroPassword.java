package utest.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistroPassword {
    public static final Target INPUT_PASSWORD = Target.the("Contraseña").located(By.id("password"));
    public static final Target CONFIRMAR_PASSWORD = Target.the("Confirmar contraseña").located(By.id("confirmPassword"));
    public static final Target TERMS = Target.the("Terminos").located(By.id("termOfUse"));
    public static final Target PRIVACY = Target.the("Privacidad").located(By.id("privacySetting"));
    public static final Target FASE_REGISTRO = Target.the("Texto de la ultima fase").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[1]/div/div/h1/span[2]"));

}
