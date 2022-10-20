package com.example.entities;

import java.math.BigDecimal;

public interface Produto {

    public abstract String getNome();
    public abstract BigDecimal getValorUnitario();

    public abstract BigDecimal calcularTotal();

}
