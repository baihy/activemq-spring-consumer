package com.baihy.listener;

import com.baihy.domain.MailContent;
import com.baihy.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import java.io.Serializable;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.listener
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 17:38
 */
@Component(value = "mailMessageListener")
public class MailMessageListener implements MessageListener {

    @Autowired
    private MailService mailService;

    @Override
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            ObjectMessage objectMessage = (ObjectMessage) message;
            try {
                Serializable obj = objectMessage.getObject();
                if (obj instanceof MailContent) {
                    MailContent mailContent = (MailContent) obj;
                    System.out.println("消费的消息是：" + mailContent);
                    mailService.sendMail(mailContent);
                }
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
