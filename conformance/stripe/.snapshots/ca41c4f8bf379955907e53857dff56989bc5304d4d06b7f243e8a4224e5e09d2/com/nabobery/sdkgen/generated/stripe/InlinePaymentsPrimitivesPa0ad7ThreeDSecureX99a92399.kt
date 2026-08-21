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

public enum class InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Branch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure,
}

public sealed class InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399NoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399DecodingException(message)

internal data class InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure).count { it }
}

/**
 * Populated if this transaction used 3D Secure authentication.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/three_d_secure
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399.Serializer::class)
public class InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecureView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecureView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure) add(InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Branch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399 {
      val inspection = inspectInlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399NoMatchException("InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399(element: JsonElement): InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = true
  return InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceThreeDSecure: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
