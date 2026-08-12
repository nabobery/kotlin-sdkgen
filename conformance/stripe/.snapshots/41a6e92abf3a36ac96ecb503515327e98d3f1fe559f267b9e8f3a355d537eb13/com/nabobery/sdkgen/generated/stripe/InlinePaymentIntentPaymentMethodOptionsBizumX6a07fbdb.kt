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
public class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch1View()

public enum class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch {
  Branch1,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bizum.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bizum
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbInspection,
) {
  public val branch1: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch1View>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch.Branch1)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbNoMatchException("InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbInspection(
    matchesBranch1 = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("Branch1: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesBranch1 = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdbInspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
