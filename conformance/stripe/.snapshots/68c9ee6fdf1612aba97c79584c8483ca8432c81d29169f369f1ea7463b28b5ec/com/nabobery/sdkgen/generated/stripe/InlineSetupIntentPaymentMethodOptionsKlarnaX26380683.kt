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

public enum class InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Branch {
  SetupIntentPaymentMethodOptionsKlarna,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsKlarnaX26380683DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsKlarnaX26380683NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsKlarnaX26380683DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Inspection(
  public val matchesSetupIntentPaymentMethodOptionsKlarna: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsKlarna, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/klarna.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/klarna
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsKlarnaX26380683.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsKlarnaX26380683 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Inspection,
) {
  public val setupIntentPaymentMethodOptionsKlarna: SetupIntentPaymentMethodOptionsKlarnaView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsKlarna) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsKlarnaView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Branch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsKlarna) add(InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Branch.SetupIntentPaymentMethodOptionsKlarna)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsKlarnaX26380683 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsKlarnaX26380683(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsKlarnaX26380683NoMatchException("InlineSetupIntentPaymentMethodOptionsKlarnaX26380683 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsKlarnaX26380683(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsKlarnaX26380683> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsKlarnaX26380683 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsKlarnaX26380683")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsKlarnaX26380683) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsKlarnaX26380683").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsKlarnaX26380683(element: JsonElement): InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Inspection(
    matchesSetupIntentPaymentMethodOptionsKlarna = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsKlarna: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsKlarna = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsKlarnaX26380683Inspection(
    matchesSetupIntentPaymentMethodOptionsKlarna = matchesSetupIntentPaymentMethodOptionsKlarna,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsKlarna) add("SetupIntentPaymentMethodOptionsKlarna: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
