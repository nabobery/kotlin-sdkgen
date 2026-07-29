import com.nabobery.sdkgen.buildlogic.benchmark.VerifyBenchmarkBudget

tasks.register<VerifyBenchmarkBudget>("verifyBenchmarkBudget") {
    group = "verification"
    description = "Verifies three benchmark measurement records against a supplied budget by their true median."
    recordsDirectory.set(layout.projectDirectory.dir("benchmarks/records"))
    budgetFile.set(layout.projectDirectory.file("benchmarks/budget.json"))
    verificationMarker.set(layout.buildDirectory.file("reports/benchmark/budget.txt"))
}
