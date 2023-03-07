n = 3

# def pat(n): 
#     for i in range(1,n+1):
#         k = n 
#         while k >= i:
#             print("*",end = "")
#             k -= 1
#         print()


def pat(n): 
    for i in range(n):
        print("*" * (n-i))      # means 3 - i  (here n is not in range its number of rows)

pat(n)