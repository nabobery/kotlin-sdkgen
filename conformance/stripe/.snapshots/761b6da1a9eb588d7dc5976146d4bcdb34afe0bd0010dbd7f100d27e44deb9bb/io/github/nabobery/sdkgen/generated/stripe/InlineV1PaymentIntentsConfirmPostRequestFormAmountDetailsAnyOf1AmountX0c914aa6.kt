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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Branch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X2c875a29")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
