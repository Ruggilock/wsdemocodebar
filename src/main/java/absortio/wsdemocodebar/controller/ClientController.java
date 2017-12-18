package absortio.wsdemocodebar.controller;

import absortio.wsdemocodebar.model.Client;
import absortio.wsdemocodebar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/finddni/{dni}")
    public Collection<Client> getAllUsuario(@PathVariable String dni) {
        return clientService.findByDni(dni);
    }

}
