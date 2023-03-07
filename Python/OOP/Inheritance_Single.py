class Emp:
    company = "Google"

    def showDetails(self):
        print("Googlers Employee!")


class Programmer(Emp):
    Language = "Python"
    company = "YouTube"

    def getLang(self):
        print(f"Language of programmer is: {self.Language}")

    def showDetails(self):
        print("YouTube Employee!")


e = Emp()
print(e.company)
e.showDetails()

p = Programmer()
print(p.company)
p.showDetails()
p.getLang()