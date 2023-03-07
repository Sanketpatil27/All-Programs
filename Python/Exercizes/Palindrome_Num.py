# A palindromic number is a number (such as 16461)
# that remains the same when its digits are reversed

n = int(input("enter a number: "))
rev = 0


# 2nd method
# n = str(n)
# palind = n[::-1]
# if n == palind:
#   print('number is palindrome!')
# else:
#   print('no')


# method 1
def isPalindrome(n):
    global rev
    while n > 0:
        dig = n%10
        rev = rev*10 + dig
        n = n//10
      
    return rev
        

if isPalindrome(n) == n:
  print ("This is Palindrome")
else:
  print("Not Palindrome")