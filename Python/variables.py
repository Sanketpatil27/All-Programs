# a = 'st"r'
from numpy import double


a = "st'r"
a = '''s't"r'''
A = 34.34
b = 23
c = 23.2345452
d = True
e = double(c)

print(a)
print(A)
print(b)
print(c)
print(d)
print(e)

print(type(a))
print(type(A))
print(type(b))
print(type(c))
print(type(d))
print(type(e))