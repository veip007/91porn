package com.u9porn.di.component;

import com.u9porn.di.PerService;
import com.u9porn.di.module.ServiceModule;
import com.u9porn.service.DownloadVideoService;

import dagger.Component;

/**
 * @author flymegoc
 * @date 2018/2/4
 */
@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
    void inject(DownloadVideoService downloadVideoService);
}
