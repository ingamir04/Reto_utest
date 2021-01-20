package utest.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utest.prueba.userinterfaces.UtestRegistroPassword;

public class Respuesta implements Question<Boolean> {
    private String pregunta;

    public Respuesta(String pregunta) {
        this.pregunta = pregunta;
    }
    public static Respuesta ver(String pregunta) {
        return new Respuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textName= Text.of(UtestRegistroPassword.FASE_REGISTRO).viewedBy(actor).asString();
        if(pregunta.equals(textName)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
