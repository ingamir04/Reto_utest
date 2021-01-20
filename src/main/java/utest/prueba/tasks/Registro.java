package utest.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import utest.prueba.model.UtestData;
import utest.prueba.userinterfaces.UtestRegistro1;
import utest.prueba.userinterfaces.UtestRegistro2;
import utest.prueba.userinterfaces.UtestRegistro3;
import utest.prueba.userinterfaces.UtestRegistroPassword;

import java.util.List;

public class Registro implements Task {

    private String srtname;
    private String srtlast;
    private String stremail;
    private String strmonth;
    private String strday;
    private String stryear;
    private String strcity;
    private String srtpostal;
    private String strpassword;
    private String strconfirpassword;

    public Registro(String srtname, String srtlast, String stremail, String strmonth, String strday, String stryear, String strcity, String srtpostal, String strpassword, String strconfirpassword) {
        this.srtname = srtname;
        this.srtlast = srtlast;
        this.stremail = stremail;
        this.strmonth = strmonth;
        this.strday = strday;
        this.stryear = stryear;
        this.strcity = strcity;
        this.srtpostal = srtpostal;
        this.strpassword = strpassword;
        this.strconfirpassword = strconfirpassword;
    }

    public static Registro Pagina(String srtname, String srtlast, String stremail, String strmonth, String strday, String stryear, String strcity, String srtpostal, String strpassword, String strconfirpassword) {
        return Tasks.instrumented(Registro.class,srtname,srtlast,stremail,strmonth,strday,stryear,strcity,srtpostal,strpassword,strconfirpassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(UtestRegistro1.BUTTON_JOIN),
                    Enter.theValue(srtname).into(UtestRegistro1.INPUT_FIRTS),
                    Enter.theValue(srtlast).into(UtestRegistro1.INPUT_LAST),
                    Enter.theValue(stremail).into(UtestRegistro1.INPUT_EMAIL),
                    SelectFromOptions.byVisibleText(strmonth).from(UtestRegistro1.MONTH),
                    SelectFromOptions.byVisibleText(strday).from(UtestRegistro1.DAY),
                    SelectFromOptions.byVisibleText(stryear).from(UtestRegistro1.YEAR),
                    Click.on(UtestRegistro1.BUTTON_NEXT),
                    Enter.theValue(strcity).into(UtestRegistro2.INPUT_CITY),
                    Hit.the(Keys.ARROW_DOWN).into(UtestRegistro2.INPUT_CITY),
                    Hit.the(Keys.ENTER).into(UtestRegistro2.INPUT_CITY),
                    Hit.the(Keys.ESCAPE).into(UtestRegistro2.INPUT_CITY),
                    Enter.theValue(srtpostal).into(UtestRegistro2.INPUT_POSTAL),
                    Click.on(UtestRegistro2.BUTTON_NEXTDEVICIES),
                    Click.on(UtestRegistro3.COMPUTER),
                    Click.on(UtestRegistro3.SELECT_COMPUTER),
                    Click.on(UtestRegistro3.VERSION),
                    Click.on(UtestRegistro3.SELECT_VERSION),
                    Click.on(UtestRegistro3.LANGUAGE),
                    Click.on(UtestRegistro3.SELECT_LANGUAGE),
                    Click.on(UtestRegistro3.MOBILE),
                    Click.on(UtestRegistro3.SELECT_MOBILE),
                    Click.on(UtestRegistro3.MODELO),
                    Click.on(UtestRegistro3.SELECT_MODELO),
                    Click.on(UtestRegistro3.SYSTEM),
                    Click.on(UtestRegistro3.SELECT_SYSTEM),
                    Click.on(UtestRegistro3.BUTTON_NEXT),
                    Enter.theValue(strpassword).into(UtestRegistroPassword.INPUT_PASSWORD),
                    Enter.theValue(strconfirpassword).into(UtestRegistroPassword.CONFIRMAR_PASSWORD),
                    Click.on(UtestRegistroPassword.TERMS),
                    Click.on(UtestRegistroPassword.PRIVACY)
            );
    }
}
