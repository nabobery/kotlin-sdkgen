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

public enum class InlinePaymentIntentManagedPaymentsX593f2137Branch {
  SmorResourceManagedPayments,
}

public sealed class InlinePaymentIntentManagedPaymentsX593f2137DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentManagedPaymentsX593f2137NoMatchException(
  message: String,
) : InlinePaymentIntentManagedPaymentsX593f2137DecodingException(message)

internal data class InlinePaymentIntentManagedPaymentsX593f2137Inspection(
  public val matchesSmorResourceManagedPayments: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSmorResourceManagedPayments).count { it }
}

/**
 * Settings for Managed Payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/managed_payments
 */
@Serializable(with = InlinePaymentIntentManagedPaymentsX593f2137.Serializer::class)
public class InlinePaymentIntentManagedPaymentsX593f2137 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentManagedPaymentsX593f2137Inspection,
) {
  public val smorResourceManagedPayments: SmorResourceManagedPaymentsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSmorResourceManagedPayments) json.decodeFromJsonElement<SmorResourceManagedPaymentsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentManagedPaymentsX593f2137Branch>
    get() = buildSet {
      if (inspection.matchesSmorResourceManagedPayments) add(InlinePaymentIntentManagedPaymentsX593f2137Branch.SmorResourceManagedPayments)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentManagedPaymentsX593f2137 {
      val inspection = inspectInlinePaymentIntentManagedPaymentsX593f2137(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentManagedPaymentsX593f2137NoMatchException("InlinePaymentIntentManagedPaymentsX593f2137 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentManagedPaymentsX593f2137(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentManagedPaymentsX593f2137> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentManagedPaymentsX593f2137 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentManagedPaymentsX593f2137")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentManagedPaymentsX593f2137) {
      encoder.requireJsonEncoder("InlinePaymentIntentManagedPaymentsX593f2137").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentManagedPaymentsX593f2137(element: JsonElement): InlinePaymentIntentManagedPaymentsX593f2137Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentManagedPaymentsX593f2137Inspection(
    matchesSmorResourceManagedPayments = false,
    failures = listOf("SmorResourceManagedPayments: expected JSON object"),
  )
  val matchesSmorResourceManagedPayments = raw["enabled"] != null
  return InlinePaymentIntentManagedPaymentsX593f2137Inspection(
    matchesSmorResourceManagedPayments = matchesSmorResourceManagedPayments,
    failures = buildList {
      if (!matchesSmorResourceManagedPayments) add("SmorResourceManagedPayments: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
