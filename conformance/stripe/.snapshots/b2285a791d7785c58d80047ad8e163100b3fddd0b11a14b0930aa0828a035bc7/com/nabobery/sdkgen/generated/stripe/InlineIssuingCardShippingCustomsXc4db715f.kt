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

public enum class InlineIssuingCardShippingCustomsXc4db715fBranch {
  IssuingCardShippingCustoms,
}

public sealed class InlineIssuingCardShippingCustomsXc4db715fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardShippingCustomsXc4db715fNoMatchException(
  message: String,
) : InlineIssuingCardShippingCustomsXc4db715fDecodingException(message)

internal data class InlineIssuingCardShippingCustomsXc4db715fInspection(
  public val matchesIssuingCardShippingCustoms: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardShippingCustoms).count { it }
}

/**
 * Additional information that may be required for clearing customs.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/customs
 */
@Serializable(with = InlineIssuingCardShippingCustomsXc4db715f.Serializer::class)
public class InlineIssuingCardShippingCustomsXc4db715f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardShippingCustomsXc4db715fInspection,
) {
  public val issuingCardShippingCustoms: IssuingCardShippingCustomsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardShippingCustoms) json.decodeFromJsonElement<IssuingCardShippingCustomsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardShippingCustomsXc4db715fBranch>
    get() = buildSet {
      if (inspection.matchesIssuingCardShippingCustoms) add(InlineIssuingCardShippingCustomsXc4db715fBranch.IssuingCardShippingCustoms)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardShippingCustomsXc4db715f {
      val inspection = inspectInlineIssuingCardShippingCustomsXc4db715f(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardShippingCustomsXc4db715fNoMatchException("InlineIssuingCardShippingCustomsXc4db715f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardShippingCustomsXc4db715f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardShippingCustomsXc4db715f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingCustomsXc4db715f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardShippingCustomsXc4db715f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingCustomsXc4db715f) {
      encoder.requireJsonEncoder("InlineIssuingCardShippingCustomsXc4db715f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardShippingCustomsXc4db715f(element: JsonElement): InlineIssuingCardShippingCustomsXc4db715fInspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardShippingCustomsXc4db715fInspection(
    matchesIssuingCardShippingCustoms = false,
    failures = listOf("IssuingCardShippingCustoms: expected JSON object"),
  )
  val matchesIssuingCardShippingCustoms = true
  return InlineIssuingCardShippingCustomsXc4db715fInspection(
    matchesIssuingCardShippingCustoms = matchesIssuingCardShippingCustoms,
    failures = buildList {
      if (!matchesIssuingCardShippingCustoms) add("IssuingCardShippingCustoms: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
