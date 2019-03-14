'''

listar o partido e votos quando forem vereadores com os seguintes nomes: 'eduardo', 'joão' ou 'josé'
'''

from  lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)

for linha in tabela[1:] :
  nome = linha[0]
  l_nome = nome.split(" ")

  if l_nome[0].lower() == 'eduardo' or l_nome[0].lower() == 'joão' or l_nome[0].lower() == 'josé':
    print(nome + ' pertence ao ' + linha[1] + ' com ' + linha[2] + ' votos')