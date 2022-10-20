package com.example.usecases.adicionarItemNoCarrinho;

import java.util.Optional;

import com.example.entities.ItemDoCarrinho;
import com.example.entities.ItemDoCarrinhoFactory;
import com.example.entities.Produto;
import com.example.usecases.contratoDeDados.CarrinhoContratoDeDados;
import com.example.usecases.contratoDeDados.ProdutoContratoDeDados;
import com.example.usecases.interfaces.CasoDeUsoComParametrosResposta;

public class AdicionarItemNoCarrinho 
implements CasoDeUsoComParametrosResposta<AdicionarItemInputDTO, AdicionarItemOutputDTO> {

    private final ProdutoContratoDeDados produtoContratoDeDados;
    private final CarrinhoContratoDeDados carrinhoContratoDeDados;
    private final ItemDoCarrinhoFactory itemDoCarrinhoFactory = new ItemDoCarrinhoFactory();

    public AdicionarItemNoCarrinho(ProdutoContratoDeDados produtoContratoDeDados, CarrinhoContratoDeDados carrinhoContratoDeDados) {
        this.produtoContratoDeDados = produtoContratoDeDados;
        this.carrinhoContratoDeDados = carrinhoContratoDeDados;
    }

    @Override
    public AdicionarItemOutputDTO executar(AdicionarItemInputDTO params) {
        // verifica se existe
        // - msg de erro se exisitir
        Optional<Produto> prod = produtoContratoDeDados.buscarProdutoPorNome(params.produto().getNome());
        if(prod.isEmpty()) {
            throw new IllegalArgumentException("Produto nao existe.");
        }

        // adiciona item no carrinho
        ItemDoCarrinho item = itemDoCarrinhoFactory.criarItem(prod.get(), params.quantidade());
        carrinhoContratoDeDados.adicionarItem(item);

        // retorna o total do item
        return new AdicionarItemOutputDTO(item.calcularTotal());
    }

    
}
