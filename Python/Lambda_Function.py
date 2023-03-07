# lambda or Anonymous function - it is like one liner function 

# def minus(a,b):
#     return a-b
# print(minus (23, 3))


# same upper code can be written in different way ->
minus = lambda a, b: a - b
print(minus (73, 30))


# sorting list items by thier index number of lists or tuples->

li = [[11,14], [5,6], [8, 23]]
li = [(11,14), [5,6], (8, 23)]      # works same for tuples also
                                    # key keyword takes a function 
li.sort(key= lambda x: x[1])        # it will sort the list's list/tuple point of their 1'st index
# key work with only lambda , not with functions
print(li)
