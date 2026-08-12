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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentIntentLatestChargeXddbf3551Branch {
  Branch1,
  Charge,
}

public sealed class InlinePaymentIntentLatestChargeXddbf3551DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentLatestChargeXddbf3551NoMatchException(
  message: String,
) : InlinePaymentIntentLatestChargeXddbf3551DecodingException(message)

internal data class InlinePaymentIntentLatestChargeXddbf3551Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the latest [Charge object](https://docs.stripe.com/api/charges) created by this PaymentIntent. This property is
 * `null` until PaymentIntent confirmation is attempted.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/latest_charge
 */
@Serializable(with = InlinePaymentIntentLatestChargeXddbf3551.Serializer::class)
public class InlinePaymentIntentLatestChargeXddbf3551 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentLatestChargeXddbf3551Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentLatestChargeXddbf3551Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentIntentLatestChargeXddbf3551Branch.Branch1)
      if (inspection.matchesCharge) add(InlinePaymentIntentLatestChargeXddbf3551Branch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentLatestChargeXddbf3551 {
      val inspection = inspectInlinePaymentIntentLatestChargeXddbf3551(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentLatestChargeXddbf3551NoMatchException("InlinePaymentIntentLatestChargeXddbf3551 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentLatestChargeXddbf3551(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentLatestChargeXddbf3551> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentLatestChargeXddbf3551 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentLatestChargeXddbf3551")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentLatestChargeXddbf3551) {
      encoder.requireJsonEncoder("InlinePaymentIntentLatestChargeXddbf3551").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentLatestChargeXddbf3551(element: JsonElement): InlinePaymentIntentLatestChargeXddbf3551Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlinePaymentIntentLatestChargeXddbf3551Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCharge = matchesCharge,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCharge) add("Charge: value does not match Charge")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
