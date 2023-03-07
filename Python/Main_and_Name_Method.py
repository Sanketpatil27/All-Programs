def greet(name):
    print("Hello", name)

# return __main__ if this code is running in this module, if this file import in another file then it will return the file name not __main__
print(__name__)        # this will return this file name in |Main_and_Name_Importing| file, coz it is imported

# this if block run only if this code is running in this file, not in imported file
if __name__ == "__main__":
    name = input('Enter your name: ')
    greet(name)

# if __name__ == "__main__": , we use this when we only want to execute this file's specific block of code in other files, this part will not consider in imported files