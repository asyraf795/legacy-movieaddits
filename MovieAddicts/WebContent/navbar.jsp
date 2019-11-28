<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div.container2 {
    width: 100%;
    border: 1px solid gray;
}
.div_text_shadow
{
color: rgb(77, 98, 140);
font-size: 30px;
background-color: #1E90FF;
text-shadow: rgb(77, 98, 170); 2px 2px 0px;
}
header, footer {
    padding: 1em;

    color: white;
    background-color: #1E90FF;
    clear: left;
}
.enjoy-css {
  display: inline-block;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  padding: 10px 276px 10px 20px;
  border: 1px solid #b7b7b7;
  -webkit-border-radius: 3px;
  border-radius: 3px;
  font: normal 16px/normal "Times New Roman", Times, serif;
  color: rgba(0,142,198,1);
  -o-text-overflow: clip;
  text-overflow: clip;
  background: rgba(252,252,252,1);
  -webkit-box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) inset;
  box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) inset;
  text-shadow: 1px 1px 0 rgba(255,255,255,0.66) ;
  -webkit-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
  -moz-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
  -o-transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
  transition: all 200ms cubic-bezier(0.42, 0, 0.58, 1);
}
.enjoy-css2 {
  display: inline-block;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  cursor: pointer;
  padding: 10px 20px;
  border: 1px solid #018dc4;
  -webkit-border-radius: 3px;
  border-radius: 3px;
  font: normal 16px/normal "Times New Roman", Times, serif;
  color: rgba(255,255,255,0.9);
  -o-text-overflow: clip;
  text-overflow: clip;
  background: #0199d9;
  -webkit-box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) ;
  box-shadow: 2px 2px 2px 0 rgba(0,0,0,0.2) ;
  text-shadow: -1px -1px 0 rgba(15,73,168,0.66) ;
  -webkit-transition: all 300ms cubic-bezier(0.42, 0, 0.58, 1);
  -moz-transition: all 300ms cubic-bezier(0.42, 0, 0.58, 1);
  -o-transition: all 300ms cubic-bezier(0.42, 0, 0.58, 1);
  transition: all 300ms cubic-bezier(0.42, 0, 0.58, 1);
}
</style>
</head>
<body>

<div class="container2">

<header>
<form action="MovieController.do" method="get">

   <a href="index.jsp"><img style="height: 35px;" src="general_files/logo.png"></a>
   <a href="MovieController.do?action=latestMovies" class="div_text_shadow">Latest </a>
   &nbsp;
   <a href="MovieController.do?action=popularMovies" class="div_text_shadow">Popular </a>
   &nbsp;
   <a href="MovieController.do?action=topMovies" class="div_text_shadow">Top </a>
   &nbsp;
      <input type="hidden" name="action" value="searchMovies" />
      <input class="enjoy-css" name="moviesearch" placeholder="Search Movies" />
   <input type="submit" class="enjoy-css2" value="Enjoy" />
   
</form>








</header>




</div>

</body>
</html>







