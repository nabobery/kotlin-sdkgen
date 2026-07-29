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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247daInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X187fb5d3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
