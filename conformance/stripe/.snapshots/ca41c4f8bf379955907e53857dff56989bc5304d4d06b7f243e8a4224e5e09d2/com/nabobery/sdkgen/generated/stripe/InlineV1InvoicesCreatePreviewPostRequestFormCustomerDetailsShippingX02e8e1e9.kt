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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Branch {
  InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57,
  InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Inspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57, matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/shipping
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Inspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Branch.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Branch.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Inspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8>()
  return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9Inspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57 = matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8 = matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57) add("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57: value does not match InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X542f7e57")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8) add("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8: value does not match InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2Xebf6fdc8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
