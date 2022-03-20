package com.sip.restlayer.repositories;
import com.sip.restlayer.entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
