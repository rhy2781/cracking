def isUnique(s: str) -> bool:
    st = set()
    for i in s:
        if i in st:
            return False
        st.add(i)
    return True
