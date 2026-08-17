package duoc.cl.actividad1.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class HolaMundoV1 {
    @GetMapping
    public String holaMundo() {
        return "Hola Mundo";
    }
    //aqui habia un bug porque decia la version del codigo
    @PostMapping
    public String Despedida() {
        return "Adios Mundo";
    }

}
