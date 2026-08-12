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

public enum class InlinePaymentIntentPaymentMethodOptionsZipX24317875Branch {
  PaymentMethodOptionsZip,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsZipX24317875DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsZipX24317875NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsZipX24317875DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsZipX24317875Inspection(
  public val matchesPaymentMethodOptionsZip: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsZip, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/zip.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/zip
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsZipX24317875.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsZipX24317875 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsZipX24317875Inspection,
) {
  public val paymentMethodOptionsZip: PaymentMethodOptionsZipView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsZip) json.decodeFromJsonElement<PaymentMethodOptionsZipView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsZipX24317875Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsZip) add(InlinePaymentIntentPaymentMethodOptionsZipX24317875Branch.PaymentMethodOptionsZip)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsZipX24317875Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsZipX24317875 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsZipX24317875(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsZipX24317875NoMatchException("InlinePaymentIntentPaymentMethodOptionsZipX24317875 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsZipX24317875(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsZipX24317875> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsZipX24317875 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsZipX24317875")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsZipX24317875) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsZipX24317875").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsZipX24317875(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsZipX24317875Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsZipX24317875Inspection(
    matchesPaymentMethodOptionsZip = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsZip: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsZip = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsZipX24317875Inspection(
    matchesPaymentMethodOptionsZip = matchesPaymentMethodOptionsZip,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsZip) add("PaymentMethodOptionsZip: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
