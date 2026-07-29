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

public enum class InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Branch {
  SetupIntentPaymentMethodOptionsPayto,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Inspection(
  public val matchesSetupIntentPaymentMethodOptionsPayto: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsPayto, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/payto.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/payto
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Inspection,
) {
  public val setupIntentPaymentMethodOptionsPayto: SetupIntentPaymentMethodOptionsPaytoView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsPayto) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsPaytoView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Branch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsPayto) add(InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Branch.SetupIntentPaymentMethodOptionsPayto)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91NoMatchException("InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91(element: JsonElement): InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Inspection(
    matchesSetupIntentPaymentMethodOptionsPayto = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsPayto: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsPayto = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsPaytoXcf06bc91Inspection(
    matchesSetupIntentPaymentMethodOptionsPayto = matchesSetupIntentPaymentMethodOptionsPayto,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsPayto) add("SetupIntentPaymentMethodOptionsPayto: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
