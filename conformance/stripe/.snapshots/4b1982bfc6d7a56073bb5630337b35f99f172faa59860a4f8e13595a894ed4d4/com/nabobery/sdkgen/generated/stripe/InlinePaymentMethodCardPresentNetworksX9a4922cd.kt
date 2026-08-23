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

public enum class InlinePaymentMethodCardPresentNetworksX9a4922cdBranch {
  PaymentMethodCardPresentNetworks,
}

public sealed class InlinePaymentMethodCardPresentNetworksX9a4922cdDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardPresentNetworksX9a4922cdNoMatchException(
  message: String,
) : InlinePaymentMethodCardPresentNetworksX9a4922cdDecodingException(message)

internal data class InlinePaymentMethodCardPresentNetworksX9a4922cdInspection(
  public val matchesPaymentMethodCardPresentNetworks: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodCardPresentNetworks).count { it }
}

/**
 * Contains information about card networks that can be used to process the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_present/properties/networks
 */
@Serializable(with = InlinePaymentMethodCardPresentNetworksX9a4922cd.Serializer::class)
public class InlinePaymentMethodCardPresentNetworksX9a4922cd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardPresentNetworksX9a4922cdInspection,
) {
  public val paymentMethodCardPresentNetworks: PaymentMethodCardPresentNetworksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodCardPresentNetworks) json.decodeFromJsonElement<PaymentMethodCardPresentNetworksView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardPresentNetworksX9a4922cdBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodCardPresentNetworks) add(InlinePaymentMethodCardPresentNetworksX9a4922cdBranch.PaymentMethodCardPresentNetworks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardPresentNetworksX9a4922cd {
      val inspection = inspectInlinePaymentMethodCardPresentNetworksX9a4922cd(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardPresentNetworksX9a4922cdNoMatchException("InlinePaymentMethodCardPresentNetworksX9a4922cd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardPresentNetworksX9a4922cd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardPresentNetworksX9a4922cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardPresentNetworksX9a4922cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardPresentNetworksX9a4922cd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardPresentNetworksX9a4922cd) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardPresentNetworksX9a4922cd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardPresentNetworksX9a4922cd(element: JsonElement): InlinePaymentMethodCardPresentNetworksX9a4922cdInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardPresentNetworksX9a4922cdInspection(
    matchesPaymentMethodCardPresentNetworks = false,
    failures = listOf("PaymentMethodCardPresentNetworks: expected JSON object"),
  )
  val matchesPaymentMethodCardPresentNetworks = raw["available"].isStringArray()
  return InlinePaymentMethodCardPresentNetworksX9a4922cdInspection(
    matchesPaymentMethodCardPresentNetworks = matchesPaymentMethodCardPresentNetworks,
    failures = buildList {
      if (!matchesPaymentMethodCardPresentNetworks) add("PaymentMethodCardPresentNetworks: required properties 'available' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
