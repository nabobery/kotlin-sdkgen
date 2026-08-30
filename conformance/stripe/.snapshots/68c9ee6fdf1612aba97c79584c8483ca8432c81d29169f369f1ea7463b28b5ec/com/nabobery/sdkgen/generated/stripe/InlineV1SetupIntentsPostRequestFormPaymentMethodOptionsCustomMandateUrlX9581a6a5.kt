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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_mandate_ur
 * l.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_mandate_ur
 * l
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2X0b371c29")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
