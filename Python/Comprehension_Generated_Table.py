n = int(input("Enter a number to create table of it: "))

# for i in range(1,11):
#     table.append(n * i)


table = [n * i for i in range(1, 11)]
print(table)

with open('Comprehension_Generated_Table.txt', 'a') as f:
    f.write(str(table))
    f.write('\n')
