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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Branch {
  InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a,
  InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Inspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a, matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/address
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Inspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Branch.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942) add(InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Branch.InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Inspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942>()
  return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6Inspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a = matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942 = matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a) add("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a: value does not match InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf1X535d537a")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942) add("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942: value does not match InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAnyOf2X628f6942")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
