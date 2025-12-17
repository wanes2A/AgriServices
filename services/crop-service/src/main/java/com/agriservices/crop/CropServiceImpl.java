package com.agriservices.crop;
import jakarta.jws.WebService;
import model.Crop;
import java.util.*;

@WebService(endpointInterface = "com.agriservices.crop.CropService")
private final Map<String, Crop> crops = new HashMap<>();

    @Override
    public List<Crop> getAllCrops() {
        return new ArrayList<>(crops.values());
    }

    @Override
    public Crop getCropById(String id) {
        return crops.get(id);
    }

    @Override
    public Crop createCrop(Crop crop) {
        String id = UUID.randomUUID().toString();
        crop.setId(id);
        crops.put(id, crop);
        return crop;
    }

    @Override
    public boolean deleteCrop(String id) {
        return crops.remove(id) != null;
    }
}
