Adicionar novo usuário
-------------------------

####User Story 1
Como gerente de compras  
Quero que o usuário possa se cadastrar no sistema  
Para que seja possivel efetuar compras online.

####Critérios de aceitação

Dado que é inserido um novo usuário  
Quando não é informado o nome  
Então sistema deve lançar a mensagem "O nome é obrigatório"  

Dado que é inserido um novo usuário  
Quando é informado o nome e tem mais que 50 caracteres  
Então sistema deve lançar a mensagem "O nome do usuário tem que ter no máximo 50 caracteres."  

Dado que é inserido um novo usuário  
Quando não é informado o email  
Então sistema deve lançar a mensagem "O email é obrigatório"  

Dado que é inserido um novo usuario  
Quando é informado o email e ja exista no sistema  
Então sistema deve lançar a mensagem "Já existe usuário com esse email"  

Dado que é inserido um novo usuário  
Quando não é informado a senha  
Então sistema deve lançar a mensagem "A senha é obrigatória"  

Dado que é inserido um novo usuário  
Quando é informado a senha e ela tem menos que 4 caracteres  
Então sistema deve lançar a mensagem "A senha deve ter no minimo 4 caracteres"



Salvar endereço do usuário pelo CEP
-------------------------

####User Story 2

####Critérios de aceitação

 
