package org.eclipse.microprofile.maven.pdf;

import java.io.File;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Turns existing PDF file into the main project artifact.
 * 
 * @author Ondrej Mihalyi
 */
@Mojo(name = "pdfArtifact", defaultPhase = LifecyclePhase.PACKAGE)
public class PdfArtifactMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project.build.finalName}", readonly = true)
    private String filelName;

    @Parameter(defaultValue = "${project.build.directory}", required = true)
    private File directory;

    /**
     * The {@link {MavenProject}.
     */
    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    public void execute() throws MojoExecutionException {
        File pdfFile = new File(directory, filelName + ".pdf");
        if (pdfFile.canRead()) {
            project.getArtifact().setFile(pdfFile);
            getLog().info("File " + pdfFile.getAbsolutePath() + " set as the project main artifact.");
        } else {
            String errorMsg = "File " + pdfFile.getAbsolutePath() + " doesn't exist or isn't readable.";
            getLog().error(errorMsg);
            throw new MojoExecutionException(errorMsg);
        }
    }
}
