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

public enum class InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19DecodingException(
  message: String,
) : SerializationException(message)

public class InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19NoMatchException(
  message: String,
) : InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19DecodingException(message)

internal data class InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Inspection(
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/issue_field_value/properties
 * /value
 */
@Serializable(with = InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19.Serializer::class)
public class InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19 {
      val inspection = inspectInlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19(raw)
      if (inspection.matchCount == 0) {
        throw InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19NoMatchException("InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19) {
      encoder.requireJsonEncoder("InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19(element: JsonElement): InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Int>()
  return InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19Inspection(
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
