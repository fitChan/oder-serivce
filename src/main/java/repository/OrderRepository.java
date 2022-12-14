package repository;

import entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findByOrderId(String orderId);
    Iterable<Order> findByUserId(String userId);

}
