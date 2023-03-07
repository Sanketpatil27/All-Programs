n = int(input('Enter a rows in pyramid: '))

# i = 0
# while i < n:
#     j = 0
#     k = 0

#     # spaces -
#     print("")

#     # stars ->
#     while k <= i:
#         print(end='*')
#         k += 1

#     i += 1



# simplified ->

for i in range(n):
    print("*" * (i+1))
