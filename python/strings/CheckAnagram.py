def areAnagramsNaive(s1, s2):
    if len(s1) != len(s2):
        return False
    s1 = sorted(s1)
    s2 = sorted(s2)

    return s1==s2


def areAnagramOptimal(s1, s2):
    if len(s1) != len(s2):
        return False
    
    frq = [0]*26

    for ch in s1:
        frq[ord(ch) - ord('a')]+=1

    for ch in s2:
        frq[ord(ch) - ord('a')]-=1

    for ch in frq:
        if frq[ch] != 0:
            return False
    
    return True

if __name__ == "__main__":
    s1 = "listen"
    s2 = "silent"
    s3 = "geeks"
    s4 = "leaks"

    if(areAnagramOptimal(s3, s4)):
        print("Anagram")
    else:
        print("Not Anagram")

    if(areAnagramsNaive(s1, s2)):
        print("Anagram")
    else:
        print("Not Anagram")




 