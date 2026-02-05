def check_palindrome(n):
    s=""
    for ch in range(len(n)-1, -1, -1):
        s+=n[ch]
    return s.lower()==n.lower()

if __name__ == "__main__":
    n=input("Enter a word: ")
    if check_palindrome(n):
        print("Palindrome")
    else:
        print("Non-Palindrome")



