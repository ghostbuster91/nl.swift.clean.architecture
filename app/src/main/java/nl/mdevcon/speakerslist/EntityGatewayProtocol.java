package nl.mdevcon.speakerslist;

import java.util.List;

public interface EntityGatewayProtocol {
    List<Speakers> fetchAllSpeakers();
}
