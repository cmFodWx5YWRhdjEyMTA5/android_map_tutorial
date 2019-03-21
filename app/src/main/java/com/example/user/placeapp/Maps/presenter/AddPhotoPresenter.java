package com.example.user.placeapp.Maps.presenter;

import android.util.Log;

import com.example.user.placeapp.Maps.AddPhotoContract;
import com.example.user.placeapp.Maps.model.MapServiceModel;
import com.example.user.placeapp.POJO.sPlaceOverview;

import java.io.File;

public class AddPhotoPresenter implements AddPhotoContract.Presenter {
    AddPhotoContract.View addPhotoView;
    MapServiceModel mapServiceModel;

    public AddPhotoPresenter(AddPhotoContract.View addPhotoView) {
        this.addPhotoView = addPhotoView;

        mapServiceModel = new MapServiceModel();
    }

    @Override
    public void submitPhoto(String poiId, String imagePath) {
        File file = new File(imagePath);
        mapServiceModel.addPlacePhoto(poiId, file, new MapServiceModel.addPlacePhotoListener() {
            @Override
            public void onAddPlacePhotoFinished(sPlaceOverview response) {
                addPhotoView.submitFinished(response);
            }

            @Override
            public void onAddPlacePhotoFailure(Throwable t) {
                Log.d("submitPhoto", t.getMessage().toString());
            }
        });
    }
}
