package com.example.usecases.adicionarItemNoCarrinho;

import com.example.entities.Produto;

public record AdicionarItemInputDTO(Produto produto, Integer quantidade) 
{}
