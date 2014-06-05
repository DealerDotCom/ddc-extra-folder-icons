package com.dealer.hudson.plugins.folder.icons;

import com.cloudbees.hudson.plugins.folder.FolderIconDescriptor;
import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Andrew Potter (ddcapotter)
 */
public class SsbFolderIcon extends AbstractFolderIcon {

    @DataBoundConstructor
    public SsbFolderIcon() {
        super("SuperSmashBros");
    }


    @Extension(ordinal=100)
    public static class SsbDescriptorImpl extends FolderIconDescriptor {
        @Override
        public String getDisplayName() {
            return "SuperSmashBros Folder";
        }
    }
}
