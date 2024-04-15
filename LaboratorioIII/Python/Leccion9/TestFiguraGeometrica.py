#Probar los codigos de las clases

from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

Cuadrado1 = Cuadrado(5, "Azul") # pasamos argumentos
print(Cuadrado1.ancho)
print(Cuadrado1.alto)
print(f" Calculo del area del cuadrado: {Cuadrado1.calcularArea()}")

# metodo mro, permite ver la gerarquia en la que se llaman los metodos
# MRO = Method Resolution Order

print(Cuadrado.mro()) # orden en el que se ejecutan los metodos ya definidos

print(Cuadrado1)

rectangulo1 = Rectangulo(3,8, "verde")
print(f"Calculo del area del rectangulo: {rectangulo1.calcularArea()}")
print(rectangulo1)
