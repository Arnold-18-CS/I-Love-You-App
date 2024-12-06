package com.example.iloveyou.ui.theme

object LoveQuoteProvider {
    private val loveQuotes = listOf(
        "In your eyes, I find my home; in your heart, I find my peace; and in your soul, I find my forever.",
        "You’re the rhythm of my heartbeat, the light in my sky, and the reason my world spins.",
        "In a thousand lifetimes, I’d find you again and again, because you’re my beginning and my end.",
        "Have you listened to \"All of Me - John Legend\"? If you ever doubt my feelings listen, know that's how I feel",
        "Love is not finding someone to live with; it’s finding someone you can’t live without.",
        "One of my happiest moments was hearing you were afraid of me dying, your were so cute for that.",
        "You’re my favorite place to go, when my mind searches for peace and my heart searches for love.",
        "Your eyes so pretty I wish I could stare into them every morning I wake and before I sleep",
        "If loving you was a job, I'd work myself to death",
        "I know that I started living again the moment I met you and I appreciate you for that.",
        "When you read this I'm probably coding something, with my sleeves rolled up. Hope that's a sexy imagery for you :)",
        "我 最 爱 你。- That‘s some Chinese love for you right there.",
        "I want to hug you so hard, you go numb and kiss you so long you pass out.",
        "If you said 'no' because I was younger than you, you wouldn't be reading this. I'm happy you said yes",
        "My good girl",
        "Did you know: I'm kinda like obsessed with you.",
        "If no one has told you, you look really pretty today. Even if I can't see it, I know it.",
        "I still get butterflies everytime I hug you and my heart feels so warm every time you smile.",
        "In case you ever foolishly forget: I am never not thinking of you.",
        "I'm not going anywhere so never be anxious or worried that you won't see or hear from me again",
        "Don't tell me that you'll kill yourself cause it hurts a lot. Just say that you want to see me and I'll come",
        "You gave me someone to love, another day to look forward to and a thought to have if I'm ever tired",
        "I would not forget you even if I got amnesia or got a concussion. Wanna put it to the test? ;|",
        "I randomly woke up at midnight started writing this if you ever wonder if I think about you, I love you lots.",
        "You are my favourite autis... I mean neurodivergent person",
        "You are the chaos that I crave when my life feels empty",
        "I didn’t fall for you in a moment; I fell in love with every tiny thing you are, piece by piece."
    )

    fun getRandomQuotes(): String{
        return loveQuotes.random()
    }
}