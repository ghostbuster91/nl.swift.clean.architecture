package nl.mdevcon.speakerslist

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class ShowAllSpeakersInteractorTest {

    private val gateway: EntityGatewayProtocol = object : EntityGatewayProtocol {
        override fun fetchAllSpeakers() = listOf(Speaker("name", "aaa", "aaaa", Date()))
    }

    private val presenter: SpeakersListPresenterStub = SpeakersListPresenterStub()

    @Test
    fun shouldDisplayAllSpeakersFromGateway() {
        ShowAllSpeakersInteractor(gateway = gateway, presenter = presenter).showAllSpeakers()
        assertTrue(presenter.called)
    }

    class SpeakersListPresenterStub : SpeakersListPresenter {
        var called = false
        override fun presentAllSpeakers(speakers: List<SpeakerDisplayData>) {
            called = true
        }
    }
}