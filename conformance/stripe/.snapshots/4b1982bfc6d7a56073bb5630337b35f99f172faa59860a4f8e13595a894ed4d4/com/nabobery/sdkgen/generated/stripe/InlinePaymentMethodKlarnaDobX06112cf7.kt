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

public enum class InlinePaymentMethodKlarnaDobX06112cf7Branch {
  PaymentFlowsPrivatePaymentMethodsKlarnaDob,
}

public sealed class InlinePaymentMethodKlarnaDobX06112cf7DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodKlarnaDobX06112cf7NoMatchException(
  message: String,
) : InlinePaymentMethodKlarnaDobX06112cf7DecodingException(message)

internal data class InlinePaymentMethodKlarnaDobX06112cf7Inspection(
  public val matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob).count { it }
}

/**
 * The customer's date of birth, if provided.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_klarna/properties/dob
 */
@Serializable(with = InlinePaymentMethodKlarnaDobX06112cf7.Serializer::class)
public class InlinePaymentMethodKlarnaDobX06112cf7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodKlarnaDobX06112cf7Inspection,
) {
  public val paymentFlowsPrivatePaymentMethodsKlarnaDob:
      PaymentFlowsPrivatePaymentMethodsKlarnaDobView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob) json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsKlarnaDobView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodKlarnaDobX06112cf7Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob) add(InlinePaymentMethodKlarnaDobX06112cf7Branch.PaymentFlowsPrivatePaymentMethodsKlarnaDob)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodKlarnaDobX06112cf7 {
      val inspection = inspectInlinePaymentMethodKlarnaDobX06112cf7(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodKlarnaDobX06112cf7NoMatchException("InlinePaymentMethodKlarnaDobX06112cf7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodKlarnaDobX06112cf7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodKlarnaDobX06112cf7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodKlarnaDobX06112cf7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodKlarnaDobX06112cf7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodKlarnaDobX06112cf7) {
      encoder.requireJsonEncoder("InlinePaymentMethodKlarnaDobX06112cf7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodKlarnaDobX06112cf7(element: JsonElement): InlinePaymentMethodKlarnaDobX06112cf7Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodKlarnaDobX06112cf7Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob = false,
    failures = listOf("PaymentFlowsPrivatePaymentMethodsKlarnaDob: expected JSON object"),
  )
  val matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob = true
  return InlinePaymentMethodKlarnaDobX06112cf7Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob = matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob,
    failures = buildList {
      if (!matchesPaymentFlowsPrivatePaymentMethodsKlarnaDob) add("PaymentFlowsPrivatePaymentMethodsKlarnaDob: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
