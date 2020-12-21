package com.tyjw.inspectline.common.utils;

class MyThread extends Thread {

    private int taskId;//任务编号
    private int userId;//用户编号
    private String utoken;//用户token

    public MyThread(int taskId, int userId, String token) {
        this.taskId = taskId;
        this.userId = userId;
        this.utoken = token;
    }

    @Override
    public void run() {
        System.out.println("Mythread 线程");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread(233, 101, "e96c4dd9d53f40a5bb5976e2f97f19d2");
        t.start();
    }
}