/*
 * Copyright 2002-${Year} the original author or authors.
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
package com.cola.lib.cache.hibernate.region;

import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.cache.spi.TimestampsRegion;
import org.springframework.cache.Cache;

import java.util.Properties;

/**
 * cola
 * Created by jiachen.shi on 8/29/2016.
 */
public class DefaultTimestampRegion extends DefaultGeneralDataRegion implements TimestampsRegion {

    public DefaultTimestampRegion(String regionName, Cache cache, Properties properties, SessionFactoryOptions settings) {
        super(regionName, cache, properties);
    }

}
