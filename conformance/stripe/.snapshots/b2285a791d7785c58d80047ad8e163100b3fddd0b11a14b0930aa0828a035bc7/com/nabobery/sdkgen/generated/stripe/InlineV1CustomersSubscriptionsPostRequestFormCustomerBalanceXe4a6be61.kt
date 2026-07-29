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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Branch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balanc
 * e
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347) add(InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b) add(InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b>()
  return InlineV1CustomersSubscriptionsPostRequestFormCustomerBalanceXe4a6be61Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xcf738347")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xe972db1b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
