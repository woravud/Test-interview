t = float(input("Input your time : "))
h = t / 3600
t %= 3600
m = t / 60
t %= 60
s = t
print("%02d:%02d:%02d"% (h,m,s))

