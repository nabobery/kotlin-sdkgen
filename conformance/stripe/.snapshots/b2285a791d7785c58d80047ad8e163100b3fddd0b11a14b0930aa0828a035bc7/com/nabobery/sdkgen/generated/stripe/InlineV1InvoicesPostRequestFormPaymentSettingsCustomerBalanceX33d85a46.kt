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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2) add(InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453) add(InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceX33d85a46Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xe8b48ee2")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf0a88453")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
