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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Branch {
  InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff,
  InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff, matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/terms_of_service_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/terms_of_service_acceptance
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff:
      InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7:
      InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff) add(InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Branch.InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7) add(InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Branch.InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184NoMatchException("InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184(element: JsonElement): InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff>()
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7>()
  return InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184Inspection(
    matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff = matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff,
    matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7 = matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff) add("InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAnyOf1X22bc8fff")
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7) add("InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X14e77aa7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
