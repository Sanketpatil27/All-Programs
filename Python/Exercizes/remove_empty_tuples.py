def removEmp(li):
    t = [t for t in li if t]
    return t


li = [(),(3,5),(6,3)]
print(*removEmp(li))            # * will remove the list brackets