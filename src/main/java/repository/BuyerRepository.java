package repository;

import entity.Buyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository  extends CrudRepository<Buyer,Long> {
}
