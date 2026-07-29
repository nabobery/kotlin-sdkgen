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

public enum class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1NoMatchException(
  message: String,
) : InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1DecodingException(message)

internal data class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * The previous value. Present for text, date, and number field types.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes/properties/issue_field
 * _value/properties/from/properties/value
 */
@Serializable(with = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1.Serializer::class)
public class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1 {
      val inspection = inspectInlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1(raw)
      if (inspection.matchCount == 0) {
        throw InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1NoMatchException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1) {
      encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1(element: JsonElement): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Int>()
  return InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1Inspection(
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
