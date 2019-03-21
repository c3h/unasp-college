'''

Lista os vereadores com seus respectivos votos e a somatoria ao final.
'''

from  lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)
total = 0

for linha in tabela[1:] :
    voto = linha[2]
    num = voto.split(" ")

    print(linha[0] + ' com ' + num[0] + ' votos')

    total = total + float(num[0])

print('\nTotal: ' + str(total) + ' votos')