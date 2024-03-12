# Desafio Final - Formação em Desenvolvimento Web Java - Módulo II
## Ser + Tech Programa 50+ Turma - 1076
## Professores: Alex Facincani e Luis Carlos Cardoso

## Sistema de Biblioteca:

### Gestão de Livros
- **Must have**
  - Criar, visualizar, atualizar e deletar (CRUD) livros.
  - Informações de um livro podem incluir, mas não se limitam a: título, autor, ano de publicação, ISBN...

#### Gestão de Membros
- Criar, visualizar, atualizar e deletar (CRUD) membros.
- Informações de um membro podem incluir, mas não se limitam a: nome, endereço, contato...

- **Nice to have**
  - Gestão de Empréstimos
  - Registrar empréstimos de livros aos membros.
  - Definir prazo para devolução e gerenciar multas por atraso

### Resumo da Aplicação
A Biblioteca é uma aplicação de gerenciamento de livros, membros e empréstimos. Através desta aplicação, é possível realizar operações CRUD (Create, Read, Update, Delete) para as entidades principais: Livro, Membro e Empréstimo.

#### Endpoints Disponíveis

#### Livros:

#### Método: GET
- Listar todos os livros
  - Endpoint: /livros (http://localhost:8080/livros)
  - Buscar todos os livros
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/65462642-062d-4ee5-aef5-a9c14842fe94)

- Endpoint: /livros/{id}
  - Buscar livro por ID: (http://localhost:8080/livros/5)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/747eeaa8-e349-47f8-9505-fcc1825f01cd)

#### Método: POST
- Criar Novo Livro (http://localhost:8080/livros)
  - Atualizar informações de um livro:
  ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/448d0808-3cf6-4f7c-8b1b-a1578c09fec8)

#### Método: PUT
- Atualizar Livro por ID
  - Endpoint: /livros/{id} (http://localhost:8080/livros/)
  ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/d1361145-e3dd-4d9d-b794-c9bb16860d33)

#### Método: DELETE
- Deletar Livro por ID
  - Excluir um livro
  - Endpoint: /livros/{id} (http://localhost:8080/livros/26)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/a727eb13-3747-4743-9cd2-699058b06808)

### Membros:

#### Método: GET
- Listar todos os membros:
  - URL: http://localhost:8080/membros (http://localhost:8080/membros)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/d4fcb8f4-4185-4729-a8d3-c9653594d524)

#### Método: GET
- Buscar Todos os Membros
  - Endpoint: http://localhost:8080/membros (http://localhost:8080/membros)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/c6225902-1685-4a13-904f-97a64378d159)

- Buscar membro por ID:
  - Método: GET
  - Endpoint: http://localhost:8080/membros/{id} (http://localhost:8080/membros/11)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/4654ce76-6c9d-476c-aeb3-c51126493b44)

#### Método: POST
- Endpoint: /membros
  - Criar um novo membro:
  - Endpoint: http://localhost:8080/membros
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/aa0d103f-b29f-4fd0-bc96-e162bc3731f6)

#### Método: PUT
- Atualizar Membro por ID
  - Método: PUT
  - URL: http://localhost:8080/membros/{id} (Localhost:8080/membros/15)
  ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/ff92efa5-617b-439f-afc2-49bec2806574)

#### Método: DELETE
- Deletar Membro por ID
  - Endpoint: URL: http://localhost:8080/membros/{id} (Localhost:8080/membros/15)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/de695124-2f3e-47ea-9238-71427f5a6f86)

### Empréstimos:

- Listar Todos os Empréstimos
  #### Método: GET
  - URL: http://localhost:8080/emprestimos
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/341c4422-9e03-40c6-8abb-82d95e0eb9f7)

- Buscar Empréstimo por ID
  - Método: GET
  - URL: http://localhost:8080/emprestimos/{id} (http://localhost:8080/emprestimos/3)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/1d1510a5-956e-478f-93c1-1d1836d6aee8)

- Criar Novo Empréstimo
  - Método: POST
  - URL: http://localhost:8080/emprestimos
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/f321c12a-6f31-4198-8fd8-8733e2f089dc)

- Realizar Devolução
  - Método: PUT
  - URL: http://localhost:8080/emprestimos/{id}/devolucao (http://localhost:8080/emprestimos/12/devolucao)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/f46ff1cc-45a4-454b-b7ac-4eeaff712035)

- Deletar Empréstimo por ID
  - Método: DELETE
  - URL: http://localhost:8080/emprestimos/{id} (http://localhost:8080/emprestimos/3)
  - ![image](https://github.com/teofilonicolau/com_biblioteca_ada/assets/97030160/fb6764b1-e908-474d-a974-34b8415359fa)
