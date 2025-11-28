package com.senura.quality_hub.architectureTests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.senura.quality_hub.ddd")
public class LayerDependencyRulesTest {

    @ArchTest
    static final ArchRule services_should_not_access_controllers =
            noClasses().that().resideInAPackage("..application..")
                    .should().accessClassesThat().resideInAPackage("..controller..");

    @ArchTest
    static final ArchRule services_should_only_be_accessed_by_controllers_or_other_services =
            classes().that().resideInAPackage("..application..")
                    .should().onlyBeAccessed().byAnyPackage("..presentation..", "..application..");
    @ArchTest
    static final ArchRule services_should_not_depend_on_controllers =
            noClasses().that().resideInAPackage("..application..")
                    .should().dependOnClassesThat().resideInAPackage("..presentation..");

    @ArchTest
    static final ArchRule domain_should_not_access_presentation_or_application =
            noClasses().that().resideInAPackage("..domain..")
                    .should().accessClassesThat().resideInAnyPackage("..presentation..", "..application..");

    @ArchTest
    static final ArchRule presentation_should_not_access_domain =
            noClasses().that().resideInAPackage("..presentation..")
                    .should().accessClassesThat().resideInAPackage("..domain..");

    @ArchTest
    static final ArchRule presentation_should_not_access_infrastructure =
            noClasses().that().resideInAPackage("..presentation..")
                    .should().accessClassesThat().resideInAPackage("..infrastructure..");
}
