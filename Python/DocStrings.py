# first line of function is always called as docstring, used to know about function work

def fun1(a,b):
    """ This is doc string
    This function does'n work for three numbers! """
    print(a+b)

fun1(23,4)
print(fun1.__doc__)