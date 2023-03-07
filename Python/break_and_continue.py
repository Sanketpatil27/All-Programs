# it stops loop when the break is encountered

# for i in range(10):
#     if i == 7:
#         break
#     print(i)


# it skip the further code and starts again the code (skip the 7 from range)

for i in range(10):
    if i == 7:
        continue
    print(i)