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

public enum class InlineIssuingAuthorizationTokenXc4287492Branch {
  Branch1,
  IssuingToken,
}

public sealed class InlineIssuingAuthorizationTokenXc4287492DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationTokenXc4287492NoMatchException(
  message: String,
) : InlineIssuingAuthorizationTokenXc4287492DecodingException(message)

internal data class InlineIssuingAuthorizationTokenXc4287492Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingToken: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingToken).count { it }
}

/**
 * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this authorization. If a network token was
 * not used for this authorization, this field will be null.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/token
 */
@Serializable(with = InlineIssuingAuthorizationTokenXc4287492.Serializer::class)
public class InlineIssuingAuthorizationTokenXc4287492 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationTokenXc4287492Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingToken: IssuingToken? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingToken) json.decodeFromJsonElement<IssuingToken>(raw) else null }

  public val matchedBranches: Set<InlineIssuingAuthorizationTokenXc4287492Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingAuthorizationTokenXc4287492Branch.Branch1)
      if (inspection.matchesIssuingToken) add(InlineIssuingAuthorizationTokenXc4287492Branch.IssuingToken)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationTokenXc4287492 {
      val inspection = inspectInlineIssuingAuthorizationTokenXc4287492(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationTokenXc4287492NoMatchException("InlineIssuingAuthorizationTokenXc4287492 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationTokenXc4287492(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationTokenXc4287492> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationTokenXc4287492 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationTokenXc4287492")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationTokenXc4287492) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationTokenXc4287492").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationTokenXc4287492(element: JsonElement): InlineIssuingAuthorizationTokenXc4287492Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingToken = element.isJsonDecodable<IssuingToken>()
  return InlineIssuingAuthorizationTokenXc4287492Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingToken = matchesIssuingToken,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingToken) add("IssuingToken: value does not match IssuingToken")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
