month = {"j", "f", "m"}
print(month)

month.add("a")
month.add("m")

print (month)

#[print (i) for i in month]
month.update(['j','k','l','m'])
print(month)

month. discard("j")
month. discard("m")
print(month)

month. remove ("a")
print (month)

print (month.pop()) 
month.clear()
print (month)

d = {1, 2,3,4,5,6}
d1 = {7, 8,9,2}

print(d | d1)  #union
print(d.union(d1))

print(d & d1) #intersection, show common elems
print (d.intersection(d1))

a = {'a', 'b', 'c'}
b = {'d', 'c', 'e'}
c = {'c', 'f', 'g'}

a. intersection_update (b, c)  #update a 
print (a)

m1 = {1, 2,3,4}
m2 = {2, 3,5}
print (m1-m2)   # substraction operator

print (m1.difference(m2)) #same as substraction

j = {1, 2,3,4}
k = {1, 2,5,6}
print(j^k)  #show unique values

print(j.symmetric_difference(k))