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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baBranch {
  InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baBranch.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baBranch.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baNoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00baInspection(
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1X0fabcae2")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf2X45b97629")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
