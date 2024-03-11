# Desafio Final - Formação em Desenvolvimento Web Java - Módulo II
## Biblioteca Virtual
Bem-vindo à aplicação Biblioteca Virtual, desenvolvida como parte do Desafio Final da Formação em Desenvolvimento Web Java - Módulo II da Ada Tech.

### Resumo da Aplicação
A Biblioteca Virtual é uma aplicação de gerenciamento de livros, membros e empréstimos. Através desta aplicação, é possível realizar operações CRUD (Create, Read, Update, Delete) para as entidades principais: Livro, Membro e Empréstimo.

#### Endpoints Disponíveis
#### Livros
:

#### Método: GET
- Listar todos os livros
- Endpoint: /livros(http://localhost:8080/livros)
- Buscar todos os livros
- ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/65462642-062d-4ee5-aef5-a9c14842fe94)


- Endpoint: /livros/{id}
- Buscar livro por ID:(http://localhost:8080/livros/5)
-  ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/747eeaa8-e349-47f8-9505-fcc1825f01cd)
Criar um novo livro:

#### Método: POST
- Criar Novo Livro (http://localhost:8080/livros)
- Corpo da Requisição: Objeto Livro
- Atualizar informações de um livro:
![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/448d0808-3cf6-4f7c-8b1b-a1578c09fec8)


### Método: PUT
- Atualizar Livro por ID
- Endpoint: /livros/{id}(http://localhost:8080/livros/)
- Corpo da Requisição: Objeto Livro
![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/d1361145-e3dd-4d9d-b794-c9bb16860d33)

:

### Método: DELETE
- Deletar Livro por ID
- Excluir um livro
- Endpoint: /livros/{id}(http://localhost:8080/livros/26)
- ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/a727eb13-3747-4743-9cd2-699058b06808)


- 
### Membros
### Listar todos os membros:
- Método: GET
- URL: http://localhost:8080/membros(http://localhost:8080/membros)
- ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/d4fcb8f4-4185-4729-a8d3-c9653594d524)

### Método: GET
- Endpoint: /membros
- Buscar membro por ID:

- Método: GET
- Endpoint: /membros/{id}
- URL: http://localhost:8080/membros/{id} ()
- Criar um novo membro:

### Método: POST
- Endpoint: /membros
- Corpo da Requisição: Objeto Membro
- Atualizar informações de um membro:

### Método: PUT
- Endpoint: /membros/{id}
- Corpo da Requisição: Objeto Membro
- Excluir um membro:

### Método: DELETE
- Endpoint: /membros/{id}
