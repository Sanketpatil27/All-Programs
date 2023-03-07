from decimal import DivisionByZero


a = int(input("Enter value of a: "))
b = int(input("Enter value of b: "))

try: 
    print(a/b)
except ZeroDivisionError:
    print("Infinite!!!")
# except DivisionByZero:     # this is error
#     print("none!!!")

print("Done!")