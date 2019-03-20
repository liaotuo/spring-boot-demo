package com.liaotuo.springboot;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 18070959
 * @date 2019-03-20 9:25 PM
 * @description BookRepository
 **/
public interface BookRepository extends ElasticsearchRepository<Book, String> {
    Page<Book> findByAuthor(String author, Pageable pageable);

    List<Book> findByTitle(String title);
}