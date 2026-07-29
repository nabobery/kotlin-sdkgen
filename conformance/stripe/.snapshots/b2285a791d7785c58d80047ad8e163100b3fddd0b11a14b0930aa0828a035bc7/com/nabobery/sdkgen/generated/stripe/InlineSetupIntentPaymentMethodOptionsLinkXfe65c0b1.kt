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
public class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch1View()

public enum class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch {
  Branch1,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/link.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/link
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Inspection,
) {
  public val branch1: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch1View>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch.Branch1)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1NoMatchException("InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1(element: JsonElement): InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Inspection(
    matchesBranch1 = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("Branch1: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesBranch1 = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsLinkXfe65c0b1Inspection(
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
