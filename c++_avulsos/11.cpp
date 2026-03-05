#include <iostream>
void nums(int &a, int &b, int &c);
int main (){
    int a, b, c;
    std::cout << "Qual o valor de A ? ";
    std::cin >> a;
    while(a == 0){
        std::cout << "0 Nao e um valor valido " << std::endl;
        std::cout << "Informe um valor valido: ";
        std::cin >> a;
    }
    std::cout << "Qual o valor de B?: ";
    std::cin >> b;
    std::cout << "Qual o valor de C?: ";
    std::cin >> c;
    nums(a,b,c);
};
void nums(int &a, int &b, int &c){
    int b1 = b*b;
    int ac = 4*a*c;
    int sub = b1 - ac; 
    std::cout << "O valor de Delta seria: " << sub;
}
