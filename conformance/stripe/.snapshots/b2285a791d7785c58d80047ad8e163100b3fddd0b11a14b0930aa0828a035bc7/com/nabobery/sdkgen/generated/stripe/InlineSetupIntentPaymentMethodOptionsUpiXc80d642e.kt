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

public enum class InlineSetupIntentPaymentMethodOptionsUpiXc80d642eBranch {
  SetupIntentPaymentMethodOptionsUpi,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsUpiXc80d642eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsUpiXc80d642eNoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsUpiXc80d642eDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsUpiXc80d642eInspection(
  public val matchesSetupIntentPaymentMethodOptionsUpi: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsUpi, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/upi.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/upi
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsUpiXc80d642e.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsUpiXc80d642e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsUpiXc80d642eInspection,
) {
  public val setupIntentPaymentMethodOptionsUpi: SetupIntentPaymentMethodOptionsUpiView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsUpi) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsUpiView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsUpiXc80d642eBranch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsUpi) add(InlineSetupIntentPaymentMethodOptionsUpiXc80d642eBranch.SetupIntentPaymentMethodOptionsUpi)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsUpiXc80d642eBranch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsUpiXc80d642e {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsUpiXc80d642e(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsUpiXc80d642eNoMatchException("InlineSetupIntentPaymentMethodOptionsUpiXc80d642e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsUpiXc80d642e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsUpiXc80d642e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsUpiXc80d642e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsUpiXc80d642e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsUpiXc80d642e) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsUpiXc80d642e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsUpiXc80d642e(element: JsonElement): InlineSetupIntentPaymentMethodOptionsUpiXc80d642eInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsUpiXc80d642eInspection(
    matchesSetupIntentPaymentMethodOptionsUpi = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsUpi: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsUpi = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsUpiXc80d642eInspection(
    matchesSetupIntentPaymentMethodOptionsUpi = matchesSetupIntentPaymentMethodOptionsUpi,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsUpi) add("SetupIntentPaymentMethodOptionsUpi: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
