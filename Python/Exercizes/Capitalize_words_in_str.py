def to_jaden_case(string):
    strg=''
    lst1 = string.split()
    for i in lst1:
        strg += i.capitalize() + ' '
    return strg[:-1]        # to remove the last space

print(to_jaden_case("hello i am sp"))

