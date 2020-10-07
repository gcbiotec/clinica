package br.com.fundatec.clinica.config;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public ApiError onException(Exception exception) {
//        return new ApiError("INTERNAL_SERVER_ERROR", extractMessage(exception));
//    }

    private String extractMessage(Throwable exception) {
        if (exception.getCause() == null && exception.getMessage() != null) {
            return exception.getMessage();
        } else if (exception.getCause() == null && exception.getMessage() == null) {
            return "";
        } else {
            return exception.getCause().getLocalizedMessage();
        }
    }
}
