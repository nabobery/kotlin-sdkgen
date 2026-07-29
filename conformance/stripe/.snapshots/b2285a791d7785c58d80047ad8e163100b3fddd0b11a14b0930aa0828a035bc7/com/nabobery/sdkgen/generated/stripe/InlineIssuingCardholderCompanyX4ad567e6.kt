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

public enum class InlineIssuingCardholderCompanyX4ad567e6Branch {
  IssuingCardholderCompany,
}

public sealed class InlineIssuingCardholderCompanyX4ad567e6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderCompanyX4ad567e6NoMatchException(
  message: String,
) : InlineIssuingCardholderCompanyX4ad567e6DecodingException(message)

internal data class InlineIssuingCardholderCompanyX4ad567e6Inspection(
  public val matchesIssuingCardholderCompany: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderCompany).count { it }
}

/**
 * Additional information about a `company` cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder/properties/company
 */
@Serializable(with = InlineIssuingCardholderCompanyX4ad567e6.Serializer::class)
public class InlineIssuingCardholderCompanyX4ad567e6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderCompanyX4ad567e6Inspection,
) {
  public val issuingCardholderCompany: IssuingCardholderCompanyView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderCompany) json.decodeFromJsonElement<IssuingCardholderCompanyView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardholderCompanyX4ad567e6Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderCompany) add(InlineIssuingCardholderCompanyX4ad567e6Branch.IssuingCardholderCompany)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderCompanyX4ad567e6 {
      val inspection = inspectInlineIssuingCardholderCompanyX4ad567e6(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderCompanyX4ad567e6NoMatchException("InlineIssuingCardholderCompanyX4ad567e6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderCompanyX4ad567e6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderCompanyX4ad567e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderCompanyX4ad567e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderCompanyX4ad567e6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderCompanyX4ad567e6) {
      encoder.requireJsonEncoder("InlineIssuingCardholderCompanyX4ad567e6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderCompanyX4ad567e6(element: JsonElement): InlineIssuingCardholderCompanyX4ad567e6Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderCompanyX4ad567e6Inspection(
    matchesIssuingCardholderCompany = false,
    failures = listOf("IssuingCardholderCompany: expected JSON object"),
  )
  val matchesIssuingCardholderCompany = raw["tax_id_provided"] != null
  return InlineIssuingCardholderCompanyX4ad567e6Inspection(
    matchesIssuingCardholderCompany = matchesIssuingCardholderCompany,
    failures = buildList {
      if (!matchesIssuingCardholderCompany) add("IssuingCardholderCompany: required properties 'tax_id_provided' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
