from typing import Text
text1 = input("Please enter s1 : " )
text2 = input("Please enter s2 : " )
dict_text1 = dict()
dict_text2 = dict()
for i in range(len(text1)):
    p1 = text1[i].lower()
    if p1 in dict_text1:
        dict_text1[p1] +=1
    else:
        dict_text1[p1] = 1
for i in range(len(text2)):
    p2 = text2[i].lower()
    if p2 in dict_text2:
        dict_text2[p2] +=1
    else:
        dict_text2[p2] = 1
if(dict_text1 == dict_text2):
    result = "true"
else:
    result = "false"
print("text1 = ",text1)
print("text2 = ",text2)
print("result")
print(result)

