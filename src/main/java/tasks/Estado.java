package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.EstadoFinanciero.*;

public class Estado implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(MENU_TRANSPARENCIA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MENU_TRANSPARENCIA),
                WaitUntil.the(PRESUPUESTO, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(PRESUPUESTO),
                Click.on(PRESUPUESTO)
        );

        CambiarPestanna(actor);

        actor.attemptsTo(
                WaitUntil.the(ESTADOS_FINANCIEROS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ESTADOS_FINANCIEROS),
                WaitUntil.the(BALANCES, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(BALANCES),
                Click.on(BALANCES),
                WaitUntil.the(BTN_ESTADO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ESTADO)
        );

        CambiarPestanna(actor);

        actor.attemptsTo(

        );

    }

    //ul [contains (@class, 'docsInd pag alt_content')]//div [contains (@class, 'item-paginado')]//div [contains (@class, 'desc-item-paginate')]//img
    public void CambiarPestanna(Actor actor) {
        Set<String> windowIterator = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
        for (String h : windowIterator) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(h);
        }
    }

    public static Estado  financiero() {
     return instrumented( Estado.class );
    }

}
