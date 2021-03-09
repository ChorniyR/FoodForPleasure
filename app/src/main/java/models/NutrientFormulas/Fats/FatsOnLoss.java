package models.NutrientFormulas.Fats;

public class FatsOnLoss implements IFatsOption {
    @Override
    public int process(int calories) {
        return (int)(calories*0.35/0.9);
    }
}
