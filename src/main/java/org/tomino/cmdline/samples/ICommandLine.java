package org.tomino.cmdline.samples;

import org.tomino.cmdline.annotation.*;

/**
 * The interface defining all comand line options supported by program.
 */
public interface ICommandLine {
    @Name(name = "global", shortName = "g", description = "Global parameter available to all commands")
    String globalParameter = null;

    @DefaultCommand
    @Name(name = "default", shortName = "d", description = "Default command with simple action")
    void defaultCommand();

    @Name(name = "simple", shortName = "s", description = "Simple command with simple action")
    void simpleCommand();

    @Name(name = "complex", shortName = "c", description = "Complex command with parameters")
    void complexCommand(
            @Name(name = "param1", shortName = "p1", description = "First parameter")
            @LongRange(min = 10, max = 100)
            int param1,

            @Required
            @Name(name = "param2", shortName = "p2", description = "Second parameter")
            @Regex("a[0-9]+")
            String param2,

            @DefaultValue("true")
            @Name(name = "param3", shortName = "p3", description = "Third parameter")
            boolean param3);

    @Name(name = "array", shortName = "a", description = "Complex command with array parameter")
    void complexCommandWithArrayParameter(
            @Name(name = "param1", shortName = "p1", description = "First parameter")
            @LongRange(min = 10, max = 100)
            int[] param1);

    @Name(name = "array2", shortName = "ua", description = "Complex command with unnamed array parameter")
    void complexCommandWithUnnamedArrayParameter(
            @Unnamed(description = "First parameter")
            @LongRange(min = 10, max = 100)
            int[] param1);

    @Name(name = "unnamed", shortName = "u", description = "Complex command with unnamed parameters")
    void complexCommandWithUnnamedParameters(
            @Name(name = "param1", shortName = "p1", description = "First parameter")
            @LongRange(min = 10, max = 100)
            int param1,

            @Required
            @Unnamed(description = "Second parameter")
            @Regex("a[0-9]+")
            String param2,

            @DefaultValue("true")
            @Unnamed(description = "Third parameter")
            boolean param3);

    @Help
    @Name(name = "help", shortName = "h", description = "Help command displaying the usage information")
    void help(
            @Name(name = "help", description = "Help text")
            String help);
}
