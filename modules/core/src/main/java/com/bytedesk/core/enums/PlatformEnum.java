/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-06-20 16:31:05
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2024-10-24 18:28:29
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.core.enums;

public enum PlatformEnum {
    BYTEDESK,
    LIANGSHIBAO,
    ZHAOBIAO,
    MEIYU,
    TIKU;

    // 根据字符串查找对应的枚举常量
    public static PlatformEnum fromValue(String value) {
        for (PlatformEnum type : PlatformEnum.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No PlatformEnum constant with value: " + value);
    }

}
