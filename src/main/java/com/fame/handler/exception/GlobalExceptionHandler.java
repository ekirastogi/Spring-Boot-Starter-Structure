package com.fame.handler.exception;

import com.fame.exception.base.BaseException;
import com.fame.response.ErrorResponseDTO;
import com.fame.response.base.ResponseDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekansh
 * @since 20/1/16
 */
@RestController
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {BaseException.class })
    public ResponseDTO handleBaseException(Exception e){
        ResponseDTO responseDTO = new ErrorResponseDTO();
        responseDTO.setMessage(e.getMessage());
        return responseDTO;
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseDTO handleException(Exception e){
        ResponseDTO responseDTO = new ErrorResponseDTO();
        responseDTO.setMessage(e.getMessage());
        return responseDTO;
    }


}
