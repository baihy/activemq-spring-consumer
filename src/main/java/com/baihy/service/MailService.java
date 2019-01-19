package com.baihy.service;

import com.baihy.domain.MailContent;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.service
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 17:39
 */
public interface MailService {

    void sendMail(MailContent mail);

}
