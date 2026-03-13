package org.example.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import myprofileapp.composeapp.generated.resources.Res
import myprofileapp.composeapp.generated.resources.meng

@Composable
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFF3EEE7)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                ProfileCard(
                    name = "Silvia",
                    nim = "123140133",
                    bio = "Calon Ahli SYURGA yang baik lagipun Dermawan",
                    email = "taktaulah04@gmail.com",
                    phone = "+62 821 6941 0745",
                    location = "Solok, Sumatra Barat"
                )
            }
        }
    }
}

@Composable
fun ProfileCard(
    name: String,
    nim: String,
    bio: String,
    email: String,
    phone: String,
    location: String
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileHeader(name, nim)

            Text(
                text = bio,
                fontSize = 14.sp,
                color = Color.Gray
            )

            InfoItem("💌", "Email", email, Color(0xFFE8F5E9))
            InfoItem("📱", "Phone", phone, Color(0xFFFFEBEE))
            InfoItem("📍", "Location", location, Color(0xFFFFF3E0))

            HobbySection()

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "🌸 Contact Me",
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun ProfileHeader(
    name: String,
    nim: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(Res.drawable.meng),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = name,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = nim,
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun InfoItem(
    icon: String,
    label: String,
    value: String,
    bgColor: Color
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = bgColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = icon,
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = label,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )

                Text(
                    text = value,
                    fontSize = 15.sp,
                    color = Color.DarkGray
                )
            }
        }
    }
}

@Composable
fun HobbySection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Hobbies",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HobbyChip(
                    icon = "🍔",
                    text = "Eating",
                    bgColor = Color(0xFFFFF3E0),
                    modifier = Modifier.weight(1f)
                )
                HobbyChip(
                    icon = "😴",
                    text = "Sleeping",
                    bgColor = Color(0xFFE8F5E9),
                    modifier = Modifier.weight(1f)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HobbyChip(
                    icon = "🎬",
                    text = "Watching K-Drama",
                    bgColor = Color(0xFFFFEBEE),
                    modifier = Modifier.weight(1f)
                )
                HobbyChip(
                    icon = "⭐",
                    text = "Fangirl",
                    bgColor = Color(0xFFEDE7F6),
                    modifier = Modifier.weight(1f)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HobbyChip(
                    icon = "💸",
                    text = "Becoming Rich",
                    bgColor = Color(0xFFFFF8E1),
                    modifier = Modifier.weight(1f)
                )
                HobbyChip(
                    icon = "💭",
                    text = "Daydreaming",
                    bgColor = Color(0xFFE3F2FD),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun HobbyChip(
    icon: String,
    text: String,
    bgColor: Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(18.dp))
            .background(bgColor)
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = icon,
                fontSize = 13.sp
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            color = Color.DarkGray
        )
    }
}