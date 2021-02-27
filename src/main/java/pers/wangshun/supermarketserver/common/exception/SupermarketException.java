package pers.wangshun.supermarketserver.common.exception;

import lombok.Data;
import pers.wangshun.supermarketserver.common.constants.ResultCodeEnum;

/**
 * @author WangShun
 */
@Data
public class SupermarketException extends RuntimeException {
    private Integer code;

    /**
     * 接受状态码和错误消息
     * @param code
     * @param message
     */
    public SupermarketException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SupermarketException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "SupermarketException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
