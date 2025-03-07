package com.example.application.backend.domain.enums;

public enum Roles {
    ADM(1,"Administrador"),
    GER(2,"Gerente"),
    FIN(3,"Financeiro"),
    VEN(3,"Vendedor"),
    CON(4,"Consultas");

    private final int id;
    private final String descricao;

    // Construtor do Enum
    Roles(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // Métodos para acessar os atributos
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

}


