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

public enum class InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Branch {
  PaymentMethodConfigBizPaymentMethodConfigurationDetails,
}

public sealed class InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Inspection(
  public val matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails).count { it }
}

/**
 * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) used
 * for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/payment_method_configuration_details
 */
@Serializable(with = InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1.Serializer::class)
public class InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Inspection,
) {
  public val paymentMethodConfigBizPaymentMethodConfigurationDetails:
      PaymentMethodConfigBizPaymentMethodConfigurationDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) json.decodeFromJsonElement<PaymentMethodConfigBizPaymentMethodConfigurationDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) add(InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Branch.PaymentMethodConfigBizPaymentMethodConfigurationDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1 {
      val inspection = inspectInlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1NoMatchException("InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1(element: JsonElement): InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Inspection(
    matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = false,
    failures = listOf("PaymentMethodConfigBizPaymentMethodConfigurationDetails: expected JSON object"),
  )
  val matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = raw["id"].isString()
  return InlinePaymentIntentPaymentMethodConfigurationDetailsXa9c290a1Inspection(
    matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails,
    failures = buildList {
      if (!matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) add("PaymentMethodConfigBizPaymentMethodConfigurationDetails: required properties 'id' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
