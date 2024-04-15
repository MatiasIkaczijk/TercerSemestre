# Clase padre

class FiguraGeometrica:
    def __init__(self, ancho, alto):
        self.ancho = ancho
        self.alto = alto

@property
def ancho(self, ancho):
    return self._ancho

@ancho.setter
def ancho(self, ancho):
    self._ancho = ancho

@property
def alto(self):
    return self._alto

@alto.setter
def alto(self, alto):
    self._alto = alto
# metodo thunder
def __str__(self):
    return f"FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]"