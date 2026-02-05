def valid_Paranthesis(s):
    st=[]
    for ch in s:
        if ch=='(' or ch=='{' or ch=='[':
            st.append(ch)
        else:
            if not st:
                return False
            top=st[-1]
            if ch==')' and top=='(' or \
            ch=='}' and top=='{' or \
            ch==']' and top=='[':
                st.pop()
            else:
                return False
    return not st




if __name__ == "__main__":
    s=input("Enter a word: ")

    print("True" if valid_Paranthesis(s)  else "False")