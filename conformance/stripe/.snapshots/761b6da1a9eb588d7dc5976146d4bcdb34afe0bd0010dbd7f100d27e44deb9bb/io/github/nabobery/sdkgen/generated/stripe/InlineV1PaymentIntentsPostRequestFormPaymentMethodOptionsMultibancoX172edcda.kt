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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/multibanco.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/multibanco
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcdaInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X9f75da06")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X95330119")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
