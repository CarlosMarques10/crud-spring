package com.estudando.crudspring.dto;

import com.estudando.crudspring.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class ClientDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, max = 60, message = "O nome deve conter entre 3 e 60 caracteres")
    private String name;

    @NotBlank(message = "Campo requerido")
    @Size(min = 11, max = 11, message = "Número de cpf inválido")
    private String cpf;

    @Positive(message = "Renda deve ser positivo")
    private Double income;

    @PastOrPresent(message = "Data de nascimento não pode ser data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(Client client){
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }


}
