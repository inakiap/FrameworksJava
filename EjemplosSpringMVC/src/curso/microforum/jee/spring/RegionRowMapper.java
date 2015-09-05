package curso.microforum.jee.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import curso.microforum.jee.spring.Regions;

/**
 * Clase que traduce los resultsets que obtenemos con las búsquedas en objetos java del tipo que queremos.
 * @author Spring
 *
 */
public class RegionRowMapper implements RowMapper<Regions> {

	@Override
	public Regions mapRow(ResultSet rs, int nfila) throws SQLException {

		Regions region = null;
		
		region = new Regions(rs.getLong("REGION_ID"), rs.getString("REGION_NAME"));
		
		return region;
	}

}
