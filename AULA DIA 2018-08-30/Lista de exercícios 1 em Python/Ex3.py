# -*- coding: cp1252 -*-
print "Dados para a viagem"
precoLitro = input("Preço por litro: ")
autonomia = input("Km por litro de combustível: ")
distancia = input("Distancia a percorrer(em Km): ")
litrosTotal = distancia/autonomia
gastoTotal = litrosTotal*precoLitro
print "Dados da Viagem"
print "
