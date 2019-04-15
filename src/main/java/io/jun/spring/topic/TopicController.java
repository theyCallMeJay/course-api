package io.jun.spring.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopic() {
        return Arrays.asList(
                new Topic("Spring", "Spring framework", "Spring framework description"),
                new Topic("java", "java framework", "Spring framework description"),
                new Topic("javascript", "js framework", "Spring framework description")
        );

    }
}
