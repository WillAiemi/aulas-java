# -*- coding: cp1252 -*-
print "Informe os sal�rios"
salarioMinimo = input("Sal�rio M�nimo: ")
salario = input("Sal�rio: ")
nDeSalariosMinimos = salario/salarioMinimo
round(salario,2)
round(salarioMinimo, 2)
round(nDeSalariosMinimos,2)
print "Dados Salariais"
print "Sal�rio M�nimo: R$%.2f" % salarioMinimo
print "Sal�rio: R$%.2f" % salario
print "Quantidade de sal�rios m�nimos: %.2f" % nDeSalariosMinimos
