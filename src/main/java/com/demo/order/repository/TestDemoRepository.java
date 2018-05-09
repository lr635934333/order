package com.demo.order.repository;

import com.demo.order.domain.TestDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestDemoRepository extends JpaRepository<TestDemo, String> {
}
