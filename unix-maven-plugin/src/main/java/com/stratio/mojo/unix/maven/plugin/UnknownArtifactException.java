 package com.stratio.mojo.unix.maven.plugin;

import org.apache.maven.artifact.*;

import java.util.*;

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 */
public class UnknownArtifactException
    extends Exception
{
    public final String artifact;

    public final Map<String, Artifact> artifactMap;

    public UnknownArtifactException( String artifact, Map<String, Artifact> artifactMap )
    {
        this.artifact = artifact;
        this.artifactMap = artifactMap;
    }
}
