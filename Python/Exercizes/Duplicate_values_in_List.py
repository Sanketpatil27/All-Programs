l = [10, 20, 30, 20, 20, 30, 40, 50, -20, 60, 60, -20, -20]
visited = set()
newl = []

for i in l:
    if i not in visited:
        visited.add(i)
    else:
        newl.append(i)


print("values in list are:", l)
print("Values in visited list are:", visited)     
print("Values in new list are:", newl)     
print("Duplicate values in list are:", *list(set(newl)))     
# * will remove brackets of list