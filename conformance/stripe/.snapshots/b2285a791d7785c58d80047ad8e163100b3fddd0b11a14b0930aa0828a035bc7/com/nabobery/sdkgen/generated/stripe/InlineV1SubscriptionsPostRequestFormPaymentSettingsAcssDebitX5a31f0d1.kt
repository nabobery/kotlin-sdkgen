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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitX5a31f0d1Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X316ba7ad")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X208bff3f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
