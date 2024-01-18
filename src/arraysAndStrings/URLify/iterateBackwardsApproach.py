def URLify(s: str, t: int):
    count = 0
    for i in range(t):
        if s[i] == ' ':
            count += 1

    s = list(s)
    write = t + (count * 2) - 1
    read = t - 1
    while read >= 0:
        if s[read] == ' ':
            s[write] = '0'
            s[write - 1] = '2'
            s[write - 2] = '%'
            write -= 3
        else:
            s[write] = s[read]
            write -= 1
        read -= 1
    return "".join(i for i in s)
