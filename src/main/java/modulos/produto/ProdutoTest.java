package modulos.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

@DisplayName("Testes Mobile dp Mósudlo de produto")
public class ProdutoTest {
    @DisplayName("Validação do Valor do Produto Não permitido")
    @Test
    public void testValidacaoDoValorDeProdutoNaoPermitido(){
       //Abrir o App
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platform", "");
        capacidades.setCapability("udid","");



       //Fazer Login

       //Abrir o formularo nopvo produto

       //Cadastrar um produto com valor invalido

       //Validar que a mensagem de valor inválido foi apresentado

    }

}
