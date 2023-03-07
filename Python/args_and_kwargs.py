# def funargs(*args):
#     print(type(args))           # type is always tuple
#     print(args) 
# funargs(1, 43,54,34, 55)                # we can pass any items whenever we wants


# sequence is always normal, *args, **kwargs
# *args and **kwargs are optional


def funargs(normal, *ar, **kwargs):       
    print(normal)
    for item in ar:
        print(item)

    for key, values in kwargs.items():
        print(key, values)


args = ["harry", "merry", "carry", "cherry"]
kw = {"rohan": 'monitor', "harry": "coder", "carry": "developer"}

funargs("I am normal argument", *args, **kw)