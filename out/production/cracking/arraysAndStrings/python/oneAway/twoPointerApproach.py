def oneAway(first: str, second: str) -> bool:
    if abs(len(first) - len(second)) > 1:
        return False

    s1 = first if len(first) < len(second) else second
    s2 = second if len(first) < len(second) else first

    index1 = 0
    index2 = 0
    difference = False

    while index1 < len(s1) and index2 < len(s2):
        if s1[index1] != s2[index2]:
            if difference:
                return False
            difference = True

            if len(s1) == len(s2):
                index1 += 1
        else:
            index1 += 1
        index2 += 1
    return True







