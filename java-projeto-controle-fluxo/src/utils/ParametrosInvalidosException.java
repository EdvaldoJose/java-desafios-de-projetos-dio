package utils;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {
    public String getMessage() {
        return "O segundo parametro deve ser maior que o primeiro";
    }
}
