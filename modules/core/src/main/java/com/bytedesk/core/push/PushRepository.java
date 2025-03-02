/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-04-25 15:42:24
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2024-10-28 12:39:07
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.core.push;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PushRepository extends JpaRepository<PushEntity, Long>, JpaSpecificationExecutor<PushEntity> {

    List<PushEntity> findByStatus(String status);

    // Optional<PushEntity> findByStatusAndTypeAndReceiverAndContent(String status, String type, String receiver,
    //                 String content);
    Optional<PushEntity> findByStatusAndReceiverAndContent(String status, String receiver, String content);

    Optional<PushEntity> findByDeviceUid(String deviceUid);

    Optional<PushEntity> findByDeviceUidAndContent(String deviceUid, String code);

    Boolean existsByStatusAndTypeAndReceiver(String status, String type, String receiver);

    Boolean existsByStatusAndTypeAndReceiverAndContent(String status, String type, String receiver,
            String content);
}
