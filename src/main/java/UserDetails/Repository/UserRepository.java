package UserDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UserDetails.Model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
