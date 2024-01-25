
def checkPermutation(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    count = [0] * 128
    for i in range(len(s)):
        count[ord(s[i])] += 1
        count[ord(t[i])] -= 1

    for j in count:
        if j != 0:
            return False
    return True
