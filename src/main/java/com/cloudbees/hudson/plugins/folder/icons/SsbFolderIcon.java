package com.cloudbees.hudson.plugins.folder.icons;

import com.cloudbees.hudson.plugins.folder.FolderIconDescriptor;

/**
 * @author Andrew Potter (ddcapotter)
 */
public class SsbFolderIcon extends AbstractFolderIcon {

    public SsbFolderIcon() {
        super("SuperSmashBros");
    }

    public static class SsbDescriptorImpl extends FolderIconDescriptor {
        @Override
        public String getDisplayName() {
            return "SuperSmashBros Folder";
        }
    }
}
