package pers.wangshun.supermarketserver.common.vo;

import lombok.Data;
import pers.wangshun.supermarketserver.common.constants.ResultCodeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WangShun
 */
@Data
public class Result {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    private Result(){}

    public static Result ok(){
        Result r = new Result();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    public static Result error(){
        Result r = new Result();
        r.setSuccess(ResultCodeEnum.LOGIN_FAILED.getSuccess());
        r.setCode(ResultCodeEnum.LOGIN_FAILED.getCode());
        r.setMessage(ResultCodeEnum.LOGIN_FAILED.getMessage());
        return r;
    }

    public static Result setResult(ResultCodeEnum resultCodeEnum){
        Result r = new Result();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMessage(resultCodeEnum.getMessage());
        return r;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
