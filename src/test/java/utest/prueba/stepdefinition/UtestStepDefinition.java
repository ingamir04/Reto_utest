package utest.prueba.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.prueba.model.UtestData;
import utest.prueba.questions.Respuesta;
import utest.prueba.tasks.Abrir;
import utest.prueba.tasks.Registro;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Enter a website the utes$")
    public void enterAWebsiteTheUtes() {
        OnStage.theActorCalled("Amir").wasAbleTo(Abrir.pagina());
    }


    @When("^Register on the websites$")
    public void registerOnTheWebsites(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.Pagina(utestData.get(0).getSrtname(),utestData.get(0).getSrtlast(),utestData.get(0).getStremail(),utestData.get(0).getStrmonth(),utestData.get(0).getStrday(),utestData.get(0).getStryear(),utestData.get(0).getStrcity(), utestData.get(0).getSrtpostal(),utestData.get(0).getStrpassword(), utestData.get(0).getStrconfirpassword()));
    }

    @Then("^The confirm registrations$")
    public void theConfirmRegistrationsTheLastStep(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.ver(utestData.get(0).getStrpregunta())));
    }

}
