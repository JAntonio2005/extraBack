package joshiBack.miBack.services;
import joshiBack.miBack.model.Alumno;
import joshiBack.miBack.payload.request.AlumnoRequest;
import joshiBack.miBack.payload.response.AlumnoResponse;
import joshiBack.miBack.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired private AlumnoRepository repo;

    public List<AlumnoResponse> getAll() {
        return repo.findAll().stream().map(this::toResponse).toList();
    }

    public AlumnoResponse save(AlumnoRequest req) {
        Alumno a = new Alumno();
        a.setNombre(req.getNombre());
        a.setCarrera(req.getCarrera());
        a.setCorreo(req.getCorreo());
        return toResponse(repo.save(a));
    }

    public AlumnoResponse update(Long id, AlumnoRequest req) {
        Alumno a = repo.findById(id).orElseThrow();
        a.setNombre(req.getNombre());
        a.setCarrera(req.getCarrera());
        a.setCorreo(req.getCorreo());
        return toResponse(repo.save(a));
    }

    public void delete(Long id) { repo.deleteById(id); }

    private AlumnoResponse toResponse(Alumno a) {
        return new AlumnoResponse(a.getId(), a.getNombre(), a.getCarrera(), a.getCorreo());
    }
}
