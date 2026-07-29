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

public enum class InlinePaymentRecordPaymentMethodDetailsX99046c4cBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails,
}

public sealed class InlinePaymentRecordPaymentMethodDetailsX99046c4cDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentRecordPaymentMethodDetailsX99046c4cNoMatchException(
  message: String,
) : InlinePaymentRecordPaymentMethodDetailsX99046c4cDecodingException(message)

internal data class InlinePaymentRecordPaymentMethodDetailsX99046c4cInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails).count { it }
}

/**
 * Information about the Payment Method debited for this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/payment_method_details
 */
@Serializable(with = InlinePaymentRecordPaymentMethodDetailsX99046c4c.Serializer::class)
public class InlinePaymentRecordPaymentMethodDetailsX99046c4c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentRecordPaymentMethodDetailsX99046c4cInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentRecordPaymentMethodDetailsX99046c4cBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) add(InlinePaymentRecordPaymentMethodDetailsX99046c4cBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentRecordPaymentMethodDetailsX99046c4c {
      val inspection = inspectInlinePaymentRecordPaymentMethodDetailsX99046c4c(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentRecordPaymentMethodDetailsX99046c4cNoMatchException("InlinePaymentRecordPaymentMethodDetailsX99046c4c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentRecordPaymentMethodDetailsX99046c4c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentRecordPaymentMethodDetailsX99046c4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentRecordPaymentMethodDetailsX99046c4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentRecordPaymentMethodDetailsX99046c4c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentRecordPaymentMethodDetailsX99046c4c) {
      encoder.requireJsonEncoder("InlinePaymentRecordPaymentMethodDetailsX99046c4c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentRecordPaymentMethodDetailsX99046c4c(element: JsonElement): InlinePaymentRecordPaymentMethodDetailsX99046c4cInspection {
  val raw = element as? JsonObject ?: return InlinePaymentRecordPaymentMethodDetailsX99046c4cInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = raw["type"].isString()
  return InlinePaymentRecordPaymentMethodDetailsX99046c4cInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
