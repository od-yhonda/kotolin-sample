package com.example.kotolin_sample

interface TaskDataSource {

    interface LoadTaskCallback {

        fun onLoadTasks(tasks: List<Task>)

        fun onError(error: Throwable)
    }

    interface Callback {

        fun onSuccess()

        fun onError(error: Throwable)
    }

    fun loadTasks(callback: LoadTaskCallback)

    fun insertTask(task: Task, callback: Callback)

    fun updateTask(task: Task, callback: Callback)

    fun deleteTask(task: Task, callback: Callback)
}