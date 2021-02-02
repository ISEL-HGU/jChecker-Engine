package edu.isel.csee.jchecker.score;

import java.util.ArrayList;
import java.util.HashMap;

public class EvaluationSchemeMapper {

	private String assignmentName;
	private String assignmentGroup;
	private ArrayList<String> packageName = null;
	private ArrayList<String> inputs = null;
	private ArrayList<String> outputs = null;
	private ArrayList<String> reqClass = null;
	private ArrayList<String> reqMethod = null;
	private ArrayList<String> reqCustExc = null;
	private ArrayList<String> reqCusStruct = null;
	private ArrayList<String> overriding = null;
	private ArrayList<String> overloading = null;
	private HashMap<String, String> superclass_pair = null;
	private HashMap<String, String> interface_pair = null;
	private boolean thread = false;
	private boolean javadoc = false;
	private boolean encaps = false;
	private boolean compiled = false;
	
	
	private double point = 0;
	private double result_point = 0;
	private double compiled_deduct_point = 0;
	private double runtime_deduct_point = 0;
	private double package_deduct_point = 0;
	private double class_deduct_point = 0;
	private double customExc_deduct_point = 0;
	private double customStr_deduct_point = 0;
	private double spc_deduct_point = 0;
	private double itf_deduct_point = 0;
	private double ovr_deduct_point = 0;
	private double ovl_deduct_point = 0;
	private double thr_deduct_point = 0;
	private double jvd_deduct_point = 0;
	private double enc_deduct_point = 0;
	
	
	private double runtime_max_deduct = 0;
	private double package_max_deduct = 0;
	private double class_max_deduct = 0;
	private double customExc_max_deduct = 0;
	private double customStr_max_deduct = 0;
	private double spc_max_deduct = 0;
	private double itf_max_deduct = 0;
	private double ovr_max_deduct = 0;
	private double ovl_max_deduct = 0;
	
	




	public String getAssignmentName()
	{
		return assignmentName;
	}
	
	
	public void setAssignmentName(String assignmentName)
	{
		this.assignmentName = assignmentName;
	}
	
	
	public String getAssignmentGroup()
	{
		return assignmentGroup;
	}
	
	
	public void setAssignmentGroup(String assignmentGroup)
	{
		this.assignmentGroup = assignmentGroup;
	}
	
	
	public boolean isCompiled()
	{
		return compiled;
	}


	public void setCompiled(boolean compiled)
	{
		this.compiled = compiled;
	}
	

	public double getCompiled_deduct_point()
	{
		return compiled_deduct_point;
	}


	public void setCompiled_deduct_point(double compiled_deduct_point)
	{
		this.compiled_deduct_point = compiled_deduct_point;
	}
	
	
	public ArrayList<String> getPackageName()
	{
		return packageName;
	}


	public void setPackageName(ArrayList<String> packageName)
	{
		this.packageName = packageName;
	}


	public ArrayList<String> getInputs()
	{
		return inputs;
	}
	
	
	public void setInputs(ArrayList<String> inputs)
	{
		this.inputs = inputs;
	}
	
	
	public ArrayList<String> getOutputs()
	{
		return outputs;
	}
	
	
	public void setOutputs(ArrayList<String> outputs)
	{
		this.outputs = outputs;
	}
	
	
	public ArrayList<String> getReqClass()
	{
		return reqClass;
	}
	
	
	public void setReqClass(ArrayList<String> reqClass)
	{
		this.reqClass = reqClass;
	}
	
	
	public ArrayList<String> getReqMethod()
	{
		return reqMethod;
	}
	
	
	public void setReqMethod(ArrayList<String> reqMethod)
	{
		this.reqMethod = reqMethod;
	}
	
	
	public ArrayList<String> getReqCustExc()
	{
		return reqCustExc;
	}
	
	
	public void setReqCustExc(ArrayList<String> reqCustExc)
	{
		this.reqCustExc = reqCustExc;
	}
	
	
	public ArrayList<String> getReqCusStruct()
	{
		return reqCusStruct;
	}
	
	
	public void setReqCusStruct(ArrayList<String> reqCusStruct)
	{
		this.reqCusStruct = reqCusStruct;
	}
	
	
	
	public HashMap<String, String> getSuperclass_pair()
	{
		return superclass_pair;
	}


	public void setSuperclass_pair(HashMap<String, String> superclass_pair)
	{
		this.superclass_pair = superclass_pair;
	}


	public HashMap<String, String> getInterface_pair()
	{
		return interface_pair;
	}


	public void setInterface_pair(HashMap<String, String> interface_pair)
	{
		this.interface_pair = interface_pair;
	}

	
	public ArrayList<String> getOverriding()
	{
		return overriding;
	}


	public void setOverriding(ArrayList<String> overriding)
	{
		this.overriding = overriding;
	}


	public ArrayList<String> getOverloading()
	{
		return overloading;
	}


	public void setOverloading(ArrayList<String> overloading)
	{
		this.overloading = overloading;
	}


	public boolean isThreads()
	{
		return thread;
	}


	public void setThreads(boolean thread)
	{
		this.thread = thread;
	}


	public boolean isJavadoc()
	{
		return javadoc;
	}
	
	
	public void setJavadoc(boolean javadoc)
	{
		this.javadoc = javadoc;
	}
	
	
	public boolean isEncaps()
	{
		return encaps;
	}
	
	
	public void setEncaps(boolean encaps)
	{
		this.encaps = encaps;
	}
	
	
	public double getPoint()
	{
		return point;
	}
	
	
	public void setPoint(double point)
	{
		this.point = point;
		this.result_point = point;
	}
	
	
	public double getResult_point()
	{
		return result_point;
	}


	public void deduct_point(double deduction_point)
	{
		this.result_point -= deduction_point;
	}


	public double getRuntime_deduct_point()
	{
		return runtime_deduct_point;
	}
	
	
	public void setRuntime_deduct_point(double runtime_deduct_point)
	{
		this.runtime_deduct_point = runtime_deduct_point;
	}
	
	
	public double getPackage_deduct_point()
	{
		return package_deduct_point;
	}
	
	
	public void setPackage_deduct_point(double package_deduct_point)
	{
		this.package_deduct_point = package_deduct_point;
	}
	
	
	public double getClass_deduct_point()
	{
		return class_deduct_point;
	}
	
	
	public void setClass_deduct_point(double class_deduct_point)
	{
		this.class_deduct_point = class_deduct_point;
	}
	
	
	public double getCustomExc_deduct_point()
	{
		return customExc_deduct_point;
	}
	
	
	public void setCustomExc_deduct_point(double customExc_deduct_point)
	{
		this.customExc_deduct_point = customExc_deduct_point;
	}
	
	
	public double getCustomStr_deduct_point()
	{
		return customStr_deduct_point;
	}
	
	
	public void setCustomStr_deduct_point(double customStr_deduct_point)
	{
		this.customStr_deduct_point = customStr_deduct_point;
	}
	
	
	public double getSpc_deduct_point()
	{
		return spc_deduct_point;
	}
	
	
	public void setSpc_deduct_point(double spc_deduct_point)
	{
		this.spc_deduct_point = spc_deduct_point;
	}
	
	
	public double getItf_deduct_point()
	{
		return itf_deduct_point;
	}
	
	
	public void setItf_deduct_point(double itf_deduct_point)
	{
		this.itf_deduct_point = itf_deduct_point;
	}
	
	
	
	public double getOvr_deduct_point()
	{
		return ovr_deduct_point;
	}
	
	
	public void setOvr_deduct_point(double ovr_deduct_point)
	{
		this.ovr_deduct_point = ovr_deduct_point;
	}
	
	
	public double getOvl_deduct_point()
	{
		return ovl_deduct_point;
	}
	
	
	public void setOvl_deduct_point(double ovl_deduct_point)
	{
		this.ovl_deduct_point = ovl_deduct_point;
	}
	
	
	public double getThr_deduct_point()
	{
		return thr_deduct_point;
	}
	
	
	public void setThr_deduct_point(double thr_deduct_point)
	{
		this.thr_deduct_point = thr_deduct_point;
	}
	
	
	public double getJvd_deduct_point()
	{
		return jvd_deduct_point;
	}
	
	
	public void setJvd_deduct_point(double jvd_deduct_point)
	{
		this.jvd_deduct_point = jvd_deduct_point;
	}
	
	
	public double getEnc_deduct_point()
	{
		return enc_deduct_point;
	}
	
	
	public void setEnc_deduct_point(double enc_deduct_point)
	{
		this.enc_deduct_point = enc_deduct_point;
	}


	public double getRuntime_max_deduct()
	{
		return runtime_max_deduct;
	}


	public void setRuntime_max_deduct(double runtime_max_deduct)
	{
		this.runtime_max_deduct = runtime_max_deduct;
	}


	public double getPackage_max_deduct() {
		return package_max_deduct;
	}


	public void setPackage_max_deduct(double package_max_deduct) {
		this.package_max_deduct = package_max_deduct;
	}


	public double getClass_max_deduct()
	{
		return class_max_deduct;
	}


	public void setClass_max_deduct(double class_max_deduct)
	{
		this.class_max_deduct = class_max_deduct;
	}


	public double getCustomExc_max_deduct()
	{
		return customExc_max_deduct;
	}


	public void setCustomExc_max_deduct(double customExc_max_deduct)
	{
		this.customExc_max_deduct = customExc_max_deduct;
	}


	public double getCustomStr_max_deduct()
	{
		return customStr_max_deduct;
	}


	public void setCustomStr_max_deduct(double customStr_max_deduct)
	{
		this.customStr_max_deduct = customStr_max_deduct;
	}


	public double getSpc_max_deduct()
	{
		return spc_max_deduct;
	}


	public void setSpc_max_deduct(double spc_max_deduct)
	{
		this.spc_max_deduct = spc_max_deduct;
	}


	public double getItf_max_deduct()
	{
		return itf_max_deduct;
	}


	public void setItf_max_deduct(double itf_max_deduct)
	{
		this.itf_max_deduct = itf_max_deduct;
	}


	public double getOvr_max_deduct()
	{
		return ovr_max_deduct;
	}


	public void setOvr_max_deduct(double ovr_max_deduct)
	{
		this.ovr_max_deduct = ovr_max_deduct;
	}


	public double getOvl_max_deduct()
	{
		return ovl_max_deduct;
	}


	public void setOvl_max_deduct(double ovl_max_deduct)
	{
		this.ovl_max_deduct = ovl_max_deduct;
	}
}