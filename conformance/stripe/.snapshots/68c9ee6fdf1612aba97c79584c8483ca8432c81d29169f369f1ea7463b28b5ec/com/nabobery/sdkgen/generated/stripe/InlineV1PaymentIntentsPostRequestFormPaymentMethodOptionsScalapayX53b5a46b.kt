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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/scalapay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/scalapay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X3e4b4e82")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
