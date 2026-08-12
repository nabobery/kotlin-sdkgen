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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX38dece94Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X95c1d609")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xed1a406b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
