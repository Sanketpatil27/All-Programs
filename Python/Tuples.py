# tuples are created using ()
a = ()                              #empty tuple
print("\nThis is empty typle:",a)

# a1 = (1)                          # wrong way to define typle, it is not a tuple
# print(a1)

a1 = (1,)                           # right way to define a typle of single ele.
print(a1)


t = (1,34,5,'hello',True)           # tuples are immutable data type
print(t)

print(t[1])                         # get element of tuple
# t[0] = 23                         # we can't change the value of a tuple
print(t)