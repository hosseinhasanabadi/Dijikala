package com.example.dijikala.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dijikala.R
import com.example.dijikala.ui.componemts.RoundedIconBox
import com.example.dijikala.ui.theme.LocalSpacing

@Composable
fun ShowcaseSection(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = LocalSpacing.current.semiMedium,
                vertical = LocalSpacing.current.biggerSmall
            )

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = LocalSpacing.current.semeSmall)
            , horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )






        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = LocalSpacing.current.semeSmall),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )
            RoundedIconBox(
                title = stringResource(id = R.string.digikala_jet),
                image = painterResource(id = R.drawable.digijet),
                onClick = {},


                )






        }

    }

}