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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eBranch {
  InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45,
  InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eInspection(
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45, matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/shipping_address
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eInspection,
) {
  public val inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45:
      InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a:
      InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45) add(InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eBranch.InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a) add(InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eBranch.InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eNoMatchException("InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e(element: JsonElement): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eInspection {
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45>()
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a>()
  return InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20eInspection(
    matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45 = matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45,
    matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a = matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45) add("InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45: value does not match InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45")
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a) add("InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a: value does not match InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
