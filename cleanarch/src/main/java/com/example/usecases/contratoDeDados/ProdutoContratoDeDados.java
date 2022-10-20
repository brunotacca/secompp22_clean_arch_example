package com.example.usecases.contratoDeDados;

import java.util.Optional;

import com.example.entities.Produto;

public interface ProdutoContratoDeDados {
    
    public abstract Optional<Produto> buscarProdutoPorNome(String nome);
    
}
