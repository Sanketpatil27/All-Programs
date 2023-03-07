from tkinter import *

root = Tk()

# width x height
root.geometry("544x334")

# minimum size of window
# width, height
# root.minsize(123, 123)

# maximum size of window
# width, height
root.maxsize(523, 523)

# this label is for displaying the text
label = Label(text = "This is Label!")
label.pack()        # this is imp for displaying the label on the window

root.mainloop()