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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dBranch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dInspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dInspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131) add(InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274) add(InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dNoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313d(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dInspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX68ff313dInspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X13d37131")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X00f4c274")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
