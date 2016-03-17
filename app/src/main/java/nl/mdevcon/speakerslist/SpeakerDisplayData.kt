package nl.mdevcon.speakerslist

class SpeakerDisplayData(val name: String, val title: String, val dateSubmitted: String)

fun Speaker.toDisplayData() = SpeakerDisplayData(name, title, dateSubmitted.toString())
