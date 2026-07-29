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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_ba
 * lance
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsCustomerBalanceX4de1fde1Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X53d1933b")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X5a9029bf")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
