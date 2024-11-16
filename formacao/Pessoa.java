package formacao;
/**
 * Escreva a descrição da classe pessoa aqui.
 * 
 * @author Rui Pereira 
 * @version 1.0
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int Idade;
    private String Nome;
    private String Apelido;
    // private Date Nascimento;


    /**
     * COnstrutor para objetos da classe pessoa
     */
    public Pessoa()
    {
        // inicializa variáveis de instância
        this.Idade = 0;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int sampleMethod(int y)
    {
        // ponha seu código aqui
        return this.Idade + y;
    }
}
