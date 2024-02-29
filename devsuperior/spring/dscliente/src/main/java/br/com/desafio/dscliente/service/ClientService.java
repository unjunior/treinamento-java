package br.com.desafio.dscliente.service;

import br.com.desafio.dscliente.dto.ClientDTO;
import br.com.desafio.dscliente.entities.Client;
import br.com.desafio.dscliente.repository.ClientRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoty repositoty;

    @Transactional(readOnly = true)
    public ClientDTO finbById(Long id){
        Client client = repositoty.findById(id).get();
        return new ClientDTO(client);
    }
}
