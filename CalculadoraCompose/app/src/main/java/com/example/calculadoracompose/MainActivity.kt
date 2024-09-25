package com.example.calculadoracompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoracompose.ui.theme.CalculadoraComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraComposeTheme {
                MainPreview();
            }
        }
    }
}

@Composable
fun LandscapeView(numbers: MutableState<String>) {

    Column(
        modifier = Modifier
            .background(Color(4279505940))
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            Modifier
                .padding(40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = numbers.value,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp, end = 35.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Button(
                        onClick = { numbers.value = "0" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "C",
                            color = Color(4290748426),
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value.dropLast(1) },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "<",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }

                    Button(
                        onClick = { numbers.value += "%" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "%",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "/" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "/",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "1" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "1")
                    }
                    Button(
                        onClick = { numbers.value += "2" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "2")
                    }
                    Button(
                        onClick = { numbers.value += "3" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "3")
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { numbers.value += "x" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "x",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "-" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "-",
                            color = Color(4290748426),
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "+" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "+",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "." },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = ".")
                    }
                    Button(
                        onClick = { numbers.value += "4" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "4")
                    }
                    Button(
                        onClick = { numbers.value += "5" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "5")
                    }
                    Button(
                        onClick = { numbers.value += "6" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "6")
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { numbers.value += "=" },
                        modifier = Modifier
                            .width(196.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4290748426))
                    ) {
                        Text(
                            text = "=",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "0" },
                        modifier = Modifier
                            .width(196.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "0")
                    }

                    Button(
                        onClick = { numbers.value += "7" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "7")
                    }
                    Button(
                        onClick = { numbers.value += "8" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "8")
                    }
                    Button(
                        onClick = { numbers.value += "9" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(text = "9")
                    }
                }
            }
        }
    }
}

@Composable
fun PortraitView(numbers: MutableState<String>) {

    Column(
        modifier = Modifier
            .background(Color(4279505940))
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth()
        ) {
            TextField(
                value = numbers.value,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp, start = 5.dp, end = 5.dp)
            )


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { numbers.value = "0" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "C",
                            color = Color(4290748426),
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value.dropLast(1) },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "<",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }

                    Button(
                        onClick = { numbers.value += "%" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "%",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                    Button(
                        onClick = { numbers.value += "/" },
                        modifier = Modifier
                            .width(65.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(20),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                    ) {
                        Text(
                            text = "/",
                            color = Color(4290748426),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Light
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = { numbers.value += "1" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "1")
                        }
                        Button(
                            onClick = { numbers.value += "2" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "2")
                        }
                        Button(
                            onClick = { numbers.value += "3" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "3")
                        }
                        Button(
                            onClick = { numbers.value += "x" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(
                                text = "x",
                                color = Color(4290748426),
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = { numbers.value += "4" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "4")
                        }
                        Button(
                            onClick = { numbers.value += "5" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "5")
                        }
                        Button(
                            onClick = { numbers.value += "6" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "6")
                        }
                        Button(
                            onClick = { numbers.value += "-" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(
                                text = "-",
                                color = Color(4290748426),
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = { numbers.value += "7" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "7")
                        }
                        Button(
                            onClick = { numbers.value += "8" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "8")
                        }
                        Button(
                            onClick = { numbers.value += "9" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "9")
                        }
                        Button(
                            onClick = { numbers.value += "+" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(
                                text = "+",
                                color = Color(4290748426),
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Button(
                            onClick = { numbers.value += "0" },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = "0")
                        }
                        Button(
                            onClick = { numbers.value += "." },
                            modifier = Modifier
                                .width(65.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4281611316))
                        ) {
                            Text(text = ".")
                        }
                        Button(
                            onClick = { numbers.value += "=" },
                            modifier = Modifier
                                .width(155.dp)
                                .height(60.dp),
                            shape = RoundedCornerShape(20),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(4290748426))
                        ) {
                            Text(
                                text = "=",
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    device = "spec:width=448dp,height=998dp,dpi=420,isRound=false,chinSize=0dp,orientation=portrait"
)

@Composable
fun MainPreview() {
    var numbers: MutableState<String> = rememberSaveable { mutableStateOf("0") };
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            LandscapeView(numbers)
        }

        else -> {
            PortraitView(numbers)
        }
    }
}