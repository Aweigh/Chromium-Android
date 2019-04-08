
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/bluetooth_system.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface BluetoothSystem extends org.chromium.mojo.bindings.Interface {



    public static final class State {


        public static final int UNSUPPORTED = 0;

        public static final int UNAVAILABLE = UNSUPPORTED + 1;

        public static final int POWERED_OFF = UNAVAILABLE + 1;

        public static final int TRANSITIONING = POWERED_OFF + 1;

        public static final int POWERED_ON = TRANSITIONING + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (4);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private State() {}

    }


    public static final class SetPoweredResult {


        public static final int SUCCESS = 0;

        public static final int FAILED_UNKNOWN_REASON = SUCCESS + 1;

        public static final int BLUETOOTH_UNAVAILABLE = FAILED_UNKNOWN_REASON + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (2);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private SetPoweredResult() {}

    }


    public static final class ScanState {


        public static final int NOT_SCANNING = 0;

        public static final int TRANSITIONING = NOT_SCANNING + 1;

        public static final int SCANNING = TRANSITIONING + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (2);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private ScanState() {}

    }


    public static final class StartScanResult {


        public static final int SUCCESS = 0;

        public static final int FAILED_UNKNOWN_REASON = SUCCESS + 1;

        public static final int BLUETOOTH_UNAVAILABLE = FAILED_UNKNOWN_REASON + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (2);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private StartScanResult() {}

    }


    public static final class StopScanResult {


        public static final int SUCCESS = 0;

        public static final int FAILED_UNKNOWN_REASON = SUCCESS + 1;

        public static final int BLUETOOTH_UNAVAILABLE = FAILED_UNKNOWN_REASON + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (2);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private StopScanResult() {}

    }


    public interface Proxy extends BluetoothSystem, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BluetoothSystem, BluetoothSystem.Proxy> MANAGER = BluetoothSystem_Internal.MANAGER;


    void getState(

GetStateResponse callback);

    interface GetStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void setPowered(
boolean powered, 
SetPoweredResponse callback);

    interface SetPoweredResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void getScanState(

GetScanStateResponse callback);

    interface GetScanStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void startScan(

StartScanResponse callback);

    interface StartScanResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void stopScan(

StopScanResponse callback);

    interface StopScanResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void getAvailableDevices(

GetAvailableDevicesResponse callback);

    interface GetAvailableDevicesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<BluetoothDeviceInfo[]> { }


}