package com.pcwk.cmn;

import java.util.List;

/**
 * λͺ¨λ  DAO? WorkDivλ₯? implements λ°μ κ²?.
 * @author ITSC
 *
 */
public interface WorkDiv<T> {

	/**
	 * <pre>
	 * λͺ©λ‘μ‘°ν
	 * @param dto
	 * @return List<DTO>
	 * </pre>
	 */
	public abstract List<T> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * ?±λ‘?
	 * @param dto
	 * @return 1(?±κ³?)/0(?€?¨)
	 * </pre>
	 */
	public abstract int doSave(T dto);
	
	/**
	 * <pre>
	 * ?­? 
	 * @param dto
	 * @return 1(?±κ³?)/0(?€?¨)
	 * </pre>
	 */
	public int doDelete(T dto);
	
	/**
	 * <pre>
	 * ?¨κ±΄μ‘°?
	 * @param dto
	 * @return DTO
	 * </pre>
	 */
	public T doSelectOne(T dto);
	
	/**
	 * <pre>
	 * ?? :delete,insert
	 * @param dto
	 * @return 1(?±κ³?)/0(?€?¨)
	 * </pre>
	 */
	public int doUpdate(T dto);
	
	
	
	default String excelDown(String path) {
		return "download_path";
	}
	
	
}
