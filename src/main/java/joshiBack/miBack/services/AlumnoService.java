package joshiBack.miBack.services;

import joshiBack.miBack.payload.request.AlumnoRequest;
import joshiBack.miBack.payload.response.AlumnoResponse;
import java.util.List;




public interface AlumnoService {
    List<AlumnoResponse> getAll();
    AlumnoResponse save(AlumnoRequest request);
    AlumnoResponse update(Long id, AlumnoRequest request);
    void delete(Long id);

 

}

