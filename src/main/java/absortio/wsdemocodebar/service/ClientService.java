package absortio.wsdemocodebar.service;

import absortio.wsdemocodebar.model.Client;
import absortio.wsdemocodebar.model.Product;
import absortio.wsdemocodebar.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAllClient(){
        return clientRepository.findAll();
    }
    public void delete(Integer id){
        clientRepository.delete(id);
    }
    public void save( Client clientModel){ clientRepository.save(clientModel);}
    public Collection<Client> findByDni(String dni){
        return clientRepository.findByDni(dni);
    }


}
