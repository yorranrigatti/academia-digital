package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
  @NotBlank(message = "Preecha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotBlank(message = "Preecha o campo corretamente.")
  @CPF(message = "'${validatedData}' é invalido")
  private String cpf;

  @NotBlank(message = "Preecha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotNull(message = "Preecha o campo corretamente.")
  @Past(message = "Data '${validatedData}' é invalida")
  private LocalDate dataDeNascimento;
}
