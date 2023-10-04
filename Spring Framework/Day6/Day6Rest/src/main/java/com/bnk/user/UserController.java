package com.bnk.user;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bnk.user.dto.Customer;
import com.bnk.user.model.IUserService;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	IUserService ser;
	@Autowired
	private ServletContext servletContext;

	@GetMapping()
	public ResponseEntity<?> list() throws SQLException {
		List<Customer> cus = ser.search("");
		if (cus != null && !cus.isEmpty()) {
			return new ResponseEntity<List<Customer>>(cus, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping("{id}")
	protected Customer view(@PathVariable int id) throws SQLException {
		Customer cu = ser.search(id);
		System.out.println(cu);
		return cu;
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
	}

	@PostMapping
	public boolean upload(Customer c, @RequestParam("uploadfile") MultipartFile mFile) throws Exception {
		String fName = mFile.getOriginalFilename();
		File f = new File(servletContext.getRealPath("/resources/img"), fName);
		mFile.transferTo(f);
		c.setImgInfo(fName);
		ser.save(c);
		return true;
	}
	
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        try {
            // 사용자를 데이터베이스에서 찾아서 삭제
            ser.delete(id);
            return new ResponseEntity<>("User deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting user: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
}
