package com.devsuperior.dscommerce.repository;

import com.devsuperior.dscommerce.entites.Order;
import com.devsuperior.dscommerce.entites.OrderItem;
import com.devsuperior.dscommerce.entites.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
