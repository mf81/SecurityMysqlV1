package eu.maciejfijalkowski.securityMysqlV1.repository;

import eu.maciejfijalkowski.securityMysqlV1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
