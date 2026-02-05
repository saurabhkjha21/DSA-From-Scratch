word=input("Enter a Word : ")
frq={}
print("First Repeating Character: ")
for ch in word:
    frq[ch]=frq.get(ch, 0)+1
    
    if frq[ch] ==2:
        print(ch)
        break
