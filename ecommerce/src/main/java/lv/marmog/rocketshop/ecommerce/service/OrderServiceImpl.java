package lv.marmog.rocketshop.ecommerce.service;

import lv.marmog.rocketshop.ecommerce.model.Order;
import lv.marmog.rocketshop.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());

        return this.orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}
