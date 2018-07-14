start demo & gateway  
post http://localhost:8000/api/customer with {"name":"yourname"}  
it turns out 500  
see log, find NullPointerException in NettyRoutingFilter  
