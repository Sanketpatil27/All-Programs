# 1 2 3 4
# 1+2 3 4
# 3+3 4 
# 6+4
# 10  (output)

from functools import reduce
l = [1, 2, 3, 4]

sum = lambda a,b: a+b

val = reduce(sum, l)        # sequential computation
print(val)