package com.example.usecases.interfaces;

public interface CasoDeUsoComParametrosResposta<T, R> {

    public abstract R executar(T params);
    
}
