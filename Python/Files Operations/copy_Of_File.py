f = open('Files Operations/poem.txt')
data = f.read()

f = open('Files Operations/copy.txt', 'w')
f.write(data)

f.close()