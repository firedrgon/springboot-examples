package com.hong.rocketmq.event;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.ApplicationEvent;

/**
 * Created by hong on 2017/5/24.
 */
public class RocketMQEvent extends ApplicationEvent {

    private DefaultMQPushConsumer consumer;
    private MessageExt messageExt;
    private String topic;

    public RocketMQEvent(Object source) {
        super(source);
    }

    public RocketMQEvent( DefaultMQPushConsumer consumer,MessageExt messageExt) {
        super(messageExt);
        this.consumer = consumer;
        this.messageExt = messageExt;
        this.topic = messageExt.getTopic();
    }

    public DefaultMQPushConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(DefaultMQPushConsumer consumer) {
        this.consumer = consumer;
    }

    public MessageExt getMessageExt() {
        return messageExt;
    }

    public void setMessageExt(MessageExt messageExt) {
        this.messageExt = messageExt;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
