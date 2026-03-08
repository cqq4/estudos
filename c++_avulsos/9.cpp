#include <iostream>
#include <iomanip>
int main(){
    float r;
    std::cout << "Quantos reais voce tem na carteira? ";
    std::cin >> r;
    std::cout << std::fixed << std::setprecision(2);
    std:: cout << "Com " << r << "R$, voce consegue comprar " << r/5.14 << " Dolares ";
}