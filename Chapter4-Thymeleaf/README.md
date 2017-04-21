#使用Thymeleaf模板引擎渲染web视图  

> 1.spring boot 使用Thymeleaf模板
> 2.Thymeleaf基础知识



##表达式支持的语法

    字面（Literals）
    文本文字（Text literals）: 'one text', 'Another one!',…
    数字文本（Number literals）: 0, 34, 3.0, 12.3,…
    布尔文本（Boolean literals）: true, false
    空（Null literal）: null
    文字标记（Literal tokens）: one, sometext, main,…
    文本操作（Text operations）
    字符串连接(String concatenation): +
    文本替换（Literal substitutions）: |The name is ${name}|
    算术运算（Arithmetic operations）
    二元运算符（Binary operators）: +, -, *, /, %
    减号（单目运算符）Minus sign (unary operator): -
    布尔操作（Boolean operations）
    二元运算符（Binary operators）:and, or
    布尔否定（一元运算符）Boolean negation (unary operator):!, not
    比较和等价(Comparisons and equality)
    比较（Comparators）: >, <, >=, <= (gt, lt, ge, le)
    等值运算符（Equality operators）:==, != (eq, ne)
    条件运算符（Conditional operators）
    If-then: (if) ? (then)
    If-then-else: (if) ? (then) : (else)
    Default: (value) ?: (defaultvalue)
    所有这些特征可以被组合并嵌套：
    
    'User is of type ' + (${user.isAdmin()} ? 'Administrator' : (${user.type} ?: 'Unknown'))