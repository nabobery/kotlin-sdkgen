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

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Branch {
  InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e,
  InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e, matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/rendering_options
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0NoMatchException("InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0(element: JsonElement): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e>()
  val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d>()
  return InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX689589e0Inspection(
    matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e,
    matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e) add("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e")
      if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d) add("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
