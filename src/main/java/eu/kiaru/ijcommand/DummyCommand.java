/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

package eu.kiaru.ijcommand;

import net.imagej.ImageJ;
import net.imglib2.type.numeric.RealType;
import sc.iview.SciView;
import sc.iview.vector.ClearGLVector3;
import sc.iview.vector.Vector3;

import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.util.Colors;

/**
 * This example illustrates how to create an ImageJ {@link Command} plugin.
 * <p>
 * You should replace the parameter fields with your own inputs and outputs,
 * and replace the {@link run} method implementation with your own logic.
 * </p>
 */
@Plugin(type = Command.class, menuPath = "Plugins>Gauss Filtering")
public class DummyCommand<T extends RealType<T>> implements Command {

    @Parameter
    private SciView sciView;
	
    @Override
    public void run() {
    	// ImageJ command here
    	
        int numPoints = 25;
        Vector3[] points = new Vector3[numPoints];

        for( int k = 0; k < numPoints; k++ ) {
            points[k] = new ClearGLVector3( ( float ) ( 10.0f * Math.random() - 5.0f ), //
                                            ( float ) ( 10.0f * Math.random() - 5.0f ), //
                                            ( float ) ( 10.0f * Math.random() - 5.0f ) );
        }

        double edgeWidth = 0.1;

        sciView.addLine( points, Colors.LIGHTSALMON, edgeWidth );
    }

    /**
     * This main function allows to run the plugin immediately out of
     * an integrated development environment (IDE).
     *
     * @param args whatever, it's ignored
     * @throws Exception
     */
    public static void main(final String... args) throws Exception {
        // create the ImageJ application context with all available services
        final ImageJ ij = new ImageJ();
        ij.ui().showUI();
        ij.command().run(DummyCommand.class, true);
    }

}
