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

public enum class InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Branch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails,
}

public sealed class InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3NoMatchException(
  message: String,
) : InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3DecodingException(message)

internal data class InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails).count { it }
}

/**
 * Information about the Payment Method debited for this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_attempt_record/properties/payment_method_details
 */
@Serializable(with = InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3.Serializer::class)
public class InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) add(InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Branch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3 {
      val inspection = inspectInlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3NoMatchException("InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3) {
      encoder.requireJsonEncoder("InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3(element: JsonElement): InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = raw["type"].isString()
  return InlinePaymentAttemptRecordPaymentMethodDetailsXcf3260e3Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
