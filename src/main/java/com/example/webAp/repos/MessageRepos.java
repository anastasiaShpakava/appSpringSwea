package com.example.webAp.repos;

import com.example.webAp.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepos extends CrudRepository <Message, Integer> {   //позволяет плучить полный список полей либо по идентификатору
    List<Message> findByTag (String tag);
}
