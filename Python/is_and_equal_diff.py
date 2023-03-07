a = [3,4,5,346,6]
b = a      # this is reference, two references pointing same object
c = a[:]    # this is copy of a, not reference

print(b == a) 
print(b is a)    #is will true when two reference values pointing to same objexct
print(c == a)
print(c is a)    # this is copy not a reference, coz false