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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a) add(InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsCardX34294038Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X105a391b")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X6de4877a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
