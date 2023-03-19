package com.example.jetpacknavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpacknavigation.ui.composeui.CentralPage
import com.example.jetpacknavigation.ui.composeui.EastPage
import com.example.jetpacknavigation.ui.composeui.NorthPage
import com.example.jetpacknavigation.ui.composeui.WestPage
import com.example.jetpacknavigation.ui.theme.JetpackNavigationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackNavigationTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        TopAppBar {
                            Spacer(modifier = Modifier.weight(1f))
                            Text(text = "Cardinal Navigation")
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "central") {
                        composable("central") {
                            CentralPage(
                                onToNorthClick = { navController.navigate("north") },
                                onToEastClick = { navController.navigate("east") },
                                onToWestClick = { navController.navigate("west") },
                                onToSouthClick = { navController.navigate("south") },
                            )
                        }
                        composable("north") {
                            NorthPage()
                        }
                        composable("east") {
                            EastPage()
                        }
                        composable("north") {
                            NorthPage()
                        }
                        composable("west") {
                            WestPage()
                        }
                    }
                }
            }

        }
    }
}
