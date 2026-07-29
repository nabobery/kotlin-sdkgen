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

public enum class InlineBankAccountFutureRequirementsX2d2814a2Branch {
  ExternalAccountRequirements,
}

public sealed class InlineBankAccountFutureRequirementsX2d2814a2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBankAccountFutureRequirementsX2d2814a2NoMatchException(
  message: String,
) : InlineBankAccountFutureRequirementsX2d2814a2DecodingException(message)

internal data class InlineBankAccountFutureRequirementsX2d2814a2Inspection(
  public val matchesExternalAccountRequirements: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesExternalAccountRequirements).count { it }
}

/**
 * Information about the [upcoming new requirements for the bank
 * account](https://docs.stripe.com/connect/custom-accounts/future-requirements), including what information needs to be
 * collected, and by when.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/future_requirements
 */
@Serializable(with = InlineBankAccountFutureRequirementsX2d2814a2.Serializer::class)
public class InlineBankAccountFutureRequirementsX2d2814a2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBankAccountFutureRequirementsX2d2814a2Inspection,
) {
  public val externalAccountRequirements: ExternalAccountRequirementsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesExternalAccountRequirements) json.decodeFromJsonElement<ExternalAccountRequirementsView>(raw) else null }

  public val matchedBranches: Set<InlineBankAccountFutureRequirementsX2d2814a2Branch>
    get() = buildSet {
      if (inspection.matchesExternalAccountRequirements) add(InlineBankAccountFutureRequirementsX2d2814a2Branch.ExternalAccountRequirements)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBankAccountFutureRequirementsX2d2814a2 {
      val inspection = inspectInlineBankAccountFutureRequirementsX2d2814a2(raw)
      if (inspection.matchCount == 0) {
        throw InlineBankAccountFutureRequirementsX2d2814a2NoMatchException("InlineBankAccountFutureRequirementsX2d2814a2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBankAccountFutureRequirementsX2d2814a2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBankAccountFutureRequirementsX2d2814a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBankAccountFutureRequirementsX2d2814a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBankAccountFutureRequirementsX2d2814a2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBankAccountFutureRequirementsX2d2814a2) {
      encoder.requireJsonEncoder("InlineBankAccountFutureRequirementsX2d2814a2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBankAccountFutureRequirementsX2d2814a2(element: JsonElement): InlineBankAccountFutureRequirementsX2d2814a2Inspection {
  val raw = element as? JsonObject ?: return InlineBankAccountFutureRequirementsX2d2814a2Inspection(
    matchesExternalAccountRequirements = false,
    failures = listOf("ExternalAccountRequirements: expected JSON object"),
  )
  val matchesExternalAccountRequirements = true
  return InlineBankAccountFutureRequirementsX2d2814a2Inspection(
    matchesExternalAccountRequirements = matchesExternalAccountRequirements,
    failures = buildList {
      if (!matchesExternalAccountRequirements) add("ExternalAccountRequirements: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
