a = {2,34,545,64,'sp'}

print(type(a))
print(a)


b = set()               # required when creating empty sets
print(b)

b.add(3)
# b.add(3)             # ignore the repetative values
b.add(456)
b.add(9)
b.add(56.76)
b.add('wer')

# cannot add dictonary or list (coz it is mutable)
# b.add({4: 89})
# b.add([2,3,4])

# we can add tuple (coz it cannot change)
b.add((489,76))

print(b)

b.remove('wer')
print(b)

print("length of set: ",len(b))
print(b)


print("popped:",b.pop())          # pop any value from set, and return
print(b)


print(b.union({8,11}))
print(b.intersection({8,11}))


b.clear()               # clear the set

d = {1,2,3,4}
d.remove(len(d))
print(d)

e = d
print("e =",e)