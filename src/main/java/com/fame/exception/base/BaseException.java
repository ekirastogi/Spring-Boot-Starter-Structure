package com.fame.exception.base;

import com.fame.util.codes.StatusCodes;

/**
 * @author ekansh
 * @since 20/1/16
 */
public class BaseException extends RuntimeException {

    public BaseException(){
        super(StatusCodes.BASE_EXCEPTION);
    }

    public BaseException(String message){
        super(message);
    }

}
