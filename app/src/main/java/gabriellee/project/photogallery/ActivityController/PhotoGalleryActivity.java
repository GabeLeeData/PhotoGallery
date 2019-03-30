package gabriellee.project.photogallery.ActivityController;

import android.support.v4.app.Fragment;

import gabriellee.project.photogallery.FragmentController.PhotoGalleryFragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();

    }
}
