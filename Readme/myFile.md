# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - Eclipse >=4.55.0
 - Postman >=10.13


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - Framework :  SpringBoot
 - Language :  Java

# DataFlow

<b><span style="color: white;">Controller</span></b>

1. *GetMapping("/getuser")*
```
public List<User> getUser(){
		
		return userservices.getAlluser();
	}
```
2. *PostMapping("/adduser")*
```
public String addUsers(@RequestBody User user) {
		
		 return userservices.addUsers(user);}
```
3. *GetMapping("/getuser/{id}")*

```
public User getUserById(@PathVariable("id") String id){
		
		return userservices.getUserWithId(id);
		
	}
```
4. *PutMapping("/updateUser/{id}")*
```
public String updateUserById(@PathVariable("id") String id,@RequestBody User user) {
	
	
	return userservices.updateById(id,user);
}
```
5.*DeleteMapping("/deletebyid/{id}")*
```
public String deleteById(@PathVariable("id") String id) {
	
	return userservices.deleteById(id);
	
	
}
```
<b><span style="color: white;">Services</span></b>

*Inteface*

```
    public String addUsers(User user);

	public List<User> getAlluser();

	public User getUserWithId(String id);

	public String updateById(String id, User user);

	public String deleteById(String id);
```
<b><span style="color: white;">Repository</span></b>
  
  1. *addUsers*
  ```
  public void addUsers(User user) {
		userList.add(user);
		
	}
  ```
  2. *getUserList*
  ```
  public List<User> getUserList() {
		return userList;
	}
  ```
  3. *setUserList*
   
   ```
   public void setUserList(List<User> userList) {
		this.userList = userList;
	}
   ```
   4. *updateById*

```
	public void updateById(User user, User u1) {
		user.setUserId(u1.getUserId());
		user.setName(u1.getName());
		user.setAddress(u1.getAddress());
		user.setPhNumber(u1.getPhNumber());
		user.setUserName(u1.getUserName());
		
	
```






# Datastructure Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

*ARRAYLIST*

</details>




# Summary

 Spring Project that is a User management system.
The user will have the following attribute
**UserId**,
**Name**,
**UserName**,
**Address**,
**Phone Number**

Endpoint provided are **addUser**, 
**getUser/{userid}**,
**getAllUser**,
**updateUserInfo**,
**deleteUser**

# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

