package com.biblioteca.ada.model.dto;



import lombok.Data;

import java.time.LocalDate;

@Data
public class MultaDTO {
    private Long id;
    private Double multaValor;
    private LocalDate dataPagamentoMulta;




}
