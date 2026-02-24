package com.proj.fin.loan.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.proj.fin.loan.bean.LoanBean;

@Service
//holds logic for various CRUD operations
public class LoanService {
	//Want to return a list of beans
	private static List<LoanBean> loanList=new ArrayList<>();
	private static int loanId=0;
	
	static {
		//adding data to the list
		loanList.add(new LoanBean(++loanId,"spring","ML","1234",LocalDate.now(),LocalDate.now().plusMonths(1)));
		loanList.add(new LoanBean(++loanId,"spring","PL","9857699676",LocalDate.now(),LocalDate.now().plusMonths(2)));
		loanList.add(new LoanBean(++loanId,"spring","ML","67544",LocalDate.now(),LocalDate.now().plusDays(15)));
		loanList.add(new LoanBean(++loanId,"spring","ML","1234",LocalDate.now(),LocalDate.now().plusMonths(2)));

	}
	
	public List<LoanBean> getAllRecs(){
		return loanList;
	}
	//add loan data
	public void addLoanData(String username,String mobileNo,String loanDesc) {
		
		//create a loan bean
		LoanBean lb=new LoanBean(++loanId,username,loanDesc,mobileNo,LocalDate.now(),LocalDate.now().plusYears(1));
		
		//add it to the collection
		loanList.add(lb);
		
	}
	//to delete a reco5rd 
	public void findById(int id) {
		Predicate<? super LoanBean> predicate=l->l.getLoanId()==id;
		//predicate-condition
		loanList.removeIf(predicate);
	}
	//to update the record-part 1
	public LoanBean upById(int id) {
		Predicate<? super LoanBean> predicate=l->l.getLoanId()==id;
		//READ EVERY OBJECT IN THE LIST
		//CHECK FOR THE ID--USING PREDICATE
		//IN CASE OF POSITIVE MATCH,RETURN THE MATCHED OBJECT INTO A COLLECTION
		//FROM THE RETURNED COLLECTION---GET THE FIRST OBJECT
		LoanBean lb=loanList.stream().filter(predicate).findFirst().get();
		return lb;
		
	}
	//to update the record-part 2
	public void revisedChanges(LoanBean lb) {
		//delete the record from the collection for the said id
		findById(lb.getLoanId());//deletes the old one
		//add the new revised bean to the collection
		//System.out.println(lb);
		loanList.add(lb);
		
	}

}
