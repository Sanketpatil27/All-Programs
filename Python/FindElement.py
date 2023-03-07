
# Online Python - IDE, Editor, Compiler, Interpreter


myl = [1,2,3,4,5,6,7,8]
tofind = 5
found = False
for I in range(len(myl)):
    found = myl[I] == tofind
    if found:
        break 
if found:
   print('element found at',I)
else:
   print('absent')