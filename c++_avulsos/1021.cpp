#include <stdio.h>
 #include <iostream>
 #include <iomanip>
 #include <cmath>
 using namespace std;
int main() {
 double n;
 cin >> n;
 int y = (int) n;
 int centavos = (int) round((n - y)* 100);
 cout << "NOTAS:" << endl;
 int notas [6] = {100,50,20,10,5,2};
 for (int i =0; i < 6; i++){
     int qtd = (y) / notas[i];
     cout << qtd << " nota (s) de R$ " << notas[i] << ".00" << endl;
     y = y%notas[i];
 }
 cout << "MOEDAS:" << endl;
 cout << y << " moeda(s) de R$ 1.00" << endl;
 int moedas [5] = {50,25,10,5,1};
 for (int i= 0; i < 5; i++){
     int qtd = centavos/moedas[i];
     cout << qtd << fixed << setprecision(2) << " moeda(s) de R$ " << moedas[i]/100.0 << endl;
     centavos = centavos%moedas[i];
 }
    return 0;
}