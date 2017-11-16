package com.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.domain.primary.User;
import com.jpa.domain.primary.UserRepository;
import com.jpa.domain.secondary.Message;
import com.jpa.domain.secondary.MessageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaInitApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;
    
    @Test
    public void test() throws Exception {
        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));
        userRepository.flush();
//        Assert.assertEquals(5, userRepository.findAll().size());
        
        messageRepository.save(new Message("o1", "aaaaaaaaaa"));
        messageRepository.save(new Message("o2", "bbbbbbbbbb"));
        messageRepository.save(new Message("o3", "cccccccccco3"));
//        Assert.assertEquals(3, messageRepository.findAll().size());
    }

}
