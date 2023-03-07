list = [1, 2, 3, 4, False, 'harry']

# index = 0
# for i in list:
#     print(f"{i} at index {index}")
#     index += 1


# here first is always index and second is item
for index, item in enumerate(list):
    print(f"{item} at index {index}")

tpl = (1,23,4,45,56,9,45)
for index, item in enumerate(tpl):
    print(f"{item} at index {index}")