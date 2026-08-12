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

public enum class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Branch {
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827,
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827, matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Branch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Branch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250NoMatchException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a>()
  return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsRestrictionsX68f1e250Inspection(
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827,
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X6b6b385a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
