#include "hash.h"
#include <iostream>


//Hash sem problemas de colisoes

int Hash::FuncaoHash(Aluno aluno){
    return (aluno.obterRa() % max_Posicoes); //ra do aluno modulo qtia max do vetor (resto = posicao que sera armazenado)
};

    Hash::Hash(int tamanho_vetor, int max)
{
    qnt_Itens = 0;
    max_Itens = max;
    max_Posicoes = tamanho_vetor;
    estrutura = new Aluno[tamanho_vetor]; //vetor, que tera o dado dos alunos, possui -1 e NULL que sera substituido pelo ra e nome
    //(tamanho_vetor seria seta o tamanho maximo no vetor == tamanho informado pelo usuario)
}
Hash::~Hash(){
    delete [] estrutura; // deleTE [], para destruir o vetor/estrutura
}

bool Hash::full(){
    return (qnt_Itens == max_Itens); // qd qta itens = max itens = hash cheia/completa
}

int Hash::TamanhoAtual(){
    return (qnt_Itens); // tamanho atual de itens na hash
}

void Hash::Inserir(Aluno aluno){
    int local = FuncaoHash(aluno); //descobre qual o local que o aluno sera inserido
    estrutura[local] = aluno; //supondo que nao tenha outro ra no local ele simplesmente o adiciona
    qnt_Itens++; //aumenta a quantidade de itens no vetor/ insere o aluno
}

void Hash::Remover(Aluno aluno){
    int local = FuncaoHash(aluno); //verifica em qual local o aluno esta
    if (estrutura[local].obterRa() != -1){  //verifica se tem algo la se for diferente de -1 realmente tem alguem, se for igual a -1 nao tem ninguem
        estrutura[local] = Aluno(-1, " "); //remove o aluno deixando o local novamente com -1 e NULL
        qnt_Itens--; //diminui a qnt de itens no vetor
    }
}

void Hash::Buscar(Aluno& aluno, bool& busca){
    int local = FuncaoHash(aluno); // Faz a busca do aluno requerido. //verifica o aluno 
    Aluno aux = estrutura[local]; //Recebe qual o aluno esta ocupando local que procuramos. //verifica a posicao
    if (aluno.obterRa() != aux.obterRa()){ // Se o aluno ocupando tal posicao nao tiver o msm RA q buscamos busca = false
        busca = false;
    }else{
        busca = true; //se o aluno ocupando tal posicao tiver o msm RA que procuramos retorna = true
        aluno = aux;
    }
}

void Hash::print(){
    std::cout << "Tabela Hash: \n";
    for (int i=0; i <max_Posicoes; i++){  //comeca no 0 indo ate o max de posicao para pegar todos elementos da estrutura
        if (estrutura[i].obterRa() != -1){  //Faz a separacao das casas vazias na tabela (se for diferente de -1 = (vazio) o numero e impresso 
            std::cout << i << ":" << estrutura[i].obterRa(); //i mostra ql a posicao do vetor estamos, mostra o RA
            std::cout << estrutura[i].obterNome(); //Mostra qual o nome do aluno
        }
    }
};