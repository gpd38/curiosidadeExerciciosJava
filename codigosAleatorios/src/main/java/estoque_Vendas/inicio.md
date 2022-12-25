#include <iostream>

using namespace std;

int main()
{
    //Menu de opções que o usuário escolhe qual deseja executar
    int opcao;

    cout << "[1] Cadastrar Vendedor.\n";
    cout << "[2] Cadastrar Produtos.\n";
    cout << "[3] Realizar Venda.\n";
    cout << "[4] Relatorio.\n";

    cin >> opcao;

    do{
        switch (opcao) {
            case 1: 
                cadastrarVendedor();
                break;
            case 2: 
                cadastrarProduto();
                break;
            case 3: 
                vender();
                break;
            case 4: 
                relatorio();
                break;
            default:
                cout << "Opcao Inválida.\n";
        }
    } while (opcao < 1 || opcao > 4); 

}// fim main

void cadastrarVendedor(){
    
    int qtdNome = 5;
    int tamNome = 15;
    char vetNome[qtdNome][tamNome];

    for(int i = 0; i < 5; i++){
        cout << "Digite o nome do vendedor.\n";
        cin >> opcao;
    }
     

    cin >> opcao;
}

void cadastrarProduto(){
    
}

void vender(){
    
}

void relatorio(){
    
}