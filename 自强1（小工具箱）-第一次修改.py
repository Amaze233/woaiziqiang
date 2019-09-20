X = input("欢迎使用小工具箱，请根据以下提示信息进行操作\n"
          "输入‘1’进行字符串输入并加密\n"
          "输入‘2’进行字符串输入及字典制作\n"
          "输入‘3’进行txt文件读取及二维码生成与保存:")
if X is '1':
    try:
        import base64
        w = input("欢迎使用字符串加解密系统\n"
                  "输入'4'进行字符串的加密\n"
                  "输入'5'进行字符串的解密\n"
                  "请输入：")
        if w is '4':
            str1 = input("请输入需加密的字符串：")
            str2 = base64.b64encode(str1.encode("utf-8"))
            print("加密后的字符串：", str2)
        elif w is '5':
            str3 = input("请输入需解密的字符串：")
            str4 = base64.b64decode(str3).decode("utf-8")
            print("重新解密的字符串：", str4)
    except :
        print("输入非法字符，请重新输入！")
elif X is '2':
    try:
        x = input('欢迎使用python字典制作、转换与反转系统\n'
                  '请按说明输入字典的键与值\n'
                  '注意:\n'
                  '输入字典的键和值时请务必按对应顺序输入\n'
                  '并且相邻的键或值之间请以空格隔开!!!!!!\n'
                  '请输入字典的键：')
        y = input('请输入字典的值：')
        list1 = x.split(" ")
        list2 = y.split(" ")
        the_dict = dict(zip(list1, list2))
        print("您所输入的字典为：", the_dict)
        import json
        json_str = json.dumps(the_dict)
        print("所输字典转换的JSON字符串为：", json_str)
        print("JSON字符串的类型为：", type(json_str))
        the_dict_alter = {}
        for key, value in the_dict.items():
            if value not in the_dict_alter:
                the_dict_alter[value] = [key]
            else:
                the_dict_alter[value].append(key)
        print("反转后的字典为：", the_dict_alter)
        print("反转后字典的类型为", type(the_dict_alter))
    except:
        print("输入非法字符，请重新输入！")
elif X is "3":
        i = input("欢迎使用QRcode生成系统\n"
                  "请将要转化的txt文档放入此py文档的同一类目底下\n"
                  "注意！生成的QRcode也将保存于同一类目下\n"
                  "请输入要读取的文件名：")
        file = open(i, "r")
        data = file.read()
        print(data)
        import qrcode
        img = qrcode.make(data=data)
        img.show()
        img.save("自强.jpg")
