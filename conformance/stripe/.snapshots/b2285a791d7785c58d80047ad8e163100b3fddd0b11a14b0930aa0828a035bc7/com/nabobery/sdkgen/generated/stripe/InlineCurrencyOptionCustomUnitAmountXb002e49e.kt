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

public enum class InlineCurrencyOptionCustomUnitAmountXb002e49eBranch {
  CustomUnitAmount,
}

public sealed class InlineCurrencyOptionCustomUnitAmountXb002e49eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCurrencyOptionCustomUnitAmountXb002e49eNoMatchException(
  message: String,
) : InlineCurrencyOptionCustomUnitAmountXb002e49eDecodingException(message)

internal data class InlineCurrencyOptionCustomUnitAmountXb002e49eInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/currency_option/properties/custom_unit_amount
 */
@Serializable(with = InlineCurrencyOptionCustomUnitAmountXb002e49e.Serializer::class)
public class InlineCurrencyOptionCustomUnitAmountXb002e49e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCurrencyOptionCustomUnitAmountXb002e49eInspection,
) {
  public val customUnitAmount: CustomUnitAmountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomUnitAmount) json.decodeFromJsonElement<CustomUnitAmountView>(raw) else null }

  public val matchedBranches: Set<InlineCurrencyOptionCustomUnitAmountXb002e49eBranch>
    get() = buildSet {
      if (inspection.matchesCustomUnitAmount) add(InlineCurrencyOptionCustomUnitAmountXb002e49eBranch.CustomUnitAmount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCurrencyOptionCustomUnitAmountXb002e49e {
      val inspection = inspectInlineCurrencyOptionCustomUnitAmountXb002e49e(raw)
      if (inspection.matchCount == 0) {
        throw InlineCurrencyOptionCustomUnitAmountXb002e49eNoMatchException("InlineCurrencyOptionCustomUnitAmountXb002e49e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCurrencyOptionCustomUnitAmountXb002e49e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCurrencyOptionCustomUnitAmountXb002e49e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCurrencyOptionCustomUnitAmountXb002e49e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCurrencyOptionCustomUnitAmountXb002e49e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCurrencyOptionCustomUnitAmountXb002e49e) {
      encoder.requireJsonEncoder("InlineCurrencyOptionCustomUnitAmountXb002e49e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCurrencyOptionCustomUnitAmountXb002e49e(element: JsonElement): InlineCurrencyOptionCustomUnitAmountXb002e49eInspection {
  val raw = element as? JsonObject ?: return InlineCurrencyOptionCustomUnitAmountXb002e49eInspection(
    matchesCustomUnitAmount = false,
    failures = listOf("CustomUnitAmount: expected JSON object"),
  )
  val matchesCustomUnitAmount = true
  return InlineCurrencyOptionCustomUnitAmountXb002e49eInspection(
    matchesCustomUnitAmount = matchesCustomUnitAmount,
    failures = buildList {
      if (!matchesCustomUnitAmount) add("CustomUnitAmount: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
