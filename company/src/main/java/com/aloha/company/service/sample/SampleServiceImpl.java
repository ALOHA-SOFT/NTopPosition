package com.aloha.company.service.sample;

import org.springframework.stereotype.Service;

import com.aloha.company.domain.Sample;
import com.aloha.company.mapper.SampleMapper;
import com.aloha.company.service.BaseServiceImpl;

import groovy.util.logging.Slf4j;

@Slf4j
@Service
public class SampleServiceImpl extends BaseServiceImpl<Sample, SampleMapper> implements SampleService {

  
}
