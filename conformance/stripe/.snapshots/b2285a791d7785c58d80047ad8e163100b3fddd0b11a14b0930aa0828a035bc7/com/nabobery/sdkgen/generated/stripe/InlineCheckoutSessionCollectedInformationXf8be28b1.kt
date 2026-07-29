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

public enum class InlineCheckoutSessionCollectedInformationXf8be28b1Branch {
  PaymentPagesCheckoutSessionCollectedInformation,
}

public sealed class InlineCheckoutSessionCollectedInformationXf8be28b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionCollectedInformationXf8be28b1NoMatchException(
  message: String,
) : InlineCheckoutSessionCollectedInformationXf8be28b1DecodingException(message)

internal data class InlineCheckoutSessionCollectedInformationXf8be28b1Inspection(
  public val matchesPaymentPagesCheckoutSessionCollectedInformation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCollectedInformation).count { it }
}

/**
 * Information about the customer collected within the Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/collected_information
 */
@Serializable(with = InlineCheckoutSessionCollectedInformationXf8be28b1.Serializer::class)
public class InlineCheckoutSessionCollectedInformationXf8be28b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionCollectedInformationXf8be28b1Inspection,
) {
  public val paymentPagesCheckoutSessionCollectedInformation:
      PaymentPagesCheckoutSessionCollectedInformationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCollectedInformation) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCollectedInformationView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionCollectedInformationXf8be28b1Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCollectedInformation) add(InlineCheckoutSessionCollectedInformationXf8be28b1Branch.PaymentPagesCheckoutSessionCollectedInformation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionCollectedInformationXf8be28b1 {
      val inspection = inspectInlineCheckoutSessionCollectedInformationXf8be28b1(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionCollectedInformationXf8be28b1NoMatchException("InlineCheckoutSessionCollectedInformationXf8be28b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionCollectedInformationXf8be28b1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionCollectedInformationXf8be28b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionCollectedInformationXf8be28b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionCollectedInformationXf8be28b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionCollectedInformationXf8be28b1) {
      encoder.requireJsonEncoder("InlineCheckoutSessionCollectedInformationXf8be28b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionCollectedInformationXf8be28b1(element: JsonElement): InlineCheckoutSessionCollectedInformationXf8be28b1Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionCollectedInformationXf8be28b1Inspection(
    matchesPaymentPagesCheckoutSessionCollectedInformation = false,
    failures = listOf("PaymentPagesCheckoutSessionCollectedInformation: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCollectedInformation = true
  return InlineCheckoutSessionCollectedInformationXf8be28b1Inspection(
    matchesPaymentPagesCheckoutSessionCollectedInformation = matchesPaymentPagesCheckoutSessionCollectedInformation,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCollectedInformation) add("PaymentPagesCheckoutSessionCollectedInformation: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
