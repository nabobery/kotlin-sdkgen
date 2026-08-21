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

public enum class InlinePriceCustomUnitAmountXd58f53a7Branch {
  CustomUnitAmount,
}

public sealed class InlinePriceCustomUnitAmountXd58f53a7DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePriceCustomUnitAmountXd58f53a7NoMatchException(
  message: String,
) : InlinePriceCustomUnitAmountXd58f53a7DecodingException(message)

internal data class InlinePriceCustomUnitAmountXd58f53a7Inspection(
  public val matchesCustomUnitAmount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomUnitAmount).count { it }
}

/**
 * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment
 * Links.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/custom_unit_amount
 */
@Serializable(with = InlinePriceCustomUnitAmountXd58f53a7.Serializer::class)
public class InlinePriceCustomUnitAmountXd58f53a7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePriceCustomUnitAmountXd58f53a7Inspection,
) {
  public val customUnitAmount: CustomUnitAmountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomUnitAmount) json.decodeFromJsonElement<CustomUnitAmountView>(raw) else null }

  public val matchedBranches: Set<InlinePriceCustomUnitAmountXd58f53a7Branch>
    get() = buildSet {
      if (inspection.matchesCustomUnitAmount) add(InlinePriceCustomUnitAmountXd58f53a7Branch.CustomUnitAmount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePriceCustomUnitAmountXd58f53a7 {
      val inspection = inspectInlinePriceCustomUnitAmountXd58f53a7(raw)
      if (inspection.matchCount == 0) {
        throw InlinePriceCustomUnitAmountXd58f53a7NoMatchException("InlinePriceCustomUnitAmountXd58f53a7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePriceCustomUnitAmountXd58f53a7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePriceCustomUnitAmountXd58f53a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePriceCustomUnitAmountXd58f53a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePriceCustomUnitAmountXd58f53a7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePriceCustomUnitAmountXd58f53a7) {
      encoder.requireJsonEncoder("InlinePriceCustomUnitAmountXd58f53a7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePriceCustomUnitAmountXd58f53a7(element: JsonElement): InlinePriceCustomUnitAmountXd58f53a7Inspection {
  val raw = element as? JsonObject ?: return InlinePriceCustomUnitAmountXd58f53a7Inspection(
    matchesCustomUnitAmount = false,
    failures = listOf("CustomUnitAmount: expected JSON object"),
  )
  val matchesCustomUnitAmount = true
  return InlinePriceCustomUnitAmountXd58f53a7Inspection(
    matchesCustomUnitAmount = matchesCustomUnitAmount,
    failures = buildList {
      if (!matchesCustomUnitAmount) add("CustomUnitAmount: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
