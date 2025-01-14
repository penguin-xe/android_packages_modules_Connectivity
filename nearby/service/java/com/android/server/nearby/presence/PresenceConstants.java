/*
 * Copyright (C) 2022 The Android Open Source Project
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

package com.android.server.nearby.presence;

import static com.android.server.nearby.common.bluetooth.fastpair.BluetoothUuids.to128BitUuid;

import com.android.server.nearby.util.ArrayUtils;

import java.util.UUID;

/**
 * Constants for Nearby Presence operations.
 */
public class PresenceConstants {
    /** The Presence UUID value in byte array format. */
    public static final byte[] PRESENCE_UUID_BYTES = ArrayUtils.intToByteArray(0xFCF1);

    /** Presence advertisement service data uuid. */
    public static final UUID PRESENCE_UUID = to128BitUuid((short) 0xFCF1);
}
