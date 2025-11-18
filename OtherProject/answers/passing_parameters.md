#### Tại sao sau khi chạy phương thức swap(s1, s2) thì tên của hai học sinh không thay đổi? Từ đó, Java là ngôn ngữ truyền tham trị hay tham chiếu?
Khi gọi phương thức ```swap(s1, s2)```, bản sao của ```s1``` và ```s2``` được chép vào hai biến lần lượt là ```o1``` và ```o2```. Lúc này, nếu ta chạy phương thức
```java
public static void swap(Object o1, Object o2) {
    Object tmp = o1;
    o1 = o2;
    o2 = tmp;
}
```
Thì chỉ có giá trị của ```o1``` và ```o2``` thay đổi, ```s1``` và ```s2``` giữ nguyên.

**Kết luận**: Java là ngôn ngữ truyền tham trị. Đối với một Object, giá trị được truyền chính là 1 reference của nó, không phải chính nó.


#### Làm thế nào để phương thức swap hoạt động?
Sửa thành:
```java
public static void swap(Student s1, Student s2) {
    int tmpId = s1.getStudentId();
    String tmpName = s1.getName();

    s1.setStudentId(s2.getStudentId());
    s1.setName(s2.getName());

    s2.setStudentId(tmpId);
    s2.setName(tmpName);
}
```
Nhớ thêm mấy cái setter, getter vào cho đỡ bug.


#### Sơ đồ stack minh hoạ
Đùa ông anh bắt em vẽ sơ đồ thật đấy à.

##### Ban đầu
|Stack|Heap|
|------|------|
|s1|(1, "A")|
|s2|(2, "B")|

##### Gọi swap(s1, s2)

###### int tmpId = s1.getStudentId()
|Stack|Heap|
|------|------|
|s1|(1, "A")|
|s2|(2, "B")|
|tmpId = 1| |

###### String tmpName = s1.getName()
|Stack|Heap|
|------|------|
|s1|(1, "A")|
|s2|(2, "B")|
|tmpId = 1| |
|tmpName = "A"| |

###### s1.setStudentId(s2.getStudentId())
|Stack|Heap|
|------|------|
|s1|(2, "A")|
|s2|(2, "B")|
|tmpId = 1| |
|tmpName = "A"| |

###### s1.setName(s2.getName())
|Stack|Heap|
|------|------|
|s1|(2, "B")|
|s2|(2, "B")|
|tmpId = 1| |
|tmpName = "A"| |

###### s2.setStudentId(tmpId)
|Stack|Heap|
|------|------|
|s1|(2, "B")|
|s2|(1, "B")|
|tmpId = 1| |
|tmpName = "A"| |

###### s2.setName(tmpName)
|Stack|Heap|
|------|------|
|s1|(2, "B")|
|s2|(1, "A")|
|tmpId = 1| |
|tmpName = "A"| |