package com.work.demo.modules;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class _files {

    public static String getRawContent(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

}
