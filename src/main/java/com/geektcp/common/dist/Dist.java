package com.geektcp.common.dist;

import com.geektcp.common.core.system.Sys;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author geektcp on 2023/2/3 11:27.
 */

@Mojo(name = "dist")
public class Dist extends AbstractMojo {

    @Parameter(name = "name", defaultValue = "test")
    private String name;

    /**
     * assemble the jars when finished the operation: mvn package
     * need mv the jar and pack it ,then we will get the zip or tar file
     * which include all jar of every module.
     * */
    public void execute() {

    }

}
