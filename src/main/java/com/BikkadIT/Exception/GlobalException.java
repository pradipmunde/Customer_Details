package com.BikkadIT.Exception;

import com.BikkadIT.helper.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> exceptionHandlr(ResourceNotFoundException e){
        ApiResponse apiResponse=new ApiResponse();
        String message= e.getMessage();
        apiResponse.setMessage(message);
        apiResponse.setStatus(false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
