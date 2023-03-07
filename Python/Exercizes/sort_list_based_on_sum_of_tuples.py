# Python code to sort list of tuple based on sum of element in tuple.
  
# li list initialisation
li = [(4, 5), (2, 3), (6, 7), (2, 8)] 
  
print("The original list of tuple is ")
print(li)
  
# getting length of list of tuples
lst = len(li)
  
# Bubble sort
for i in range(lst):
      
    for j in range(lst-i-1):
        if (li[j][0]+li[j][1]) > (li[j+1][0]+li[j+1][1]):
            li[j], li[j+1] = li[j+1], li[j]
  
  
# print output
print("\nThe answer is")
print(li)



# sort the list based on their first or zero'th index list or tuples
li = [[11,14], [5,6], [8, 23]]
li = [(11,14), (5,6), (8, 23)]      # works same for tuples also
                                    # key keyword takes a function 
li.sort(key= lambda x: x[1])        # it will sort the list's list point of their 1'st index
print("Sorted list based on index:",li)


nl =[]
for a,b in li:
    nl.append(a+b)
nl.sort()
print("sorted list based on sum:",nl)