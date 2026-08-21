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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsUpiX74f0e331Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xb5405e6e")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc75f25a9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
