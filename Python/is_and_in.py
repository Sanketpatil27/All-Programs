#                               is and in are boolean type operator
# is, is like == operator

a = None
if a is None:
    print('Yes')
else:
    print('No')

b = 17
print(b is 117)



# in -->
c = [2,34,56,6]
print("2 in c:", 2 in c)
print("12 in c:", 12 in c)