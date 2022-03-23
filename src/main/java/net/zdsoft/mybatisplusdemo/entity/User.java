package net.zdsoft.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author jwc
 * @date 2022/3/23
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
