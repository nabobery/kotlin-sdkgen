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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20eInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1Xa6c78475")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xff401fb1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
