a = 123  # global variable

def fun():
    global a     # this will tell the function to use the global variable a 
    a = 34       # this is local variable of fun(), not change the global a varible, if global variable is not used
    print(a)


print(a)
fun()
print(a)