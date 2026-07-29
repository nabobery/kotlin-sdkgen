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

public enum class InlineChargeOutcomeXd5852e19Branch {
  ChargeOutcome,
}

public sealed class InlineChargeOutcomeXd5852e19DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeOutcomeXd5852e19NoMatchException(
  message: String,
) : InlineChargeOutcomeXd5852e19DecodingException(message)

internal data class InlineChargeOutcomeXd5852e19Inspection(
  public val matchesChargeOutcome: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesChargeOutcome).count { it }
}

/**
 * Details about whether the payment was accepted, and why. See [understanding
 * declines](https://docs.stripe.com/declines) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/outcome
 */
@Serializable(with = InlineChargeOutcomeXd5852e19.Serializer::class)
public class InlineChargeOutcomeXd5852e19 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeOutcomeXd5852e19Inspection,
) {
  public val chargeOutcome: ChargeOutcomeView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesChargeOutcome) json.decodeFromJsonElement<ChargeOutcomeView>(raw) else null }

  public val matchedBranches: Set<InlineChargeOutcomeXd5852e19Branch>
    get() = buildSet {
      if (inspection.matchesChargeOutcome) add(InlineChargeOutcomeXd5852e19Branch.ChargeOutcome)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeOutcomeXd5852e19 {
      val inspection = inspectInlineChargeOutcomeXd5852e19(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeOutcomeXd5852e19NoMatchException("InlineChargeOutcomeXd5852e19 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeOutcomeXd5852e19(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeOutcomeXd5852e19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeOutcomeXd5852e19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeOutcomeXd5852e19")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeOutcomeXd5852e19) {
      encoder.requireJsonEncoder("InlineChargeOutcomeXd5852e19").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeOutcomeXd5852e19(element: JsonElement): InlineChargeOutcomeXd5852e19Inspection {
  val raw = element as? JsonObject ?: return InlineChargeOutcomeXd5852e19Inspection(
    matchesChargeOutcome = false,
    failures = listOf("ChargeOutcome: expected JSON object"),
  )
  val matchesChargeOutcome = raw["type"].isString()
  return InlineChargeOutcomeXd5852e19Inspection(
    matchesChargeOutcome = matchesChargeOutcome,
    failures = buildList {
      if (!matchesChargeOutcome) add("ChargeOutcome: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
