# is a number that is the sum of its own digits 
# each raised to the power of the number of digits.
# ex: 153 = 1^3 + 5^3 + 3^3

def narcissistic(value):
    sum = 0
    val = str(value)
    l = len(val)
    
    for i in val:
        sum += int(i)**l
    if sum == value:
        return True
    else:
        return False

print(narcissistic(153))