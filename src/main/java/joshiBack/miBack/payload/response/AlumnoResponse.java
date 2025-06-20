package joshiBack.miBack.payload.response;
public class AlumnoResponse {
    private Long id;
    private String nombre;
    private String carrera;
    private String correo;
    // constructor, getters

    public AlumnoResponse(Long id, String nombre, String carrera, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    


}
