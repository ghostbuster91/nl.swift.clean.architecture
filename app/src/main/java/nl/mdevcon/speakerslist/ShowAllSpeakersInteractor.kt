package nl.mdevcon.speakerslist

class ShowAllSpeakersInteractor(val gateway: EntityGatewayProtocol, val presenter: SpeakersListPresenter) {

    fun showAllSpeakers() {
        val speakers = gateway.fetchAllSpeakers()
        val displayData = speakers.map(::SpeakerDisplayData)
        presenter.presentAllSpeakers(displayData)
    }
}
