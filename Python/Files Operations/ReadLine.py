f = open("Files Operations/one.txt",'r')

# data = f.readlines()   # read whole file in list datatype

# read only one line of  file, datatype is string
data = f.readline()         
print(data)                 

# after first line \n is also printed
# read second line
data = f.readline()         
print(data)

print(type(data))
f.close()   