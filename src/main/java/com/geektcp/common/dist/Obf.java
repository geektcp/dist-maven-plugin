package com.geektcp.common.dist;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author geektcp on 2023/2/3 11:27.
 */

@Mojo(name = "obf")
public class Obf extends AbstractMojo {

    @Parameter(name = "name", defaultValue = "test")
    private String name;



    @Parameter(name = "code", defaultValue = "THY")
    private String code;


    /**
     * assemble the jars when finished the operation: mvn package
     * need mv the jar and pack it ,then we will get the zip or tar file
     * which include all jar of every module.
     * */
    public void execute() {
        getLog().info("name: " + name);
        getLog().info("code: " + code);
    }

}
