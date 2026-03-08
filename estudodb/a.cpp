#include <iostream>
#include "sqlite3.h"
#include <string>

int retorno(void *NotUsed, int argc, char **argv, char **coluna){
    for(int i= 0; i < argc; i++){
        std::cout << coluna[i] << "=" 
        << (argv[i] ? argv[i]: "NULL");
    }
    std::cout << "\n";
    return 0;
}

sqlite3*db_preco;
sqlite3*db_login;
void conect();
void conect_login();
bool login(std::string log, std::string senha);

int main(){
std::string log;
std::string senha;
conect();
login(log, senha);
std::cout << "Ola, Por favor me informe qual seu login:";
std::cin >> log;
std::cout << "Informe Sua Senha:";
std::cin >> senha;


return 0;
}

void conect(){
    int rc = sqlite3_open("reg.db", &db_preco);
    const char *create = 
    "CREATE TABLE reg(id INTEGER PRIMARY KEY AUTOINCREMENT, num NUMERIC)";
    sqlite3_exec(db_preco, create, 0, 0,0);
    if (rc != SQLITE_OK){
        std::cout << "Erro";
    }
}

void conect_login(){
    sqlite3_open("login.db", &db_login);

    const char *conect_log = 
    "create table conect_log('id INTEGER PRIMARY KEY AUTOINCREMENT, login TEXT UNIQUE,senha TEXT);";

    sqlite3_exec(db_login,conect_log, 0,0,0);
}

bool login(std::string log, std::string senha){
    sqlite3_stmt * handle_sql = 0;
    sqlite3_open("login.db", &db_login);
    const char *login_add = "select 1 from login where login = ? and senha = ? ";
    sqlite3_prepare_v2(db_login, login_add, -1, &handle_sql, 0);

    sqlite3_close(db_login);

    sqlite3_bind_text(handle_sql, 1, log.c_str(), -1, SQLITE_TRANSIENT);
    sqlite3_bind_text(handle_sql, 2, log.c_str(), -1, SQLITE_TRANSIENT);

    sqlite3_step(handle_sql);
    sqlite3_finalize(handle_sql);
    return 0;
}