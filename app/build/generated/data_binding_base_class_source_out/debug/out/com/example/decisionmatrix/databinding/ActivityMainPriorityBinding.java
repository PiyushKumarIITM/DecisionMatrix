// Generated by view binder compiler. Do not edit!
package com.example.decisionmatrix.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.decisionmatrix.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainPriorityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout mainLayout;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final Toolbar toolbar4;

  private ActivityMainPriorityBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout mainLayout, @NonNull TextView textView8, @NonNull Toolbar toolbar4) {
    this.rootView = rootView;
    this.mainLayout = mainLayout;
    this.textView8 = textView8;
    this.toolbar4 = toolbar4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainPriorityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainPriorityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_priority, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainPriorityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.main_layout;
      LinearLayout mainLayout = ViewBindings.findChildViewById(rootView, id);
      if (mainLayout == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.toolbar4;
      Toolbar toolbar4 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar4 == null) {
        break missingId;
      }

      return new ActivityMainPriorityBinding((ConstraintLayout) rootView, mainLayout, textView8,
          toolbar4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
