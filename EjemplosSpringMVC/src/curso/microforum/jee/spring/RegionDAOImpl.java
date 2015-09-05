package curso.microforum.jee.spring;

import java.util.List;

import javax.sql.DataSource;

import curso.microforum.jee.spring.Regions;

import org.springframework.jdbc.core.JdbcTemplate;

public class RegionDAOImpl implements RegionsDAO {
	
	private JdbcTemplate jdbcTemplate;


	public RegionDAOImpl (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Regions> list() {
		String consulta = "SELECT * FROM REGIONS";//Esto debería estar aparte, sólo por motivos didácticos se incluye aquí
		
		//jdbcTemplate es el que me pone en contacto con la bbdd
		List<Regions> l_regiones = this.jdbcTemplate.query(consulta, new RegionRowMapper());
		
		return l_regiones;
	}

	@Override
	public Regions read(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void insert(Regions region) {
		String sql = "INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES (?, ?)";
		
		this.jdbcTemplate.update(sql, region.getId(), region.getName());
		
	}

}
