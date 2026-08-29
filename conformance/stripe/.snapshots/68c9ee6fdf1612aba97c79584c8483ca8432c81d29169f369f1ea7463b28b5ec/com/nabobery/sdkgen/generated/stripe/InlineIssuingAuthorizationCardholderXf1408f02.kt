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

public enum class InlineIssuingAuthorizationCardholderXf1408f02Branch {
  Branch1,
  IssuingCardholder,
}

public sealed class InlineIssuingAuthorizationCardholderXf1408f02DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationCardholderXf1408f02NoMatchException(
  message: String,
) : InlineIssuingAuthorizationCardholderXf1408f02DecodingException(message)

internal data class InlineIssuingAuthorizationCardholderXf1408f02Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingCardholder: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingCardholder).count { it }
}

/**
 * The cardholder to whom this authorization belongs.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/cardholder
 */
@Serializable(with = InlineIssuingAuthorizationCardholderXf1408f02.Serializer::class)
public class InlineIssuingAuthorizationCardholderXf1408f02 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingAuthorizationCardholderXf1408f02Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingCardholder: IssuingCardholder? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholder) json.decodeFromJsonElement<IssuingCardholder>(raw) else null }

  public val matchedBranches: Set<InlineIssuingAuthorizationCardholderXf1408f02Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingAuthorizationCardholderXf1408f02Branch.Branch1)
      if (inspection.matchesIssuingCardholder) add(InlineIssuingAuthorizationCardholderXf1408f02Branch.IssuingCardholder)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingAuthorizationCardholderXf1408f02 {
      val inspection = inspectInlineIssuingAuthorizationCardholderXf1408f02(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingAuthorizationCardholderXf1408f02NoMatchException("InlineIssuingAuthorizationCardholderXf1408f02 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingAuthorizationCardholderXf1408f02(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationCardholderXf1408f02> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationCardholderXf1408f02 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationCardholderXf1408f02")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationCardholderXf1408f02) {
      encoder.requireJsonEncoder("InlineIssuingAuthorizationCardholderXf1408f02").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingAuthorizationCardholderXf1408f02(element: JsonElement): InlineIssuingAuthorizationCardholderXf1408f02Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingCardholder = element.isJsonDecodable<IssuingCardholder>()
  return InlineIssuingAuthorizationCardholderXf1408f02Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingCardholder = matchesIssuingCardholder,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingCardholder) add("IssuingCardholder: value does not match IssuingCardholder")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
