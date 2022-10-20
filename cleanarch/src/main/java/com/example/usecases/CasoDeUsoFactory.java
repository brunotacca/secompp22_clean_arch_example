package com.example.usecases;

import com.example.usecases.adicionarItemNoCarrinho.AdicionarItemInputDTO;
import com.example.usecases.adicionarItemNoCarrinho.AdicionarItemNoCarrinho;
import com.example.usecases.adicionarItemNoCarrinho.AdicionarItemOutputDTO;
import com.example.usecases.contratoDeDados.CarrinhoContratoDeDados;
import com.example.usecases.contratoDeDados.ProdutoContratoDeDados;
import com.example.usecases.interfaces.CasoDeUsoComParametrosResposta;

public class CasoDeUsoFactory {

    private final ProdutoContratoDeDados produtoContratoDeDados;
    private final CarrinhoContratoDeDados carrinhoContratoDeDados;

    public CasoDeUsoFactory(ProdutoContratoDeDados produtoContratoDeDados,
            CarrinhoContratoDeDados CarrinhoContratoDeDados) {
        this.produtoContratoDeDados = produtoContratoDeDados;
        this.carrinhoContratoDeDados = CarrinhoContratoDeDados;
    }

    public CasoDeUsoComParametrosResposta<AdicionarItemInputDTO, AdicionarItemOutputDTO> criarCasoDeUsoAdicionarItemNoCarrinho() {
        return new AdicionarItemNoCarrinho(produtoContratoDeDados, carrinhoContratoDeDados);
    }

}
