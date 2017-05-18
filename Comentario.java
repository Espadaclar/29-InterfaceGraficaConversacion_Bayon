public class Comentario 
{
  private String nombre;
  private String comentario;
  
  public Comentario(String nombre, String comentario) 
  {
        this.nombre = nombre;
        this.comentario = comentario;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public String getComentario(){
    return comentario;
  }
  
  
  
}