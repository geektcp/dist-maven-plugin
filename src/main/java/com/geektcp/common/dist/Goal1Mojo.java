package com.geektcp.common.dist;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Administrator on 2023/2/3 11:26.
 */
public class Goal1Mojo extends AbstractMojo {

    @Parameter(name = "name", defaultValue = "test")
    private String name;

    public void execute() {
        getLog().info("This is goal1.");
    }
}
