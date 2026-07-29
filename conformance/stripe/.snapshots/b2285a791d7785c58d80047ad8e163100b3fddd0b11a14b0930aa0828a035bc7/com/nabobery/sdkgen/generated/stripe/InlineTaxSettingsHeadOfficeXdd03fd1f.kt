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

public enum class InlineTaxSettingsHeadOfficeXdd03fd1fBranch {
  TaxProductResourceTaxSettingsHeadOffice,
}

public sealed class InlineTaxSettingsHeadOfficeXdd03fd1fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxSettingsHeadOfficeXdd03fd1fNoMatchException(
  message: String,
) : InlineTaxSettingsHeadOfficeXdd03fd1fDecodingException(message)

internal data class InlineTaxSettingsHeadOfficeXdd03fd1fInspection(
  public val matchesTaxProductResourceTaxSettingsHeadOffice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceTaxSettingsHeadOffice).count { it }
}

/**
 * The place where your business is located.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.settings/properties/head_office
 */
@Serializable(with = InlineTaxSettingsHeadOfficeXdd03fd1f.Serializer::class)
public class InlineTaxSettingsHeadOfficeXdd03fd1f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxSettingsHeadOfficeXdd03fd1fInspection,
) {
  public val taxProductResourceTaxSettingsHeadOffice: TaxProductResourceTaxSettingsHeadOfficeView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceTaxSettingsHeadOffice) json.decodeFromJsonElement<TaxProductResourceTaxSettingsHeadOfficeView>(raw) else null }

  public val matchedBranches: Set<InlineTaxSettingsHeadOfficeXdd03fd1fBranch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceTaxSettingsHeadOffice) add(InlineTaxSettingsHeadOfficeXdd03fd1fBranch.TaxProductResourceTaxSettingsHeadOffice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxSettingsHeadOfficeXdd03fd1f {
      val inspection = inspectInlineTaxSettingsHeadOfficeXdd03fd1f(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxSettingsHeadOfficeXdd03fd1fNoMatchException("InlineTaxSettingsHeadOfficeXdd03fd1f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxSettingsHeadOfficeXdd03fd1f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTaxSettingsHeadOfficeXdd03fd1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxSettingsHeadOfficeXdd03fd1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxSettingsHeadOfficeXdd03fd1f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxSettingsHeadOfficeXdd03fd1f) {
      encoder.requireJsonEncoder("InlineTaxSettingsHeadOfficeXdd03fd1f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxSettingsHeadOfficeXdd03fd1f(element: JsonElement): InlineTaxSettingsHeadOfficeXdd03fd1fInspection {
  val raw = element as? JsonObject ?: return InlineTaxSettingsHeadOfficeXdd03fd1fInspection(
    matchesTaxProductResourceTaxSettingsHeadOffice = false,
    failures = listOf("TaxProductResourceTaxSettingsHeadOffice: expected JSON object"),
  )
  val matchesTaxProductResourceTaxSettingsHeadOffice = raw["address"] != null
  return InlineTaxSettingsHeadOfficeXdd03fd1fInspection(
    matchesTaxProductResourceTaxSettingsHeadOffice = matchesTaxProductResourceTaxSettingsHeadOffice,
    failures = buildList {
      if (!matchesTaxProductResourceTaxSettingsHeadOffice) add("TaxProductResourceTaxSettingsHeadOffice: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
