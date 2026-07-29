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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dBranch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/customer_balance
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea) add(InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a) add(InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289d(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a>()
  return InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceX4126289dInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xc44272ea")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9ffc086a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
