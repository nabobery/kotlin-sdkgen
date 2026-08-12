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

public enum class InlineSetupIntentPaymentMethodOptionsPaypalX322a769bBranch {
  SetupIntentPaymentMethodOptionsPaypal,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsPaypalX322a769bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsPaypalX322a769bNoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsPaypalX322a769bDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsPaypalX322a769bInspection(
  public val matchesSetupIntentPaymentMethodOptionsPaypal: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsPaypal, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/paypal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/paypal
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsPaypalX322a769b.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsPaypalX322a769b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsPaypalX322a769bInspection,
) {
  public val setupIntentPaymentMethodOptionsPaypal: SetupIntentPaymentMethodOptionsPaypalView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsPaypal) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsPaypalView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsPaypalX322a769bBranch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsPaypal) add(InlineSetupIntentPaymentMethodOptionsPaypalX322a769bBranch.SetupIntentPaymentMethodOptionsPaypal)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsPaypalX322a769bBranch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsPaypalX322a769b {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsPaypalX322a769b(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsPaypalX322a769bNoMatchException("InlineSetupIntentPaymentMethodOptionsPaypalX322a769b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsPaypalX322a769b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsPaypalX322a769b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsPaypalX322a769b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsPaypalX322a769b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsPaypalX322a769b) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsPaypalX322a769b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsPaypalX322a769b(element: JsonElement): InlineSetupIntentPaymentMethodOptionsPaypalX322a769bInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsPaypalX322a769bInspection(
    matchesSetupIntentPaymentMethodOptionsPaypal = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsPaypal: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsPaypal = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsPaypalX322a769bInspection(
    matchesSetupIntentPaymentMethodOptionsPaypal = matchesSetupIntentPaymentMethodOptionsPaypal,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsPaypal) add("SetupIntentPaymentMethodOptionsPaypal: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
