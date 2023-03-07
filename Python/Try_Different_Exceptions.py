try:
    a = int(input("Enter a number: "))
    c = 1/a
    print(c)

except ZeroDivisionError as _3:
    print("Make sure you are not dividing by zero..")

except ValueError as _3:            # occur when provided string to int literal
    print("Please enter a valid value!")

except:
    print('All other exceptons are occured here other than upper!')

print("Thanks for using this code...")