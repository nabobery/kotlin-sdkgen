package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class RepositoryRuleDecodingException(
  message: String,
) : SerializationException(message)

public class RepositoryRuleNoMatchException(
  message: String,
) : RepositoryRuleDecodingException(message)

public class RepositoryRuleAmbiguityException(
  message: String,
) : RepositoryRuleDecodingException(message)

public class RepositoryRuleBranchValidationException(
  message: String,
) : RepositoryRuleDecodingException(message)

/**
 * A repository rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule
 */
@Serializable(with = RepositoryRuleSerializer::class)
public sealed interface RepositoryRule {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class RepositoryRuleCreation internal constructor(
    public val type: InlineRepositoryRuleCreationTypeX8824ca31,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCreationTypeX8824ca31): RepositoryRuleCreation {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCreationMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCreation factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCreation(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleUpdate internal constructor(
    public val type: InlineRepositoryRuleUpdateTypeX6cbd920c,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleUpdateTypeX6cbd920c): RepositoryRuleUpdate {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleUpdateMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleUpdate factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleUpdate(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleDeletion internal constructor(
    public val type: InlineRepositoryRuleDeletionTypeXff5dcc76,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleDeletionTypeXff5dcc76): RepositoryRuleDeletion {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleDeletionMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleDeletion factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleDeletion(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleRequiredLinearHistory internal constructor(
    public val type: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c): RepositoryRuleRequiredLinearHistory {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleRequiredLinearHistoryMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleRequiredLinearHistory factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleRequiredLinearHistory(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleMergeQueue internal constructor(
    public val type: InlineRepositoryRuleMergeQueueTypeX172c173c,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleMergeQueueTypeX172c173c): RepositoryRuleMergeQueue {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleMergeQueueMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleMergeQueue factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleMergeQueue(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleRequiredDeployments internal constructor(
    public val type: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837): RepositoryRuleRequiredDeployments {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleRequiredDeploymentsMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleRequiredDeployments factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleRequiredDeployments(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleRequiredSignatures internal constructor(
    public val type: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44): RepositoryRuleRequiredSignatures {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleRequiredSignaturesMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleRequiredSignatures factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleRequiredSignatures(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRulePullRequest internal constructor(
    public val type: InlineRepositoryRulePullRequestTypeX73e7678e,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRulePullRequestTypeX73e7678e): RepositoryRulePullRequest {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRulePullRequestMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRulePullRequest factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRulePullRequest(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleRequiredStatusChecks internal constructor(
    public val type: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d): RepositoryRuleRequiredStatusChecks {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleRequiredStatusChecksMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleRequiredStatusChecks factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleRequiredStatusChecks(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleNonFastForward internal constructor(
    public val type: InlineRepositoryRuleNonFastForwardTypeX330f0497,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleNonFastForwardTypeX330f0497): RepositoryRuleNonFastForward {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleNonFastForwardMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleNonFastForward factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleNonFastForward(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleCommitMessagePattern internal constructor(
    public val type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f): RepositoryRuleCommitMessagePattern {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCommitMessagePatternMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCommitMessagePattern factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCommitMessagePattern(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleCommitAuthorEmailPattern internal constructor(
    public val type: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6): RepositoryRuleCommitAuthorEmailPattern {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCommitAuthorEmailPatternMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCommitAuthorEmailPattern factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCommitAuthorEmailPattern(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleCommitterEmailPattern internal constructor(
    public val type: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc): RepositoryRuleCommitterEmailPattern {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCommitterEmailPatternMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCommitterEmailPattern factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCommitterEmailPattern(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleBranchNamePattern internal constructor(
    public val type: InlineRepositoryRuleBranchNamePatternTypeX1f68907f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleBranchNamePatternTypeX1f68907f): RepositoryRuleBranchNamePattern {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleBranchNamePatternMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleBranchNamePattern factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleBranchNamePattern(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleTagNamePattern internal constructor(
    public val type: InlineRepositoryRuleTagNamePatternTypeXe99b8e74,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleTagNamePatternTypeXe99b8e74): RepositoryRuleTagNamePattern {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleTagNamePatternMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleTagNamePattern factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleTagNamePattern(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleWorkflows internal constructor(
    public val type: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8): RepositoryRuleWorkflows {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleWorkflowsMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleWorkflows factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleWorkflows(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleCodeScanning internal constructor(
    public val type: InlineRepositoryRuleCodeScanningTypeX47dd9d07,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCodeScanningTypeX47dd9d07): RepositoryRuleCodeScanning {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCodeScanningMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCodeScanning factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCodeScanning(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleCopilotCodeReview internal constructor(
    public val type: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647): RepositoryRuleCopilotCodeReview {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleCopilotCodeReviewMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleCopilotCodeReview factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleCopilotCodeReview(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleLicenseComplianceScanning internal constructor(
    public val type: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf): RepositoryRuleLicenseComplianceScanning {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleLicenseComplianceScanningMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleLicenseComplianceScanning factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleLicenseComplianceScanning(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleFilePathRestriction internal constructor(
    public val type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95): RepositoryRuleFilePathRestriction {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleFilePathRestrictionMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleFilePathRestriction factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleFilePathRestriction(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleMaxFilePathLength internal constructor(
    public val type: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9): RepositoryRuleMaxFilePathLength {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleMaxFilePathLengthMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleMaxFilePathLength factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleMaxFilePathLength(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleFileExtensionRestriction internal constructor(
    public val type: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22): RepositoryRuleFileExtensionRestriction {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleFileExtensionRestrictionMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleFileExtensionRestriction factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleFileExtensionRestriction(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class RepositoryRuleMaxFileSize internal constructor(
    public val type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : RepositoryRule {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineRepositoryRuleMaxFileSizeTypeX8cf07814): RepositoryRuleMaxFileSize {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectRepositoryRule(raw)
        if (inspection.size == 0) {
          throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.repositoryRuleMaxFileSizeMatches) {
          throw RepositoryRuleBranchValidationException("RepositoryRuleMaxFileSize factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw RepositoryRuleAmbiguityException("RepositoryRule matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return RepositoryRuleMaxFileSize(
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object RepositoryRuleSerializer : KSerializer<RepositoryRule> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): RepositoryRule {
    val jsonDecoder = decoder.requireJsonDecoder("RepositoryRule")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: expected JSON object")
    val matches = inspectRepositoryRule(rawObject)
    if (matches.size == 0) {
      throw RepositoryRuleNoMatchException("RepositoryRule matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw RepositoryRuleAmbiguityException("RepositoryRule matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.repositoryRuleCreationMatches -> RepositoryRule.RepositoryRuleCreation(type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.repositoryRuleUpdateMatches -> RepositoryRule.RepositoryRuleUpdate(type = requireNotNull(matches.typeState22), raw = rawObject)
      matches.repositoryRuleDeletionMatches -> RepositoryRule.RepositoryRuleDeletion(type = requireNotNull(matches.typeState8), raw = rawObject)
      matches.repositoryRuleRequiredLinearHistoryMatches -> RepositoryRule.RepositoryRuleRequiredLinearHistory(type = requireNotNull(matches.typeState18), raw = rawObject)
      matches.repositoryRuleMergeQueueMatches -> RepositoryRule.RepositoryRuleMergeQueue(type = requireNotNull(matches.typeState14), raw = rawObject)
      matches.repositoryRuleRequiredDeploymentsMatches -> RepositoryRule.RepositoryRuleRequiredDeployments(type = requireNotNull(matches.typeState17), raw = rawObject)
      matches.repositoryRuleRequiredSignaturesMatches -> RepositoryRule.RepositoryRuleRequiredSignatures(type = requireNotNull(matches.typeState19), raw = rawObject)
      matches.repositoryRulePullRequestMatches -> RepositoryRule.RepositoryRulePullRequest(type = requireNotNull(matches.typeState16), raw = rawObject)
      matches.repositoryRuleRequiredStatusChecksMatches -> RepositoryRule.RepositoryRuleRequiredStatusChecks(type = requireNotNull(matches.typeState20), raw = rawObject)
      matches.repositoryRuleNonFastForwardMatches -> RepositoryRule.RepositoryRuleNonFastForward(type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.repositoryRuleCommitMessagePatternMatches -> RepositoryRule.RepositoryRuleCommitMessagePattern(type = requireNotNull(matches.typeState4), raw = rawObject)
      matches.repositoryRuleCommitAuthorEmailPatternMatches -> RepositoryRule.RepositoryRuleCommitAuthorEmailPattern(type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.repositoryRuleCommitterEmailPatternMatches -> RepositoryRule.RepositoryRuleCommitterEmailPattern(type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.repositoryRuleBranchNamePatternMatches -> RepositoryRule.RepositoryRuleBranchNamePattern(type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.repositoryRuleTagNamePatternMatches -> RepositoryRule.RepositoryRuleTagNamePattern(type = requireNotNull(matches.typeState21), raw = rawObject)
      matches.repositoryRuleWorkflowsMatches -> RepositoryRule.RepositoryRuleWorkflows(type = requireNotNull(matches.typeState23), raw = rawObject)
      matches.repositoryRuleCodeScanningMatches -> RepositoryRule.RepositoryRuleCodeScanning(type = requireNotNull(matches.typeState2), raw = rawObject)
      matches.repositoryRuleCopilotCodeReviewMatches -> RepositoryRule.RepositoryRuleCopilotCodeReview(type = requireNotNull(matches.typeState6), raw = rawObject)
      matches.repositoryRuleLicenseComplianceScanningMatches -> RepositoryRule.RepositoryRuleLicenseComplianceScanning(type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.repositoryRuleFilePathRestrictionMatches -> RepositoryRule.RepositoryRuleFilePathRestriction(type = requireNotNull(matches.typeState10), raw = rawObject)
      matches.repositoryRuleMaxFilePathLengthMatches -> RepositoryRule.RepositoryRuleMaxFilePathLength(type = requireNotNull(matches.typeState12), raw = rawObject)
      matches.repositoryRuleFileExtensionRestrictionMatches -> RepositoryRule.RepositoryRuleFileExtensionRestriction(type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.repositoryRuleMaxFileSizeMatches -> RepositoryRule.RepositoryRuleMaxFileSize(type = requireNotNull(matches.typeState13), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: RepositoryRule) {
    encoder.requireJsonEncoder("RepositoryRule").encodeJsonElement(value.raw)
  }
}

internal data class RepositoryRuleInspection(
  public val typeState7: InlineRepositoryRuleCreationTypeX8824ca31?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val typeState22: InlineRepositoryRuleUpdateTypeX6cbd920c?,
  public val typeState22Decoded: Boolean,
  public val typeState22Matches: Boolean,
  public val typeState8: InlineRepositoryRuleDeletionTypeXff5dcc76?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState18: InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c?,
  public val typeState18Decoded: Boolean,
  public val typeState18Matches: Boolean,
  public val typeState14: InlineRepositoryRuleMergeQueueTypeX172c173c?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState17: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837?,
  public val typeState17Decoded: Boolean,
  public val typeState17Matches: Boolean,
  public val typeState19: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44?,
  public val typeState19Decoded: Boolean,
  public val typeState19Matches: Boolean,
  public val typeState16: InlineRepositoryRulePullRequestTypeX73e7678e?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val typeState20: InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d?,
  public val typeState20Decoded: Boolean,
  public val typeState20Matches: Boolean,
  public val typeState15: InlineRepositoryRuleNonFastForwardTypeX330f0497?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val typeState4: InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState3: InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val typeState5: InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val typeState1: InlineRepositoryRuleBranchNamePatternTypeX1f68907f?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val typeState21: InlineRepositoryRuleTagNamePatternTypeXe99b8e74?,
  public val typeState21Decoded: Boolean,
  public val typeState21Matches: Boolean,
  public val typeState23: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8?,
  public val typeState23Decoded: Boolean,
  public val typeState23Matches: Boolean,
  public val typeState2: InlineRepositoryRuleCodeScanningTypeX47dd9d07?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState6: InlineRepositoryRuleCopilotCodeReviewTypeX9668c647?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState11: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val typeState10: InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState12: InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState9: InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val typeState13: InlineRepositoryRuleMaxFileSizeTypeX8cf07814?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val repositoryRuleCreationMatches: Boolean,
  public val repositoryRuleUpdateMatches: Boolean,
  public val repositoryRuleDeletionMatches: Boolean,
  public val repositoryRuleRequiredLinearHistoryMatches: Boolean,
  public val repositoryRuleMergeQueueMatches: Boolean,
  public val repositoryRuleRequiredDeploymentsMatches: Boolean,
  public val repositoryRuleRequiredSignaturesMatches: Boolean,
  public val repositoryRulePullRequestMatches: Boolean,
  public val repositoryRuleRequiredStatusChecksMatches: Boolean,
  public val repositoryRuleNonFastForwardMatches: Boolean,
  public val repositoryRuleCommitMessagePatternMatches: Boolean,
  public val repositoryRuleCommitAuthorEmailPatternMatches: Boolean,
  public val repositoryRuleCommitterEmailPatternMatches: Boolean,
  public val repositoryRuleBranchNamePatternMatches: Boolean,
  public val repositoryRuleTagNamePatternMatches: Boolean,
  public val repositoryRuleWorkflowsMatches: Boolean,
  public val repositoryRuleCodeScanningMatches: Boolean,
  public val repositoryRuleCopilotCodeReviewMatches: Boolean,
  public val repositoryRuleLicenseComplianceScanningMatches: Boolean,
  public val repositoryRuleFilePathRestrictionMatches: Boolean,
  public val repositoryRuleMaxFilePathLengthMatches: Boolean,
  public val repositoryRuleFileExtensionRestrictionMatches: Boolean,
  public val repositoryRuleMaxFileSizeMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (repositoryRuleCreationMatches) add("RepositoryRuleCreation")
      if (repositoryRuleUpdateMatches) add("RepositoryRuleUpdate")
      if (repositoryRuleDeletionMatches) add("RepositoryRuleDeletion")
      if (repositoryRuleRequiredLinearHistoryMatches) add("RepositoryRuleRequiredLinearHistory")
      if (repositoryRuleMergeQueueMatches) add("RepositoryRuleMergeQueue")
      if (repositoryRuleRequiredDeploymentsMatches) add("RepositoryRuleRequiredDeployments")
      if (repositoryRuleRequiredSignaturesMatches) add("RepositoryRuleRequiredSignatures")
      if (repositoryRulePullRequestMatches) add("RepositoryRulePullRequest")
      if (repositoryRuleRequiredStatusChecksMatches) add("RepositoryRuleRequiredStatusChecks")
      if (repositoryRuleNonFastForwardMatches) add("RepositoryRuleNonFastForward")
      if (repositoryRuleCommitMessagePatternMatches) add("RepositoryRuleCommitMessagePattern")
      if (repositoryRuleCommitAuthorEmailPatternMatches) add("RepositoryRuleCommitAuthorEmailPattern")
      if (repositoryRuleCommitterEmailPatternMatches) add("RepositoryRuleCommitterEmailPattern")
      if (repositoryRuleBranchNamePatternMatches) add("RepositoryRuleBranchNamePattern")
      if (repositoryRuleTagNamePatternMatches) add("RepositoryRuleTagNamePattern")
      if (repositoryRuleWorkflowsMatches) add("RepositoryRuleWorkflows")
      if (repositoryRuleCodeScanningMatches) add("RepositoryRuleCodeScanning")
      if (repositoryRuleCopilotCodeReviewMatches) add("RepositoryRuleCopilotCodeReview")
      if (repositoryRuleLicenseComplianceScanningMatches) add("RepositoryRuleLicenseComplianceScanning")
      if (repositoryRuleFilePathRestrictionMatches) add("RepositoryRuleFilePathRestriction")
      if (repositoryRuleMaxFilePathLengthMatches) add("RepositoryRuleMaxFilePathLength")
      if (repositoryRuleFileExtensionRestrictionMatches) add("RepositoryRuleFileExtensionRestriction")
      if (repositoryRuleMaxFileSizeMatches) add("RepositoryRuleMaxFileSize")
    }

  public val size: Int
    get() = names.size
}

private fun inspectRepositoryRule(rawObject: JsonObject): RepositoryRuleInspection {
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCreationTypeX8824ca31>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "creation") && typeState7Decoded
  val typeState22Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleUpdateTypeX6cbd920c>(element) } }
  val typeState22 = typeState22Result?.getOrNull()
  val typeState22Decoded = typeState22Result?.isSuccess == true
  val typeState22Matches = (rawObject.stringValue("type") == "update") && typeState22Decoded
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleDeletionTypeXff5dcc76>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "deletion") && typeState8Decoded
  val typeState18Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleRequiredLinearHistoryTypeX539d897c>(element) } }
  val typeState18 = typeState18Result?.getOrNull()
  val typeState18Decoded = typeState18Result?.isSuccess == true
  val typeState18Matches = (rawObject.stringValue("type") == "required_linear_history") && typeState18Decoded
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleMergeQueueTypeX172c173c>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "merge_queue") && typeState14Decoded
  val typeState17Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleRequiredDeploymentsTypeXd224c837>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = (rawObject.stringValue("type") == "required_deployments") && typeState17Decoded
  val typeState19Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleRequiredSignaturesTypeX8a300d44>(element) } }
  val typeState19 = typeState19Result?.getOrNull()
  val typeState19Decoded = typeState19Result?.isSuccess == true
  val typeState19Matches = (rawObject.stringValue("type") == "required_signatures") && typeState19Decoded
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRulePullRequestTypeX73e7678e>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "pull_request") && typeState16Decoded
  val typeState20Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleRequiredStatusChecksTypeX789a4b9d>(element) } }
  val typeState20 = typeState20Result?.getOrNull()
  val typeState20Decoded = typeState20Result?.isSuccess == true
  val typeState20Matches = (rawObject.stringValue("type") == "required_status_checks") && typeState20Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleNonFastForwardTypeX330f0497>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "non_fast_forward") && typeState15Decoded
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCommitMessagePatternTypeX88e4cb3f>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "commit_message_pattern") && typeState4Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCommitAuthorEmailPatternTypeXae685cd6>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "commit_author_email_pattern") && typeState3Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCommitterEmailPatternTypeX8ee368dc>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "committer_email_pattern") && typeState5Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleBranchNamePatternTypeX1f68907f>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "branch_name_pattern") && typeState1Decoded
  val typeState21Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleTagNamePatternTypeXe99b8e74>(element) } }
  val typeState21 = typeState21Result?.getOrNull()
  val typeState21Decoded = typeState21Result?.isSuccess == true
  val typeState21Matches = (rawObject.stringValue("type") == "tag_name_pattern") && typeState21Decoded
  val typeState23Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleWorkflowsTypeXb0c9a6d8>(element) } }
  val typeState23 = typeState23Result?.getOrNull()
  val typeState23Decoded = typeState23Result?.isSuccess == true
  val typeState23Matches = (rawObject.stringValue("type") == "workflows") && typeState23Decoded
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCodeScanningTypeX47dd9d07>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "code_scanning") && typeState2Decoded
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleCopilotCodeReviewTypeX9668c647>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "copilot_code_review") && typeState6Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "license_compliance_scanning") && typeState11Decoded
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleFilePathRestrictionTypeX1e0bac95>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "file_path_restriction") && typeState10Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleMaxFilePathLengthTypeXdba116e9>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "max_file_path_length") && typeState12Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleFileExtensionRestrictionTypeXffa75a22>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "file_extension_restriction") && typeState9Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineRepositoryRuleMaxFileSizeTypeX8cf07814>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "max_file_size") && typeState13Decoded
  val rawEmpty = rawObject.isEmpty()
  val repositoryRuleCreationMatches = matchesRepositoryRuleRepositoryRuleCreationBranch(rawObject) && (typeState7Matches)
  val repositoryRuleUpdateMatches = matchesRepositoryRuleRepositoryRuleUpdateBranch(rawObject) && (typeState22Matches)
  val repositoryRuleDeletionMatches = matchesRepositoryRuleRepositoryRuleDeletionBranch(rawObject) && (typeState8Matches)
  val repositoryRuleRequiredLinearHistoryMatches = matchesRepositoryRuleRepositoryRuleRequiredLinearHistoryBranch(rawObject) && (typeState18Matches)
  val repositoryRuleMergeQueueMatches = matchesRepositoryRuleRepositoryRuleMergeQueueBranch(rawObject) && (typeState14Matches)
  val repositoryRuleRequiredDeploymentsMatches = matchesRepositoryRuleRepositoryRuleRequiredDeploymentsBranch(rawObject) && (typeState17Matches)
  val repositoryRuleRequiredSignaturesMatches = matchesRepositoryRuleRepositoryRuleRequiredSignaturesBranch(rawObject) && (typeState19Matches)
  val repositoryRulePullRequestMatches = matchesRepositoryRuleRepositoryRulePullRequestBranch(rawObject) && (typeState16Matches)
  val repositoryRuleRequiredStatusChecksMatches = matchesRepositoryRuleRepositoryRuleRequiredStatusChecksBranch(rawObject) && (typeState20Matches)
  val repositoryRuleNonFastForwardMatches = matchesRepositoryRuleRepositoryRuleNonFastForwardBranch(rawObject) && (typeState15Matches)
  val repositoryRuleCommitMessagePatternMatches = matchesRepositoryRuleRepositoryRuleCommitMessagePatternBranch(rawObject) && (typeState4Matches)
  val repositoryRuleCommitAuthorEmailPatternMatches = matchesRepositoryRuleRepositoryRuleCommitAuthorEmailPatternBranch(rawObject) && (typeState3Matches)
  val repositoryRuleCommitterEmailPatternMatches = matchesRepositoryRuleRepositoryRuleCommitterEmailPatternBranch(rawObject) && (typeState5Matches)
  val repositoryRuleBranchNamePatternMatches = matchesRepositoryRuleRepositoryRuleBranchNamePatternBranch(rawObject) && (typeState1Matches)
  val repositoryRuleTagNamePatternMatches = matchesRepositoryRuleRepositoryRuleTagNamePatternBranch(rawObject) && (typeState21Matches)
  val repositoryRuleWorkflowsMatches = matchesRepositoryRuleRepositoryRuleWorkflowsBranch(rawObject) && (typeState23Matches)
  val repositoryRuleCodeScanningMatches = matchesRepositoryRuleRepositoryRuleCodeScanningBranch(rawObject) && (typeState2Matches)
  val repositoryRuleCopilotCodeReviewMatches = matchesRepositoryRuleRepositoryRuleCopilotCodeReviewBranch(rawObject) && (typeState6Matches)
  val repositoryRuleLicenseComplianceScanningMatches = matchesRepositoryRuleRepositoryRuleLicenseComplianceScanningBranch(rawObject) && (typeState11Matches)
  val repositoryRuleFilePathRestrictionMatches = matchesRepositoryRuleRepositoryRuleFilePathRestrictionBranch(rawObject) && (typeState10Matches)
  val repositoryRuleMaxFilePathLengthMatches = matchesRepositoryRuleRepositoryRuleMaxFilePathLengthBranch(rawObject) && (typeState12Matches)
  val repositoryRuleFileExtensionRestrictionMatches = matchesRepositoryRuleRepositoryRuleFileExtensionRestrictionBranch(rawObject) && (typeState9Matches)
  val repositoryRuleMaxFileSizeMatches = matchesRepositoryRuleRepositoryRuleMaxFileSizeBranch(rawObject) && (typeState13Matches)
  return RepositoryRuleInspection(
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    typeState22 = typeState22,
    typeState22Decoded = typeState22Decoded,
    typeState22Matches = typeState22Matches,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState18 = typeState18,
    typeState18Decoded = typeState18Decoded,
    typeState18Matches = typeState18Matches,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState17 = typeState17,
    typeState17Decoded = typeState17Decoded,
    typeState17Matches = typeState17Matches,
    typeState19 = typeState19,
    typeState19Decoded = typeState19Decoded,
    typeState19Matches = typeState19Matches,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    typeState20 = typeState20,
    typeState20Decoded = typeState20Decoded,
    typeState20Matches = typeState20Matches,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    typeState21 = typeState21,
    typeState21Decoded = typeState21Decoded,
    typeState21Matches = typeState21Matches,
    typeState23 = typeState23,
    typeState23Decoded = typeState23Decoded,
    typeState23Matches = typeState23Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    repositoryRuleCreationMatches = repositoryRuleCreationMatches,
    repositoryRuleUpdateMatches = repositoryRuleUpdateMatches,
    repositoryRuleDeletionMatches = repositoryRuleDeletionMatches,
    repositoryRuleRequiredLinearHistoryMatches = repositoryRuleRequiredLinearHistoryMatches,
    repositoryRuleMergeQueueMatches = repositoryRuleMergeQueueMatches,
    repositoryRuleRequiredDeploymentsMatches = repositoryRuleRequiredDeploymentsMatches,
    repositoryRuleRequiredSignaturesMatches = repositoryRuleRequiredSignaturesMatches,
    repositoryRulePullRequestMatches = repositoryRulePullRequestMatches,
    repositoryRuleRequiredStatusChecksMatches = repositoryRuleRequiredStatusChecksMatches,
    repositoryRuleNonFastForwardMatches = repositoryRuleNonFastForwardMatches,
    repositoryRuleCommitMessagePatternMatches = repositoryRuleCommitMessagePatternMatches,
    repositoryRuleCommitAuthorEmailPatternMatches = repositoryRuleCommitAuthorEmailPatternMatches,
    repositoryRuleCommitterEmailPatternMatches = repositoryRuleCommitterEmailPatternMatches,
    repositoryRuleBranchNamePatternMatches = repositoryRuleBranchNamePatternMatches,
    repositoryRuleTagNamePatternMatches = repositoryRuleTagNamePatternMatches,
    repositoryRuleWorkflowsMatches = repositoryRuleWorkflowsMatches,
    repositoryRuleCodeScanningMatches = repositoryRuleCodeScanningMatches,
    repositoryRuleCopilotCodeReviewMatches = repositoryRuleCopilotCodeReviewMatches,
    repositoryRuleLicenseComplianceScanningMatches = repositoryRuleLicenseComplianceScanningMatches,
    repositoryRuleFilePathRestrictionMatches = repositoryRuleFilePathRestrictionMatches,
    repositoryRuleMaxFilePathLengthMatches = repositoryRuleMaxFilePathLengthMatches,
    repositoryRuleFileExtensionRestrictionMatches = repositoryRuleFileExtensionRestrictionMatches,
    repositoryRuleMaxFileSizeMatches = repositoryRuleMaxFileSizeMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!repositoryRuleCreationMatches) add("RepositoryRuleCreation: branch predicate did not match properties 'type'")
      if (!repositoryRuleUpdateMatches) add("RepositoryRuleUpdate: branch predicate did not match properties 'type'")
      if (!repositoryRuleDeletionMatches) add("RepositoryRuleDeletion: branch predicate did not match properties 'type'")
      if (!repositoryRuleRequiredLinearHistoryMatches) add("RepositoryRuleRequiredLinearHistory: branch predicate did not match properties 'type'")
      if (!repositoryRuleMergeQueueMatches) add("RepositoryRuleMergeQueue: branch predicate did not match properties 'type'")
      if (!repositoryRuleRequiredDeploymentsMatches) add("RepositoryRuleRequiredDeployments: branch predicate did not match properties 'type'")
      if (!repositoryRuleRequiredSignaturesMatches) add("RepositoryRuleRequiredSignatures: branch predicate did not match properties 'type'")
      if (!repositoryRulePullRequestMatches) add("RepositoryRulePullRequest: branch predicate did not match properties 'type'")
      if (!repositoryRuleRequiredStatusChecksMatches) add("RepositoryRuleRequiredStatusChecks: branch predicate did not match properties 'type'")
      if (!repositoryRuleNonFastForwardMatches) add("RepositoryRuleNonFastForward: branch predicate did not match properties 'type'")
      if (!repositoryRuleCommitMessagePatternMatches) add("RepositoryRuleCommitMessagePattern: branch predicate did not match properties 'type'")
      if (!repositoryRuleCommitAuthorEmailPatternMatches) add("RepositoryRuleCommitAuthorEmailPattern: branch predicate did not match properties 'type'")
      if (!repositoryRuleCommitterEmailPatternMatches) add("RepositoryRuleCommitterEmailPattern: branch predicate did not match properties 'type'")
      if (!repositoryRuleBranchNamePatternMatches) add("RepositoryRuleBranchNamePattern: branch predicate did not match properties 'type'")
      if (!repositoryRuleTagNamePatternMatches) add("RepositoryRuleTagNamePattern: branch predicate did not match properties 'type'")
      if (!repositoryRuleWorkflowsMatches) add("RepositoryRuleWorkflows: branch predicate did not match properties 'type'")
      if (!repositoryRuleCodeScanningMatches) add("RepositoryRuleCodeScanning: branch predicate did not match properties 'type'")
      if (!repositoryRuleCopilotCodeReviewMatches) add("RepositoryRuleCopilotCodeReview: branch predicate did not match properties 'type'")
      if (!repositoryRuleLicenseComplianceScanningMatches) add("RepositoryRuleLicenseComplianceScanning: branch predicate did not match properties 'type'")
      if (!repositoryRuleFilePathRestrictionMatches) add("RepositoryRuleFilePathRestriction: branch predicate did not match properties 'type'")
      if (!repositoryRuleMaxFilePathLengthMatches) add("RepositoryRuleMaxFilePathLength: branch predicate did not match properties 'type'")
      if (!repositoryRuleFileExtensionRestrictionMatches) add("RepositoryRuleFileExtensionRestriction: branch predicate did not match properties 'type'")
      if (!repositoryRuleMaxFileSizeMatches) add("RepositoryRuleMaxFileSize: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesRepositoryRuleRepositoryRuleCreationBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"creation\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleUpdateBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("update_allows_fetch_and_merge") && ((property as JsonObject)["update_allows_fetch_and_merge"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"update\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleDeletionBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"deletion\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleRequiredLinearHistoryBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"required_linear_history\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleMergeQueueBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("check_response_timeout_minutes") && (property as JsonObject).containsKey("grouping_strategy") && (property as JsonObject).containsKey("max_entries_to_build") && (property as JsonObject).containsKey("max_entries_to_merge") && (property as JsonObject).containsKey("merge_method") && (property as JsonObject).containsKey("min_entries_to_merge") && (property as JsonObject).containsKey("min_entries_to_merge_wait_minutes") && ((property as JsonObject)["check_response_timeout_minutes"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("1", "360", null, null, null)) } ?: true) && ((property as JsonObject)["grouping_strategy"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ALLGREEN\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"HEADGREEN\"")))) } ?: true) && ((property as JsonObject)["max_entries_to_build"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "100", null, null, null)) } ?: true) && ((property as JsonObject)["max_entries_to_merge"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "100", null, null, null)) } ?: true) && ((property as JsonObject)["merge_method"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"MERGE\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"SQUASH\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"REBASE\"")))) } ?: true) && ((property as JsonObject)["min_entries_to_merge"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "100", null, null, null)) } ?: true) && ((property as JsonObject)["min_entries_to_merge_wait_minutes"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "360", null, null, null)) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"merge_queue\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleRequiredDeploymentsBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("required_deployment_environments") && ((property as JsonObject)["required_deployment_environments"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"required_deployments\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleRequiredSignaturesBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"required_signatures\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRulePullRequestBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("dismiss_stale_reviews_on_push") && (property as JsonObject).containsKey("require_code_owner_review") && (property as JsonObject).containsKey("require_last_push_approval") && (property as JsonObject).containsKey("required_approving_review_count") && (property as JsonObject).containsKey("required_review_thread_resolution") && ((property as JsonObject)["allowed_merge_methods"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonPrimitive && item.isString && (item.jsonSchemaEquals(SdkJson.parseToJsonElement("\"merge\"")) || item.jsonSchemaEquals(SdkJson.parseToJsonElement("\"squash\"")) || item.jsonSchemaEquals(SdkJson.parseToJsonElement("\"rebase\"")))) }))) } ?: true) && ((property as JsonObject)["dismiss_stale_reviews_on_push"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["dismissal_restriction"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("enabled") && ((property as JsonObject)["allowed_actors"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("id") && (item as JsonObject).containsKey("type") && ((item as JsonObject)["id"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((item as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"User\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"Team\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"IntegrationInstallation\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"RepositoryRole\"")))) } ?: true)))) }))) } ?: true) && ((property as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) } ?: true) && ((property as JsonObject)["require_code_owner_review"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["require_last_push_approval"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["required_approving_review_count"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "10", null, null, null)) } ?: true) && ((property as JsonObject)["required_review_thread_resolution"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["required_reviewers"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("file_patterns") && (item as JsonObject).containsKey("minimum_approvals") && (item as JsonObject).containsKey("reviewer") && ((item as JsonObject)["file_patterns"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((item as JsonObject)["minimum_approvals"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((item as JsonObject)["reviewer"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("id") && (property as JsonObject).containsKey("type") && ((property as JsonObject)["id"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"Team\"")))) } ?: true)))) } ?: true)))) }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"pull_request\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleRequiredStatusChecksBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("required_status_checks") && (property as JsonObject).containsKey("strict_required_status_checks_policy") && ((property as JsonObject)["do_not_enforce_on_create"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["required_status_checks"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("context") && ((item as JsonObject)["context"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["integration_id"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) }))) } ?: true) && ((property as JsonObject)["strict_required_status_checks_policy"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"required_status_checks\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleNonFastForwardBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"non_fast_forward\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleCommitMessagePatternBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("operator") && (property as JsonObject).containsKey("pattern") && ((property as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["negate"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["operator"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"starts_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ends_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"contains\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"regex\"")))) } ?: true) && ((property as JsonObject)["pattern"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"commit_message_pattern\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleCommitAuthorEmailPatternBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("operator") && (property as JsonObject).containsKey("pattern") && ((property as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["negate"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["operator"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"starts_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ends_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"contains\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"regex\"")))) } ?: true) && ((property as JsonObject)["pattern"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"commit_author_email_pattern\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleCommitterEmailPatternBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("operator") && (property as JsonObject).containsKey("pattern") && ((property as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["negate"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["operator"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"starts_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ends_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"contains\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"regex\"")))) } ?: true) && ((property as JsonObject)["pattern"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"committer_email_pattern\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleBranchNamePatternBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("operator") && (property as JsonObject).containsKey("pattern") && ((property as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["negate"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["operator"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"starts_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ends_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"contains\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"regex\"")))) } ?: true) && ((property as JsonObject)["pattern"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"branch_name_pattern\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleTagNamePatternBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("operator") && (property as JsonObject).containsKey("pattern") && ((property as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["negate"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["operator"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"starts_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ends_with\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"contains\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"regex\"")))) } ?: true) && ((property as JsonObject)["pattern"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"tag_name_pattern\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleWorkflowsBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("workflows") && ((property as JsonObject)["do_not_enforce_on_create"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["workflows"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("path") && (item as JsonObject).containsKey("repository_id") && ((item as JsonObject)["path"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["ref"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["repository_id"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((item as JsonObject)["sha"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"workflows\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleCodeScanningBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("code_scanning_tools") && ((property as JsonObject)["code_scanning_tools"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("alerts_threshold") && (item as JsonObject).containsKey("security_alerts_threshold") && (item as JsonObject).containsKey("tool") && ((item as JsonObject)["alerts_threshold"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"none\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"errors\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"errors_and_warnings\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"all\"")))) } ?: true) && ((item as JsonObject)["security_alerts_threshold"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"none\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"critical\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high_or_higher\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium_or_higher\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"all\"")))) } ?: true) && ((item as JsonObject)["tool"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"code_scanning\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleCopilotCodeReviewBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["review_draft_pull_requests"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((property as JsonObject)["review_on_push"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"copilot_code_review\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleLicenseComplianceScanningBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"license_compliance_scanning\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleFilePathRestrictionBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("restricted_file_paths") && ((property as JsonObject)["restricted_file_paths"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"file_path_restriction\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleMaxFilePathLengthBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("max_file_path_length") && ((property as JsonObject)["max_file_path_length"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("1", "32767", null, null, null)) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"max_file_path_length\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleFileExtensionRestrictionBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("restricted_file_extensions") && ((property as JsonObject)["restricted_file_extensions"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"file_extension_restriction\"")))) } ?: true))))

private fun matchesRepositoryRuleRepositoryRuleMaxFileSizeBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("max_file_size") && ((property as JsonObject)["max_file_size"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("1", "100", null, null, null)) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"max_file_size\"")))) } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
