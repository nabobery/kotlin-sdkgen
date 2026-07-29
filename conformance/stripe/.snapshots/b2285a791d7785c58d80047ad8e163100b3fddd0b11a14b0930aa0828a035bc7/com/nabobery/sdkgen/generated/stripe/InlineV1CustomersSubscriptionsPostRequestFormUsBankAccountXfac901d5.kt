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

public enum class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Branch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/us_bank_account
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771) add(InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27) add(InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27>()
  return InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountXfac901d5Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X1e856771")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf2d18d27")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
