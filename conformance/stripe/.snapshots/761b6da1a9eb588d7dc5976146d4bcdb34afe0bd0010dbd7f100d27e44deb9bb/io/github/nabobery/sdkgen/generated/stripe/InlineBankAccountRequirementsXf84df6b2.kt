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

public enum class InlineBankAccountRequirementsXf84df6b2Branch {
  ExternalAccountRequirements,
}

public sealed class InlineBankAccountRequirementsXf84df6b2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBankAccountRequirementsXf84df6b2NoMatchException(
  message: String,
) : InlineBankAccountRequirementsXf84df6b2DecodingException(message)

internal data class InlineBankAccountRequirementsXf84df6b2Inspection(
  public val matchesExternalAccountRequirements: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesExternalAccountRequirements).count { it }
}

/**
 * Information about the requirements for the bank account, including what information needs to be collected.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/requirements
 */
@Serializable(with = InlineBankAccountRequirementsXf84df6b2.Serializer::class)
public class InlineBankAccountRequirementsXf84df6b2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBankAccountRequirementsXf84df6b2Inspection,
) {
  public val externalAccountRequirements: ExternalAccountRequirementsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesExternalAccountRequirements) json.decodeFromJsonElement<ExternalAccountRequirementsView>(raw) else null }

  public val matchedBranches: Set<InlineBankAccountRequirementsXf84df6b2Branch>
    get() = buildSet {
      if (inspection.matchesExternalAccountRequirements) add(InlineBankAccountRequirementsXf84df6b2Branch.ExternalAccountRequirements)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBankAccountRequirementsXf84df6b2 {
      val inspection = inspectInlineBankAccountRequirementsXf84df6b2(raw)
      if (inspection.matchCount == 0) {
        throw InlineBankAccountRequirementsXf84df6b2NoMatchException("InlineBankAccountRequirementsXf84df6b2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBankAccountRequirementsXf84df6b2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBankAccountRequirementsXf84df6b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBankAccountRequirementsXf84df6b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBankAccountRequirementsXf84df6b2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBankAccountRequirementsXf84df6b2) {
      encoder.requireJsonEncoder("InlineBankAccountRequirementsXf84df6b2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBankAccountRequirementsXf84df6b2(element: JsonElement): InlineBankAccountRequirementsXf84df6b2Inspection {
  val raw = element as? JsonObject ?: return InlineBankAccountRequirementsXf84df6b2Inspection(
    matchesExternalAccountRequirements = false,
    failures = listOf("ExternalAccountRequirements: expected JSON object"),
  )
  val matchesExternalAccountRequirements = true
  return InlineBankAccountRequirementsXf84df6b2Inspection(
    matchesExternalAccountRequirements = matchesExternalAccountRequirements,
    failures = buildList {
      if (!matchesExternalAccountRequirements) add("ExternalAccountRequirements: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
