package hello.exception.exhandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //생성자를 자동으로 생성해준다.
public class ErrorResult {
    private String code;
    private String message;
}
