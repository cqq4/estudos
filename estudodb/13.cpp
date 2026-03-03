#include <iostream>
#include "sqlite3.h"

void connection();

int main(){
    sqlite3 *db;
    sqlite3_stmt *stmt;
    sqlite3_open("loja.db", &db);

}

void connection(){
    if(sqlite3_open("loja.db", &db) == SQLITE_OK){
        sqlite3_prepare_v2(db, "CREATE TABLE IF NOT EXISTED user(name
varchar(50), roll INT, email varchar(80));", -1);
    }
}