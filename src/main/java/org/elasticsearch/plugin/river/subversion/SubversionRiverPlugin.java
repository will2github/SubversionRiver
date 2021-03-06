/*
 * Copyright [2013] [Pascal Lombard]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.elasticsearch.plugin.river.subversion;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.river.RiversModule;
import org.elasticsearch.river.subversion.SubversionRiverModule;

/**
 * Created by : Pascal.Lombard
 */
public class SubversionRiverPlugin extends AbstractPlugin {

    @Inject public SubversionRiverPlugin() {
    }

    @Override
    public String name() {
        return "river-subversion";
    }

    @Override
    public String description() {
        return "River Subversion Plugin";
    }

    @Override public void processModule(Module module) {
        if (module instanceof RiversModule) {
            ((RiversModule) module).registerRiver("svn", SubversionRiverModule.class);
        }
    }
}
