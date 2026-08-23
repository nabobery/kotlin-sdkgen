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

public enum class InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Branch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks,
}

public sealed class InlinePaymentsPrimitivesPa0ad7ChecksX56edce12DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa0ad7ChecksX56edce12NoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa0ad7ChecksX56edce12DecodingException(message)

internal data class InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks).count { it }
}

/**
 * Check results by Card networks on Card address and CVC at time of payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/checks
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7ChecksX56edce12.Serializer::class)
public class InlinePaymentsPrimitivesPa0ad7ChecksX56edce12 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecksView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks) add(InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Branch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa0ad7ChecksX56edce12 {
      val inspection = inspectInlinePaymentsPrimitivesPa0ad7ChecksX56edce12(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa0ad7ChecksX56edce12NoMatchException("InlinePaymentsPrimitivesPa0ad7ChecksX56edce12 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa0ad7ChecksX56edce12(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7ChecksX56edce12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7ChecksX56edce12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa0ad7ChecksX56edce12")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0ad7ChecksX56edce12) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa0ad7ChecksX56edce12").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa0ad7ChecksX56edce12(element: JsonElement): InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = true
  return InlinePaymentsPrimitivesPa0ad7ChecksX56edce12Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceChecks: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
