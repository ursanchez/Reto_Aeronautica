package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class EstadoVerificado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of().viewedBy(actor).asString();
    }

    public static EstadoVerificado financiero() {
        return new EstadoVerificado();
    }
}
