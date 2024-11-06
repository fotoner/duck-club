package moe.fotone.duckclub.api.user.repositroy;

import moe.fotone.duckclub.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}