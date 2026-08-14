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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/ideal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf2X887f34c9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
