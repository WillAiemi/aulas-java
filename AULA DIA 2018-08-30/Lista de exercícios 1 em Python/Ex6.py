print "Insira os valores A, B e C abaixo:"
a = input("A: ")
b = input("B: ")
c = input("C: ")
delta = (b**2-4*a*c)
x1 = (-b+delta**0.5)/(2*a)
x2 = (-b-delta**0.5)/(2*a)
print "x' = " + str(x1)
print "x'' = " + str(x2)
