import os

# print(dir(os))
# print("Current directory: ",os.getcwd())      # get current working directory


# change the working directory
# os.chdir("C://")        
# print("After changing directory: ", os.getcwd())        # now we can't read or write in files, which located in current directory
# f = open("1.txt")                                       # such like this


# print(os.listdir())         # make list of current directory files
# print(os.listdir("C://"))         # make list of C:// drive directory files

# creating directory (Folder)
# os.mkdir("Os_File")     
# os.makedirs("Os_File/another")     # make os_file and also another file  (make directories)

# renaming files, it deletes the existing file and make another with copied content of existing file
# os.rename("Os.txt", "Os module.txt")     

# enviorment variable
# print(os.environ.get("Path"))       # give the path of Path

# join path
# print(os.path.join("C://", "Os module.txt"))


# print(os.path.exists("C://Program Files"))           # true if path exists
# print(os.path.isfile("C://Program Files"))           # true if it is file, in this this is directory, so false
print(os.path.isdir("C://Program Files"))             # true if it is directory