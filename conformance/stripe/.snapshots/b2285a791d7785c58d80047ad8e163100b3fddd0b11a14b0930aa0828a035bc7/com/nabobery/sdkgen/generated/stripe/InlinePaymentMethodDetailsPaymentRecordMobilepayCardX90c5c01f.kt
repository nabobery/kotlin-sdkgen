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

public enum class InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard,
}

public sealed class InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fNoMatchException(
  message: String,
) : InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fDecodingException(message)

internal data class InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard).count { it }
}

/**
 * Internal card details
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_mobilepay/properties/card
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f.Serializer::class)
public class InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCardView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard) add(InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f {
      val inspection = inspectInlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fNoMatchException("InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f(element: JsonElement): InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard = true
  return InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01fInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodMobilepayDetailsResourceCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
