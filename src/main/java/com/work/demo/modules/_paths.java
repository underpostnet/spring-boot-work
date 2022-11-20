package com.work.demo.modules;

import java.io.File;
import java.io.IOException;

public final class _paths {

    public String absolutePath;

    public _paths(String absolutePath) {
        // this.parentPath = new File(absolutePath).getParent();
        this.absolutePath = absolutePath;
    }

    public String getPathFromRelative(String relativePath) throws IOException {
        return new File(this.absolutePath, relativePath).getCanonicalPath(); // may throw IOException
    }

}
