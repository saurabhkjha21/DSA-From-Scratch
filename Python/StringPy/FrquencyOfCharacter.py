word=input("Enter a word: ")
frq={}

for ch in word:
    if ch in frq:
        frq[ch]+=1
    else:
        frq[ch]=1

for ch in frq:
    print(ch, " : ",frq[ch])

