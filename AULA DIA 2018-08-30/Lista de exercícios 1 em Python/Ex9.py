# -*- coding: cp1252 -*-
print "Informe os salários"
salarioMinimo = input("Salário Mínimo: ")
salario = input("Salário: ")
nDeSalariosMinimos = salario/salarioMinimo
round(salario,2)
round(salarioMinimo, 2)
round(nDeSalariosMinimos,2)
print "Dados Salariais"
print "Salário Mínimo: R$%.2f" % salarioMinimo
print "Salário: R$%.2f" % salario
print "Quantidade de salários mínimos: %.2f" % nDeSalariosMinimos
