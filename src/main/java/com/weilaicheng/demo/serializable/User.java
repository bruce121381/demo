package com.weilaicheng.demo.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author by beijita@weilaicheng.com
 * 2020/2/24
 *
 * @author xiangzhi.meng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {


    private Integer id;

    private String name;




}
