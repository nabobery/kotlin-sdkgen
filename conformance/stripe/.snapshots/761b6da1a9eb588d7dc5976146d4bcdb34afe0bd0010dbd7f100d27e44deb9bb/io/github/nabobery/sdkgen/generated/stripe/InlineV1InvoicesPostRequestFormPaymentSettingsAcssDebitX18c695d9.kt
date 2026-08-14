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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c) add(InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53) add(InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsAcssDebitX18c695d9Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X1299cb3c")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X911f9f53")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
