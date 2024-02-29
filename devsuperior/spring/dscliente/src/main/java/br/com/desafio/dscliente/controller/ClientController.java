package br.com.desafio.dscliente.controller;

import br.com.desafio.dscliente.dto.ClientDTO;
import br.com.desafio.dscliente.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById (@PathVariable Long id){
       ClientDTO dto = service.finbById(id);
       return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity <Page<ClientDTO>> findAll(Pageable pageable){
        Page<ClientDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }
    @PostMapping
    public ResponseEntity <ClientDTO> insert (@RequestBody ClientDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
            .path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable Long id, @RequestBody ClientDTO dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
