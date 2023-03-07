def abbrev_name(name):
    return '.'.join(w[0] for w in name.split()).upper()

print(abbrev_name("sanket popat patil"))

