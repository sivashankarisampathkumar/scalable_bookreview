package com.example.BookReview.repository;

import com.example.BookReview.model.Book;
import com.example.BookReview.model.UserDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends MongoRepository<UserDetail, String> {
}
