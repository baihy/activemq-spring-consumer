package com.baihy.domain;

import java.io.Serializable;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.domain
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 15:30
 */
public class MailContent implements Serializable {

    private String from;

    private String to;

    private String subject;

    private String content;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MailContent{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
