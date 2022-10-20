package com.example.entities;

public class CarrinhoDeComprasFactory {
    
    public CarrinhoDeCompras criarCarrinho() {
        return new CarrinhoDeComprasImpl();
    }

}
