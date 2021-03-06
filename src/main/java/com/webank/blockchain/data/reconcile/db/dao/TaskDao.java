/**
 * Copyright 2020 Webank.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.blockchain.data.reconcile.db.dao;

import com.webank.blockchain.data.reconcile.db.entity.TaskInfo;
import com.webank.blockchain.data.reconcile.db.repository.TaskInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author wesleywang
 * @Description:
 * @date 2020/6/19
 */
@Service
public class TaskDao {

    @Autowired
    private TaskInfoRepository repository;

    public void updateTaskStatus(long pkId, int from, int to){
        repository.updateStatus(pkId, from,to);
    }

    public void updateTaskStatus(long pkId, int from, int to, Date lastExecuteEndTime){
        repository.updateStatus(pkId, from,to,lastExecuteEndTime);
    }

    public TaskInfo save(TaskInfo taskInfo){
        return repository.save(taskInfo);
    }

    public List<TaskInfo> queryTaskInfoByStatus(int status){
        return repository.findByStatus(status);
    }

    public List<TaskInfo> queryNotOverTaskByBusFileName(String fileName){
        return repository.queryNotOverTaskByBusFileName(fileName);
    }

    public TaskInfo queryTaskInfoByTaskId(String taskId){
        return repository.findByTaskId(taskId);
    }

    public TaskInfo queryTaskInfoByPkId(long pkId) {
        return repository.findByPkId(pkId);

    }
}
