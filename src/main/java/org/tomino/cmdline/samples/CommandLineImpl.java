package org.tomino.cmdline.samples;

import java.util.Arrays;

/**
 * The class contains implementations of all commands supported by program.
 */
public class CommandLineImpl implements ICommandLine {
    public String globalParameter = null;

    public void defaultCommand() {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.println("Default Command");
    }

    public void simpleCommand() {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.println("Simple Command");
    }

    public void complexCommand(int param1, String param2, boolean param3) {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.printf("Complex Command: %d, %s, %b%n", param1, param2, param3);
    }

    public void complexCommandWithArrayParameter(int[] param1) {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.printf("Complex Command with array parameter: %d, %s%n", param1.length, Arrays.toString(param1));
    }

    public void complexCommandWithUnnamedArrayParameter(int[] param1) {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.printf("Complex Command with array parameter: %d, %s%n", param1.length, Arrays.toString(param1));
    }

    public void complexCommandWithUnnamedParameters(int param1, String param2, boolean param3) {
        System.out.printf("globalParameter=%s%n", this.globalParameter);
        System.out.printf("Complex Command with unnamed parameters: %d, %s, %b%n", param1, param2, param3);
    }

    public void help(String help) {
        System.out.println(help);
    }
}
