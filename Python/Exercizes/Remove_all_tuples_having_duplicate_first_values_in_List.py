# Python code to remove tuples having 
# duplicate first value from given
# list of tuples


li = [(12.121, 'Tuple1'), (12.121, 'Tuple2'), (12.121, 'Tuple3'), (923232.2323, 'Tuple4')]
visited = set()
output = []

for a,b in li:
    if a not in visited:
        visited.add(a)       # first it checkes first ele of tuple 1 in list, if not present then output appends that tuple
        output.append((a,b))
    

print("List of tuples before removing duplicates: ", li)
print("List of tuples after removing duplicates: ", output)