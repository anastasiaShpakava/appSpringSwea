package com.example.webAp.repos;

import com.example.webAp.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepos extends CrudRepository <Message, Integer> {   //позволяет плучить полный список полей либо по идентификатору
}
