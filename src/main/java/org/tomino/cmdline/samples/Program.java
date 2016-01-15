package org.tomino.cmdline.samples;

import org.tomino.cmdline.CmdParser;

/**
 * Sample program using cmd-parser library.
 */
public class Program {
    public static void main(String[] args) {
        CmdParser.dispatchArgs(args, new CommandLineImpl());
    }
}
