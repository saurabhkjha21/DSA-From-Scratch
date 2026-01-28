word=input("Enter a word: ")
rev=""

for ch in range(len(word)-1, -1, -1):
    rev+=word[ch]

print(rev)