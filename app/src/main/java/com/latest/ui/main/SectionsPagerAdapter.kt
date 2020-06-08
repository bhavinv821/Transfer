package com.latest.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.latest.*

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
        R.string.tab_text_3,
    R.string.tab_text_4,
    R.string.tab_text_5

)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {

    when(position){
        0->{
            val app = appFragment()
            return app
        }
        1-> {
            val photo = photoFragment()
            return photo
        }
        2->{
            val video = videoFragment()
            return video
        }
        3->{
            val music  = musicFragment()
            return music
        }
        4->{
            val file = fileFragment()
            return file;
        }
    }

        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 5
    }
}