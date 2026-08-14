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

public enum class InlinePaymentIntentAmountDetailsX0fe9fd24Branch {
  PaymentFlowsAmountDetails,
  PaymentFlowsAmountDetailsClient,
}

public sealed class InlinePaymentIntentAmountDetailsX0fe9fd24DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentAmountDetailsX0fe9fd24NoMatchException(
  message: String,
) : InlinePaymentIntentAmountDetailsX0fe9fd24DecodingException(message)

internal data class InlinePaymentIntentAmountDetailsX0fe9fd24Inspection(
  public val matchesPaymentFlowsAmountDetails: Boolean,
  public val matchesPaymentFlowsAmountDetailsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsAmountDetails, matchesPaymentFlowsAmountDetailsClient).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/amount_details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/amount_details
 */
@Serializable(with = InlinePaymentIntentAmountDetailsX0fe9fd24.Serializer::class)
public class InlinePaymentIntentAmountDetailsX0fe9fd24 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentAmountDetailsX0fe9fd24Inspection,
) {
  public val paymentFlowsAmountDetails: PaymentFlowsAmountDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsAmountDetails) json.decodeFromJsonElement<PaymentFlowsAmountDetailsView>(raw) else null }

  public val paymentFlowsAmountDetailsClient: PaymentFlowsAmountDetailsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsAmountDetailsClient) json.decodeFromJsonElement<PaymentFlowsAmountDetailsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentAmountDetailsX0fe9fd24Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsAmountDetails) add(InlinePaymentIntentAmountDetailsX0fe9fd24Branch.PaymentFlowsAmountDetails)
      if (inspection.matchesPaymentFlowsAmountDetailsClient) add(InlinePaymentIntentAmountDetailsX0fe9fd24Branch.PaymentFlowsAmountDetailsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentAmountDetailsX0fe9fd24 {
      val inspection = inspectInlinePaymentIntentAmountDetailsX0fe9fd24(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentAmountDetailsX0fe9fd24NoMatchException("InlinePaymentIntentAmountDetailsX0fe9fd24 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentAmountDetailsX0fe9fd24(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentAmountDetailsX0fe9fd24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentAmountDetailsX0fe9fd24 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentAmountDetailsX0fe9fd24")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentAmountDetailsX0fe9fd24) {
      encoder.requireJsonEncoder("InlinePaymentIntentAmountDetailsX0fe9fd24").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentAmountDetailsX0fe9fd24(element: JsonElement): InlinePaymentIntentAmountDetailsX0fe9fd24Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentAmountDetailsX0fe9fd24Inspection(
    matchesPaymentFlowsAmountDetails = false,
    matchesPaymentFlowsAmountDetailsClient = false,
    failures = listOf("PaymentFlowsAmountDetails: expected JSON object", "PaymentFlowsAmountDetailsClient: expected JSON object"),
  )
  val matchesPaymentFlowsAmountDetails = true
  val matchesPaymentFlowsAmountDetailsClient = true
  return InlinePaymentIntentAmountDetailsX0fe9fd24Inspection(
    matchesPaymentFlowsAmountDetails = matchesPaymentFlowsAmountDetails,
    matchesPaymentFlowsAmountDetailsClient = matchesPaymentFlowsAmountDetailsClient,
    failures = buildList {
      if (!matchesPaymentFlowsAmountDetails) add("PaymentFlowsAmountDetails: required properties  do not match their declared types")
      if (!matchesPaymentFlowsAmountDetailsClient) add("PaymentFlowsAmountDetailsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
