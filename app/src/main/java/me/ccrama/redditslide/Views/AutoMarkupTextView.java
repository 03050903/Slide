package me.ccrama.redditslide.Views;

import android.content.Context;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by ccrama on 5/5/2015.
 */
public class AutoMarkupTextView extends TextView {

    public AutoMarkupTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public AutoMarkupTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public AutoMarkupTextView(Context context) {
        super(context);
    }

    public void addText(String s) {
        parseLinks(s);
    }

    private void parseLinks(String s) {


        setText(s);
        int mask = Linkify.WEB_URLS;
        Linkify.addLinks(this, mask);

        //todo this setMovementMethod(new CommentMovementMethod());

    }


}