package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {
  @NotNull(message = "Preecha o campo corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo")
  private Long alunoId;

}
