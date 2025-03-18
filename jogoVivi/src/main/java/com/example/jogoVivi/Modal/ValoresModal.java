package com.example.jogoVivi.Modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "valores")
public class ValoresModal {

    @Id
    String _id;
    int tipo;
    String nome;
    String descricao;
    boolean ponto;
    String imagem;

    public ValoresModal(String _id, int tipo, String nome, String descricao, boolean ponto, String imagem) {
        this._id = _id;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.ponto = ponto;
        this.imagem = imagem;
    }

    public ValoresModal() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isPonto() {
        return ponto;
    }

    public void setPonto(boolean ponto) {
        this.ponto = ponto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Valores{" +
                "_id='" + _id + '\'' +
                ", tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ponto=" + ponto +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
