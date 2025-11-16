Khi thêm phương thức
```java
addDVD(DigitalVideoDisc ...discs)
```
vào lớp ```Cart``` trong khi đã có
```java
addDVD(DigitalVideoDisc[] discs)
```
thì chương trình sẽ không biên dịch được. Do trong **Java**, ```DigitalVideoDisc...``` được coi là một mảng nên chương trình sẽ bị lỗi ```duplicate method / method is already defined```

Để giải quyết, chỉ cần giữ lại một trong hai là được. Ưu tiên 
```java 
addDVD(DigitalVideoDisc ...discs)
``` 
do phương thức trên cho phép truyền một mảng hoặc một số lượng tham số nhất định.
