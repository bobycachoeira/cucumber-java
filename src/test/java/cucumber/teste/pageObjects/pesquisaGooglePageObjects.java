package cucumber.teste.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pesquisaGooglePageObjects {

    private static final By campoPesquisa = By.id( "lst-ib" );
    private static final By botãoPesquisar = By.name( "btnK" );
    private static final By resultStats = By.id( "resultStats" );

    WebDriver driver;
    WebDriverWait wait;

    public pesquisaGooglePageObjects(WebDriver driver, WebDriverWait wait ) {

        this.driver = driver;
        this.wait = wait;
    }

    public void acessaPaginaPesquisa() {

        driver.get( "https://www.google.com.br/?gws_rd=cr&dcr=0&ei=Lpa4Wa_TA8SFwgTo67OICQ" );
    }

    public void informaValorPesquisar(String valorPesquisar){
        driver.findElement(campoPesquisa).clear();
        driver.findElement(campoPesquisa).sendKeys(valorPesquisar);
    }

    public void clicaBotaoPesquisar(){
        driver.findElement(botãoPesquisar).click();
    }

    public String validaTextoResultStats(){
        String resultado = driver.findElement(resultStats).getText();
        return resultado;
    }
}
