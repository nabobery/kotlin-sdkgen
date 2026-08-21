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

public enum class InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options/properties/referen
 * ce_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options/properties/referen
 * ce_prefix
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05NoMatchException("InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05(element: JsonElement): InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a>()
  return InlineV1PaymentIntentsPostRequestFormReferencePrefixX315adc05Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3437cc8a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
