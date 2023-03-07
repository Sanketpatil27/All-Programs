from inspect import Attribute


class Attribute:
    a = 9


obj = Attribute()
obj.a = 23          # it create new instance attribute of name a, it does'n change class a

# Attribute.a = 6     # it will change class attribute

print(Attribute.a)
print(obj.a)