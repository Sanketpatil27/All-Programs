# w is specified for write mode
# is file doesn't exist then it created new

w = open('Files Operations/write.txt','w')
w.write('This2 is writing mode\n hello')    # override if called another time
w.write(' hii')    # append at last when write again, called many times


# it returns numbers of characters written
# m = w.write('This is writing mode\n hello')
# print(m)             

w.close()