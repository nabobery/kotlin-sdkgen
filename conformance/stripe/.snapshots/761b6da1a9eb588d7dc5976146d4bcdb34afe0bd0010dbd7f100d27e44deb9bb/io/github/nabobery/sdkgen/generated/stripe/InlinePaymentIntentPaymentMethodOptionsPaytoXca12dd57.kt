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

public enum class InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Branch {
  PaymentIntentPaymentMethodOptionsPayto,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Inspection(
  public val matchesPaymentIntentPaymentMethodOptionsPayto: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsPayto, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/payto.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/payto
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Inspection,
) {
  public val paymentIntentPaymentMethodOptionsPayto: PaymentIntentPaymentMethodOptionsPaytoView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsPayto) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsPaytoView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsPayto) add(InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Branch.PaymentIntentPaymentMethodOptionsPayto)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57NoMatchException("InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Inspection(
    matchesPaymentIntentPaymentMethodOptionsPayto = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsPayto: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsPayto = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57Inspection(
    matchesPaymentIntentPaymentMethodOptionsPayto = matchesPaymentIntentPaymentMethodOptionsPayto,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsPayto) add("PaymentIntentPaymentMethodOptionsPayto: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
