#include "aluno.h"
class Hash{
    private:
    int FuncaoHash(Aluno aluno);
    int max_Itens; // maximo de itens q podemos colocar no vetor
    int max_Posicoes; //posicao maxima q temos (max vetor)
    int qnt_Itens; //quantos itens colocados no vetor
    Aluno* estrutura; //vetor aonde tera as hash, possuindo elementos de Aluno*

    public:
    Hash(int tamanho_vetor, int max);
    ~Hash();
    bool full();
    int TamanhoAtual();
    void Inserir(Aluno aluno); // Objeto da classe aluno que sera inserido na hash
    void Remover(Aluno aluno); // Objeto que sera deletado da hash
    void Buscar(Aluno& aluno, bool& busca); //Aluno& busca o aluno por ref = 
    //para sempre entrar como um aluno novo(diferentes buscas)
    //bool comeca com false,caso encontre se torna true e retorna o dado do aluno
    void print(); 
};