n = int(input("enter a number: "))
rev = 0

def isPalindrome(n):
    global rev
    while n > 0:
        dig = n%10      # it gets last number of n
        # print(dig)
        rev = rev*10 + dig      # *10 caz to add dig at last to number
        n = n//10               # to update value of n after above operations 
      
    return rev
        
print(f"Reverse number of {n} is :",isPalindrome(n))