# -*- coding: cp1252 -*-
print "Insira os valores abaixo: "
salarioFixo = input("Sal�rio fixo: ")
vendas = input("Valor das vendas: ")
comissao = vendas*0.04
salarioFinal = salarioFixo+comissao
print "Dados de Pagamento do Vendedor"
print "Sal�rio Fixo: "+str(salarioFixo)
print "Vendas total: "+str(vendas)
print "Comiss�o: "+str(comissao)
print "Sal�rio Final: "+str(salarioFinal)
