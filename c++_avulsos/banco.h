#include <string>
#include <sqlite3.h>
class Banco{
    protected:
        float saldo, deposito, saque;
        int numeroconta;
        std::string nomeTitular;

    public:
        void depositar(float _saldo, float _deposito);
        void sacar(float _saldo, float _saque);
        int consultarSaldo();
        int mostrarDados();
};

class Database : public Banco{
    private:
        int senha;
        std::string login;
        sqlite3 *db;
    public:
        void abrirBanco();
        void insertConta(std::string _login, int _senha, float _saldo);
        void buscaConta(std::string _login);

};
