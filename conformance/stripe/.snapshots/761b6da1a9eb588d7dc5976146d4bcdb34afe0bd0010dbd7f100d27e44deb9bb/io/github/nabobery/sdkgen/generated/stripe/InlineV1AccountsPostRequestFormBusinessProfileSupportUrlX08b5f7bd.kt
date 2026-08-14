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

public enum class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdBranch {
  Branch1,
  InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a,
}

public sealed class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdNoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdDecodingException(message)

internal data class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/support_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/support_url
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a:
      InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a) add(InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdBranch.InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd {
      val inspection = inspectInlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdNoMatchException("InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bd(element: JsonElement): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a = element.isJsonDecodable<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a>()
  return InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX08b5f7bdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a = matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a) add("InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a: value does not match InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X31aa990a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
