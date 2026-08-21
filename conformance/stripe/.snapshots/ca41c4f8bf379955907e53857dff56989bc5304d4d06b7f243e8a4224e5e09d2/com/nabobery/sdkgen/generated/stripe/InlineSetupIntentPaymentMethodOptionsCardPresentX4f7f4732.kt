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

@Serializable
public class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch1View()

public enum class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch {
  Branch1,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/card_present.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/card_present
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Inspection,
) {
  public val branch1: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch1View>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch.Branch1)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732NoMatchException("InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732(element: JsonElement): InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Inspection(
    matchesBranch1 = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("Branch1: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesBranch1 = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsCardPresentX4f7f4732Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
