# MovieTracker

API Rest do projeto MovieTracker - Tenha controle dos filmes que você assistiu!

## Requisitos

- [] CRUD de Filmes
- [] CRUD de Usuários
- [] Autenticação
- [] Dashboard
- [] Reviews

## Documentação

### Endpoints

verbo (caminho REST) + recurso

- [Listar Filmes](#listar-filmes)
- [Cadastrar Filme](#cadastrar-filmes)
- [Apagar Filme](#apagar-filme)
- [Detalhar Filme](#detalhar-filme)
- [Atualizar Filme](#atualizar-filme)


### Listar Filmes

`GET` /filme

Retorna um array com todos os filmes cadastrados pelo usuário atual.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Brilho Eterno de uma Mente Sem Lembranças",
        "gênero": "Drama",
        "ano de lançamento": 2004,
        "duração": 108,
        "classificação indicativa": 14,
        "diretor": "Michel Gondry",
        "roteirista": "Charlie Kaufman",
        "produtor": ["Steve Golin", "Anthony Bregman"],
        "capa": "imagem da capa"
    }
]
```

#### Códigos de Resposta

| código | descrição |
|--------|-----------|
|200| Filmes retornados com sucesso
|401| Não autorizado. Realize a autenticação em /login

---

### Cadastrar Filmes

`POST` /filme

Cadastra um filme com os dados enviados no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|--------
|nome|string|✅| Título do filme
|gênero|string|✅| Gênero do filme
|ano de lançamento|int|✅| O ano em que o filme foi lançado
|duração|int|✅| Duração do filme em minutos
|classificação indicativa|int|❌| Faixa etária para a qual o filme não é recomendado
|diretor|string|❌| O nome do diretor do filme
|roteirista|string|❌| O nome do roteirista do filme
|produtor|string|❌| O nome do produtor do filme
|capa|img|❌| Imagem de capa

```js
{
    "id": 1,
    "nome": "Brilho Eterno de uma Mente Sem Lembranças",
    "gênero": "Drama",
    "ano de lançamento": 2004,
    "duração": 108,
    "classificação indicativa": 14,
    "diretor": "Michel Gondry",
    "roteirista": "Charlie Kaufman",
    "produtor": ["Steve Golin", "Anthony Bregman"],
    "capa": "imagem da capa"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Brilho Eterno de uma Mente Sem Lembranças",
    "gênero": "Drama",
    "ano de lançamento": 2004,
    "duração": 108,
    "classificação indicativa": 14,
    "diretor": "Michel Gondry",
    "roteirista": "Charlie Kaufman",
    "produtor": ["Steve Golin", "Anthony Bregman"],
    "capa": "imagem da capa"
}
```

#### Código de Resposta

| código | descrição |
|--------|-----------|
|201| Filme cadastrado com sucesso
|400| Validação falhou. Verifique os dados enviados no corpo da requisição
|401| Não autorizado. Realize a autenticação em /login

---

### Apagar Filme

`DELETE` /filme/`{id}`

Apaga o filme com o `id` informado no parâmetro de path.

#### Código de Resposta

| código | descrição |
|--------|-----------|
|204| Filme apagado com sucesso
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe filme com o `id` informado


---

### Detalhar Filme

`GET` /filme/`{id}`

Retorna os dados do filme com o `id` informado no parâmetro de path.


#### Exemplo de Resposta

```js
// requisição /filme/1
{
    "id": 1,
    "nome": "Brilho Eterno de uma Mente Sem Lembranças",
    "gênero": "Drama",
    "ano de lançamento": 2004,
    "duração": 108,
    "classificação indicativa": 14,
    "diretor": "Michel Gondry",
    "roteirista": "Charlie Kaufman",
    "produtor": ["Steve Golin", "Anthony Bregman"],
    "capa": "imagem da capa"
}
```

#### Código de Resposta

| código | descrição |
|--------|-----------|
|200| Filme retornado com sucesso
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe categoria com o `id` informado

---

### Atualizar Filme

`PUT` /filme/`{id}`

Atualiza os dados do filme com o `id` informado no path.


#### Corpo da Requisição

|campo|tipo|obrigatório|descrição
|-----|----|:-----------:|--------
|nome|string|✅| Título do filme
|gênero|string|✅| Gênero do filme
|ano de lançamento|int|✅| O ano em que o filme foi lançado
|duração|int|✅| Duração do filme em minutos
|classificação indicativa|int|❌| Faixa etária para a qual o filme não é recomendado
|diretor|string|❌| O nome do diretor do filme
|roteirista|string|❌| O nome do roteirista do filme
|produtor|string|❌| O nome do produtor do filme
|capa|img|❌| Imagem de capa

```js
{
    "id": 1,
    "nome": "Brilho Eterno de uma Mente Sem Lembranças",
    "gênero": "Drama",
    "ano de lançamento": 2004,
    "duração": 108,
    "classificação indicativa": 14,
    "diretor": "Michel Gondry",
    "roteirista": "Charlie Kaufman",
    "produtor": ["Steve Golin", "Anthony Bregman"],
    "capa": "imagem da capa"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Brilho Eterno de uma Mente Sem Lembranças",
    "gênero": "Drama",
    "ano de lançamento": 2004,
    "duração": 108,
    "classificação indicativa": 14,
    "diretor": "Michel Gondry",
    "roteirista": "Charlie Kaufman",
    "produtor": ["Steve Golin", "Anthony Bregman"],
    "capa": "imagem da capa"
}
```


#### Código de Resposta

| código | descrição |
|--------|-----------|
|200| Filme cadastrado com sucesso
|400| Validação falhou. Verifique os dados enviados no corpo da requisição
|401| Não autorizado. Realize a autenticação em /login
|404| Não existe filme com o `id` informado

---
