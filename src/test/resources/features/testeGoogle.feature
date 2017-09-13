# language: pt
  @testeUm
  Funcionalidade: fazer pesquisa no google

    Cenario: Pesquisar no google
      Dado que eu acesse a pagina inicial do google
      Quando informar no campo de busca o valor "teste"
      E clicar em pesquisar
      Então deve trazer o resultado