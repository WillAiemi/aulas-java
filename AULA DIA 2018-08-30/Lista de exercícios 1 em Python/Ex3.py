# -*- coding: cp1252 -*-
print "Dados para a viagem"
precoLitro = input("Pre�o por litro: ")
autonomia = input("Km por litro de combust�vel: ")
distancia = input("Distancia a percorrer(em Km): ")
litrosTotal = distancia/autonomia
gastoTotal = litrosTotal*precoLitro
print "Dados da Viagem"
print "
