class Solution(object):
    def sortVowels(self, s):
        vowels = []

        s = list(s)

        for i in s:
            if i in "AEIOUaeiou":
                vowels.append(i)
        
        if vowels == []:
            return "".join(s)
        vowels.sort()
        count = 0
        for j in range(len(s)):
            if s[j] in "AEIOUaeiou":
                s[j] = vowels[count]
                count += 1
        
        return "".join(s)