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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/billie.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/billie
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf1X373cba5b")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieAnyOf2Xaf1200b8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
