package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @When("ejecuto la herramienta {string} para extraer el contenido de JIRA de la historia de usuario {string}")
    public void ejecuto_la_herramienta_para_extraer(String herramienta, String historiaDeUsuario) {
        page.extraerContenidoDeJira(herramienta, historiaDeUsuario);
    }

    @Then("el contenido de la historia de usuario se extrae correctamente y se valida su integridad")
    public void validar_extraccion_y_integridad() {
        Assert.assertTrue(page.validarIntegridadContenido());
    }

    @When("releo el documento del usuario con {string}")
    public void releo_el_documento_del_usuario(String herramienta) {
        page.releerDocumento(herramienta);
    }

    @Then("el documento se recarga correctamente y se asegura que contenga la información actualizada")
    public void validar_recarga_y_actualizacion() {
        Assert.assertTrue(page.verificarInformacionActualizada());
    }
}