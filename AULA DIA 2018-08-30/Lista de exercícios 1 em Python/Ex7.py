# -*- coding: cp1252 -*-
print "Insira os valores abaixo: "
salarioFixo = input("Salário fixo: ")
vendas = input("Valor das vendas: ")
comissao = vendas*0.04
salarioFinal = salarioFixo+comissao
print "Dados de Pagamento do Vendedor"
print "Salário Fixo: "+str(salarioFixo)
print "Vendas total: "+str(vendas)
print "Comissão: "+str(comissao)
print "Salário Final: "+str(salarioFinal)
