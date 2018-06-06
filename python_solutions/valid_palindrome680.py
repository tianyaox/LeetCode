class Solution(object):
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        i = 0
        j = len(s)-1
        skipped_i = False
        skipped_j = False
        stored_i = 0
        stored_j = len(s)-1
        while i<j:
            print(s[i:j+1])
            print(i)
            print(j)
            print(skipped_i)
            print(skipped_j)
            if s[i]==s[j]:
                i += 1
                j -= 1
                continue
            if s[i]!=s[j]:
                if not skipped_i and not skipped_j:
                    stored_i = i
                    stored_j = j
                    i+=1
                    skipped_i = True
                    continue
                    
                if skipped_i and not skipped_j:
                    i = stored_i
                    j = stored_j
                    j -= 1
                    skipped_j = True
                    continue
                    
                if skipped_i and skipped_j:
                    return False

                
        return True
    

if __name__ == '__main__':
    s = Solution()
    print(s.validPalindrome("abc"))