#include <string>

class Pessoa{
 protected:
    int idade;
    std::string nome;
    
 public:
    Pessoa(int _idade, std::string _nome);
    ~Pessoa();
    virtual void mostra();
};

class Cliente : public Pessoa{
    private:
        int salario;
        public:
        Cliente(int _idade, std::string _nome, float _salario);
        void mostra();
};
