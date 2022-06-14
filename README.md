# Blog Pessoal

- [**Front-End**](https://github.com/nogran/Blog-Pessoal-Front-End)<br>
- [**Back-End**](https://github.com/nogran/Blog-Pessoal-Back-End)

## Tools Front-End
- [**TypeScript**](https://www.typescriptlang.org/)
- [**React.js**](https://reactjs.org/): [Material-UI](https://mui.com/), [React Router](https://reactrouter.com/), [React Redux](https://react-redux.js.org/), [React Toastify](https://www.npmjs.com/package/react-toastify)

## Tools Back-End
- [**Spring Boot**](https://spring.io/): [Maven](https://maven.apache.org/)
- [**Java**](https://www.java.com/en/)
- [**MySQL**](https://www.mysql.com/)

## Deploy Front-End
- https://nogran-blog.netlify.app/

## Deploy Back-End
- https://nogran-blog.herokuapp.com/

# Projeto Blog Pessoal

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" width="100" height="100">

<br>

## Diagrama de Classes

```mermaid
classDiagram
class Tema {
  - id : Long
  - descricao : String
  - postagem : List ~Postagem~
  + getAll()
  + getById(Long id)
  + getByDescricao(String descricao)
  + postTema(Tema tema)
  + putTema(Tema tema)
  + deleteTema(Long id)
}
class Postagem {
  - id : Long
  - titulo : String
  - texto: String
  - data: LocalDateTime
  - tema : Tema
  - usuario : Usuario
  + getAll()
  + getById(Long id)
  + getByTitulo(String titulo)
  + postPostagem(Postagem postagem)
  + putPostagem(Postagem postagem)
  + deleteTema(Long id)
}
class Usuario {
  - id : Long
  - nome : String
  - usuario : String
  - senha : String
  - foto : String
  - postagem : List ~Postagem~
  + getAll()
  + getById(Long id)
  + autenticarUsuario(UsuarioLogin usuarioLogin)
  + cadastrarUsuario(Usuario usuario)
  + atualizarUsuario(Usuario usuario)
}
class UsuarioLogin{
  - id : Long
  - nome : String
  - usuario : String
  - senha : String
  - foto : String
  - token : String
}
Tema --> Postagem
Usuario --> Postagem
```
