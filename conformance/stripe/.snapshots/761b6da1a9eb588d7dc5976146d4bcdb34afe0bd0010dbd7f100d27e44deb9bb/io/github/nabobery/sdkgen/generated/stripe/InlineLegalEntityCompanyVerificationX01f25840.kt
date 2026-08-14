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

public enum class InlineLegalEntityCompanyVerificationX01f25840Branch {
  LegalEntityCompanyVerification,
}

public sealed class InlineLegalEntityCompanyVerificationX01f25840DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyVerificationX01f25840NoMatchException(
  message: String,
) : InlineLegalEntityCompanyVerificationX01f25840DecodingException(message)

internal data class InlineLegalEntityCompanyVerificationX01f25840Inspection(
  public val matchesLegalEntityCompanyVerification: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityCompanyVerification).count { it }
}

/**
 * Information on the verification state of the company.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/verification
 */
@Serializable(with = InlineLegalEntityCompanyVerificationX01f25840.Serializer::class)
public class InlineLegalEntityCompanyVerificationX01f25840 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyVerificationX01f25840Inspection,
) {
  public val legalEntityCompanyVerification: LegalEntityCompanyVerificationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityCompanyVerification) json.decodeFromJsonElement<LegalEntityCompanyVerificationView>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyVerificationX01f25840Branch>
    get() = buildSet {
      if (inspection.matchesLegalEntityCompanyVerification) add(InlineLegalEntityCompanyVerificationX01f25840Branch.LegalEntityCompanyVerification)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyVerificationX01f25840 {
      val inspection = inspectInlineLegalEntityCompanyVerificationX01f25840(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyVerificationX01f25840NoMatchException("InlineLegalEntityCompanyVerificationX01f25840 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyVerificationX01f25840(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyVerificationX01f25840> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyVerificationX01f25840 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyVerificationX01f25840")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyVerificationX01f25840) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyVerificationX01f25840").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyVerificationX01f25840(element: JsonElement): InlineLegalEntityCompanyVerificationX01f25840Inspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityCompanyVerificationX01f25840Inspection(
    matchesLegalEntityCompanyVerification = false,
    failures = listOf("LegalEntityCompanyVerification: expected JSON object"),
  )
  val matchesLegalEntityCompanyVerification = raw["document"] != null
  return InlineLegalEntityCompanyVerificationX01f25840Inspection(
    matchesLegalEntityCompanyVerification = matchesLegalEntityCompanyVerification,
    failures = buildList {
      if (!matchesLegalEntityCompanyVerification) add("LegalEntityCompanyVerification: required properties 'document' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
