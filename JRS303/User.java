
package com.wyl.pojo;

/**
 * @author by wyl
 * @date 2021/11/19.20点44分
 * <p>
 * JRS303  (Bean Validation)  数据校验
 * <p>
 * JRS303  (Bean Validation)  数据校验
 * <p>
 * JRS303  (Bean Validation)  数据校验
 * <p>
 * JRS303  (Bean Validation)  数据校验
 * <p>
 * JRS303  (Bean Validation)  数据校验
 */

/**
 * JRS303  (Bean Validation)  数据校验
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 空检查
 @Null 验证对象是否为null
 @NotNull 验证对象是否不为null, 无法查检长度为0的字符串
 @NotBlank 检查约束字符串是不是Null还有被Trim的长度是否大于0, 只对字符串, 且会去掉前后空格.
 @NotEmpty 检查约束元素是否为NULL或者是EMPTY.

 Boolean检查
 @AssertTrue 验证 Boolean 对象是否为 true
 @AssertFalse 验证 Boolean 对象是否为 false

 长度检查
 @Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内
 @Length(min=, max=) Validates that the annotated string is between min and max included.

 日期检查
 @Past 验证 Date 和 Calendar 对象是否在当前时间之前，验证成立的话被注释的元素一定是一个过去的日期
 @Future 验证 Date 和 Calendar 对象是否在当前时间之后 ，验证成立的话被注释的元素一定是一个将来的日期
 @Pattern 验证 String 对象是否符合正则表达式的规则，被注释的元素符合制定的正则表达式，regexp:正则表达式 flags: 指定 Pattern.Flag 的数组，表示正则表达式的相关选项。

 数值检查
 建议使用在String,Integer类型，不建议使用在int类型上，因为表单值为“”时无法转换为int，但可以转换为String为”“,Integer为null
 @Min 验证 Number 和 String 对象是否大等于指定的值
 @Max 验证 Number 和 String 对象是否小等于指定的值
 @DecimalMax 被标注的值必须不大于约束中指定的最大值. 这个约束的参数是一个通过BigDecimal定义的最大值的字符串表示.小数存在精度
 @DecimalMin 被标注的值必须不小于约束中指定的最小值. 这个约束的参数是一个通过BigDecimal定义的最小值的字符串表示.小数存在精度
 @Digits 验证 Number 和 String 的构成是否合法
 @Digits(integer=,fraction=) 验证字符串是否是符合指定格式的数字，interger指定整数精度，fraction指定小数精度。
 @Range(min=, max=) 被指定的元素必须在合适的范围内
 @Range(min=10000,max=50000,message=”range.bean.wage”)
 @Valid 递归的对关联对象进行校验, 如果关联对象是个集合或者数组,那么对其中的元素进行递归校验,如果是一个map,则对其中的值部分进行校验.(是否进行递归验证)
 @CreditCardNumber信用卡验证
 @Email 验证是否是邮件地址，如果为null,不进行验证，算通过验证。
 @ScriptAssert(lang= , script=, alias=)
 @URL(protocol=,host=, port=,regexp=, flags=)
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EnableConfigurationProperties
@Slf4j   //Lombok log类

@Scope("singleton")
@Component(value = "user")
@Validated                    //开启JRS303数据校验
@ConfigurationProperties(prefix = "user")    //绑定配置yml文件
public class User {

    @NotBlank(message = "name不难为空")
    private String name;

    @Email
    private String email;

}

