package laurens.poc.handlingexceptionsspringboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductException {

    private int errorCode;
    private String message;

}
