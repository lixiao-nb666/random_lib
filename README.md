# random_lib

    该工具包不需要提前初始化    

    //系统随机字符串总计32个byte
    public int getRandomInt()

    //输入1个最大数，然后随机，比如输入100就是0-99
    public int getRandomInt(int numb)

    //输入长度获取对应长度的数字
    public long getRandomLongByLength(int length)

    //输入长度获取对应长度的字符串
    public String getRandomString(int length)

    //输入长度获取对应的数字，并且在该字符串最前面加个指定字符串
    public String getRandomStringTitleAddStr(String str,int length)

    //获取指定长度的对应字符串，随机字符使用自己输入的字符串
    public String getRandomStringUseCustomString(int length, String str) 

    //获取指定长度的对应字符串，随机字符使用自己输入的字符组
    public String getRandomStringUseCustomStrings(int length,String... strs)

    //获取指定长度的对应字符串，随机字符使用自己输入的字符组，并且在2个字符之前加个间隔的字符串
    public String getRandomStringUseCustomStringsAddBwStr(int length,String bwStr,String... strs)