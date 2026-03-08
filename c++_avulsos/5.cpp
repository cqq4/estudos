#include <iostream>
int main(){
    float n1, n2;
    std::cout << "Qual foi a sua primeira nota: ";
    std::cin >> n1;
    std::cout << "Qual foi sua segunda nota: ";
    std::cin >> n2;
    std::cout << "A sua media de nota foi: " << (n1 + n2)/2;
}