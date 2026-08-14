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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/multibanco.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/multibanco
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8821089a")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xf1b9eef1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
