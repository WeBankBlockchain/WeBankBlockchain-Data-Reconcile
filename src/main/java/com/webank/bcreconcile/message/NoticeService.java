/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.bcreconcile.message;

/**
 * An interface for message queues, used for extensions
 *
 * @author wesleywang
 * @Description:
 * @date 2020/6/17
 */
public interface NoticeService <T,S>{

    void  receiveMsg(T t);

    void  sendMsg(S s);

}
