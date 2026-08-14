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

public enum class InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Branch {
  PaymentIntentPaymentMethodOptionsEps,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Inspection(
  public val matchesPaymentIntentPaymentMethodOptionsEps: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsEps, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/eps.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/eps
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Inspection,
) {
  public val paymentIntentPaymentMethodOptionsEps: PaymentIntentPaymentMethodOptionsEpsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsEps) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsEpsView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsEps) add(InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Branch.PaymentIntentPaymentMethodOptionsEps)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsEpsX37abbad2(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2NoMatchException("InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsEpsX37abbad2(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Inspection(
    matchesPaymentIntentPaymentMethodOptionsEps = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsEps: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsEps = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2Inspection(
    matchesPaymentIntentPaymentMethodOptionsEps = matchesPaymentIntentPaymentMethodOptionsEps,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsEps) add("PaymentIntentPaymentMethodOptionsEps: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
