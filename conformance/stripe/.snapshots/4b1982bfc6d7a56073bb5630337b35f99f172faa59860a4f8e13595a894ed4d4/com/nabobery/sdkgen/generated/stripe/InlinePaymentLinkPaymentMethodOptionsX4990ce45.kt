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

public enum class InlinePaymentLinkPaymentMethodOptionsX4990ce45Branch {
  PaymentLinksResourcePaymentMethodOptions,
}

public sealed class InlinePaymentLinkPaymentMethodOptionsX4990ce45DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkPaymentMethodOptionsX4990ce45NoMatchException(
  message: String,
) : InlinePaymentLinkPaymentMethodOptionsX4990ce45DecodingException(message)

internal data class InlinePaymentLinkPaymentMethodOptionsX4990ce45Inspection(
  public val matchesPaymentLinksResourcePaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourcePaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/payment_method_options
 */
@Serializable(with = InlinePaymentLinkPaymentMethodOptionsX4990ce45.Serializer::class)
public class InlinePaymentLinkPaymentMethodOptionsX4990ce45 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkPaymentMethodOptionsX4990ce45Inspection,
) {
  public val paymentLinksResourcePaymentMethodOptions: PaymentLinksResourcePaymentMethodOptionsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourcePaymentMethodOptions) json.decodeFromJsonElement<PaymentLinksResourcePaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkPaymentMethodOptionsX4990ce45Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourcePaymentMethodOptions) add(InlinePaymentLinkPaymentMethodOptionsX4990ce45Branch.PaymentLinksResourcePaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkPaymentMethodOptionsX4990ce45 {
      val inspection = inspectInlinePaymentLinkPaymentMethodOptionsX4990ce45(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkPaymentMethodOptionsX4990ce45NoMatchException("InlinePaymentLinkPaymentMethodOptionsX4990ce45 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkPaymentMethodOptionsX4990ce45(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkPaymentMethodOptionsX4990ce45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkPaymentMethodOptionsX4990ce45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkPaymentMethodOptionsX4990ce45")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkPaymentMethodOptionsX4990ce45) {
      encoder.requireJsonEncoder("InlinePaymentLinkPaymentMethodOptionsX4990ce45").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkPaymentMethodOptionsX4990ce45(element: JsonElement): InlinePaymentLinkPaymentMethodOptionsX4990ce45Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkPaymentMethodOptionsX4990ce45Inspection(
    matchesPaymentLinksResourcePaymentMethodOptions = false,
    failures = listOf("PaymentLinksResourcePaymentMethodOptions: expected JSON object"),
  )
  val matchesPaymentLinksResourcePaymentMethodOptions = true
  return InlinePaymentLinkPaymentMethodOptionsX4990ce45Inspection(
    matchesPaymentLinksResourcePaymentMethodOptions = matchesPaymentLinksResourcePaymentMethodOptions,
    failures = buildList {
      if (!matchesPaymentLinksResourcePaymentMethodOptions) add("PaymentLinksResourcePaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
