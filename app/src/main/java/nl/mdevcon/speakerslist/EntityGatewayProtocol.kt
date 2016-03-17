package nl.mdevcon.speakerslist

interface EntityGatewayProtocol {
    fun fetchAllSpeakers(): List<Speaker>
}
