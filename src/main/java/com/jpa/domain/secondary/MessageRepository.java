package com.jpa.domain.secondary;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 
* @author Raven
* @date 2017年11月16日 下午11:00:23
 */
public interface MessageRepository extends  JpaRepository<Message, Long> {


}
