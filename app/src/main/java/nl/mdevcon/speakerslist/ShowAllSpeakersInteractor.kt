package nl.mdevcon.speakerslist

class ShowAllSpeakersInteractor(val gateway: EntityGatewayProtocol) {

    fun showAllSpeakers() {
        val speakers = gateway.fetchAllSpeakers()
        speakers.map { it.toDisplayData() }
    }
}
