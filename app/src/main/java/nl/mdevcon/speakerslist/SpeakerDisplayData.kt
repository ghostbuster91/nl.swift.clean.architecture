package nl.mdevcon.speakerslist

class SpeakerDisplayData(val name: String, val title: String, val dateSubmitted: String) {
    constructor(speaker: Speaker) : this(speaker.name, speaker.title, speaker.dateSubmitted.toString())
}
