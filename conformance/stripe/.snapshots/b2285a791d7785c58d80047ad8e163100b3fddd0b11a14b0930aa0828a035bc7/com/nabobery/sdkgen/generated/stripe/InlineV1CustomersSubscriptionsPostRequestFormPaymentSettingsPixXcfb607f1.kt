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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Branch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/pix
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPixXcfb607f1Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X0196eaf9")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5bc7f39e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
