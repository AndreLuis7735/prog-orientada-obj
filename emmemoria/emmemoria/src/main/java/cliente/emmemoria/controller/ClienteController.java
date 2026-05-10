package fatecfranca.emmemoria.controller;

import fatecfranca.emmemoria.model.Cliente;
import fatecfranca.emmemoria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

// a classe é uma controladora de requisições
@RestController
// controla as requisições do endpoint /clientes
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired // injeção de dependência
    ClienteService service;

    // GET /clientes — lista todos os clientes
    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    // POST /clientes — cadastra um novo cliente e retorna 201 Created
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente criado = service.criar(cliente);
        URI uri = URI.create("/clientes/" + criado.getId());
        return ResponseEntity.created(uri).body(criado);
    }

    // DELETE /clientes/{id} — remove um cliente pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        boolean removido = service.remover(id);
        return removido ? ResponseEntity.noContent().build()
                        : ResponseEntity.notFound().build();
    }

    // PUT /clientes/{id} — atualiza os dados de um cliente pelo ID
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id,
                                             @RequestBody Cliente novo) {
        Cliente atualizado = service.atualizar(id, novo);
        return (atualizado != null) ? ResponseEntity.ok(atualizado)
                                    : ResponseEntity.notFound().build();
    }
}
