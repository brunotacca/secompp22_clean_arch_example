package com.example.external.database;

import java.math.BigDecimal;
import java.util.Optional;

import com.example.entities.Produto;
import com.example.entities.ProdutoFactory;
import com.example.usecases.contratoDeDados.ProdutoContratoDeDados;

public class ProdutoRepositorio implements ProdutoContratoDeDados {

    private final ProdutoFactory produtoFactory = new ProdutoFactory();

    @Override
    public Optional<Produto> buscarProdutoPorNome(String nome) {
        if(nome == "Clean Arch Book") {
            return Optional.of(
                produtoFactory.criaProduto("Clean Arch Book", new BigDecimal(99.99))
            );
        }
        return Optional.empty();
    }

}
