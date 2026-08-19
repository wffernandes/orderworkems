package tech.buildrun.orderworkems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.orderworkems.entity.Order;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderNumber(String orderNumber);
}
