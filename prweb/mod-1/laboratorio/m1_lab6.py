'''
Exibe o partido a soma dos votos de seus cadidatos.
'''

from  lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)
partidos = {}
partidos1 = {}
total = 0

for linha in tabela[1:] :
  partido = linha[1]
  n_voto = int((float(linha[2].split(" ")[0]))*1000)

  if partido in partidos :
    partidos[partido] = partidos[partido] + n_voto
  else :
    partidos[partido] = n_voto

  total = total + n_voto

for linha in tabela[1:] :
  partido = linha[1]

  if partido in partidos1 :
    partidos1[partido] += 1
  else :
    partidos1[partido] = 1

for partido in partidos :
  print(partido + ' com total de ' + str(partidos[partido]) + ' votos e ' + str(partidos1[partido]) + ' vereadores' )

print('\nTotal : ' + str(total) + ' votos.')