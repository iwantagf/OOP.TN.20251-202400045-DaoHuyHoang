Trong ví dụ, từ khoá ```super``` trong mã nguồn của ```Book``` được dùng để tái sử dụng đoạn mã nguồn của lớp cha ```Media``` gồm
- Constructor
```java
super(title, cost, category)
```
- Phương thức ```toString()```
```java
return super.toString()
       + "[" + this.numOfTokens + "]"
       + "\nAuthors: " + this.authors;
```