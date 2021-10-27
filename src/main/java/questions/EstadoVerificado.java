package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.EstadoFinanciero.PDF;

public class EstadoVerificado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PDF).viewedBy(actor).asString();
    }

    public static EstadoVerificado financiero() {
        return new EstadoVerificado();
    }
}
