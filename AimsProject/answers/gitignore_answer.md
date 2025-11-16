Các đường dẫn ```.settings```, ```bin```, ```.classpath``` và ```.project``` nên được thêm vào file ```.gitignore``` là vì:
- Các đường dẫn trên thường không chứa mã nguồn của project, thường là các thư mục cấu hình hoặc thư mục chứa các file được compiler sinh ra khi chạy code
- Nếu không thêm các đường dẫn trên vào ```.gitignore``` thì:
    - Repo sẽ chứa nhiều file không cần thiết
    - Dễ xảy ra xung đột khi nhiều người cùng sửa project (do có thể mỗi người sử dụng 1 IDE khác nhau)

Nếu sử dụng các công cụ khác để lập trình Java thì bỏ qua hết mọi file/thư mục do IDE sinh ra hoặc thuộc cấu hình cá nhân, và mọi file được build sinh ra tự động. Ví dụ với **Visual Studio Code** (cái có màu xanh) thì thêm ```.vscode/```. 

Lỡ commit các file rồi sau đó mới thêm vào ```.gitignore```, muốn Git dừng theo dõi mà không xoá khỏi máy thì:
- Thêm các đường dẫn vào ```.gitignore```
- Không viết câu lệnh sau vào trong terminal (nếu bạn dùng Linux) ```sudo rm -rf```
- Sử dụng chuỗi các câu lệnh dưới đây:
```bash
git rm -r --cached . 
# git rm - bỏ file khỏi vùng theo dõi, r - làm đệ quy, áp dụng cho các file con
# --cached - chỉ bỏ khỏi index chứ không xoá khỏi máy, . - áp dụng cho tất cả các file hiện có trong repo
git add .
# git add - thêm các thay đổi trong thư mục làm việc vào staging area để chuẩn bị cho lần commit tiếp theo
# . - tất cả các file không bị ignore
git commit -m "Đào Huy Hoàng đẹp trai vkl"
# git commit - Tạo commit mới dựa trên trạng thái hiện tại
# -m "...." tạo thông điệp khi commit, không nhất thiết cố định là "Đào Huy Hoàng đẹp trai vkl" dù đấy là sự thật
```