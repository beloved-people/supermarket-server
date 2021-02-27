package pers.wangshun.supermarketserver.common.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.wangshun.supermarketserver.common.constants.ResultCodeEnum;
import pers.wangshun.supermarketserver.common.exception.SupermarketException;
import pers.wangshun.supermarketserver.common.utils.ExceptionUtil;
import pers.wangshun.supermarketserver.common.vo.Result;

/**
 * @author WangShun
 * 统一异常处理器
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return Result.error();
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public Result error(BadSqlGrammarException e) {
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return Result.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public Result error(HttpMessageNotReadableException e) {
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return Result.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }

    @ExceptionHandler(SupermarketException.class)
    @ResponseBody
    public Result error(SupermarketException e) {
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return Result.error().message(e.getMessage()).code(e.getCode());
    }
}
