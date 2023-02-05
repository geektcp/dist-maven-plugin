package com.geektcp.common.dist;

import com.geektcp.common.core.system.Sys;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.OutputStream;

/**
 * @author geektcp on 2023/2/3 11:27.
 */

@Mojo(name = "build")
public class Build extends AbstractMojo {

    @Parameter(name = "name", defaultValue = "test")
    private String name;

    public void execute() {
        String command = "mvn clean javadoc:jar deploy -P release,gpg";
        Sys.p("command: " + command);
        Process process = Sys.exec(command);
        Sys.printCommandResult(process);
    }

}
