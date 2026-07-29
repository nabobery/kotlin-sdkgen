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

public enum class InlineLegalEntityCompanyAddressKanjiX8e147090Branch {
  LegalEntityJapanAddress,
}

public sealed class InlineLegalEntityCompanyAddressKanjiX8e147090DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyAddressKanjiX8e147090NoMatchException(
  message: String,
) : InlineLegalEntityCompanyAddressKanjiX8e147090DecodingException(message)

internal data class InlineLegalEntityCompanyAddressKanjiX8e147090Inspection(
  public val matchesLegalEntityJapanAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityJapanAddress).count { it }
}

/**
 * The Kanji variation of the company's primary address (Japan only).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/address_kanji
 */
@Serializable(with = InlineLegalEntityCompanyAddressKanjiX8e147090.Serializer::class)
public class InlineLegalEntityCompanyAddressKanjiX8e147090 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyAddressKanjiX8e147090Inspection,
) {
  public val legalEntityJapanAddress: LegalEntityJapanAddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityJapanAddress) json.decodeFromJsonElement<LegalEntityJapanAddressView>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyAddressKanjiX8e147090Branch>
    get() = buildSet {
      if (inspection.matchesLegalEntityJapanAddress) add(InlineLegalEntityCompanyAddressKanjiX8e147090Branch.LegalEntityJapanAddress)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyAddressKanjiX8e147090 {
      val inspection = inspectInlineLegalEntityCompanyAddressKanjiX8e147090(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyAddressKanjiX8e147090NoMatchException("InlineLegalEntityCompanyAddressKanjiX8e147090 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyAddressKanjiX8e147090(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLegalEntityCompanyAddressKanjiX8e147090> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyAddressKanjiX8e147090 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyAddressKanjiX8e147090")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyAddressKanjiX8e147090) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyAddressKanjiX8e147090").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyAddressKanjiX8e147090(element: JsonElement): InlineLegalEntityCompanyAddressKanjiX8e147090Inspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityCompanyAddressKanjiX8e147090Inspection(
    matchesLegalEntityJapanAddress = false,
    failures = listOf("LegalEntityJapanAddress: expected JSON object"),
  )
  val matchesLegalEntityJapanAddress = true
  return InlineLegalEntityCompanyAddressKanjiX8e147090Inspection(
    matchesLegalEntityJapanAddress = matchesLegalEntityJapanAddress,
    failures = buildList {
      if (!matchesLegalEntityJapanAddress) add("LegalEntityJapanAddress: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
