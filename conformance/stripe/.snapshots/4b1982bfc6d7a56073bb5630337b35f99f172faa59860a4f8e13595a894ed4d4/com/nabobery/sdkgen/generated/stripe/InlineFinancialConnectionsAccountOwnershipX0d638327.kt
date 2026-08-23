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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineFinancialConnectionsAccountOwnershipX0d638327Branch {
  Branch1,
  FinancialConnectionsAccountOwnership,
}

public sealed class InlineFinancialConnectionsAccountOwnershipX0d638327DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFinancialConnectionsAccountOwnershipX0d638327NoMatchException(
  message: String,
) : InlineFinancialConnectionsAccountOwnershipX0d638327DecodingException(message)

internal data class InlineFinancialConnectionsAccountOwnershipX0d638327Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFinancialConnectionsAccountOwnership: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFinancialConnectionsAccountOwnership).count { it }
}

/**
 * The most recent information about the account's owners.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/ownership
 */
@Serializable(with = InlineFinancialConnectionsAccountOwnershipX0d638327.Serializer::class)
public class InlineFinancialConnectionsAccountOwnershipX0d638327 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFinancialConnectionsAccountOwnershipX0d638327Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val financialConnectionsAccountOwnership: FinancialConnectionsAccountOwnership? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFinancialConnectionsAccountOwnership) json.decodeFromJsonElement<FinancialConnectionsAccountOwnership>(raw) else null }

  public val matchedBranches: Set<InlineFinancialConnectionsAccountOwnershipX0d638327Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFinancialConnectionsAccountOwnershipX0d638327Branch.Branch1)
      if (inspection.matchesFinancialConnectionsAccountOwnership) add(InlineFinancialConnectionsAccountOwnershipX0d638327Branch.FinancialConnectionsAccountOwnership)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFinancialConnectionsAccountOwnershipX0d638327 {
      val inspection = inspectInlineFinancialConnectionsAccountOwnershipX0d638327(raw)
      if (inspection.matchCount == 0) {
        throw InlineFinancialConnectionsAccountOwnershipX0d638327NoMatchException("InlineFinancialConnectionsAccountOwnershipX0d638327 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFinancialConnectionsAccountOwnershipX0d638327(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountOwnershipX0d638327> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountOwnershipX0d638327 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFinancialConnectionsAccountOwnershipX0d638327")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountOwnershipX0d638327) {
      encoder.requireJsonEncoder("InlineFinancialConnectionsAccountOwnershipX0d638327").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFinancialConnectionsAccountOwnershipX0d638327(element: JsonElement): InlineFinancialConnectionsAccountOwnershipX0d638327Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFinancialConnectionsAccountOwnership = element.isJsonDecodable<FinancialConnectionsAccountOwnership>()
  return InlineFinancialConnectionsAccountOwnershipX0d638327Inspection(
    matchesBranch1 = matchesBranch1,
    matchesFinancialConnectionsAccountOwnership = matchesFinancialConnectionsAccountOwnership,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesFinancialConnectionsAccountOwnership) add("FinancialConnectionsAccountOwnership: value does not match FinancialConnectionsAccountOwnership")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
