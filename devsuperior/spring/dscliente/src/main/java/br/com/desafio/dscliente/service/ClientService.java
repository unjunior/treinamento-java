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

    @Transactional
    public ClientDTO insert(ClientDTO dto){
        Client entity = new Client();
        copyDtoToEntity(dto, entity);
        entity = repositoty.save(entity);
        return new ClientDTO(entity);
    }
    @Transactional
    public ClientDTO update (Long id, ClientDTO dto){

        Client entity = repositoty.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        entity = repositoty.save(entity);
        return new ClientDTO(entity);
    }
    private void copyDtoToEntity(ClientDTO dto, Client entity) {
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }


}
