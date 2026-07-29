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

public enum class InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fBranch {
  LegalEntityDirectorshipDeclaration,
}

public sealed class InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fNoMatchException(
  message: String,
) : InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fDecodingException(message)

internal data class InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fInspection(
  public val matchesLegalEntityDirectorshipDeclaration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityDirectorshipDeclaration).count { it }
}

/**
 * This hash is used to attest that the director information provided to Stripe is both current and correct.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/directorship_declaration
 */
@Serializable(with = InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f.Serializer::class)
public class InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fInspection,
) {
  public val legalEntityDirectorshipDeclaration: LegalEntityDirectorshipDeclarationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityDirectorshipDeclaration) json.decodeFromJsonElement<LegalEntityDirectorshipDeclarationView>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fBranch>
    get() = buildSet {
      if (inspection.matchesLegalEntityDirectorshipDeclaration) add(InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fBranch.LegalEntityDirectorshipDeclaration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f {
      val inspection = inspectInlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fNoMatchException("InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f(element: JsonElement): InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fInspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fInspection(
    matchesLegalEntityDirectorshipDeclaration = false,
    failures = listOf("LegalEntityDirectorshipDeclaration: expected JSON object"),
  )
  val matchesLegalEntityDirectorshipDeclaration = true
  return InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8fInspection(
    matchesLegalEntityDirectorshipDeclaration = matchesLegalEntityDirectorshipDeclaration,
    failures = buildList {
      if (!matchesLegalEntityDirectorshipDeclaration) add("LegalEntityDirectorshipDeclaration: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
