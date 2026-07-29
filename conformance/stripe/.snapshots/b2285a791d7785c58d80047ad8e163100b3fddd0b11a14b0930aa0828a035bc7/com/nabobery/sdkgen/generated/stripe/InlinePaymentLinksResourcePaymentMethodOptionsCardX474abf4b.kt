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

public enum class InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bBranch {
  PaymentLinksResourceCardPaymentMethodOptions,
}

public sealed class InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bNoMatchException(
  message: String,
) : InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bDecodingException(message)

internal data class InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bInspection(
  public val matchesPaymentLinksResourceCardPaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceCardPaymentMethodOptions).count { it }
}

/**
 * Configuration for `card` payment methods.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_method_options/properties/card
 */
@Serializable(with = InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b.Serializer::class)
public class InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bInspection,
) {
  public val paymentLinksResourceCardPaymentMethodOptions:
      PaymentLinksResourceCardPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceCardPaymentMethodOptions) json.decodeFromJsonElement<PaymentLinksResourceCardPaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceCardPaymentMethodOptions) add(InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bBranch.PaymentLinksResourceCardPaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b {
      val inspection = inspectInlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bNoMatchException("InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b(element: JsonElement): InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bInspection(
    matchesPaymentLinksResourceCardPaymentMethodOptions = false,
    failures = listOf("PaymentLinksResourceCardPaymentMethodOptions: expected JSON object"),
  )
  val matchesPaymentLinksResourceCardPaymentMethodOptions = true
  return InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4bInspection(
    matchesPaymentLinksResourceCardPaymentMethodOptions = matchesPaymentLinksResourceCardPaymentMethodOptions,
    failures = buildList {
      if (!matchesPaymentLinksResourceCardPaymentMethodOptions) add("PaymentLinksResourceCardPaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
