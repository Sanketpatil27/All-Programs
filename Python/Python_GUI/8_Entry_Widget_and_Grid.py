from tkinter import *

root = Tk()

def getInfo():
    print(f"username: {uservalue.get()} \npassword: {passvalue.get()}")

root.geometry("544x433")
root.title("This is my GUI")


username = Label(text = "UserName: ", fg='brown', cursor='dot')
password = Label(text = "Password: ")

username.grid()
password.grid(row='1')

# variable classes in tkinter
# BooleanVar, IntVar, StringVar, DoubleVar

uservalue = StringVar()
passvalue = StringVar()

userentry = Entry(root, textvariable = uservalue, fg='brown')    # it will store the content of entry text to the textvariable
passentry = Entry(root, textvariable = passvalue)

userentry.grid(row='0', column= '1')
passentry.grid(row='1', column='1')

# command takes the function name
btn = Button(text = 'Submit', activebackground='yellow', activeforeground='black' ,fg = 'red', command = getInfo).grid()

root.mainloop()