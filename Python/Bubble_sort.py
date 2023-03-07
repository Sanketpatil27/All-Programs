l = [34,345,54,1234,1245,425,123,231,4325,56]
print(l)

for i in range(len(l)):
    for j in range(len(l)-1):
        if l[j] > l[j+1]:
            l[j], l[j+1] = l[j+1], l[j]


print(l)