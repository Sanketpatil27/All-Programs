import wikipedia

# This will import urlopen
# class from urllib module
# from urllib.request import urlopen
  
  
# page = urlopen("http://geeksforgeeks.org/")
# print(page.headers)

# Fetches the code 
# of the web page
# content = page.read()
# print(content)


# result = wikipedia.page("GeeksforGeeks")
# print(result.summary)
# print(wikipedia.summary("Debugging", sentences = 2))



# This will import turtle module
import turtle
  
  
myTurtle = turtle.Turtle()
myWin = turtle.Screen()
  
# Turtle to draw a spiral
def drawSpiral(myTurtle, linelen):
    myTurtle.forward(linelen)
    myTurtle.right(90)
    drawSpiral(myTurtle, linelen-10)
  
drawSpiral(myTurtle, 80)
myWin.exitonclick()