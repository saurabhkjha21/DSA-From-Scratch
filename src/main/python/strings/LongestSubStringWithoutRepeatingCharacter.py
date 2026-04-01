class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set=set()
        i=0
        maxCount=0

        for j in range(0, len(s)):
            while s[j] in char_set:
                char_set.remove(s[i])
                i+=1
            char_set.add(s[j])
            maxCount=max(maxCount, j-i+1)
        return maxCount


