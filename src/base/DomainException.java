package base;

public class DomainException extends RuntimeException {
    private static final long serialVersioUID = 1L;

    public DomainException(String mensagem){
        super(mensagem);
    }
}

