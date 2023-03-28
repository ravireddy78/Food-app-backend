package Com.Resto.RestaurantMngSys.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.Resto.RestaurantMngSys.Entity.Admin;

public interface AdminLoginDao extends JpaRepository<Admin, String> {


	Admin findByAdusrnameAndAdpassword(String adusrname, String adpassword);

}
