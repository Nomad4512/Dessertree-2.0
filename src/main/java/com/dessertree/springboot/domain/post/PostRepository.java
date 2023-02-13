package com.dessertree.springboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<PostRequest,Long> {

    @Query("SELECT p FROM PostRequest p ORDER BY p.id DESC")
    List<PostRequest> findAllDesc();

}