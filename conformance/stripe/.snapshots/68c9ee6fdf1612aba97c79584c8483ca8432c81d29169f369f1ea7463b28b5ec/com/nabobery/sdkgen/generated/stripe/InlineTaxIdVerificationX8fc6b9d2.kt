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

public enum class InlineTaxIdVerificationX8fc6b9d2Branch {
  TaxIdVerification,
}

public sealed class InlineTaxIdVerificationX8fc6b9d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIdVerificationX8fc6b9d2NoMatchException(
  message: String,
) : InlineTaxIdVerificationX8fc6b9d2DecodingException(message)

internal data class InlineTaxIdVerificationX8fc6b9d2Inspection(
  public val matchesTaxIdVerification: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxIdVerification).count { it }
}

/**
 * Tax ID verification information.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id/properties/verification
 */
@Serializable(with = InlineTaxIdVerificationX8fc6b9d2.Serializer::class)
public class InlineTaxIdVerificationX8fc6b9d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIdVerificationX8fc6b9d2Inspection,
) {
  public val taxIdVerification: TaxIdVerificationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxIdVerification) json.decodeFromJsonElement<TaxIdVerificationView>(raw) else null }

  public val matchedBranches: Set<InlineTaxIdVerificationX8fc6b9d2Branch>
    get() = buildSet {
      if (inspection.matchesTaxIdVerification) add(InlineTaxIdVerificationX8fc6b9d2Branch.TaxIdVerification)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIdVerificationX8fc6b9d2 {
      val inspection = inspectInlineTaxIdVerificationX8fc6b9d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIdVerificationX8fc6b9d2NoMatchException("InlineTaxIdVerificationX8fc6b9d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIdVerificationX8fc6b9d2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxIdVerificationX8fc6b9d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIdVerificationX8fc6b9d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIdVerificationX8fc6b9d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIdVerificationX8fc6b9d2) {
      encoder.requireJsonEncoder("InlineTaxIdVerificationX8fc6b9d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIdVerificationX8fc6b9d2(element: JsonElement): InlineTaxIdVerificationX8fc6b9d2Inspection {
  val raw = element as? JsonObject ?: return InlineTaxIdVerificationX8fc6b9d2Inspection(
    matchesTaxIdVerification = false,
    failures = listOf("TaxIdVerification: expected JSON object"),
  )
  val matchesTaxIdVerification = raw["status"] != null
  return InlineTaxIdVerificationX8fc6b9d2Inspection(
    matchesTaxIdVerification = matchesTaxIdVerification,
    failures = buildList {
      if (!matchesTaxIdVerification) add("TaxIdVerification: required properties 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
