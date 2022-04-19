package net.javaguides.springboot.repository;



import net.javaguides.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    static Optional<Role> findByName(String name) {
        return null;
    }
}