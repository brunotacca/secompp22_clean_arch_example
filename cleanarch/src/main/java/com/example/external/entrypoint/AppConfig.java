package com.example.external.entrypoint;

import com.example.entities.ProdutoFactory;
import com.example.external.database.CarrinhoRepositorio;
import com.example.external.database.ProdutoRepositorio;
import com.example.usecases.CasoDeUsoFactory;
import com.example.usecases.contratoDeDados.CarrinhoContratoDeDados;
import com.example.usecases.contratoDeDados.ProdutoContratoDeDados;

public class AppConfig {
    
    public final CasoDeUsoFactory casoDeUsoFactory;
    public final ProdutoFactory produtoFactory;
    public final ProdutoContratoDeDados produtoContratoDeDados;
    public final CarrinhoContratoDeDados carrinhoContratoDeDados;  
    
    public AppConfig() {
        produtoContratoDeDados = new ProdutoRepositorio();
        carrinhoContratoDeDados = new CarrinhoRepositorio();
        produtoFactory = new ProdutoFactory();
        casoDeUsoFactory = new CasoDeUsoFactory(produtoContratoDeDados, carrinhoContratoDeDados);
    }

}
