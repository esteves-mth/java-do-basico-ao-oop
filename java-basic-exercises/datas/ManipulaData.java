import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManipulaData {
    
    public static void main(String[] args) {
        LocalDate minhadata = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = minhadata.format(format);
        System.out.println(data);
    }

}
