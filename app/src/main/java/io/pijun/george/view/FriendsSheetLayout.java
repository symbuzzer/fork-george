package io.pijun.george.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

public class FriendsSheetLayout extends ConstraintLayout {
    public float hiddenStateTranslationY;

    public FriendsSheetLayout(Context context) {
        super(context);
    }

    public FriendsSheetLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FriendsSheetLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
