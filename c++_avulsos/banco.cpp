#include <iostream>
#include "banco.h"
#include <sqlite3.h>

void Banco::depositar(float _saldo, float _deposito){
    deposito = _deposito; 
}

void Banco::sacar(float _saldo, float _saque){
    saque = _saque
    std::cout << "Quantos R$ Voce gostaria de Sacar? ";
    std::cin << _saque;
    saque -= saque;

}


void Database::abrirBanco(){
    sqlite3_open("banco.db", &db);
    const char* sql = "CREATE TABLE IF NOT EXISTS banco(login TEXT UNIQUE, senha NUMERIC, saldo REAL);";
    sqlite3_exec(db, sql, 0,0,0);
}

void Database::insertConta(std::string _login, int _senha, float _saldo){
    sqlite3_stmt* stmt;

    login = _login;
    senha = _senha;

    saldo = 0;
    const char* sql = "INSERT INTO banco (login, senha, saldo) VALUES (?,?,?);"; //insert parametros desejados (?,?,?)
    sqlite3_prepare_v2(db, sql, -1, &stmt, NULL);

    sqlite3_bind_text(stmt, 1, _login.c_str(), -1, SQLITE_STATIC); // insert login 
    sqlite3_bind_int(stmt,2, _senha); //insert senha
    sqlite3_bind_double(stmt,3, _saldo);//insert saldo

    int resultado = sqlite3_step(stmt); //execucao
    if (resultado != SQLITE_DONE){
        std::cout << "Login ja existente, Tente Novamente";
    }
    sqlite3_finalize(stmt); //finaliza e limpa a memoria
}
 