def filter_list(l):
    return [x for x in l if type(x) is not str]

l = [1,2,3,'sd','ff',45,'oi','89']
print(filter_list(l))