package com.zhihaoliang.demo.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhihaoliang
 * @date 2019/9/303:01 PM
 * @version：1.0.0
 */
@Data
@Entity
@Table(name = "ay_user")
public class AyUser {


    @Id
    private String id;

    private String name;

    private String password;


}
