package plugin.enemydown.app.mapper;

import java.util.List;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.PlayerScore;
import plugin.enemydown.app.mapper.data.SpawnEnemy;

@Mapper
public interface GameConfigMapper {

  @Select("select * from game_config")
  List<GameConfig>selectConfigList();

  @Select("select * from game_config where difficulty = #{difficulty}")
  GameConfig selectConfig(String difficulty);

  @Select("select * from spawn_enemy inner join game_config on spawn_enemy.difficulty = game_config.difficulty where spawn_enemy.difficulty = #{difficulty}")
  List<SpawnEnemy>selectSpawnEnemyList(String difficulty);

}
