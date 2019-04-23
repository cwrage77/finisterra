package shared.network.interfaces;

import shared.network.combat.AttackRequest;
import shared.network.combat.SpellCastRequest;
import shared.network.interaction.MeditateRequest;
import shared.network.interaction.TakeItemRequest;
import shared.network.interaction.TalkRequest;
import shared.network.inventory.ItemActionRequest;
import shared.network.lobby.*;
import shared.network.lobby.player.PlayerLoginRequest;
import shared.network.movement.MovementRequest;

public class DefaultRequestProcessor implements IRequestProcessor {

    @Override
    public void processRequest(MovementRequest request, int connectionId) {

    }

    @Override
    public void processRequest(AttackRequest attackRequest, int connectionId) {

    }

    @Override
    public void processRequest(ItemActionRequest itemAction, int connectionId) {

    }

    @Override
    public void processRequest(MeditateRequest meditateRequest, int connectionId) {

    }

    @Override
    public void processRequest(TalkRequest talkRequest, int connectionId) {

    }

    @Override
    public void processRequest(TakeItemRequest takeItemRequest, int connectionId) {

    }

    @Override
    public void processRequest(SpellCastRequest spellCastRequest, int connectionId) {

    }

    @Override
    public void processRequest(JoinRoomRequest joinRoomRequest, int connectionId) {

    }

    @Override
    public void processRequest(ExitRoomRequest exitRoomRequest, int connectionId) {

    }

    @Override
    public void processRequest(CreateRoomRequest createRoomRequest, int connectionId) {

    }

    @Override
    public void processRequest(JoinLobbyRequest joinLobbyRequest, int connectionId) {

    }

    @Override
    public void processRequest(StartGameRequest startGameRequest, int connectionId) {

    }

    @Override
    public void processRequest(PlayerLoginRequest playerLoginRequest, int connectionId) {

    }
}