package com.acg.inventory.bl.manager.interfaces;

import java.util.List;

import com.acg.inventory.bl.exceptions.BusinessException;
import com.acg.inventory.bl.vo.UnitOfMeasurementVO;

public interface IUnitOfMeasurementManager {
	public boolean add(UnitOfMeasurementVO unitOfMeasurementVO) throws BusinessException;
	public List<UnitOfMeasurementVO> get() throws BusinessException;
}
