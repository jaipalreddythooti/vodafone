package vodafone.om.map;

import org.apache.torque.TorqueException;

/**
 * This is a Torque Generated class that is used to load all database map 
 * information at once.  This is useful because Torque's default behaviour
 * is to do a "lazy" load of mapping information, e.g. loading it only
 * when it is needed.<p>
 *
 * @see org.apache.torque.map.DatabaseMap#initialize() DatabaseMap.initialize() 
 */
public class TurbineMapInit
{
    public static final void init()
        throws TorqueException
    {
        vodafone.om.Table1Peer.getMapBuilder();
        vodafone.om.TurbinePermissionPeer.getMapBuilder();
        vodafone.om.TurbineRolePeer.getMapBuilder();
        vodafone.om.TurbineGroupPeer.getMapBuilder();
        vodafone.om.TurbineRolePermissionPeer.getMapBuilder();
        vodafone.om.TurbineUserPeer.getMapBuilder();
        vodafone.om.TurbineUserGroupRolePeer.getMapBuilder();
    }
}
