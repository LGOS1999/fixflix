package classes;
public class Parametro
{
    int       pos[] = new     int[100];
    String  texto[] = new  String[100];
    boolean  bool[] = new boolean[100];
    float     num[] = new   float[100];
    String palavra;
    int numero;
    boolean booleano;
    int x=0;
    
    void ZeraVet()
    {
        
        for(x=0;x<100;x++)
        {
           this.pos[x]=0;
        }
        
    }
    
    
}
