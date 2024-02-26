package modelos;

import java.util.ArrayList;
import java.util.List;

public class ListaPaciente {

    private List<Paciente> lista;

    public ListaPaciente() {
        this.lista = new ArrayList<>();
    }

    public List<Paciente> listar() {
        return lista;
    }

    public void adicionar(Paciente pac) {
        lista.add(pac);
    }

    public Paciente obtemPaciente(int id) {
        return lista.get(id);
    }

    public void atualizar(int id, Paciente pac) {
        lista.set(id, pac);
    }
}
