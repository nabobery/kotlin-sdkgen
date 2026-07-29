package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A reviewing team, and file patterns describing which files they must approve changes to.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-required-reviewer-configuration
 */
@Serializable(with = RepositoryRuleParamsRequiredReviewerConfiguration.Serializer::class)
public class RepositoryRuleParamsRequiredReviewerConfiguration(
  filePatterns: List<String>,
  /**
   * Minimum number of approvals required from the specified team. If set to zero, the team will be added to the pull
   * request but approval is optional.
   */
  public val minimumApprovals: Int,
  public val reviewer: RepositoryRuleParamsReviewer,
) {
  /**
   * Array of file patterns. Pull requests which change matching files must be approved by the specified team. File
   * patterns use fnmatch syntax.
   */
  public val filePatterns: List<String> = filePatterns.toList()

  public class Builder {
    private var filePatternsValue: List<String>? = null

    public var filePatterns: List<String>
      get() = requireNotNull(filePatternsValue) { "filePatterns is required" }.toList()
      set(`value`) {
        filePatternsValue = value.toList()
      }

    private var minimumApprovalsValue: Int? = null

    public var minimumApprovals: Int
      get() = requireNotNull(minimumApprovalsValue) { "minimumApprovals is required" }
      set(`value`) {
        minimumApprovalsValue = value
      }

    private var reviewerValue: RepositoryRuleParamsReviewer? = null

    public var reviewer: RepositoryRuleParamsReviewer
      get() = requireNotNull(reviewerValue) { "reviewer is required" }
      set(`value`) {
        reviewerValue = value
      }

    public fun build(): RepositoryRuleParamsRequiredReviewerConfiguration {
      check(filePatternsValue != null) { "filePatterns is required" }
      check(minimumApprovalsValue != null) { "minimumApprovals is required" }
      check(reviewerValue != null) { "reviewer is required" }
      return RepositoryRuleParamsRequiredReviewerConfiguration(
        filePatterns = filePatterns,
        minimumApprovals = minimumApprovals,
        reviewer = reviewer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsRequiredReviewerConfiguration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleParamsRequiredReviewerConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsRequiredReviewerConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsRequiredReviewerConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsRequiredReviewerConfiguration must be a JSON object")
      val filePatterns = json.decodeRequired<List<String>>(rawObject, "file_patterns")
      val minimumApprovals = json.decodeRequired<Int>(rawObject, "minimum_approvals")
      val reviewer = json.decodeRequired<RepositoryRuleParamsReviewer>(rawObject, "reviewer")
      return RepositoryRuleParamsRequiredReviewerConfiguration(
        filePatterns = filePatterns,
        minimumApprovals = minimumApprovals,
        reviewer = reviewer,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsRequiredReviewerConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsRequiredReviewerConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_patterns", json.encodeToJsonElement(value.filePatterns))
        put("minimum_approvals", json.encodeToJsonElement(value.minimumApprovals))
        put("reviewer", json.encodeToJsonElement(value.reviewer))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsRequiredReviewerConfiguration(block: RepositoryRuleParamsRequiredReviewerConfiguration.Builder.() -> Unit): RepositoryRuleParamsRequiredReviewerConfiguration = RepositoryRuleParamsRequiredReviewerConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsRequiredReviewerConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
