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

public enum class InlineLegalEntityCompanyOwnershipDeclarationXa6540302Branch {
  LegalEntityUboDeclaration,
}

public sealed class InlineLegalEntityCompanyOwnershipDeclarationXa6540302DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyOwnershipDeclarationXa6540302NoMatchException(
  message: String,
) : InlineLegalEntityCompanyOwnershipDeclarationXa6540302DecodingException(message)

internal data class InlineLegalEntityCompanyOwnershipDeclarationXa6540302Inspection(
  public val matchesLegalEntityUboDeclaration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesLegalEntityUboDeclaration).count { it }
}

/**
 * This hash is used to attest that the beneficial owner information provided to Stripe is both current and correct.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/ownership_declaration
 */
@Serializable(with = InlineLegalEntityCompanyOwnershipDeclarationXa6540302.Serializer::class)
public class InlineLegalEntityCompanyOwnershipDeclarationXa6540302 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLegalEntityCompanyOwnershipDeclarationXa6540302Inspection,
) {
  public val legalEntityUboDeclaration: LegalEntityUboDeclarationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesLegalEntityUboDeclaration) json.decodeFromJsonElement<LegalEntityUboDeclarationView>(raw) else null }

  public val matchedBranches: Set<InlineLegalEntityCompanyOwnershipDeclarationXa6540302Branch>
    get() = buildSet {
      if (inspection.matchesLegalEntityUboDeclaration) add(InlineLegalEntityCompanyOwnershipDeclarationXa6540302Branch.LegalEntityUboDeclaration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLegalEntityCompanyOwnershipDeclarationXa6540302 {
      val inspection = inspectInlineLegalEntityCompanyOwnershipDeclarationXa6540302(raw)
      if (inspection.matchCount == 0) {
        throw InlineLegalEntityCompanyOwnershipDeclarationXa6540302NoMatchException("InlineLegalEntityCompanyOwnershipDeclarationXa6540302 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLegalEntityCompanyOwnershipDeclarationXa6540302(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLegalEntityCompanyOwnershipDeclarationXa6540302> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyOwnershipDeclarationXa6540302 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyOwnershipDeclarationXa6540302")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLegalEntityCompanyOwnershipDeclarationXa6540302) {
      encoder.requireJsonEncoder("InlineLegalEntityCompanyOwnershipDeclarationXa6540302").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLegalEntityCompanyOwnershipDeclarationXa6540302(element: JsonElement): InlineLegalEntityCompanyOwnershipDeclarationXa6540302Inspection {
  val raw = element as? JsonObject ?: return InlineLegalEntityCompanyOwnershipDeclarationXa6540302Inspection(
    matchesLegalEntityUboDeclaration = false,
    failures = listOf("LegalEntityUboDeclaration: expected JSON object"),
  )
  val matchesLegalEntityUboDeclaration = true
  return InlineLegalEntityCompanyOwnershipDeclarationXa6540302Inspection(
    matchesLegalEntityUboDeclaration = matchesLegalEntityUboDeclaration,
    failures = buildList {
      if (!matchesLegalEntityUboDeclaration) add("LegalEntityUboDeclaration: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
