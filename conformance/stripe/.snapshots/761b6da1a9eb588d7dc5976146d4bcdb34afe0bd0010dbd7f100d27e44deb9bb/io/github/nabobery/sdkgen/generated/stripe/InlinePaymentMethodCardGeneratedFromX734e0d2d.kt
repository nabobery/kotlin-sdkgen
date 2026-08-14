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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodCardGeneratedFromX734e0d2dBranch {
  PaymentMethodCardGeneratedCard,
}

public sealed class InlinePaymentMethodCardGeneratedFromX734e0d2dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardGeneratedFromX734e0d2dNoMatchException(
  message: String,
) : InlinePaymentMethodCardGeneratedFromX734e0d2dDecodingException(message)

internal data class InlinePaymentMethodCardGeneratedFromX734e0d2dInspection(
  public val matchesPaymentMethodCardGeneratedCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodCardGeneratedCard).count { it }
}

/**
 * Details of the original PaymentMethod that created this object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/generated_from
 */
@Serializable(with = InlinePaymentMethodCardGeneratedFromX734e0d2d.Serializer::class)
public class InlinePaymentMethodCardGeneratedFromX734e0d2d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardGeneratedFromX734e0d2dInspection,
) {
  public val paymentMethodCardGeneratedCard: PaymentMethodCardGeneratedCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodCardGeneratedCard) json.decodeFromJsonElement<PaymentMethodCardGeneratedCardView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardGeneratedFromX734e0d2dBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodCardGeneratedCard) add(InlinePaymentMethodCardGeneratedFromX734e0d2dBranch.PaymentMethodCardGeneratedCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardGeneratedFromX734e0d2d {
      val inspection = inspectInlinePaymentMethodCardGeneratedFromX734e0d2d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardGeneratedFromX734e0d2dNoMatchException("InlinePaymentMethodCardGeneratedFromX734e0d2d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardGeneratedFromX734e0d2d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardGeneratedFromX734e0d2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardGeneratedFromX734e0d2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardGeneratedFromX734e0d2d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardGeneratedFromX734e0d2d) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardGeneratedFromX734e0d2d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardGeneratedFromX734e0d2d(element: JsonElement): InlinePaymentMethodCardGeneratedFromX734e0d2dInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardGeneratedFromX734e0d2dInspection(
    matchesPaymentMethodCardGeneratedCard = false,
    failures = listOf("PaymentMethodCardGeneratedCard: expected JSON object"),
  )
  val matchesPaymentMethodCardGeneratedCard = true
  return InlinePaymentMethodCardGeneratedFromX734e0d2dInspection(
    matchesPaymentMethodCardGeneratedCard = matchesPaymentMethodCardGeneratedCard,
    failures = buildList {
      if (!matchesPaymentMethodCardGeneratedCard) add("PaymentMethodCardGeneratedCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
