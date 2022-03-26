package Day4.Answer3.business.abstracts;

import Day4.Answer3.entities.concretes.Campaign;

public interface CampaignService {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);

}
