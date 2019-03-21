'''

descricao: listar os partidos eleitos em ordem alfabetica e comecando com partido: XXX
'''

from lib.scrapy_table import Scrapy_Table as st

link = "https://pt.wikipedia.org/wiki/C%C3%A2mara_Municipal_de_S%C3%A3o_Paulo"
conexao = st(link)
tabela = conexao.get_tables(5)
partidos = set()

for linha in tabela[1:] :
    partidos.add(linha[1])

partidos = (sorted(partidos))

for partido in partidos :
    print('partido: ' + partido)