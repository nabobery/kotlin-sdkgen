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

public enum class InlinePaymentMethodUsBankAccountNetworksX15dfa0caBranch {
  UsBankAccountNetworks,
}

public sealed class InlinePaymentMethodUsBankAccountNetworksX15dfa0caDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodUsBankAccountNetworksX15dfa0caNoMatchException(
  message: String,
) : InlinePaymentMethodUsBankAccountNetworksX15dfa0caDecodingException(message)

internal data class InlinePaymentMethodUsBankAccountNetworksX15dfa0caInspection(
  public val matchesUsBankAccountNetworks: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesUsBankAccountNetworks).count { it }
}

/**
 * Contains information about US bank account networks that can be used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account/properties/networks
 */
@Serializable(with = InlinePaymentMethodUsBankAccountNetworksX15dfa0ca.Serializer::class)
public class InlinePaymentMethodUsBankAccountNetworksX15dfa0ca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodUsBankAccountNetworksX15dfa0caInspection,
) {
  public val usBankAccountNetworks: UsBankAccountNetworksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesUsBankAccountNetworks) json.decodeFromJsonElement<UsBankAccountNetworksView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodUsBankAccountNetworksX15dfa0caBranch>
    get() = buildSet {
      if (inspection.matchesUsBankAccountNetworks) add(InlinePaymentMethodUsBankAccountNetworksX15dfa0caBranch.UsBankAccountNetworks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodUsBankAccountNetworksX15dfa0ca {
      val inspection = inspectInlinePaymentMethodUsBankAccountNetworksX15dfa0ca(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodUsBankAccountNetworksX15dfa0caNoMatchException("InlinePaymentMethodUsBankAccountNetworksX15dfa0ca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodUsBankAccountNetworksX15dfa0ca(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodUsBankAccountNetworksX15dfa0ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountNetworksX15dfa0ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodUsBankAccountNetworksX15dfa0ca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodUsBankAccountNetworksX15dfa0ca) {
      encoder.requireJsonEncoder("InlinePaymentMethodUsBankAccountNetworksX15dfa0ca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodUsBankAccountNetworksX15dfa0ca(element: JsonElement): InlinePaymentMethodUsBankAccountNetworksX15dfa0caInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodUsBankAccountNetworksX15dfa0caInspection(
    matchesUsBankAccountNetworks = false,
    failures = listOf("UsBankAccountNetworks: expected JSON object"),
  )
  val matchesUsBankAccountNetworks = raw["supported"] != null
  return InlinePaymentMethodUsBankAccountNetworksX15dfa0caInspection(
    matchesUsBankAccountNetworks = matchesUsBankAccountNetworks,
    failures = buildList {
      if (!matchesUsBankAccountNetworks) add("UsBankAccountNetworks: required properties 'supported' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
