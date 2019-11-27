package Program.Car;

import Program.Spot.SpotLength;

public enum CarCategory {
  SP, KO, LU, KL(SpotLength.LONG), TR(SpotLength.LONG);

  private SpotLength spotLength;

  private CarCategory(SpotLength spotLength) {
    this.spotLength = spotLength;
  }

  private CarCategory() {
    this.spotLength = SpotLength.SHORT;
  }

  public SpotLength getSpotLength() {
    return this.spotLength;
  }

  }

