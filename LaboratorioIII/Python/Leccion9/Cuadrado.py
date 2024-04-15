from Color import Color
from FiguraGeometrica import FiguraGeometrica

# herencia multiple

class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        # super.__init__(lado)
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def calcularArea(self):
        return self.alto * self.ancho
    
    # metodo str

def __str__(self):
    return f"{FiguraGeometrica.__str__(self)}{ Color.__str__(self)}"