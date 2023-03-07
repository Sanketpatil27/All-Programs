# iterable = __iter__() or __getitem__() method is defined in iterables
# iterator =  __next__()      (generater is a iterator)
# iteration =


def gen(n):
    for i in range(n):
        yield i         # it is generator, generates values on the fly(when we call)

g = gen(3)         # generater is capable to generate these numbers(ready to generate), saves the ram
print(g)

# print(g.__next__())     # next method is used to print the generater
# print(g.__next__())     # items in generator are only generate once
# print(g.__next__())   


# for i in g:
#     print(i)

# h = 3452         # int is not iterable
h = 'harry'         # string is iterable
ier = iter(h)      # make generator of h

print(ier.__next__())
print(ier.__next__())
print(ier.__next__())