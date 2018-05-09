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
import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

/**
 * This example illustrates how to create an ImageJ {@link Command} plugin.
 * <p>
 * You should replace the parameter fields with your own inputs and outputs,
 * and replace the {@link run} method implementation with your own logic.
 * </p>
 */
@Plugin(type = Command.class, menuPath = "Plugins>Gauss Filtering")
public class DummyCommand<T extends RealType<T>> implements Command {

    @Override
    public void run() {
    	// ImageJ command here
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
