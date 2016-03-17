package nl.mdevcon.speakerslist

interface SpeakersListPresenter {
    fun presentAllSpeakers(speakers: List<SpeakerDisplayData>)
}