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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aBranch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aInspection,
) {
  public val branch1:
      List<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604>>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aBranch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2Xdd7490b7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
