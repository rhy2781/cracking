from linkedList.python.helper import create_node_from_list, get_kth_node

def main():
    init = [1, 2, 3, 4, 5]
    n = create_node_from_list(init)
    loopStart = get_kth_node(n, 3)
    print(loopStart)
