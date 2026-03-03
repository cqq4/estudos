#include <iostream>
#include "sqlite3.h"
//retorno
int sqlite3_retorno(void *NotUsed, int argc, char **argv, char **coluna){
    for(int i = 0; i < argc; i++){
        std::cout << coluna[i] << "="
                  << (argv[i] ? argv[i]: "NULL");
    }
    std::cout << "\n";
    return 0;
}

void log();
void connection();
void push();
void update();
sqlite3 *db;
char * mensagem_erro = 0;

//main
int main(){
    int choice;
    connection();
    log();
    std::cout << "\n Gostaria de vizualizar o registro adicionado ? \n" << " [1]Sim \n [0]Nao";
    std::cin >> choice;
    if(choice == 1){
        push();
        std::cout << "\n Gostaria de Atualizar algum registro? \n";
        std::cin >> choice;
        if (choice == 1){
            update();
        }
    }else{
        return 0;
    }
}

//funcao de conexao
void connection(){
    int rc= sqlite3_open("loja.db", &db);
    const char *create = "CREATE TABLE loja(id INTEGER PRIMARY KEY, nome TEXT, preco NUMERIC)";
    sqlite3_exec(db, create, sqlite3_retorno, 0, &mensagem_erro);
    if(rc != SQLITE_OK){
        std::cout << "Erro!\n" << sqlite3_errmsg(db);  
        sqlite3_free(mensagem_erro);
    }else{
        std::cout << "Tabela criada com sucesso!\n";
    }
}
//Insere o dado na tabela (Tb necessario alterar o id manualmente)
void log(){
    const char *insert = "insert into loja(id,nome,preco) "
                         "values (3, 'Teste', '200')";
    int rc = sqlite3_exec(db, insert, 0, 0, &mensagem_erro);
    if (rc != SQLITE_OK){
        std::cout << "Nao foi possivel adicionar os registros! \n";
        sqlite3_close(db);
     }else {
        std::cout << "Registros enviados com sucesso!";
     }

}
//puxa o dado com base no id (atualmente teria que alterar o id manualmente)
void push(){
    const char *push = "select * from loja where id =3";
    int rc = sqlite3_exec(db, push, sqlite3_retorno, 0, &mensagem_erro);
    if (rc != SQLITE_OK){
        std::cout << "Nao foi possivel achar o registro\n" << sqlite3_errmsg(db);
        sqlite3_close(db);
    }else{
        std::cout << "Consulta Concluida! \n";
    }
}

//Update de registro
void update(){
    const char *update = "update loja set nome ='nome legal', preco = '10' where id='2'" ;
    int rc = sqlite3_exec(db, update, 0,0, &mensagem_erro);
    if (rc != SQLITE_OK){
        std::cout << "Nao foi possivel atualizar seu registro";
        sqlite3_close(db);
    }else{
        std::cout << "Registro atualizado com sucesso";
    }
}