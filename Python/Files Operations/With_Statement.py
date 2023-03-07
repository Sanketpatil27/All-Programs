# best way to open and close file at same time

with open('Files Operations/with.txt','w') as w:
    s = w.write('Hello')
print(s)


with open('Files Operations/with.txt','r') as w:
    s = w.read()
print(s)