#include <iostream>
int main(){
    float d;
    std::cout << "Digite uma distancia em metros: ";
    std::cin  >> d;
    std::cout << "A distancia de " << d <<"m corresponde a: " << std::endl << d/1000 << "km " << d/100 << "Hm" << std::endl
    << d/10 << "Dam " << d/0.1 << "dm" << std::endl << d*100 << "cm " << d*1000 << "mm"; 
}