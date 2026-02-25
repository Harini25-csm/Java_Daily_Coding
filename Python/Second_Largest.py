class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Extract unique digits from the string and sort them
        digits=sorted({int(ch) for ch in s if ch.isdigit()})
        if len(digits)<2:
            return -1
        return digits[-2]
