/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Patrik
 */
public class Paciente {

    private String nome;
    private String cpf;
    private String Telefone;
    private String data;
    private Boolean consultaRealizada;
    private Boolean isPaciente;
    private String observacoes;

    public Paciente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(Boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public Boolean getIsPaciente() {
        return isPaciente;
    }

    public void setIsPaciente(Boolean isPaciente) {
        this.isPaciente = isPaciente;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + Telefone + ", data=" + data + ", consultaRealizada=" + consultaRealizada + ", isPaciente=" + isPaciente + ", observacoes=" + observacoes + '}';
    }

}
