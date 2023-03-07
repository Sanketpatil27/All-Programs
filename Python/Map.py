def square(n):
    return n*n

l = [1,2,4]

# Method 1
l2 = []
for i in l:
    l2.append(square(i))
print(l2)


# Method 2
# map applies a function to all items in an input list
# print(list(map(square,l)))                  # Map make an iterator for functions, iterate each element of list for function
print(list(map(lambda x: x*x, l)))      

l8 = list(map(lambda x: x+x, l))
print("Doubled values in list are: ",l8)