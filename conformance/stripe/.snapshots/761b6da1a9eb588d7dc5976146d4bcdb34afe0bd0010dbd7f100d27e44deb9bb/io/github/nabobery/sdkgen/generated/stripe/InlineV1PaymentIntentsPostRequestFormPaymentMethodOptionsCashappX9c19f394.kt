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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/cashapp.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/cashapp
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X879a8242")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2Xa4ec958b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
