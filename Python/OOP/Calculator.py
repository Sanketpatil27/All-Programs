import math

class Calculator:
    def square(self, a):
        print(f"Square of {a} is:", a**2)

    def cube(self, a):
        print(f"Cube of {a} is:", a**3)

    def sqrt(self, a):
        print(f"Square root of {a} is:", math.sqrt(a))



a = int(input("Enter a numbers: "))

calcy = Calculator()

calcy.square(a)
calcy.cube(a)
calcy.sqrt(a)

