package com.tyjw.inspectline.web.init;

import com.tyjw.inspectline.service.PipelineService;
import com.tyjw.inspectline.web.configuration.ApplicationContextProvider;

public class InitData implements Runnable {

    private static PipelineService pipelineService;
    static {
        pipelineService = (PipelineService) ApplicationContextProvider.getBean("pipelineService");
    }

    @Override
    public void run() {
        //
    }

    /**
     * 初始化
     */
    public void initPipelineBuffer(){

    }
}
