package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3,
}

public sealed class InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3).count { it }
}

/**
 * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields` is specified, the list
 * specified will replace the existing custom field list on this invoice. Pass an empty string to remove
 * previously-defined fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/custom_fields
 */
@Serializable(with = InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3.Serializer::class)
public class InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Inspection,
) {
  public val branch1: List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemXd1b46d04>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemXd1b46d04>>(raw) else null }

  public val inlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3:
      InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3) add(InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Branch.InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3 {
      val inspection = inspectInlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3NoMatchException("InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3(element: JsonElement): InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemXd1b46d04>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3>()
  return InlineV1InvoicesPostRequestFormCustomFieldsXdbc056f3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3 = matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3) add("InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3: value does not match InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2Xd4a302d3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
