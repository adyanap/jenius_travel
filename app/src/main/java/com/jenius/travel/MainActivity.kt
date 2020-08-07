package com.jenius.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("username")

        val bundle = Bundle();
        bundle.putString("username", username);

        val profileFragment = ProfileFragment();
        profileFragment.arguments = bundle;

        replaceFragment(profileFragment);

        button_nav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menu_profile -> {
                    val bundle = Bundle();
                    bundle.putString("username", username);

                    val profileFragment = ProfileFragment();
                    profileFragment.arguments = bundle;


                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, profileFragment)
                        .commit()

                    true

                }

                R.id.menu_travel_list -> {
                    supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_container, TravelListFragment())
                    .commit();

                    true

                }

                else -> false
            }
        }

//        button_profile.setOnClickListener {
//            val bundle = Bundle();
//            bundle.putString("username", username);
//
//            val profileFragment = ProfileFragment();
//            profileFragment.arguments = bundle;
//
//
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.frame_container, profileFragment)
//                .commit();
//        }
//
//        button_travel.setOnClickListener {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.frame_container, TravelListFragment())
//                .commit();
//        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }
}
