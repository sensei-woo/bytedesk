/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-04-15 17:13:01
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2024-08-30 16:05:07
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.core.redis.pubsub;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
// import lombok.extern.slf4j.Slf4j;
import lombok.NoArgsConstructor;
import lombok.Data;

// java发送，python接收
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RedisPubsubMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    private String content;

}
