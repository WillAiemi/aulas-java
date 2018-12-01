# -*- coding: cp1252 -*-
print "Informe as quantidades vendidas"
latas = input("Latas: ")
garrafa600 = input("Refri 600mL: ")
garrafa2L = input("Refri 2L: ")
totalLitros = latas*0.35+garrafa600*0.6+garrafa2L*2
totalVendido = latas*1.2+garrafa600*1.8+garrafa2L*2.80
print "Quantidade de latas vendidas: "+str(latas)
print "Quantidade de refri 600mL vendidas: "+str(garrafa600)
print "Quantidade de refri de 2L vendidas: "+str(garrafa2L)
print "Foram vendidos "+str(totalLitros)+" litros"
print "Foram vendidos R$%.2f" % totalVendido + " no total"
exit()
