package sample.rocketmq;

import org.rocketmq.starter.annotation.EnableRocketMQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Note:
 * <p>
 * Date: 04/08/2018 10:54.
 *
 * @author He Jialin
 */
@SpringBootApplication
@EnableRocketMQ
public class SampleRocketMQApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleRocketMQApplication.class, args);
    }

}
