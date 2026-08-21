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

public enum class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Branch {
  InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523,
  InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Inspection(
  public val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523:
      Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523, matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Inspection,
) {
  public val inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523) add(InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Branch.InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002) add(InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Branch.InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7NoMatchException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Inspection {
  val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523>()
  val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002>()
  return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationRenderingOptionsXec8b4bf7Inspection(
    matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523 = matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523,
    matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002 = matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002,
    failures = buildList {
      if (!matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523) add("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523: value does not match InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf1Xdd44c523")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002) add("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002: value does not match InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa9d0b002")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
