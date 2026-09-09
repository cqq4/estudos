import sqlite3 

def create_table():
    conn = sqlite3.connect('Tabela.db')
    cursor = conn.cursor()
    cursor.execute('''
    CREATE TABLE IF NOT EXISTS DADOS
    (
    dds_name varchar(50),
    dds_preco varchar(50),
    dds_qntd  varchar(50)
    )''')
    conn.commit()
    conn.close()

def add_user():
    name = input('Insira o Nome do produto: ')
    preco = input('Insira o preco do produto: ')
    qntd = input('Insira a quantidade do produto: ')
    conn = sqlite3.connect('Tabela.db')
    cursor = conn.cursor()
    cursor.execute('''
    INSERT INTO Dados(dds_name, dds_preco,dds_qntd)
    VALUES (?,?,?)
    (name, preco, qntd)
    ''', (name,preco,qntd))
    conn.commit()
    conn.close()

def show_table():
    conn = sqlite3.connect('Tabela.db')
    cursor = conn.cursor()
    cursor.execute('''
    SELECT * FROM Dados
    ''')
    produtos = cursor.fetchall()
    print("\n--- PRODUTOS CADASTRADOS ---")
    for linha in produtos:
        print(f"Nome: {linha[0]} | Preço: {linha[1]} | Qtd: {linha[2]}")
    print("----------------------------\n")
    
    conn.commit()
    conn.close()


if __name__ == '__main__':
    create_table()
    add_user()
    select = input('Deseja Mostrar os dados Cadastrados? [1]Sim [2]Nao ')
    if select == '1':
        show_table()
    if select == '2':
        print('Tabom simata')
    else:
        print('Insira uma Resposta valida')
    