package com.google.immutableclass.immutableclass2;

public final class ImmutableClass {

    private final int id;
    private final StringBuffer stringBuffer;

    public ImmutableClass(int id, StringBuffer sb) {
        this.id = id;
        this.stringBuffer = new StringBuffer(sb);
    }

    public int getId() {
        return id;
    }

    public StringBuffer getStringBuffer() {
        return new StringBuffer(stringBuffer);
    }
}
