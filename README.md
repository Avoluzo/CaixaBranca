# CaixaBranca
Atividade caixa branca, matéria qualidade e testes de software, utilizando java

erros encontrados:

1- Falta de verificação de erros, O código não verifica se há erros durante a conexão com o banco de dados ou a execução da string SQL. Isso pode ser corrigido utilizando um bloco "try-catch".

2- O código não gerencia bem, a utilização de recursos, não fecha a conexão com o banco de dados quando ela não é mais necessária. Isso pode ser feito usando um bloco finally no método verificarUsuario().

3- Repetição de código. O código duplica a lógica para conectar ao banco de dados nos métodos conectarBD() e verificarUsuario(). Essa lógica pode ser refatorada para um método separado que pode ser chamado por ambos os métodos.

4- Exposição da senha do usuário, está sendo armazenada diretamente no código como uma string literal . Isso é extremamente inseguro, pois expõe a senha no código fonte

5- Não existe validação de senha. O código não valida os dados de entrada (login e senha) antes de serem utilizados na consulta SQL. Pode ser corrigido adicionando estruturas de decisão e condições de validação
