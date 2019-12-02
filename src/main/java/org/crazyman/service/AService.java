package org.crazyman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {

    private BService bService;

    private CService cService;

    private DService dService;

    @Autowired
    public AService(BService bService) {
        this.bService = bService;
    }

    public String getString(){
        return cService.test();
    }

}
