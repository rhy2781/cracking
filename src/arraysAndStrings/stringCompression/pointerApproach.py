def stringComparison(s: str) -> str:
    res = ''

    read = 0
    count = 1
    while read < len(s) - 2:
        while s[read] == s[read + 1] and read < len(s) - 2:
            read += 1
            count += 1
        res += s[read]
        res += str(count)
        count = 1
        read += 1
    return res if len(res) < len(s) else s
