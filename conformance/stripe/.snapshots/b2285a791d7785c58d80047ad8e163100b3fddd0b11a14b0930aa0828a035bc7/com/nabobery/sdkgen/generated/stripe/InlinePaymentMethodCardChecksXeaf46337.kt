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

public enum class InlinePaymentMethodCardChecksXeaf46337Branch {
  PaymentMethodCardChecks,
}

public sealed class InlinePaymentMethodCardChecksXeaf46337DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardChecksXeaf46337NoMatchException(
  message: String,
) : InlinePaymentMethodCardChecksXeaf46337DecodingException(message)

internal data class InlinePaymentMethodCardChecksXeaf46337Inspection(
  public val matchesPaymentMethodCardChecks: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodCardChecks).count { it }
}

/**
 * Checks on Card address and CVC if provided.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/checks
 */
@Serializable(with = InlinePaymentMethodCardChecksXeaf46337.Serializer::class)
public class InlinePaymentMethodCardChecksXeaf46337 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardChecksXeaf46337Inspection,
) {
  public val paymentMethodCardChecks: PaymentMethodCardChecksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodCardChecks) json.decodeFromJsonElement<PaymentMethodCardChecksView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardChecksXeaf46337Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodCardChecks) add(InlinePaymentMethodCardChecksXeaf46337Branch.PaymentMethodCardChecks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardChecksXeaf46337 {
      val inspection = inspectInlinePaymentMethodCardChecksXeaf46337(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardChecksXeaf46337NoMatchException("InlinePaymentMethodCardChecksXeaf46337 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardChecksXeaf46337(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodCardChecksXeaf46337> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardChecksXeaf46337 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardChecksXeaf46337")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardChecksXeaf46337) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardChecksXeaf46337").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardChecksXeaf46337(element: JsonElement): InlinePaymentMethodCardChecksXeaf46337Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardChecksXeaf46337Inspection(
    matchesPaymentMethodCardChecks = false,
    failures = listOf("PaymentMethodCardChecks: expected JSON object"),
  )
  val matchesPaymentMethodCardChecks = true
  return InlinePaymentMethodCardChecksXeaf46337Inspection(
    matchesPaymentMethodCardChecks = matchesPaymentMethodCardChecks,
    failures = buildList {
      if (!matchesPaymentMethodCardChecks) add("PaymentMethodCardChecks: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
