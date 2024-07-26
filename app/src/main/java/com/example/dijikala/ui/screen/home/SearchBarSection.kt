package com.example.dijikala.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.dijikala.R
import com.example.dijikala.ui.theme.LocalElevation
import com.example.dijikala.ui.theme.LocalShape
import com.example.dijikala.ui.theme.LocalSpacing
import com.example.dijikala.ui.theme.searchBarBg
import com.example.dijikala.ui.theme.unSelectedBottomBar
import com.example.dijikala.util.Constants
import com.example.dijikala.util.Constants.ENGLISH_LANG
import com.example.dijikala.util.Constants.USER_LANGUAGE
import okhttp3.internal.wait

@Composable
fun SearchBarSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .background(Color.White), elevation = LocalElevation.current.extraSmall
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(LocalSpacing.current.small)
                .clip(LocalShape.current.biggerSmall)
                .background(MaterialTheme.colors.searchBarBg)

        ) {
            SearchContent()

        }


    }
}

@Composable
private fun SearchContent() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start

    ) {
        Icon(
            modifier = Modifier
                .height(24.dp),
            painter = painterResource(id = R.drawable.search),
            contentDescription = ""
        )
        Text(
            modifier = Modifier
                .padding(start = 20.dp),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.unSelectedBottomBar,
          //  style = MaterialTheme.typography.
                 fontWeight = FontWeight.Normal,
            text = stringResource(id = R.string.search_in)

        )
        Image(
            modifier = Modifier
                .width(80.dp)
                .padding(start = 5.dp),

            painter = digikalaLogoChangeByLanguage()
            , contentDescription ="" )

    }
}
@Composable
private fun digikalaLogoChangeByLanguage():Painter{
    return if (USER_LANGUAGE == ENGLISH_LANG){
        painterResource(id = R.drawable.digi_red_english)
    }else{
        painterResource(id = R.drawable.digi_red_persian)

    }

}