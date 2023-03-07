odds = []
evns = []
for i in range(60):
    if i % 2 :
        odds.append(i) 
    else:
        evns.append(i)

print("Odd numbers:",odds)
print("Even numbers: ",evns)