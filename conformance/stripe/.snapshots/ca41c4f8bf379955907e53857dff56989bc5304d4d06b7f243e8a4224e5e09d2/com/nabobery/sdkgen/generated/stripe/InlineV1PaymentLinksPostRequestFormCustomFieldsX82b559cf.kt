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

public enum class InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfBranch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed).count { it }
}

/**
 * Collect additional information from your customer using custom fields. Up to 3 fields are supported. You can't set
 * this parameter if `ui_mode` is `custom`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfInspection,
) {
  public val branch1: List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664>>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed:
      InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfBranch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed) add(InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfBranch.InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfNoMatchException("InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cf(element: JsonElement): InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf1ItemXf427c664>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed>()
  return InlineV1PaymentLinksPostRequestFormCustomFieldsX82b559cfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed = matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed) add("InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed: value does not match InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
