package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Branch {
  ReviewCustomGatesCommentRequired,
  ReviewCustomGatesStateRequired,
}

public sealed class InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393NoMatchException(
  message: String,
) : InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393DecodingException(message)

internal data class InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Inspection(
  public val matchesReviewCustomGatesCommentRequired: Boolean,
  public val matchesReviewCustomGatesStateRequired: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesReviewCustomGatesCommentRequired, matchesReviewCustomGatesStateRequired).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1deployment_protection_rule/pos
 * t/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1deployment_protection_rule/pos
 * t/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393.Serializer::class)
public class InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Inspection,
) {
  public val reviewCustomGatesCommentRequired: ReviewCustomGatesCommentRequiredView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReviewCustomGatesCommentRequired) json.decodeFromJsonElement<ReviewCustomGatesCommentRequiredView>(raw) else null }

  public val reviewCustomGatesStateRequired: ReviewCustomGatesStateRequiredView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesReviewCustomGatesStateRequired) json.decodeFromJsonElement<ReviewCustomGatesStateRequiredView>(raw) else null }

  public val matchedBranches:
      Set<InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Branch>
    get() = buildSet {
      if (inspection.matchesReviewCustomGatesCommentRequired) add(InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Branch.ReviewCustomGatesCommentRequired)
      if (inspection.matchesReviewCustomGatesStateRequired) add(InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Branch.ReviewCustomGatesStateRequired)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393 {
      val inspection = inspectInlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393NoMatchException("InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393) {
      encoder.requireJsonEncoder("InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393(element: JsonElement): InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Inspection {
  val raw = element as? JsonObject ?: return InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Inspection(
    matchesReviewCustomGatesCommentRequired = false,
    matchesReviewCustomGatesStateRequired = false,
    failures = listOf("ReviewCustomGatesCommentRequired: expected JSON object", "ReviewCustomGatesStateRequired: expected JSON object"),
  )
  val matchesReviewCustomGatesCommentRequired = raw["comment"].isString() && raw["environment_name"].isString()
  val matchesReviewCustomGatesStateRequired = raw["environment_name"].isString() && raw["state"] != null
  return InlineReposActionsRunsDeploymentProtectionRulePostRequestJsonX8bae8393Inspection(
    matchesReviewCustomGatesCommentRequired = matchesReviewCustomGatesCommentRequired,
    matchesReviewCustomGatesStateRequired = matchesReviewCustomGatesStateRequired,
    failures = buildList {
      if (!matchesReviewCustomGatesCommentRequired) add("ReviewCustomGatesCommentRequired: required properties 'comment', 'environment_name' do not match their declared types")
      if (!matchesReviewCustomGatesStateRequired) add("ReviewCustomGatesStateRequired: required properties 'environment_name', 'state' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
