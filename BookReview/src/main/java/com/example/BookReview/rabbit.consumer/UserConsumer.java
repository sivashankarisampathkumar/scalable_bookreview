package com.example.BookReview.rabbit.consumer;

import com.example.BookReview.model.UserDetail;
import com.example.BookReview.repository.UserDetailRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

    private final ObjectMapper objectMapper;

    public UserConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
@Autowired
    private UserDetailRepository userDetailRepository;
    @RabbitListener(queues = "user.queue")
    public void consumeMessage(String message) {
        try {
            UserDetail user = objectMapper.readValue(message, UserDetail.class);
            System.out.println("Message received: " + user);
            userDetailRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* public static class UserDetail {
        private Long id;
        private String email;

        // Constructors, Getters, Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{id=" + id + ", email='" + email + "'}";
        }
    }*/
}
