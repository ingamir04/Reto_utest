package utest.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistro3 {
    public static final Target COMPUTER = Target.the("Computador ").located(By.xpath("//span[@class=\"btn btn-default form-control ui-select-toggle\"]"));
    public static final Target SELECT_COMPUTER = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), 'Windows')]"));
    public static final Target VERSION = Target.the("Seleccionar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_VERSION = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), '10')]"));
    public static final Target LANGUAGE = Target.the("Seleccionar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_LANGUAGE = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), 'Spanish')]"));
    public static final Target MOBILE = Target.the("Seleccionar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOBILE = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), 'Apple')]"));
    public static final Target MODELO = Target.the("Seleccionar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MODELO = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), 'iPhone 12')]"));
    public static final Target SYSTEM = Target.the("Seleccionar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_SYSTEM = Target.the("Seleccionar").located(By.xpath("//div[contains(text(), 'iOS 14.3')]"));
    public static final Target BUTTON_NEXT = Target.the("Boton para continuar").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
