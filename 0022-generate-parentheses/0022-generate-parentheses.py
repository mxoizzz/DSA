class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        return [*reduce(lambda q,_:{s[:i]+'()'+s[i:] for s in q for i in range(n)},range(n),{''})]