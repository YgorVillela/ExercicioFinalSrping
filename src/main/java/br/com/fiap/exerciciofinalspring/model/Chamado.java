package br.com.fiap.exerciciofinalspring.model;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@SequenceGenerator(name = "chamado", sequenceName = "SQL_T_CHAMADO",allocationSize = 1)
public class Chamado {

    @Id
    @GeneratedValue(generator = "chamado", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Size(max = 50)
    private String titulo;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    private boolean finalizado;

    private String descricao;

    @ManyToOne
    private Prioridade prioridade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
}
