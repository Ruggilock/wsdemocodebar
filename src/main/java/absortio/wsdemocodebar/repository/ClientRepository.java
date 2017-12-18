package absortio.wsdemocodebar.repository;

import absortio.wsdemocodebar.model.Client;
import absortio.wsdemocodebar.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
    Collection<Client> findByDni(String dni);
}
