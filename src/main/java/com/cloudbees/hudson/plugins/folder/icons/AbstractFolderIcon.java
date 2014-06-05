/*
 * The MIT License
 *
 * Copyright 2013 CloudBees.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cloudbees.hudson.plugins.folder.icons;

import com.cloudbees.hudson.plugins.folder.Folder;
import com.cloudbees.hudson.plugins.folder.FolderIcon;
import com.cloudbees.hudson.plugins.folder.FolderIconDescriptor;
import hudson.model.Hudson;
import org.kohsuke.stapler.Stapler;

/**
 * Default folder icon.
 */
public abstract class AbstractFolderIcon extends FolderIcon {

    String name;

    public AbstractFolderIcon(String name) {
        this.name = name;
    }

    public String getImageOf(String size) {
        return Stapler.getCurrentRequest().getContextPath()+ Hudson.RESOURCE_PATH+"/images/smarticons/"+name+"_"+size+".png";
    }

    @Override
    protected void setFolder(Folder folder) {
        name = folder.getName().replaceAll("[^\\p{ASCII}]", "");
    }

    public String getDescription() {
        return "Folder: " + name;
    }

    public static class AbstractDescriptorImpl extends FolderIconDescriptor {
        @Override
        public String getDisplayName() {
            return "Abstract Folder";
        }
    }
}
