package hello.consumer.service;


import hello.consumer.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    public static final String QUEUE_AAA = "queue-aaa";

    public static final String QUEUE_BBB = "queue-bbb";

    @RabbitListener(queues = QUEUE_AAA)
    public void getMessage(Message message){
        log.info("queue-aaa message => {}", message);
    }

    @RabbitListener(queues = QUEUE_BBB)
    public void getMessageList(Message message) {
        log.info("queue-bbb Consumer1 message => {}", message);
    }

    //서버가 2대 있다고 가정
    @RabbitListener(queues = QUEUE_BBB)
    public void getMessageList2(Message message) {
        log.info("queue-bbb Consumer2 message => {}", message);
    }

    //동시에 3개 처리
//    @RabbitListener(queues = QUEUE_BBB, concurrency = "3")
//    public void getMessageList3(Message message) {
//        log.info("queue-bbb Consumer3 message => {} on => {}", message, Thread.currentThread().getName());
//    }

}
