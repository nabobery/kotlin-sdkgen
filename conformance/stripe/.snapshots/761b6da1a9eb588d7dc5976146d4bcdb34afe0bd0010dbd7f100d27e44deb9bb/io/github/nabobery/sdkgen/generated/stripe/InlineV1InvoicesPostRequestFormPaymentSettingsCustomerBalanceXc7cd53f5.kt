package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89) add(InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962) add(InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsCustomerBalanceXc7cd53f5Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f5b0d89")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d0d9962")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
