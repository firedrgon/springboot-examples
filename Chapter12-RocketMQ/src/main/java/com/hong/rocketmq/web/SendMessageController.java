package com.hong.rocketmq.web;

import com.alibaba.fastjson.JSONObject;
import com.hong.rocketmq.bean.MyProducer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong on 2017/5/24.
 */
@RestController
public class SendMessageController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier(value = "producer")
    private DefaultMQProducer defaultProducer;

    @GetMapping("/sendMsg")
    public String sendMsg() throws RemotingException, InterruptedException, MQBrokerException {
        SendResult sendResult = null;
        try {
            for (int i = 0; i < 1000; i++) {
                Message msg = new Message("Topic", "TagA", JSONObject.toJSONBytes("你好，小菜鸟."+i));
                sendResult = defaultProducer.send(msg, 10000);
                logger.info(msg.toString());
            }
        } catch (MQClientException e) {
            logger.error(e.getMessage() + String.valueOf(sendResult));
        }
        // 当消息发送失败时如何处理
        if (sendResult == null || sendResult.getSendStatus() != SendStatus.SEND_OK) {
            // TODO
        }
        return "success";
    }
}
