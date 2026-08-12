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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Branch {
  CardGeneratedFromPaymentMethodDetails,
}

public sealed class InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9NoMatchException(
  message: String,
) : InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9DecodingException(message)

internal data class InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Inspection(
  public val matchesCardGeneratedFromPaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCardGeneratedFromPaymentMethodDetails).count { it }
}

/**
 * Transaction-specific details of the payment method used in the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_card_generated_card/properties/payment_method_details
 */
@Serializable(with = InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9.Serializer::class)
public class InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Inspection,
) {
  public val cardGeneratedFromPaymentMethodDetails: CardGeneratedFromPaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCardGeneratedFromPaymentMethodDetails) json.decodeFromJsonElement<CardGeneratedFromPaymentMethodDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Branch>
    get() = buildSet {
      if (inspection.matchesCardGeneratedFromPaymentMethodDetails) add(InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Branch.CardGeneratedFromPaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9 {
      val inspection = inspectInlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9NoMatchException("InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9(element: JsonElement): InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Inspection(
    matchesCardGeneratedFromPaymentMethodDetails = false,
    failures = listOf("CardGeneratedFromPaymentMethodDetails: expected JSON object"),
  )
  val matchesCardGeneratedFromPaymentMethodDetails = raw["type"].isString()
  return InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9Inspection(
    matchesCardGeneratedFromPaymentMethodDetails = matchesCardGeneratedFromPaymentMethodDetails,
    failures = buildList {
      if (!matchesCardGeneratedFromPaymentMethodDetails) add("CardGeneratedFromPaymentMethodDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
