package com.zhihaoliang.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ay_mood")
@Entity
@Data
public class AyMood implements Serializable {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 说说内容
     */
    private String content;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 点赞的时间
     */
    @Column(name = "praise_num")
    private Integer praiseNum;

    /**
     * 发表的时间
     */
    @Column(name = "publish_time")
    private Date publishTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取说说内容
     *
     * @return content - 说说内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置说说内容
     *
     * @param content 说说内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取点赞的时间
     *
     * @return praise_num - 点赞的时间
     */
    public Integer getPraiseNum() {
        return praiseNum;
    }

    /**
     * 设置点赞的时间
     *
     * @param praiseNum 点赞的时间
     */
    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    /**
     * 获取发表的时间
     *
     * @return publish_time - 发表的时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置发表的时间
     *
     * @param publishTime 发表的时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}