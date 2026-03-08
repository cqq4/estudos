#include <iostream>
#include <cstring>
#include "sqlite3.h"
#include <iomanip>


//funcoes
sqlite3 *db_user;
void Registrar();
void Login();

//Abre o Banco de Dados
bool user(){
    const char *user ="CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY AUTOINCREMENT, login TEXT UNIQUE, senha TEXT);";
    sqlite3_stmt * handle_sql = 0;
    int rc = sqlite3_prepare_v2(db_user, user, -1, &handle_sql, 0);
    if(rc != SQLITE_OK){
        std::cout << "Erro ao criar a tabela " << sqlite3_errmsg(db_user);
        return false;
        //Verifica se a tabela foi preparada corretamente
    }
    rc = sqlite3_step(handle_sql);
    if(rc != SQLITE_DONE){
        std::cout << "Erro ao criar a tabela " << sqlite3_errmsg(db_user);
        //Verifica se a tabela foi criada com sucesso
    }
    sqlite3_finalize(handle_sql);
    return true;
}

int main(){
sqlite3_open("user.db", &db_user);                         //abre a tabela
user();
int opc;
std::cout << "Ola!, Faca (1) Login (2) Register para poder prosseguir\n";
std::cin >> opc;
if(opc == 1){
    Login();
}else{
    Registrar();
}
sqlite3_close(db_user);        //fecha tabela
return 0;
}

//Funcao de registro
void Registrar(){
    char login[16];           //Login com no maximo 15 char
    char senha[16];           //senha com no maximo 15 chars
    std::cout << "Insira seu Login: (Max 15 Caracteres)\n";
    std::cin >> std::setw(16) >> login;
    std::cout << "Insira sua Senha: (Max 15 Caracteres)\n";
    std::cin >> std::setw(16) >> senha;

    const char *registrar= "INSERT INTO user (login, senha) VALUES (?,?);";
    sqlite3_stmt *handle_sql;
    int rc = sqlite3_prepare_v2(db_user, registrar, -1, &handle_sql, 0);
    if(rc != SQLITE_OK){
        std::cout << "Erro no prepare: "<< sqlite3_errmsg(db_user);      //Verifica se esta o prepare esta correto (se nao estiver retorna o erro)
        return;
    }

    sqlite3_bind_text(handle_sql, 1, login, -1, SQLITE_TRANSIENT);     //binda o texto para login 
    sqlite3_bind_text(handle_sql, 2, senha, -1, SQLITE_TRANSIENT);     //binda para senha

    rc = sqlite3_step(handle_sql);
    if(rc != SQLITE_DONE){
        std::string erro = sqlite3_errmsg(db_user);                    //Caso Aconteca algum erro no registro
        if(erro.find("UNIQUE constraint failed")!= std::string::npos){
            std::cout << "Erro: Esse login ja existe!";
        }else {
            std::cout << "Erro ao Registrar";
        }   
    } else {
        std::cout << "Login realizado com sucesso!";
    }
    sqlite3_finalize(handle_sql);
}

//funcao de login
void Login(){
    char login[16];
    char senha[16];
    std::cout << "Insira seu Login: ";
    std::cin >> std::setw(16) >> login;
    std::cout << "Insira sua senha: ";
    std::cin >> std::setw(16) >> senha;

    const char *logar = "SELECT * FROM user WHERE login = ?;"; //Verifica se o Login e senha sao existentes
    sqlite3_stmt* handle_sql;
    int rc = sqlite3_prepare_v2(db_user, logar, -1 ,&handle_sql, 0);
    if (rc != SQLITE_OK){
        std::cout << "Erro Ao verificar o login" << sqlite3_errmsg(db_user);
        return;
    }

    sqlite3_bind_text(handle_sql, 1, login ,-1, SQLITE_TRANSIENT);
    sqlite3_bind_text(handle_sql, 2, senha, -1, SQLITE_TRANSIENT);
    rc = sqlite3_step(handle_sql);

    if(rc == SQLITE_ROW){ //Se Login e senha existirem, voce consegue acessar o programa caso contrario e barrado
        std::cout << "Login Realizado com sucesso!\n";
    }else{
        std::cout << "Login ou Senha incorretos";
    }
    sqlite3_finalize(handle_sql);
}
