package hw1_ModelElements.InMemoryModel;

import hw1_ModelElements.ModelElements.Camera;
import hw1_ModelElements.ModelElements.Flash;
import hw1_ModelElements.ModelElements.PoligonalModel;
import hw1_ModelElements.ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras, List<IModelChangedObserver> changedObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changedObservers = changedObservers;
    }

    public Scene getScena(int id) {
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
