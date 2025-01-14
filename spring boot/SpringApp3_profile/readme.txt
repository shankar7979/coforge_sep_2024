@ActiveProfile 
ActiveProfiles is a class-level annotation that is used to declarewhich active bean definition profiles should be used when loading an 
ApplicationContextfor test classes.
 
 
 
 
@Profiles
 
Indicates that a component is eligible for registration when one or more specified profiles are active. 

A profile is a named logical grouping that may be activated programmatically via ConfigurableEnvironment.setActiveProfiles or declarativelyby setting the spring.profiles.active property as a JVM system property, as anenvironment variable, or as a Servlet context parameter in web.xmlfor web applications. Profiles may also be activated declaratively inintegration tests via the @ActiveProfiles annotation

so it is done by testing only using 
@ActiveProfiles("Honda")


@Profiles is used for conditional bean creation

 

 