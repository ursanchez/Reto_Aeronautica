package stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.EstadoVerificado;
import tasks.Estado;
import tasks.IngresarA;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class IngresarAeroCivilStepDefinitions {

    @Before
    public void inicio() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) abre la pagina de la aueronautica$")
    public void queUberAbreLaPaginaDeLaAueronautica( String actor) {
        theActorCalled(actor).wasAbleTo(IngresarA.aerocivil());
    }


    @Cuando("^navega hasta los estados financieros$")
    public void navegaHastaLosEstadosFinancieros() {
        theActorInTheSpotlight().attemptsTo(Estado.financiero());
    }

    @Entonces("^verifica los estados financieros$")
    public void verificaLosEstadosFinancieros() {
        theActorInTheSpotlight().should(seeThat(EstadoVerificado.financiero(), equalTo("")));
    }




}
