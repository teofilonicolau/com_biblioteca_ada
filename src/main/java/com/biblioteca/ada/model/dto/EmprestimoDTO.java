package com.biblioteca.ada.model.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class EmprestimoDTO {
    private Long id;
    private Long livroId;
    private Long membroId;
    private LocalDate dataEmprestimo;
    private LocalDate prazoDevolucao;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    private Double multaValor;
    private LocalDate dataPagamentoMulta;

    public Double getMultaValor() {
        return this.multaValor;
    }

    public LocalDate getDataPagamentoMulta() {
        return this.dataPagamentoMulta;
    }



}