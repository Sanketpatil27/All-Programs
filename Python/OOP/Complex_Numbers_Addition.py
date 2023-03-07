# (a + bi) (c + di) = (ac-bd) + (ad + bc)i

class Complex:
    def __init__(self, r, i):
        self.real = r
        self.imaginary = i

    def __add__(self, c2):
        return complex(self.real + c2.real, self.imaginary + c2.imaginary)
    
    def __mul__(self, c2):
        mulReal = self.real * c2.real - self.imaginary * c2.imaginary
        mulImg = self.real * c2.imaginary + self.imaginary * c2.real
        return complex(mulReal, mulImg)

    # def __str__(self):
    #     return f"{self.real} + {self.imaginary}i"

c1 = complex(3,2)
c2 = complex(1,7)

print(c1 + c2)
print(c1 * c2)