sentence=input("Enter a sentence: ")
longestWord=""
words=sentence.split()

for word in words:
    if len(word)>len(longestWord):
        longestWord=word

print("The longestword is: ", longestWord)
print("The length of longest word is: ", len(longestWord))
