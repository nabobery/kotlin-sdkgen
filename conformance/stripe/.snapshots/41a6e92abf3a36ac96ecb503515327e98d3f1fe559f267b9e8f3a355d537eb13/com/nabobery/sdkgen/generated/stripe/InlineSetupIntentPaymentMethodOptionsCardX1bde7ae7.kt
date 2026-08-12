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

public enum class InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Branch {
  SetupIntentPaymentMethodOptionsCard,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Inspection(
  public val matchesSetupIntentPaymentMethodOptionsCard: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsCard, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/card
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Inspection,
) {
  public val setupIntentPaymentMethodOptionsCard: SetupIntentPaymentMethodOptionsCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsCard) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsCardView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Branch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsCard) add(InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Branch.SetupIntentPaymentMethodOptionsCard)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsCardX1bde7ae7(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7NoMatchException("InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsCardX1bde7ae7(element: JsonElement): InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Inspection(
    matchesSetupIntentPaymentMethodOptionsCard = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsCard: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsCard = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsCardX1bde7ae7Inspection(
    matchesSetupIntentPaymentMethodOptionsCard = matchesSetupIntentPaymentMethodOptionsCard,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsCard) add("SetupIntentPaymentMethodOptionsCard: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
