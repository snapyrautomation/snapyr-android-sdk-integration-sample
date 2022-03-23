/*
 * Copyright (C) 2016 The Android Open Source Project
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

package com.snapyr.docstest1;

import com.snapyr.docstest1.activities.LoggingActivity;
import com.example.android.common.logger.Log;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDoIdentify(View view) {
        Log.d(mLogTag, "Identify tapped");
    }

    public void onDoTrack(View view) {
        Log.d(mLogTag, "Track tapped");
    }

    public void onDoFlush(View view) {
        Log.d(mLogTag, "Flush tapped");
    }


}
