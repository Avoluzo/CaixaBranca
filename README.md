# CaixaBranca
Atividade caixa branca, matéria qualidade e testes de software, utilizando java

 Pontos de Entrada e Saída:

ENTRADA:

verificarUsuario(String login, String senha): Recebe o login e senha do usuário como parâmetros.


SAÍDA:

boolean result: Retorna true se o usuário for encontrado e false caso contrário.

String nome: Contém o nome do usuário encontrado, caso o login seja bem-sucedido.

Nós e Arestas:

NÓS:

iniciar: Representa o início da execução do sistema.

conectarBD(): Representa a tentativa de conexão com o banco de dados.

Tentar conectar ao BD: Indica o resultado da tentativa de conexão.

Conexão bem-sucedida: Representa o sucesso da conexão com o banco de dados.



ARESTAS:

iniciar -> conectarBD(): Inicia a tentativa de conexão com o banco de dados.

Tentar conectar ao BD -> Conexão bem-sucedida: Indica o sucesso da conexão.

Conexão bem-sucedida -> Criar consulta SQL: Prossegue para a criação da consulta SQL.

Criar consulta SQL -> Executar consulta: Executa a consulta SQL criada.

Executar consulta -> Usuário encontrado?: Verifica se o usuário foi encontrado na consulta.

Usuário encontrado? -> Definir nome e resultado como true: Define o nome e o resultado como true se encontrado.

Usuário encontrado? -> Definir resultado como false: Define o resultado como false se o usuário não for encontrado.

Definir nome e resultado como true -> Retornar true/false: Retorna true se o usuário for encontrado.

Definir resultado como false -> Retornar true/false: Retorna false se o usuário não for encontrado.



Análise dos Caminhos:



Caminho 1 (Usuário encontrado):

Iniciar o sistema

Tentar conectar ao banco de dados (conexão bem-sucedida)

Criar consulta SQL para verificar o usuário

Executar a consulta SQL

Usuário encontrado

Definir nome e resultado como true

Retornar true/false (true)



Caminho 2 (Usuário não encontrado com conexão bem-sucedida):

Iniciar o sistema

Tentar conectar ao banco de dados (conexão bem-sucedida)

Criar consulta SQL para verificar o usuário

Executar a consulta SQL

Usuário não encontrado

Definir resultado como false

Retornar true/false (false)



Caminho 3 (Falha na conexão com o banco de dados):

Iniciar o sistema

Tentar conectar ao banco de dados (conexão falhou)








