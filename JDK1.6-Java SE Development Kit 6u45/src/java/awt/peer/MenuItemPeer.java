/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package java.awt.peer;

/**
 * The peer interfaces are intended only for use in porting
 * the AWT. They are not intended for use by application
 * developers, and developers should not implement peers
 * nor invoke any of the peer methods directly on the peer
 * instances.
 */
public interface MenuItemPeer extends MenuComponentPeer {
    void setLabel(String label);
    void setEnabled(boolean b);

    /**
     * DEPRECATED:  Replaced by setEnabled(boolean).
     */
    void enable();

    /**
     * DEPRECATED:  Replaced by setEnabled(boolean).
     */
    void disable();
}

