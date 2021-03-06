/*
 * Copyright (C) 2017 Shuma Yoshioka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.s64.android.navigationbarview.item;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.View;

public interface INavigationBarItem {

    @IdRes
    int getIdRes();

    @Nullable
    String getText(boolean isChecked);

    @ColorInt
    int getTextColorInt(boolean isChecked);

    View updateIcon(@Nullable View original, Context context, int width, int height, IconAnimator animator);

    void onItemViewCreated(View newView);

    void onItemViewRemoved(View removedView);

    @Nullable
    Integer getIconPixelSize();

    class IconAnimator {

        public final boolean isChecked;
        public final boolean oldIsChecked;
        public final float fraction;

        public IconAnimator(boolean isChecked, boolean oldIsChecked, float fraction) {
            this.isChecked = isChecked;
            this.oldIsChecked = oldIsChecked;
            this.fraction = fraction;
        }

    }

}
