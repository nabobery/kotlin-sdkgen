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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingTransactionAuthorizationX61b3c552Branch {
  Branch1,
  IssuingAuthorization,
}

public sealed class InlineIssuingTransactionAuthorizationX61b3c552DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionAuthorizationX61b3c552NoMatchException(
  message: String,
) : InlineIssuingTransactionAuthorizationX61b3c552DecodingException(message)

internal data class InlineIssuingTransactionAuthorizationX61b3c552Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingAuthorization: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingAuthorization).count { it }
}

/**
 * The `Authorization` object that led to this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/authorization
 */
@Serializable(with = InlineIssuingTransactionAuthorizationX61b3c552.Serializer::class)
public class InlineIssuingTransactionAuthorizationX61b3c552 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionAuthorizationX61b3c552Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingAuthorization: IssuingAuthorization? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingAuthorization) json.decodeFromJsonElement<IssuingAuthorization>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionAuthorizationX61b3c552Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTransactionAuthorizationX61b3c552Branch.Branch1)
      if (inspection.matchesIssuingAuthorization) add(InlineIssuingTransactionAuthorizationX61b3c552Branch.IssuingAuthorization)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionAuthorizationX61b3c552 {
      val inspection = inspectInlineIssuingTransactionAuthorizationX61b3c552(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionAuthorizationX61b3c552NoMatchException("InlineIssuingTransactionAuthorizationX61b3c552 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionAuthorizationX61b3c552(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTransactionAuthorizationX61b3c552> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionAuthorizationX61b3c552 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionAuthorizationX61b3c552")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionAuthorizationX61b3c552) {
      encoder.requireJsonEncoder("InlineIssuingTransactionAuthorizationX61b3c552").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionAuthorizationX61b3c552(element: JsonElement): InlineIssuingTransactionAuthorizationX61b3c552Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingAuthorization = element.isJsonDecodable<IssuingAuthorization>()
  return InlineIssuingTransactionAuthorizationX61b3c552Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingAuthorization = matchesIssuingAuthorization,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingAuthorization) add("IssuingAuthorization: value does not match IssuingAuthorization")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
