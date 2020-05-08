package com.example.application

import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import sun.util.locale.provider.LocaleProviderAdapter.getAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //bluetooth functionality

        /*
        //varaiable decleration
        val REQUEST_ENABLE_BT = 1;


        //get the bluetooth adapter
        val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
        if (bluetoothAdapter == null) {
            // Device doesn't support Bluetooth
        }

        //enable bluetooth
        if (bluetoothAdapter?.isEnabled == false) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
        }

        //query paired devices
        val pairedDevices: Set<BluetoothDevice>? = bluetoothAdapter?.bondedDevices
        pairedDevices?.forEach { device ->
            val deviceName = device.name
            val deviceHardwareAddress = device.address // MAC address
        }

        //discover devices
        */

        val bluetoothManager =
            getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        val mBluetoothAdapter = bluetoothManager.adapter



        //end bluetooth

        //transition to pages
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, LightsPage::class.java)
            startActivity(intent);
        }
        button2.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, VibratePage::class.java)
            startActivity(intent);
        }
        button3.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, AudioPage::class.java)
            startActivity(intent);
        }
    }
}
