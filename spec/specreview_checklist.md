# Spec Review Checklist

1. Spec PR
  - [ ] PR uses [template](https://github.com/jakartaee/specifications/blob/master/pull_request_template.md)
  - [ ] Directory of form {spec}/x.y
  - [ ] PDF of form {spec}-spec-x.y.pdf ("-spec" preferred but not required)
  - [ ] HTML of form {spec}-spec-x.y.html ("-spec" preferred but not required)
  - [ ] Index page {spec}/x.y/_index.md following (TBD) [template](https://github.com/eclipse/microprofile/blob/master/spec/spec_page_template.md)
  - [ ] Staging repository link of the form
   https://oss.sonatype.org/#nexus-search;gav~org.eclipse.microprofile.{spec}~microprofile-{spec}-api~~~~kw,version
  - [ ] EFTL TCK link of the form http://download.eclipse.org/microprofile/microprofile-{spec}-{version}/+.zip
  - [ ] Compatibility certification link of the form https://github.com/eclipse/microprofile-{spec}/#{issue}

2. _index.md
  - [ ] Link to spec pdf
  - [ ] Link to spec html
  - [ ] Link to apidocs
  - [ ] Link to final TCK download zip file of the form http://download.eclipse.org/microprofile/microprofile-{spec}-{version}/*{spec}-tck-x.y.z.zip
  - [ ] Link to API jar file of the form https://search.maven.org/artifact/microprofile.{spec}/microprofile.{spec}-api/x.y.z/jar
  - [ ] Name of and link to at least one Compatible Implementation

3. javadocs
  - [ ] Footer contains Eclipse copyright and link to license
  - [ ] ESFL license is included, usually as doc-files/speclicense.html
  - [ ] no META-INF directory in PR
  - [ ] javadocs-jar artifact matches apidocs

4. Spec PDF
  - [ ] Correct spec title
  - [ ] Version number of the form x.y, not x.y.z
  - [ ] Correct Eclipse copyright line
  - [ ] No DRAFT or SNAPSHOT
  - [ ] Correct Logo

5. Spec HTML
  - [ ] Same as PDF

6. TCK zip file
  - [ ] README file (optional for this release)
  - [ ] EFTL license file, preferably named LICENSE.md
  - [ ] User's Guide (or equivalent documentation)
  - [ ] How to test the Compatible Implementation(s) listed in _index.md above with the TCK (may be in UG)

7. TCK User's Guide (or equivalent documentation)
  - [ ] Software requirements listed
  - [ ] Installation and configuration described
  - [ ] How to run tests
  - [ ] Where to file challenges

8. Compatibility certification request
  - [ ] Request follows [template](https://github.com/jakartaee/specification-committee/blob/master/compatibility-certification-request.md)
  - [ ] SHA-256 fingerprint matches staged TCK zip file
  - [ ] Request issue has `certification` label.

9. TCK results summary
  - [ ] Page is hosted by Compatible Implementation project
  - [ ] Includes all information from certification request
  - [ ] Summary includes number of tests passed, failed, errors
  - [ ] SHA-256 fingerprint matches staged TCK zip file on cert request
 
10. EMO/PMC tasks
 - [ ] Specification project team contacts the EMO to initiate the review by sending an email to emo@eclipse.org. An issue will be created by the EMO to track the release review. Reference the  https://projects.eclipse.org/projects/ee4j.jaxb/releases/3.0 release page.
 - [ ] The specification project team requests approval for the release from the PMC by sending an email to ee4j-pmc@eclipse.org.
 - [ ] The specification project team then delivers an IP Log to the IP Team for their review as described in https://www.eclipse.org/projects/handbook/#pmi-commands-iplog. This is done by accessing the https://projects.eclipse.org/projects/ee4j.jaxb/releases/3.0 page, logging in, and using the committer tools menu on the left.

11. Update Microprofile Parent BOM
 - [ ] Update the Microprofile BOM by submitting a PR to the https://github.com/eclipse/microprofile-bom that updates the version number of your API jar file.

12. Specification ballot complete
 - [ ] The specification committee has complete the review ballot successfully

13. EMO approval
- [ ] The EMO has approved the release tracking issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=565959
