package com.example.AccountBookForMe.repository;

import com.example.AccountBookForMe.entity.PaymentListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentListItemRepository extends JpaRepository<PaymentListItem, Long> {

    @Query(value = "SELECT pm.id AS payment_id, pm.name AS name FROM payment_methods pm", nativeQuery = true)
    List<PaymentListItem> getPaymentList();
}
