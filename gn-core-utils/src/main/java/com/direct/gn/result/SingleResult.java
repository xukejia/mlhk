package com.direct.gn.result;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SingleResult<T> extends Result {

    /**
     * 
     */
    private static final long serialVersionUID = -3284587087945229723L;

    private T                 result;

    public SingleResult(boolean isSuccess, String errorCode, String errorHint, T result) {
        super(isSuccess, errorCode, errorHint);
        this.result = result;
    }

    public SingleResult(boolean isSuccess, T result) {
        super(isSuccess);
        this.result = result;
    }

    public SingleResult() {
        super(false);
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
