package com.front.api.responseBody;

import lombok.Data;

/**
 * created by wei yong
 **/
@Data
public class DocListDTO {

    private String title;

    private String summary;

    private String author;

    private String createdTime;

    private String view;

    private String comment;

    private String like;

    private String picUrl;
}
