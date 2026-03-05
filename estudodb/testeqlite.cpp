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
void push(int id_produto);
void update();
void del_create();
sqlite3 *db;
char * mensagem_erro = 0;

//main
int main(){
    connection();
    log();
    int id_produto;
    std::cout << "Qual o id do produto que voce gostaria de ver:";
    std::cin >> id_produto;
    push(id_produto);
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
void push(int id_produto){
    sqlite3_stmt * handle_sql = 0;
    const char *push = "select * from loja where id = ?";
    int rc = sqlite3_prepare_v2(db, push, -1, &handle_sql, 0);
    if (rc != SQLITE_OK){
        std::cout << "Nao foi possivel achar o registro\n" << sqlite3_errmsg(db);
        sqlite3_close(db);
    }

    rc = sqlite3_bind_int(handle_sql, 1, id_produto);

    if (rc !=SQLITE_OK){
        std::cout << "deu erro denovo!\n" << sqlite3_errmsg(db);
    }


    rc= sqlite3_step(handle_sql);

    if(rc == SQLITE_ROW){
        std::cout << sqlite3_column_text(handle_sql, 2);
    }
    sqlite3_finalize(handle_sql);
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

void del_create(){
    const char *del_create = "DROP TABLE IF EXISTS loja;" "CREATE TABLE loja ( id INTEGER PRIMARY KEY, nome TEXT, preco NUMERIC);";
    int rc = sqlite3_exec(db, del_create, 0, 0, &mensagem_erro );
    if (rc != SQLITE_OK){
        std::cout << "nao foi possivel concluir a alteracao! ";
        sqlite3_close(db);
    }else{
        std::cout << "Tudo ok !";
    }
}