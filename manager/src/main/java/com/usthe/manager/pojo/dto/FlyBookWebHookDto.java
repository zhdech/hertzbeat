package com.usthe.manager.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 飞书机器人消息实体
 *
 *
 * @version 1.0
 *
 * @Description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlyBookWebHookDto {
    public static final String WEBHOOK_URL = "https://open.feishu.cn/open-apis/bot/v2/hook/873f1a93-0517-4590-a335-da64e48d6d48";

    private static final String MARKDOWN = "post";

    /**
     * 消息类型
     */
    private String msg_type = MARKDOWN;

    private Content content;

    /**
     * 消息内容
     */
    @Data
    public static class Content {
        public Post post;
    }

    @Data
    public static class FlyBookContent{
        //格式  目前支持文本、超链接、@人的功能  text  a  at
        public String tag;
        //文本
        public String text;
        //超链接地址
        public String href;

        public String user_id;
        public String user_name;
    }
    @Data
    public static class Post {
        public zh_cn zh_cn;
    }
    @Data
    public static class zh_cn{
        //标题
        public String title;
        //内容
        public List<List<FlyBookContent>> content;
    }

}
