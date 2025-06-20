package joshiBack.miBack.controllers;


import org.springframework.web.bind.annotation.*;
import joshiBack.miBack.payload.request.AlumnoRequest;
import joshiBack.miBack.payload.response.AlumnoResponse;
import joshiBack.miBack.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "*")
public class AlumnoController {
    @Autowired private AlumnoService service;

    @GetMapping public List<AlumnoResponse> getAll() { return service.getAll(); }

    @PostMapping public AlumnoResponse create(@RequestBody AlumnoRequest req) { return service.save(req); }

    @PutMapping("/{id}") public AlumnoResponse update(@PathVariable Long id, @RequestBody AlumnoRequest req) {
        return service.update(id, req);
    }

    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
