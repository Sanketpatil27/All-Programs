# from operator import concat

asit = 'how are you \
        welcome'
print(asit)

b = '''how are you
       Good Morning'''         # triple quotes for print string as it is
print(b)

a = "harry bhai"
print("\nlength of string a:",len(a))
print(a)
print("char at index 4:", a[4])             
print("char at index -6:", a[-6])             
print("char at index -10:", a[-10])             

greeting = "Good Night "
concating = greeting + a
print(concating)


print("\nString from index 1 to 3:", a[1:4])      #print from index 1 to 3 (always get -1 from last index)
print("String from index -9 to -6:", a[-9:-6])      #same as a[1:4]
print("String from start index to 3:", a[:4])      #print from start index to 3 
print("String from index 0 to last:", a[0:])      #print from index 0 to last index
print("String from start index to last:", a[:])      #print from start index to last index



# slicing with skip value
c = 'helloCoder'
print("\n"+c)

print("Escaping one character:",c[::2])   #from start to last escaping one[-1 of value] character from start 
print("Escaping two character:",c[::3])   #from start to last escaping two characters from start
