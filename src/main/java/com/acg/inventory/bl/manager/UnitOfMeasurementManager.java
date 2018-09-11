package com.acg.inventory.bl.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.acg.inventory.bl.exceptions.BusinessException;
import com.acg.inventory.bl.manager.interfaces.IUnitOfMeasurementManager;
import com.acg.inventory.bl.vo.UnitOfMeasurementVO;
import com.acg.inventory.dl.domain.UnitOfMeasurement;
import com.acg.inventory.dl.exception.UnitOfMeasurementException;
import com.acg.inventory.dl.service.interfaces.IUnitOfMeasurement;

public class UnitOfMeasurementManager implements IUnitOfMeasurementManager {
	@Autowired
	private IUnitOfMeasurement unitOfMeasurementService;

	public boolean add(UnitOfMeasurementVO unitOfMeasurementVO) throws BusinessException {
		try {
			UnitOfMeasurement unitOfMeasurement = new UnitOfMeasurement();
			unitOfMeasurement.setName(unitOfMeasurementVO.getName());
			unitOfMeasurementService.add(unitOfMeasurement);
		} catch (UnitOfMeasurementException exception) {
			throw new BusinessException(1, "Cannot add Unit Of Measurement : " + exception.getMessage());
		}
		return true;
	}

	public List<UnitOfMeasurementVO> get() throws BusinessException {
		try {
			return unitOfMeasurementService.get().stream().map(a -> new UnitOfMeasurementVO(a.getId(), a.getName()))
					.collect(Collectors.toList());
		} catch (UnitOfMeasurementException exception) {
			throw new BusinessException(2, "Cannot get Unit Of Measurement : " + exception.getMessage());
		}
	}

}
