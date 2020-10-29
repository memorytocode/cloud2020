package com.atguigu.springcloud;
/**
* @program: cloud2020
* @description: Json封装实体类
* @author: jzm
* @create: 2020-10-29 20:47
**/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}






