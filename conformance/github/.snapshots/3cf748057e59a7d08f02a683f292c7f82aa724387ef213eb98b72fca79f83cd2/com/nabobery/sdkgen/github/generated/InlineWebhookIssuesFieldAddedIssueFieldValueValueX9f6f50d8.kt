package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8NoMatchException(
  message: String,
) : InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8DecodingException(message)

internal data class InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * The value of the field. Present for text, date, and number field types.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field_value/properties/v
 * alue
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8.Serializer::class)
public class InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8 {
      val inspection = inspectInlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8(raw)
      if (inspection.matchCount == 0) {
        throw InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8NoMatchException("InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8) {
      encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8(element: JsonElement): InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Int>()
  return InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
