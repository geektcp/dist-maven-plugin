package com.geektcp.common.dist;

import com.geektcp.common.core.system.Sys;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author geektcp on 2023/2/3 11:27.
 */

/**
 * @goal goal2
 */
public class Goal2Mojo extends AbstractMojo {
    @Parameter(name = "name", defaultValue = "test")
    private String name;

    public void execute() {
        getLog().info("This is thy.");
        Sys.p(123);

        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (Exception e) {
            Sys.p(e.getMessage());
        }
    }

}
