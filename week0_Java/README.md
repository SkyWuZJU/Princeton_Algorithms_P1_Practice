# Week0
I'm learning Java basic gramma before week1 with the help of chatGPT and 菜鸟教程.
The other .java files records all practice codes in week0.
These .java are not standard Java files and can't run. They're just for records.

## My Learning Flow
1. Read one chapter on 菜鸟教程
2. Ask ChatGPT to read the tutorial and produce customized practices for me.
3. Complete assignments from GPT one by one
4. Let the GPT summarize my mistakes
5. Record the summary and chat history below

### Object and Class
Tutorial: https://www.runoob.com/java/java-object-classes.html
Chat History with ChatGPT: https://chat.openai.com/share/a6ff3bbb-57c0-4185-aed5-721ea4bd4d81
**Summary of Mistakes:**
1. **Named Parameters**: You initially used a syntax resembling named parameters (`name: 'Audi A8'`) which is not valid in Java.
2. **Accessing Static Variables**: You accessed a static variable through an instance reference (`dapp0.network`), which, while syntactically correct, is not best practice.
3. **Compilation Command**: The command for compiling Java files was initially incorrect. The correct command is `javac` followed by the file names.

### Datatypes
Tutorial: https://www.runoob.com/java/java-basic-datatypes.html
Chat History wit ChatGPT: https://chat.openai.com/share/fecc9519-1b8d-41a3-b934-b2cba6f36b27
1. **Variable Initialization**: You initially declared variables without initialization. Remember that local variables in Java must be initialized before use.
2. **Main Method Signature**: The correct signature `public static void main(String[] args)` is required for Java to run the program.
3. **Type Casting**: You attempted to cast a `byte` directly to a `String`, which is not allowed. Use `Integer.toBinaryString` for proper conversion.
4. **Range Checking**: In the boolean expression assignment, remember to check both the upper and lower bounds of the byte range.