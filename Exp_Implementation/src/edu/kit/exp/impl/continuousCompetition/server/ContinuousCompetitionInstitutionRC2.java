package edu.kit.exp.impl.continuousCompetition.server;

import edu.kit.exp.server.communication.ServerMessageSender;
import edu.kit.exp.server.jpa.entity.Membership;

import java.util.List;

/**
 * Created by dschnurr on 17.10.14.
 */
public class ContinuousCompetitionInstitutionRC2 extends  ContinuousCompetitionInstitution {

    public ContinuousCompetitionInstitutionRC2(ContinuousCompetitionEnvironmentDuopoly environment, List<Membership> memberships, ServerMessageSender messageSender, String gameId) {
        super(environment, memberships, messageSender, gameId);
    }

    @Override
    protected void setupTreatmentConditions() {
        isTriopolyTreatment = false;
        isCournotTreatment = true;
        isDiscreteTreatment = false;
        isDecisionSupport = false;
        duration = 1800000;
        updateTimeStep = 500;
    }

}
