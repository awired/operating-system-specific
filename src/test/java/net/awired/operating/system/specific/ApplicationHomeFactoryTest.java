/**
 *
 *     Copyright (C) Awired.net
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package net.awired.operating.system.specific;

import java.io.File;
import junit.framework.Assert;
import net.awired.operating.system.specific.ApplicationHome;
import net.awired.operating.system.specific.ApplicationHomeFactory;
import org.junit.Test;

public class ApplicationHomeFactoryTest {

    @Test
    public void should_find_directory() throws Exception {
        ApplicationHome applicationHome = ApplicationHomeFactory.getApplicationHome();

        File folder = applicationHome.getFolder("housecream");
        Assert.assertTrue(folder.getAbsolutePath().endsWith("/housecream"));
    }
}
