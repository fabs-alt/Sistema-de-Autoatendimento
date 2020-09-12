package br.com.tcc30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener{menuItem ->
            when{
                menuItem.itemId == R.id.navgationHome -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navgationMenu-> {
                    loadFragment(MenuFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navgationShopping-> {
                    loadFragment(ShoppingFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navgationMenu-> {
                    loadFragment(ProductFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                    menuItem.itemId == R.id.navgationProfile-> {
                    loadFragment(ProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else ->{
                    return@setOnNavigationItemSelectedListener false
                }
            }

        }
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer,fragment)
            fragmentTransaction.commit()
        }
    }
}

