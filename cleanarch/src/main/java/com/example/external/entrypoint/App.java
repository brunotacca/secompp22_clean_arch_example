package com.example.external.entrypoint;

import java.math.BigDecimal;
import java.text.NumberFormat;

import com.example.usecases.adicionarItemNoCarrinho.AdicionarItemInputDTO;

/**
 * Hello Clean Arch!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        AppConfig appConfig = new AppConfig();

        var casoDeUso_AdicionarItemNoCarrinho = appConfig.casoDeUsoFactory.criarCasoDeUsoAdicionarItemNoCarrinho();

        var itemParaAdicionarNoCarrinho = new AdicionarItemInputDTO(
            // Caso de uso para buscar/listar/criar/alterar produtos!!??
            appConfig.produtoFactory.criaProduto("Clean Arch Book", new BigDecimal(0.99)),
            12
        );

        var output = casoDeUso_AdicionarItemNoCarrinho.executar(itemParaAdicionarNoCarrinho);
        // System.out.println(output.valorTotalDoItem());
        BigDecimal valorTotal = output.valorTotalDoItem();
        String valorFormatado = NumberFormat.getCurrencyInstance().format(valorTotal);
        System.out.println(valorFormatado);
    }

}
