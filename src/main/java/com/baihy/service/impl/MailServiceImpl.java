package com.baihy.service.impl;

import com.baihy.domain.MailContent;
import com.baihy.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.service
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 17:39
 */
@Service
public class MailServiceImpl implements MailService {


    private final Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);


    @Autowired
    private JavaMailSender sender;

    @Autowired
    private SimpleMailMessage mailMessage;

    @Autowired
    private ThreadPoolTaskExecutor pool;

    @Override
    public void sendMail(MailContent mail) {
        this.pool.execute(() -> {
            mailMessage.setTo(mail.getTo());
            mailMessage.setSubject(mail.getSubject());
            mailMessage.setText(mail.getContent());
            sender.send(mailMessage);
            logger.info("邮件发送成功！！！");
        });
    }
}
