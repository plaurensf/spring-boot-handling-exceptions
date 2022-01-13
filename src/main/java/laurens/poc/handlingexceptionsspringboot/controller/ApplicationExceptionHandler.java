package laurens.poc.handlingexceptionsspringboot.controller;

import laurens.poc.handlingexceptionsspringboot.entities.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ProductException> handleException(Exception e){
        ProductException productException = new ProductException(404, "Products are not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(productException);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ProductException> handleSpecifiedException(RuntimeException ex, HttpServletRequest request){
        final Map<String, String> pathVariables = (Map<String, String>) request.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
        ProductException productException = new ProductException(505, String.format("Product with id %s is not found", pathVariables.get("id")));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(productException);
    }

}
