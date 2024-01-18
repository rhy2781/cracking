def palindromePermutation(s: str):
    vector = 0
    for i in s:
        if ord('a') <= ord(i) <= ord('z'):
            shift = 1 << ord(i)
            vector ^= shift
    return (vector & (vector - 1)) == 0
