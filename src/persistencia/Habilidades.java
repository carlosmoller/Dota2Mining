package persistencia;
// Generated Jan 8, 2015 9:04:42 PM by Hibernate Tools 4.3.1



/**
 * Habilidades generated by hbm2java
 */
public class Habilidades  implements java.io.Serializable {


     private Long id;
     private Jogadores jogadores;
     private int level;
     private int idhabilidade;
     private int tempo;

    public Habilidades() {
    }

    public Habilidades(Jogadores jogadores, int level, int idhabilidade, int tempo) {
       this.jogadores = jogadores;
       this.level = level;
       this.idhabilidade = idhabilidade;
       this.tempo = tempo;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Jogadores getJogadores() {
        return this.jogadores;
    }
    
    public void setJogadores(Jogadores jogadores) {
        this.jogadores = jogadores;
    }
    public int getLevel() {
        return this.level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    public int getIdhabilidade() {
        return this.idhabilidade;
    }
    
    public void setIdhabilidade(int idhabilidade) {
        this.idhabilidade = idhabilidade;
    }
    public int getTempo() {
        return this.tempo;
    }
    
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }




}


