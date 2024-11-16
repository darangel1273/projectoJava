package formacao;
/**
 * Escreva a descrição da classe Turma aqui.
 * 
 * @author Rui Pereira 
 * @version 1.0
 */
public class Turma{
    private ArrayList<Aluno> alunoS;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma() {
        alunoS =new ArrayList<Aluno>();
    }

    /**
     * Adiciona um aluno
     * 
     * @param  a   
     * @return     a soma de x com y 
     */
    public Boolean adicionar(Aluno a){
        Boolean b = false;
        try{ alunoS.add(a); b=true;}
        catch(Exception e){e.printStackTrace();b=false;}
        finally{ return b; }
    }
}
