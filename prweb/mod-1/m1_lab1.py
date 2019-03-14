'''
  UNASP-SP
turma : CI73A-2019
aluno : Daniel de Azevedo Joveliano
ra : 99382
professor : Clodonil Honorio Trigo
laboratório : https://github.com/clodonil/Python-Fundamentals/blob/master/modulo1/Labs/code
data : 11 de Março de 2019
descricao: listar o nome e sobrenome para login no sistema da seguinte maneira - login: nome.sobrenome, tudo com letra minuscula
'''

from lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)
  
for linha in tabela[1:] :
  nome = linha[0]
  lista = linha[0].split(' ')
  tamanho = len(lista)

  if tamanho == 1 :
    print('login: ' + lista[0].lower())
  else :
    if tamanho == 2 :
      print('login: ' + lista[0].lower() + '.' + lista[1].lower())
    else :
      if tamanho == 3 :
        print('login: ' + lista[0].lower() + '.' + lista[2].lower())
      else :
        print('login: ' + lista[0].lower() + '.' + lista[3].lower())