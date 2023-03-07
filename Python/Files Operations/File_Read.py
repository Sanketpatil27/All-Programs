# by default mode is r (read), r for read
f = open("Files Operations/one.txt",'r')

# data = f.read()   # read whole file
data = f.read(7)    # read specific numbers of characters
print(data)
f.close()   