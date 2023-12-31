package plugin.enemydown.app.mapper.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SpawnEnemy {

  private int id;
  private String difficulty;
  private  String enemy_name;
  private  int score;
}
