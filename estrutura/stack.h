//define a class
typedef int TipoItem; //define q o int tb pode ser nomeado comO TipoItem
const int max_itens = 100; //maximo de itens no vetor
class stack{
    private:    
    int tamanho;
    TipoItem* estrutura;

    public: //chama as funcoes
    stack(); //funcao construct precisa do msm nome da class
    ~stack(); //para deletar a pilha 
    bool cheio(); // se retorna true esta cheia, false ainda cabe
    void inserir(TipoItem item); 
    TipoItem remove();
    void print();
    TipoItem tam();
};