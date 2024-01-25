def isUnique(s: str) -> bool:
    ba = [False] * 128
    for i in s:
        if ba[ord(i)]:
            return False
        ba[ord(i)] = True
    return True
