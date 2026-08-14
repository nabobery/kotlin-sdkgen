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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dBranch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dNoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dDecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dInspection,
) {
  public val branch1:
      List<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsItemXb91080cd>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsItemXb91080cd>>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dBranch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dNoMatchException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8d(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsItemXb91080cd>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274 = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274>()
  return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsXa9e1bd8dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274 = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274) add("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X1dad3274")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
