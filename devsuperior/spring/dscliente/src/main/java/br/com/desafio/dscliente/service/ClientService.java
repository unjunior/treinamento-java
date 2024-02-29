package br.com.desafio.dscliente.service;

import br.com.desafio.dscliente.dto.ClientDTO;
import br.com.desafio.dscliente.entities.Client;
import br.com.desafio.dscliente.repository.ClientRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoty repositoty;

    @Transactional(readOnly = true)
    public ClientDTO finbById(Long id){
        Client client = repositoty.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = repositoty.findAll(pageable);
        return result.map(x -> new ClientDTO(x));
    }
}
