package sample.rocketmq;

import org.rocketmq.starter.annotation.RocketMQListener;
import org.rocketmq.starter.annotation.RocketMQMessage;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Note:
 * <p>
 * Date: 04/08/2018 10:53.
 *
 * @author He Jialin
 */
@Service
@RocketMQListener(topic = "TopicTest")
public class Consumer {

    @RocketMQMessage(messageClass = String.class, tag = "TagA")
    public void onMessage(String message) {
        System.out.println("received message: {" + message + "}");
    }

}
