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

public enum class InlineIssuingAuthorizationNetworkDataX1c44162bBranch {
  IssuingAuthorizationNetworkData,
}

public sealed class InlineIssuingAuthorizationNetworkDataX1c44162bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationNetworkDataX1c44162bNoMatchException(
  message: String,
) : InlineIssuingAuthorizationNetworkDataX1c44162bDecodingException(message)

internal data class InlineIssuingAuthorizationNetworkDataX1c44162bInspection(
  public val matchesIssuingAuthorizationNetworkData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingAuthorizationNetworkData).count { it }
}

/**
 * Details about the authorization, such as identifiers, set by the card network.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/network_data
 */
@Serializable(with = InlineIssuingAuthorizationNetworkDataX1c44162b.Serializer::class)
public class InlineIssuingAuthorizationNetworkDataX1c44162b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationNetworkDataX1c44162bInspection,
) {
  public val issuingAuthorizationNetworkData: IssuingAuthorizationNetworkDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorizationNetworkData) json.decodeFromJsonElement<IssuingAuthorizationNetworkDataView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingAuthorizationNetworkDataX1c44162bBranch>
    get() = buildSet {
      if (inspection.matchesIssuingAuthorizationNetworkData) add(InlineIssuingAuthorizationNetworkDataX1c44162bBranch.IssuingAuthorizationNetworkData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationNetworkDataX1c44162b {
      val inspection = inspectInlineIssuingAuthorizationNetworkDataX1c44162b(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationNetworkDataX1c44162bNoMatchException("InlineIssuingAuthorizationNetworkDataX1c44162b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationNetworkDataX1c44162b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationNetworkDataX1c44162b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationNetworkDataX1c44162b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationNetworkDataX1c44162b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationNetworkDataX1c44162b) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationNetworkDataX1c44162b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationNetworkDataX1c44162b(element: JsonElement): InlineIssuingAuthorizationNetworkDataX1c44162bInspection {
  val raw = element as? JsonObject ?: return InlineIssuingAuthorizationNetworkDataX1c44162bInspection(
    matchesIssuingAuthorizationNetworkData = false,
    failures = listOf("IssuingAuthorizationNetworkData: expected JSON object"),
  )
  val matchesIssuingAuthorizationNetworkData = true
  return InlineIssuingAuthorizationNetworkDataX1c44162bInspection(
    matchesIssuingAuthorizationNetworkData = matchesIssuingAuthorizationNetworkData,
    failures = buildList {
      if (!matchesIssuingAuthorizationNetworkData) add("IssuingAuthorizationNetworkData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
