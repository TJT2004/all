package org.example.abc.Repository;

import org.example.abc.enity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,String> {

}
