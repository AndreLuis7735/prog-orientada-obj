package fatecfranca.emmemoria.service;

import fatecfranca.emmemoria.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    // lista em memória simulando o banco de dados
    private List<Cliente> lista = new ArrayList<Cliente>();
    private Long nextId = 1L;

    // retorna todos os clientes da lista
    public List<Cliente> listar() {
        return lista;
    }

    // adiciona um novo cliente na lista com ID gerado automaticamente
    public Cliente criar(Cliente c) {
        c.setId(nextId);
        nextId++; // prepara o próximo ID
        lista.add(c);
        return c;
    }

    // busca um cliente pelo ID, retorna null se não encontrar
    public Cliente buscarPorId(Long id) {
        for (Cliente c : lista) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null; // não encontrou
    }

    // remove um cliente pelo ID e retorna booleano de sucesso
    public boolean remover(Long id) {
        for (Cliente c : lista) {
            if (c.getId().equals(id)) {
                lista.remove(c);
                return true;
            }
        }
        return false; // não encontrou
    }

    // localiza o cliente pelo ID e substitui os dados pelo novo
    public Cliente atualizar(Long id, Cliente novo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                // encontrou — preserva o ID original no novo objeto
                novo.setId(id);
                lista.set(i, novo);
                return novo;
            }
        }
        return null; // não encontrou
    }
}
