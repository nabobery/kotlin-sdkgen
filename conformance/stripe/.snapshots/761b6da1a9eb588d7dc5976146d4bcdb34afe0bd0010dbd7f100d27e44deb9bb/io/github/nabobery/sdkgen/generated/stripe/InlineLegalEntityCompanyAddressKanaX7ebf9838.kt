package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineLegalEntityCompanyAddressKanaX7ebf9838Branch {
  LegalEntityJapanAddress,
}

public sealed class InlineLegalEntityCompanyAddressKanaX7ebf9838DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyAddressKanaX7ebf9838NoMatchException(
  message: String,
) : InlineLegalEntityCompanyAddressKanaX7ebf9838DecodingException(message)

internal data class InlineLegalEntityCompanyAddressKanaX7ebf9838Inspection(
  public val matchesLegalEntityJapanAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityJapanAddress).count { it }
}

/**
 * The Kana variation of the company's primary address (Japan only).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/address_kana
 */
@Serializable(with = InlineLegalEntityCompanyAddressKanaX7ebf9838.Serializer::class)
public class InlineLegalEntityCompanyAddressKanaX7ebf9838 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyAddressKanaX7ebf9838Inspection,
) {
  public val legalEntityJapanAddress: LegalEntityJapanAddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityJapanAddress) json.decodeFromJsonElement<LegalEntityJapanAddressView>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyAddressKanaX7ebf9838Branch>
    get() = buildSet {
      if (inspection.matchesLegalEntityJapanAddress) add(InlineLegalEntityCompanyAddressKanaX7ebf9838Branch.LegalEntityJapanAddress)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyAddressKanaX7ebf9838 {
      val inspection = inspectInlineLegalEntityCompanyAddressKanaX7ebf9838(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyAddressKanaX7ebf9838NoMatchException("InlineLegalEntityCompanyAddressKanaX7ebf9838 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyAddressKanaX7ebf9838(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyAddressKanaX7ebf9838> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyAddressKanaX7ebf9838 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyAddressKanaX7ebf9838")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyAddressKanaX7ebf9838) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyAddressKanaX7ebf9838").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyAddressKanaX7ebf9838(element: JsonElement): InlineLegalEntityCompanyAddressKanaX7ebf9838Inspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityCompanyAddressKanaX7ebf9838Inspection(
    matchesLegalEntityJapanAddress = false,
    failures = listOf("LegalEntityJapanAddress: expected JSON object"),
  )
  val matchesLegalEntityJapanAddress = true
  return InlineLegalEntityCompanyAddressKanaX7ebf9838Inspection(
    matchesLegalEntityJapanAddress = matchesLegalEntityJapanAddress,
    failures = buildList {
      if (!matchesLegalEntityJapanAddress) add("LegalEntityJapanAddress: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
