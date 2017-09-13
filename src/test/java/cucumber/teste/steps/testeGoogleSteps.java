package cucumber.teste.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import cucumber.teste.pageObjects.pesquisaGooglePageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class testeGoogleSteps {

    WebDriver driver;
    WebDriverWait wait;
    pesquisaGooglePageObjects pesquisa;

    @Before
    public void setup() {

        driver = new ChromeDriver();
        wait = new WebDriverWait( driver, 15 );

        pesquisa = new pesquisaGooglePageObjects( driver, wait );
    }

    @After
    public void tearDown() {

        driver.quit();
   }



    @Dado("^que eu acesse a pagina inicial do google$")
    public void que_eu_acesse_a_pagina_inicial_do_google() throws Throwable {
        pesquisa.acessaPaginaPesquisa();
    }


    @Quando("^informar no campo de busca o valor \"([^\"]*)\"$")
    public void informar_no_campo_de_busca_o_valor(String valorPesquisar) throws Throwable {
        pesquisa.informaValorPesquisar(valorPesquisar);
    }

    @Quando("^clicar em pesquisar$")
    public void clicar_em_pesquisar() throws Throwable {
        pesquisa.clicaBotaoPesquisar();
    }

    @Então("^deve trazer o resultado$")
    public void deve_trazer_o_resultado() throws Throwable {

        assertThat(pesquisa.validaTextoResultStats()).contains("Aproximadamente 126.000.000 resultados");
    }
}
