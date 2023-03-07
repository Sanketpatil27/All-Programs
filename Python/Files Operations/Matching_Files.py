f = open('Files Operations/poem.txt')
data = f.read()

f = open('Files Operations/copy.txt')
data1 = f.read()

if data == data1:
    print("Files are same")
else:
    print("Files are not same!!!")

f.close()