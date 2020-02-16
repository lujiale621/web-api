$.validator.setDefaults({
    submitHandler: function(form) {form.submit() }
});
$(document).ready(function() {
// 在键盘按下并释放及提交后验证提交表单
    $("#commentForm").validate({
        rules: {
            firstname: "required",
            lastname: "required",
            usernames: {
                required: true,
                minlength: 2
            },
            passwords: {
                required: true,
                minlength: 5
            },
            confirm_password: {
                required: true,
                minlength: 5,
                equalTo: "#inputPassword"
            },
            email: {
                required: true,
                email: true
            },
            phone: {
                required: "#newsletter:checked",
                minlength: 2
            },
            nospam: "required"
        },
        messages: {
            firstname: "请输入您的名字",
            lastname: "请输入您的姓氏",
            usernames: {
                required: "请输入用户名",
                minlength: "用户名必需由两个字母组成"
            },
            passwords: {
                required: "请输入密码",
                minlength: "密码长度不能小于 5 个字母"
            },
            confirm_password: {
                required: "请输入密码",
                minlength: "密码长度不能小于 5 个字母",
                equalTo: "两次密码输入不一致"
            },
            email: "请输入一个正确的邮箱",
            nospam: "请接受我们的声明",
            phone: "请输入电话号码"
        }
    })
});