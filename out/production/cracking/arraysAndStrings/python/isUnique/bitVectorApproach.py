def isUnique(s: str) -> bool:
    checker = 0
    for i in s:
        if checker & (1 << ord(i)):
            return False
        checker |= (1 << ord(i))
    return True
