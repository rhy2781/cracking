def palindromePermutation(s: str) -> bool:
    count = [0] * 26
    for i in s:
        if ord('a') <= ord(i) <= ord('z'):
            count[ord(i) - ord('a')] += 1

    one_limit = False
    for c in count:
        if c % 2 == 1:
            if one_limit:
                return False
            else:
                one_limit = True
    return True
