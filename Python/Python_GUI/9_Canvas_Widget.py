from tkinter import *

root = Tk()

canHeight = 334
canWid = 334

root.geometry(f'{canWid}x{canHeight}')

canWidget = Canvas(root, width=canWid, height = canHeight)
canWidget.pack()

# line goes from point x1, y1 to x2, y2
canWidget.create_line(0, 0, 334, 334, fill='brown')
canWidget.create_line(334, 0, 0, 334, fill='red')

# parameters for rectangel- coordinates of top left and coors of bottom right
canWidget.create_rectangle(3, 5, 200, 300, fill='brown')


# text in gui
canWidget.create_text(150, 150, text='Python', font='bold')

root.mainloop()