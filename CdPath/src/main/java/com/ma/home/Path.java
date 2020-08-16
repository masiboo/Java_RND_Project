package com.ma.home;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        String[] newP = newPath.split("/");
        String[] oldPath = path.split("/");

        int countBack = 0;

        for (String str : newP) {
            if (str.equals("..")) {
                ++countBack;
            }
        }

        int len = oldPath.length;
        StringBuffer outBuf = new StringBuffer();

        for (int i = 0; i < len - countBack; i++)
        {
            outBuf.append(oldPath[i] + "/");
        }

        // Iterate the array of new path string.
        len = newP.length;
        for (int i=0; i<len; ++i) {
            if (!newP[i].equals("..")) {
                outBuf.append(newP[i]+"/");
            }
        }

        // Removing the extra last slash.
        path = outBuf.substring(0,outBuf.length()-1).toString();
    }


    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}