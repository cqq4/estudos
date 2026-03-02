#include <iostream>
class dados{
    private:
        float saldo = 0;
        float nSaldo =0;

    public:
        void setsaldo(float a){
            std::cout << "Quanto Voce gostaria de Depositar ?";
            std::cin >> a;
            a = nSaldo;
            nSaldo = saldo;

        }
    };
int main(){
   void setsaldo(int a);
}