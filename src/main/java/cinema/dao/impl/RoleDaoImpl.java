package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(Role.RoleName roleName) {
        try {
            return factory.getCurrentSession()
                    .createQuery("FROM Role WHERE role = :roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with role name "
                    + roleName + " not found", e);
        }
    }
}
