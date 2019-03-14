'''

apresenta o partido com mais candidatos os eleitos o total de votos
'''

from lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)
partidos = {}
total = 0

for linha in tabela[1:] :
  partido = linha[1]

  if partido in partidos :
    partidos[partido] += 1
  else :
    partidos[partido] = 1

qtd_vereadores = 0
nome_partido = 0

for part in partidos :
  if partidos[part] > qtd_vereadores :
    nome_partido   = part
    qtd_vereadores =  partidos[part] 
            
print('\n' + nome_partido + ' com ' + str(qtd_vereadores) + ' vereadores votados, sendo eles: \n') 

for linha in tabela[1:] :
  if linha[1] == nome_partido :
    voto = linha[2]
    num = voto.split(" ")

    print(linha[0] + ' com ' + num[0] + ' votos')