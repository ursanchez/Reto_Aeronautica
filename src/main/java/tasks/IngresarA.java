package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirNavegador;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarA implements Task {

    private AbrirNavegador abrirNavegador;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Open.browserOn(abrirNavegador) );

    }

    public static IngresarA aerocivil() {
        return instrumented( IngresarA.class );
    }
}
